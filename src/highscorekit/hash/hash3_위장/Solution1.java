package highscorekit.hash.hash3_위장;

import java.util.HashMap;

public class Solution1 {

	public static int solution(String[][] clothes) {
        
		int answer = 0;
        int multi = 1;
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String[] list : clothes) {
            map.put(list[1], map.getOrDefault(list[1], 0) + 1);
        }
        
//        System.out.println(map.toString());
        
        if(map.size() == 1) {
            return answer + map.get(map.keySet().toArray()[0]);
        } else  {
            for(String s : map.keySet()) {
                multi *= (map.get(s) + 1);
            }
            
            return multi-1;
        }
    }
	
	public static void main(String[] args) {

		String[][] clothes = {{"crowmask", "face"},{"bluesunglasses", "face"},{"smoky_makeup", "face"},{"yellowhat", "headgear"},{"bluesunglasses", "eyewear"},{"green_turban", "headgear"}};
		
		System.out.println(solution(clothes));
		
	}
}
