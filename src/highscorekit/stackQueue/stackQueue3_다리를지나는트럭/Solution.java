package highscorekit.stackQueue.stackQueue3_다리를지나는트럭;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {

	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		
		int answer = 0;
		
		Queue<Integer> queue = new LinkedList<>();
		Queue<Integer> cross = new LinkedList<>();
		//Stack<Integer> time = new Stack<Integer>();
		
		for(int i=0; i<truck_weights.length; i++) {
			queue.add(truck_weights[i]);
		}System.out.println(queue);
		
		int t = 0;
		int sum = 0;
		int n = 0;
		
		cross.add(0);
		while(!cross.isEmpty()) {
			t++;
			
			if(cross.size() == bridge_length) {
				sum -= cross.peek();
				cross.poll();
			}
			
			if(!queue.isEmpty()) {
				n = queue.peek();
				sum += n;
			} else {
				cross.poll();
				continue;
			}
			
			if(sum > weight) {
				if(cross.size() != bridge_length) {
					t++;
					cross.add(0);
					sum -= n;
				}
			} else if(!queue.isEmpty()) {
				cross.add(n);
				queue.poll();
			} 
			System.out.println(t+"s: "+cross);
		}
		answer = t - 1;
		System.out.println("answer: "+answer);		
		return answer;
	}
	
	public static void main(String[] args) {
//		int bridge_length = 2;
//		int weight = 10;
//		int[] truck_weights = {7,4,5,6};
		
//		int bridge_length = 3;
//		int weight = 15;
//		int[] truck_weights = {9, 4, 1, 7, 9};
		
		int bridge_length = 100;
		int weight = 100;
		int[] truck_weights = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
		
//		int bridge_length = 100;
//		int weight = 100;
//		int[] truck_weights = {10};
		
		solution(bridge_length, weight, truck_weights);
	}
}
