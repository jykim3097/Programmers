package highscorekit.stackQueue.stackQueue1_기능개발;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Solution2 {

	static Queue<Integer> result = new LinkedList<>();
	static Queue<Integer> queue = new LinkedList<>();
	static int cnt = 1;
	
	public static int[] solution(int[] progresses, int[] speeds) {
		
		// 1. queue에 작업속도별 남은 배포비율 담기
		for(int i=0; i<progresses.length; i++) {
        	double tmp = (100 - progresses[i]) / (double)speeds[i];
        	queue.add((int)Math.ceil(tmp));
        }

		// 2. 처음 두 값을 뽑아 que메서드 실행
        int n = queue.poll();
        int m = queue.poll();
        Queue<Integer> res = que(n,m);
        int[] answer = new int[res.size()];
        
        // 3. queue를 array로 변경  
        int i = 0;
        Iterator<Integer> iter = res.iterator();
        while(iter.hasNext()) {
        	answer[i] = iter.next();
        	i++;
        }
        
        return answer;
    }
	
	// 두 값을 비교해 각 배포마다 배포되는 기능의 수 출력
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

		// n, m이 같은 값일 때를 못 걸러주는 값을 발견한 케이스
		int[] progresses = {98,99,98,99};
		int[] speeds = {1,1,1,1};

		solution(progresses, speeds);
	}
}
