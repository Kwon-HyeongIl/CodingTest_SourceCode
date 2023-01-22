package baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_11689 {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	long N = Long.valueOf(br.readLine());
    	long result = N;
    	for (long i=2; i<=Math.sqrt(N); i++) {
    		if (N%i == 0) {
    			result -= result/i;
    			while (N%i == 0) {
    				N /= i;
    			}
    		}
    	}
    	if (N > 1) {
    		result -= result/N;
    	}
    	System.out.println(result);
    }
}