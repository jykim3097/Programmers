package highscorekit.stackQueue.stackQueue1_기능개발;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Solution2 {

	public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i=0; i<progresses.length; i++) {
        	double tmp = (100 - progresses[i]) / (double)speeds[i];
        	queue.add((int)Math.ceil(tmp));
        	
        }
        
        System.out.println(queue);
        
        int num = queue.poll();
        
        
        Iterator<Integer> iter = queue.iterator();
        int cnt = 1;
        while(iter.hasNext()) {
        	if(iter.next() < num) {
        		cnt++;
//        		queue.poll();
        	} else {
        		System.out.println(cnt);
        		cnt=0;
        	}
        }
        
        
        return answer;
    }
	
	public static void main(String[] args) {
		
		int[] progresses = {93,92,73,78,53};
		int[] speeds = {1,4,7,5,3};
		
		System.out.println(Arrays.toString(solution(progresses, speeds)));
	}
}
