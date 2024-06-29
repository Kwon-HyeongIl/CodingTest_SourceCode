package baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N_1929 {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	StringBuilder sb = new StringBuilder();
    	int M = Integer.valueOf(st.nextToken());
    	int N = Integer.valueOf(st.nextToken());
    	
    	int[] num = new int[N+1];
    	
    	for (int i=2; i<=N; i++) {
    		num[i] = i;
    	}
    	
    	for (int i=2; i<=Math.sqrt(N); i++) {
    		if (num[i]==0) {
    			continue;
    		}
    		for (int k=i*2; k<=N; k+=i) {
    			num[k] = 0;
    		}
    	}
    	
    	for (int i=M; i<=N; i++) {
    		if (num[i]!=0) {
    			sb.append(num[i]).append("\n");
    		}
    	}
    	
    	System.out.println(sb);
    }
}