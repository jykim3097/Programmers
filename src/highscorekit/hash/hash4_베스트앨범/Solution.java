package highscorekit.hash.hash4_베스트앨범;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class Solution {

//	public int[] solution(String[] genres, int[] plays) {
//        int[] answer = {};
//        
//        Stream<String> strStream = Arrays.stream(genres);
//        
//        strStream.distinct()
//        		 .forEach(s -> System.out.println(s));
//        
//        return answer;
//    }
	
	public static void main(String[] args) {
	
		int[] answer = {};
		
		String[] genres = {"a", "b", "a", "a", "c", "b"};
		int[] plays = {500, 600, 150, 800, 2500, 400};
		
		HashMap<Integer, String> genresMap = new HashMap<>();
		HashMap<Integer, Integer> playsMap = new HashMap<>();
		
		HashMap<String, HashMap<Integer, Integer>> map = new HashMap<>();
		
		for(int i=0; i<genres.length; i++) {
			genresMap.put(i, genres[i]);
			playsMap.put(i, plays[i]);
		}
		
		System.out.println(genresMap.toString());
		System.out.println(playsMap.toString());
		
		for(int i = 0; i < playsMap.size(); i++) {
			
		}
		
		System.out.println(map.toString());
		
		
//		for(int i=0; i<genres.length; i++) {
//			map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
//		}
//		System.out.println(map.toString());
//		
//		List<String> keySetList = new ArrayList<>(map.keySet());
//		Collections.sort(keySetList, (o1, o2) -> (map.get(o2)).compareTo(map.get(o1)));
//		System.out.println(keySetList.toString());
//		
//		for(int i=0; i<map.size(); i++) {
//			HashMap<Integer, Integer> map1 = new HashMap<>();
//			
//		}
//		
//		
//		HashMap<Integer, Integer> map1 = new HashMap<>();
//		HashMap<Integer, Integer> map2 = new HashMap<>();
//		
//		for(int i=0; i<genres.length; i++) {
//			if(genres[i].equals(keySetList.get(0))) {
//				System.out.println(i);
//				System.out.println(plays[i]);
////				map1.put(i, plays[i]);
//			} else if (genres[i].equals(keySetList.get(1))) {
//				map2.put(i, plays[i]);
//			}
//		}
//
//		List<Integer> keySetList1 = new ArrayList<>(map1.keySet());
//		Collections.sort(keySetList1, (o1, o2) -> (map1.get(o2)).compareTo(map1.get(o1)));
//		
//		List<Integer> keySetList2 = new ArrayList<>(map2.keySet());
//		Collections.sort(keySetList2, (o1, o2) -> (map2.get(o2)).compareTo(map2.get(o1)));
//		
//		if(keySetList1.size() > 2) keySetList1.remove(keySetList1.get(keySetList1.size() - 1));
//		if(keySetList2.size() > 2) keySetList2.remove(keySetList2.get(keySetList2.size() - 1));
//		
//		
	}
}
