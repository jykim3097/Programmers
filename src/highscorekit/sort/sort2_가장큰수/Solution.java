package highscorekit.sort.sort2_가장큰수;

import java.util.Arrays;
import java.util.Collections;

public class Solution {

    public static String solution(int[] numbers) {
        
    	String answer = "";

		String[] strNum = new String[numbers.length];
		
		for(int i=0; i<numbers.length; i++) strNum[i] = ""+numbers[i];
		
		Arrays.sort(strNum, Collections.reverseOrder());
		System.out.println(Arrays.toString(strNum));
		
		int c=0;
		int tmp=0;
		for(int i=0; i<strNum.length-1; i++) {
			if(!strNum[i].substring(0,1).equals(strNum[i+1].substring(0, 1))) {
				
				tmp = i;
				System.out.println(i);
				
				if(i==0 || i==1) {
					for(int j=i; j>=c; j--) {
						answer += strNum[j];
					}
				} else {
					for(int j=i; j>c; j--) {
						answer += strNum[j];
					}
				}
		
				c++;
			}
		}
		
		for(int i=strNum.length-1; i>tmp; i--) {
			answer += strNum[i];
		}
		
        return answer;
    }
	
	
	public static void main(String[] args) {

		int[] numbers = {3,30,34,5,9};
		
		System.out.println(solution(numbers));
	}
}
