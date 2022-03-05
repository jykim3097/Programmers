package highscorekit.stackQueue.stackQueue3_다리를지나는트럭;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

public static int solution(int bridge_length, int weight, int[] truck_weights) {
		
		int answer = 0;
		
		Queue<Integer> queue = new LinkedList<>();
		for(int i=0; i<truck_weights.length; i++) {
			queue.add(truck_weights[i]);
		}
		
		int res = queue.size() + bridge_length;
		
		int num = queue.poll();
		Iterator<Integer> iter = queue.iterator();
        while(iter.hasNext()) {
        	int n = iter.next();
        	num += n;
        	if(num > weight) {
        		res++;
        	}
        	num = n;
        }
        
		answer = res;
		
		return answer;
	}
	
	public static void main(String[] args) {
		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = {7,4,5,6};
		
//		int bridge_length = 100;
//		int weight = 100;
//		int[] truck_weights = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
		
//		int bridge_length = 100;
//		int weight = 100;
//		int[] truck_weights = {10};
		
		solution(bridge_length, weight, truck_weights);
	}
}
