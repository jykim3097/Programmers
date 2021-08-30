package skillchecktest.level2;

public class Q1_Solution {

	public static void main(String[] args) {
		int answer = 0;
		
		int w = 8;
		int h = 8;
		
		if( w == h) answer = w*h - w;
		else {
			int max = 0;

			if(w > max ) max = w;
			if(h > max) max = h;
			
			if(max == h) answer = w*h - (int)Math.ceil(h/(double)w)*w;
			else answer = w*h - (int)Math.ceil(w/(double)h)*h;
			
		}
		System.out.println(answer);
	}
}
