package highscorekit.stackQueue.stackQueue1_기능개발;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Solution2 {

	static Queue<Integer> result = new LinkedList<>();
	static Queue<Integer> queue = new LinkedList<>();
	static int cnt = 1;
	
	public static int[] solution(int[] progresses, int[] speeds) {
		for(int i=0; i<progresses.length; i++) {
        	double tmp = (100 - progresses[i]) / (double)speeds[i];
        	queue.add((int)Math.ceil(tmp));
        }
		System.out.println(queue);

        int n = queue.poll();
        int m = queue.poll();
        Queue<Integer> res = que(n,m);
        int[] answer = new int[res.size()];
        
        int i = 0;
        Iterator<Integer> iter = res.iterator();
        while(iter.hasNext()) {
        	answer[i] = iter.next();
        	i++;
        }
        
        return answer;
    }
	
	public static Queue<Integer> que(int n, int m) {
		if(n >= m) {
			cnt++;
		}else {
			result.add(cnt);
			n = m;
			cnt = 1;
		}
		m = queue.poll();
		
		if(queue.size() != 0) {
			que(n, m);
		} else {
			if(n >= m) {
				cnt++;
			}else {
				result.add(cnt);
				cnt = 1;
			}
			result.add(cnt);
		}
		return result;
	}
	
	public static void main(String[] args) {

		// 아래 케이스에서 n,m이 같은 값일 때를 못 걸러주는 값을 발견했다
		int[] progresses = {98,99,98,99};
		int[] speeds = {1,1,1,1};

		solution(progresses, speeds);
	}
}
