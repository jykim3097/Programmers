package highscorekit.hash.hash1_완주하지못한선수;

import java.util.Arrays;

public class Solution1 {

	public String solution(String[] p, String[] c) {

		Arrays.sort(p);
		Arrays.sort(c);

		for (int i = 0; i < c.length; i++) {
			if (c[i].hashCode() != p[i].hashCode()) {
				return p[i];
			}
		}

		return p[p.length - 1];
	}
}
