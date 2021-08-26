package highscorekit.stackQueue.stackQueue2_프린터;

import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public static int solution(int[] priorities, int location) {
        int answer = 1;
         
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i : priorities) {
        	pq.add(i);
        }

        while(!pq.isEmpty()) {
        	for(int i=0; i<priorities.length; i++) {
        		if(priorities[i] == pq.peek()) {
        			if(i == location) return answer;
        			answer++;
    				pq.poll();
        		}
        	}
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
		int[] priorities = {1,1,9,1,1,1};
		int location = 0;
		
		System.out.println(solution(priorities, location));
	}
}