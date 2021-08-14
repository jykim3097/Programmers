package highscorekit.sort.sort3_HIndex;

import java.util.Arrays;

public class Solution {

	public static int solution(int[] citations) {
        int answer = 0;
        
        Arrays.sort(citations);
		
		int max = citations[citations.length - 1];
		int[] cntArr = new int[max];
		
		int cnt = 0;
		for(int i=0; i<cntArr.length; i++) {
			
			for(int j=0; j<citations.length; j++) {
				if(citations[j] >= i) {
					cnt++;
				}
			}
			
			System.out.println(i + ", " + cnt);
			
			if(i == cnt) {
				answer = i;
				return answer;
			} 
			if(i != cnt && i==cntArr.length-1) {
				answer = i;
			}
			cnt = 0;
		}
        
        return answer;
    }
	
	public static void main(String[] args) {
		
		int[] citations = {0,1,1};
		
		System.out.println(solution(citations));
	}
}
