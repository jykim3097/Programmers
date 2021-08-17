package highscorekit.stackQueue.stackQueue1_기능개발;

import java.util.Arrays;

public class Solution1 {
	
	public static int[] solution(int[] progresses, int[] speeds) {
        
        for(int i=0; i<progresses.length; i++) {
        	double tmp = (100 - progresses[i]) / (double)speeds[i];
        	progresses[i] = (int)Math.ceil(tmp);
        }

        int max = progresses[0];
        int cnt=0, len=0;
        int[] cntArr = new int[progresses.length-1];
        
        for(int i=0; i<progresses.length-1; i++) {
        	
        	if(max < progresses[i+1] ) {
        		cnt++;
        		max = progresses[i+1];
        	}
        	
        	len += cnt;
        	cntArr[i] = cnt;
        	cnt = 0;
        }
        
        
        int count = 0;
        int j = 0;
        int[] answer = new int[len+1];

        for(int i=0; i<cntArr.length; i++) {
        	count++;
        	
        	if(cntArr[i] == 1) {
        		answer[j] = count;
        		count=0;
        		j++;
        	}
        	
        	if(i == cntArr.length-1) answer[j] = count+1;
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		
//		int[] progresses = {95,90,99,99,80,99};
//		int[] speeds = {1,1,1,1,1,1};
		
//		int[] progresses = {93,30,55};
//		int[] speeds = {1,30,5};
		
		int[] progresses = {93,92,73,78,53};
		int[] speeds = {1,4,7,5,3};
		
		System.out.println(Arrays.toString(solution(progresses, speeds)));
	}
}
