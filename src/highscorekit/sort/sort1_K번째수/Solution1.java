package highscorekit.sort.sort1_K번째수;

import java.util.Arrays;

public class Solution1 {

	public static int[] solution(int[] array, int[][] commands) {

		int[] answer = new int[commands.length];
        
		for(int j=0; j < commands.length; j++) {
			
			int[] command = commands[j];
						
			int len = command[1] - command[0] + 1;
			int[] newArr = new int[len];
			
			for(int i=0; i<len; i++) newArr[i] = array[i+command[0] -1];
			
			Arrays.sort(newArr);
			
			answer[j] = newArr[command[2]-1];
		}
		
        return answer;
    }
	
	public static void main(String[] args) {
		
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};

		System.out.println(Arrays.toString(solution(array, commands)));
	}
}
