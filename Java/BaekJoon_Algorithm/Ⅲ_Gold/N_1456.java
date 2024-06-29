package baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N_1456 {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	long A = Long.valueOf(st.nextToken());
    	long B = Long.valueOf(st.nextToken());
    	
    	long[] num = new long[10000001];
    	
    	for (int i=2; i<num.length; i++) {
    		num[i] = i;
    	}
    	
    	for (int i=2; i<=Math.sqrt(B); i++) {
    		if (num[i]==0) {
    			continue;
    		}
    		for (int k=i*2; k<num.length; k+=i) {
    			num[k] = 0;
    		}
    	}
    
    	int count = 0;
    	for (int i=2; i<10000001; i++) {
    		if (num[i]!=0) {
    			long p = num[i];
    			
    			while (num[i] <= (double)B/p) {
    				if (num[i] >= (double)A/p) {
    					count++;
    				}
    				p *= num[i];
    			}
    		}
    	}
    	
    	System.out.println(count);
    }
}