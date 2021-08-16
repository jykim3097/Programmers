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
		
		int indexTmp=0; 
		int diff=0;
		
		for(int i=0; i<strNum.length-1; i++) {
			if(!strNum[i].substring(0,1).equals(strNum[i+1].substring(0, 1))) {
				
				diff = i-indexTmp;
				indexTmp = i;
				
				if(indexTmp  == 0) answer +=strNum[i];
				
				answer = addStr(answer, strNum, diff, indexTmp);	
			}
		}
		
		
		
		for(int i=strNum.length-1; i>indexTmp; i--) {
			
			System.out.println(indexTmp);
			diff = i-indexTmp;
			indexTmp = i;
			
			if(diff == 1) answer += strNum[i];
			else answer = addStr(answer, strNum, diff, indexTmp);
			
		}
		
        return answer;
    }
    
    public static String addStr(String answer, String[] strNum, int diff, int indexTmp) {
		
		String tmp = "";
		for(int j = indexTmp; j > indexTmp-diff; j--) {
			
			if (j == indexTmp) {
				tmp = strNum[j];
				continue;
			}
			
			if(Integer.parseInt(tmp) < 10) {
				
				if(Integer.parseInt(strNum[j].substring(1, 2)) <= Integer.parseInt(tmp)) tmp += strNum[j];
				else tmp = strNum[j] + tmp;
				
			} else {
				if(Integer.parseInt(strNum[j].substring(1, 2)) <= Integer.parseInt(tmp.substring(1, 2))) tmp += strNum[j];
				else tmp = strNum[j] + tmp;
			}
			
		}
		answer += tmp;
		System.out.println(tmp);
		tmp = "";
		
		return answer;
    }
	
	
	public static void main(String[] args) {

		int[] numbers = {383,38};
		
		System.out.println("answer = " + solution(numbers));
	}
}
