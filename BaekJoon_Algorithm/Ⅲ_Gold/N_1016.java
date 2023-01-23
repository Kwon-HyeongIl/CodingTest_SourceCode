package baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N_1016 {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	long min = Long.valueOf(st.nextToken());
    	long max = Long.valueOf(st.nextToken());

    	boolean[] check = new boolean[(int)(max-min+1)];
    	
    	for (long i=2; i*i<=max; i++) {
    		long pow = i*i;
    		long start = min/pow;
    		if (min%pow != 0) {
    			start++;
    		}
    		
    		for (long k=start; k*pow<=max; k++) {
    			check[(int)((k*pow)-min)] = true;
    		}
    	}
    	int count = 0;
    	for (int i=0; i<check.length; i++) {
    		if (!check[i]) {
    			count++;
    		}
    	}
    	
    	System.out.println(count);
    }
}