package baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N_3003 {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	StringBuilder sb = new StringBuilder();
    	
    	int a = Integer.valueOf(st.nextToken());
    	int b = Integer.valueOf(st.nextToken());
    	int c = Integer.valueOf(st.nextToken());
    	int d = Integer.valueOf(st.nextToken());
    	int e = Integer.valueOf(st.nextToken());
    	int f = Integer.valueOf(st.nextToken());
    	
    	int A = 1;
    	int B = 1;
    	int C = 2;
    	int D = 2;
    	int E = 2;
    	int F = 8;
    	
    	sb.append(A-a).append(" ").append(B-b).append(" ").append(C-c).append(" ").append(D-d).append(" ").append(E-e).append(" ").append(F-f);
    	System.out.println(sb);
    }
}