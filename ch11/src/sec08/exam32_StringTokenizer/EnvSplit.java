package sec08.exam32_StringTokenizer;

import java.util.StringTokenizer;

public class EnvSplit {

	public static void main(String[] args) {
		String wholeLine = System.getenv("Path");
		
		StringTokenizer envOrigin = new StringTokenizer(wholeLine, ";");
		
		while(envOrigin.hasMoreTokens()) {
			System.out.println(envOrigin.nextToken());
		}

	}

}
