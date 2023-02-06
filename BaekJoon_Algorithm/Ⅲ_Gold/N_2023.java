package baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_2023 {
	static int N;
	static StringBuilder sb = new StringBuilder();
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	N = Integer.valueOf(br.readLine());
    	
    	dfs(2, 1);
    	dfs(3, 1);
    	dfs(5, 1);
    	dfs(7, 1);
    	
    	System.out.println(sb);
    }
    
    static void dfs(int num, int jarisu) {
    	if (jarisu == N) {
    		if(isPrime(num)) {
    			sb.append(num).append("\n");
    		}
    		return;
    	}
    	
    	for (int i=0; i<=9; i++) {
    		if (i%2 == 0) {
    			continue;
    		}
    		if (isPrime(num*10+i)) {
    			dfs(num*10+i, jarisu+1);
    		}
    	}
    }
    static boolean isPrime(int number) {
    	for (int i=2; i<=number/2; i++) {
    		if (number%i == 0) {
    			return false;
    		}
    	}
    	return true;
    }
}