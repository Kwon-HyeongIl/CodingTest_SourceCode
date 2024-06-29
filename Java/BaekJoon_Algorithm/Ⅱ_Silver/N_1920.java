package baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N_1920 {
	static int[] nArr;
	static StringBuilder sb = new StringBuilder();
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int N = Integer.valueOf(br.readLine());
    	nArr = new int[N];
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	for (int i=0; i<N; i++) {
    		nArr[i] = Integer.valueOf(st.nextToken());
    	}
    	Arrays.sort(nArr);
    	int M = Integer.valueOf(br.readLine());
    	
    	st = new StringTokenizer(br.readLine());
    	for (int i=0; i<M; i++) {
    		int num = Integer.valueOf(st.nextToken());
    		binarySearch(num, 0, nArr.length-1);
    	}
    	System.out.println(sb);
    }
    
    static void binarySearch(int findNum, int left, int right) {
    	if (left > right) {
    		sb.append(0).append("\n");
    		return;
    	}
    	int mid = (left+right)/2;
    	
    	if (findNum > nArr[mid]) {
    		binarySearch(findNum, mid+1, right);
    	} else if (findNum < nArr[mid]) {
    		binarySearch(findNum, left, mid-1);
    	} else {
    		sb.append(1).append("\n");
    	}
    }
}