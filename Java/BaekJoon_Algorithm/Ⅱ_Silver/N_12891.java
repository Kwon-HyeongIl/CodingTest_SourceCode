package baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N_12891 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int S = Integer.valueOf(st.nextToken());
		int P = Integer.valueOf(st.nextToken());
		String sLine = br.readLine();
		long[] acgt = new long[4];
		
		st = new StringTokenizer(br.readLine());
		int A = Integer.valueOf(st.nextToken());
		int C = Integer.valueOf(st.nextToken());
		int G = Integer.valueOf(st.nextToken());
		int T = Integer.valueOf(st.nextToken());
		
		
		int first = 0;
		int last = 0;
		int count = 0;
		acgt[trans(sLine.charAt(0))]++;
		
		while (last < S) {
			if (last < P-1) {
				last++;
				acgt[trans(sLine.charAt(last))]++;
				continue;
			}
			
			if (acgt[0]>=A && acgt[1]>=C && acgt[2]>=G && acgt[3]>=T) {
				count++;
				if (last == S-1) {
					break;
					}
				acgt[trans(sLine.charAt(first))]--;
				first++;
				last++;
				acgt[trans(sLine.charAt(last))]++;
			  	} else {
				if (last == S-1) {
					break;
					}
				acgt[trans(sLine.charAt(first))]--;
				first++;
				last++;
				acgt[trans(sLine.charAt(last))]++;
			}
		}
		
		System.out.print(count);
		br.close();
	}
	
	static int trans(char c) {
		if (c == 'A') {
			return 0;
		} else if (c == 'C') {
			return 1;
		} else if (c == 'G') {
			return 2;
		} else {
			return 3;
		}
	}
}