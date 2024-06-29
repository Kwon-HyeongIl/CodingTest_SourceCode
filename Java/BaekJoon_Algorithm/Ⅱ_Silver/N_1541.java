package baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N_1541 {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine(), "-");
    	StringTokenizer st2;
    	
    	int count = 0;
    	int sum = 0;
    	while (st.hasMoreTokens()) {
    		st2 = new StringTokenizer(st.nextToken(), "+");
    		
    		if (count == 0) {
    			while (st2.hasMoreTokens()) {
    				sum += Integer.valueOf(st2.nextToken());
    			}
    		}
    		
    		while (st2.hasMoreTokens()) {
    			sum -= Integer.valueOf(st2.nextToken());
    		}
    		count++;
    	}
    	
    	System.out.println(sum);
    }
}