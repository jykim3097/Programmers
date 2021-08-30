package skillchecktest.level1.하샤드수;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		
		int x = 11;
		String str = x + "";
		String[] strArr = str.split("");
		
		System.out.println(Arrays.toString(strArr));
		
		int sum = 0;
		for(int i=0; i<strArr.length; i++) {
			sum += Integer.parseInt(strArr[i]);
		}
		
		System.out.println(sum);
		
		if(x%sum == 0) System.out.println(true);
		else System.out.println(false);
		
	}
}
