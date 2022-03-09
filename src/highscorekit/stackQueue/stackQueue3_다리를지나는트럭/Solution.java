package highscorekit.stackQueue.stackQueue3_다리를지나는트럭;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		
		int answer = 0;
		
		Queue<Integer> queue = new LinkedList<>();
		Queue<Integer> cross = new LinkedList<>();
		
		for(int i=0; i<truck_weights.length; i++) {
			queue.add(truck_weights[i]);
		}

		int time = 0;
		int sum = 0;
		int n = 0;

		// 다리 길이가 트럭 개수보다 긴 경우 - 예외처리 필요함

		//  다리에 트럭이 있는 경우 || 대기 트럭이 있는 경우
		while(!cross.isEmpty() || !queue.isEmpty()) {
			time++;
			
			// 다리에 트럭이 가득 찬 경우  || 대기 트럭이 빈 경우
			if(cross.size() == bridge_length || queue.isEmpty()) {
				sum -= cross.peek();
				cross.poll();
			}
			
			// 대기 트럭이 있는 경우
			if(!queue.isEmpty()) {
				n = queue.peek();
				sum += n;

				if(sum > weight) {
					sum -= n;
					cross.add(0);
				} else {
					cross.add(n);
					queue.poll();
				}
			}
		}
		
		answer = time;	
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
