package baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_14681 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.valueOf(br.readLine());
		int y = Integer.valueOf(br.readLine());
		
		if (x>0 && y>0) {
			System.out.println(1);
		} else if (x<0 && y>0) {
			System.out.println(2);
		} else if (x<0 && y<0) {
			System.out.println(3);
		} else {
			System.out.println(4);
		}
	}
}