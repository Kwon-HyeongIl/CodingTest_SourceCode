package baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N_1850 {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	Long A = Long.valueOf(st.nextToken());
    	Long B = Long.valueOf(st.nextToken());
    	
    	long count = mod(B, A);
    	
    	for (long i=0; i<count; i++) {
    		sb.append(1);
    	}
    	
    	System.out.println(sb);
    }
    
    public static long mod(long A, long B) {
    	long div = A % B;
    	if (div == 0) {
    		return B;
    	} else {
    		return mod(B, div);
    	}
    }
}