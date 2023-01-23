package baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_2588 {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	
    	int a = Integer.valueOf(br.readLine());
    	int b = Integer.valueOf(br.readLine());
    	
    	int k = b;
    	for (int i=0; i<3; i++) {
    		sb.append(a*(k%10)).append("\n");
    		k /= 10;
    	}
    	sb.append(a*b);
    	
    	System.out.println(sb);
    }
}