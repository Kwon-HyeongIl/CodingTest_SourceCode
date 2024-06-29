package baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_1300 {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int N = Integer.valueOf(br.readLine());
    	int K = Integer.valueOf(br.readLine());
    	
    	int start = 1, end = K, findNum = 0;
    	
    	while (start <= end) {
    		int middle = (start+end)/2;
    		int lowerNum = 0;
    		
    		for (int i=1; i<=N; i++) {
    			lowerNum += Math.min(middle/i, N);
    		}
    		
    		if (lowerNum < K) {
    			start = middle + 1;
    		} else {
    			findNum = middle;
    			end = middle - 1;
    		}
    	}
    	
    	System.out.println(findNum);
    }
}