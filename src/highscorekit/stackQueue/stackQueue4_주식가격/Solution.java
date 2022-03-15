package highscorekit.stackQueue.stackQueue4_주식가격;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

	public static int[] solution(int[] prices) {
		int[] answer = new int[prices.length];
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		for(int i = 0; i<prices.length; i++) {
			q.add(prices[i]);
		}
		
		int n = 0;
		
		while(!q.isEmpty()) {
			int cnt = 0;
			
			int tmp = q.poll();
			for(int i = n; i<prices.length-1; i++) {
				if(tmp <= prices[i+1]) {
					cnt++;
				} else {
					cnt++;
					break;
				}
			}
			
			answer[n] = cnt;
			n++;		
		}
		return answer;
	}
	
	public static void main(String[] args) {
		
		int[] prices = {1,2,3,2,3};
		
		solution(prices);
	}
}
