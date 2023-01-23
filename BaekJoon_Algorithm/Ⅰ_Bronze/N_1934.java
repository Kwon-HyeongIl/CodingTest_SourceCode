package baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N_1934 {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	int T = Integer.valueOf(br.readLine());
    	
    	for (int i=0; i<T; i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int a = Integer.valueOf(st.nextToken());
    		int b = Integer.valueOf(st.nextToken());
    		int k = mod(b, a);
    		sb.append((a*b)/k).append("\n");
    	}
    	
    	System.out.println(sb);
    }
    
    public static int mod(int A, int B) {
    	int div = A % B;
    	if (div == 0) {
    		return B;
    	} else {
    		return mod(B, div);
    	}
    }
}