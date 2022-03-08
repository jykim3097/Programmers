package highscorekit.stackQueue.stackQueue3_다리를지나는트럭;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		
		int answer = 0;
		
		Queue<Integer> queue = new LinkedList<>();
		Queue<Integer> cross = new LinkedList<>();
		
		for(int i=0; i<truck_weights.length; i++) {
			queue.add(truck_weights[i]);
		}System.out.println(queue);

		int time = 0;
		int sum = 0;
		int n = 0;
		cross.add(0);
		
		while(!cross.isEmpty() || !queue.isEmpty()) {
			time++;
			
			if(cross.size() == bridge_length || queue.isEmpty()) {
				sum -= cross.peek();
				cross.poll();
			}
			
			if(!queue.isEmpty()) {				
				n = queue.peek();
				sum += n;

				if(sum > weight) {
					// 합계가 큰 경우
					sum -= n;
					cross.add(0);
				} else {
					cross.add(n);
					queue.poll();
				}
			}
			
		}
		answer = time;
		System.out.println("answer: "+answer);		
		return answer;
	}
	
	public static void main(String[] args) {
//		int bridge_length = 2;
//		int weight = 10;
//		int[] truck_weights = {7,4,5,6};
		
		int bridge_length = 3;
		int weight = 15;
		int[] truck_weights = {9, 4, 1, 7, 9};
		
//		int bridge_length = 100;
//		int weight = 100;
//		int[] truck_weights = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
		
//		int bridge_length = 100;
//		int weight = 100;
//		int[] truck_weights = {10};
		
		solution(bridge_length, weight, truck_weights);
	}
}
