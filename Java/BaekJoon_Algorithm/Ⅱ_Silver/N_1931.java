package baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class N_1931 {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int N = Integer.valueOf(br.readLine());
    	int[][] arr = new int[N][2];
    	StringTokenizer st;
    	
    	for (int i=0; i<N; i++) {
    		st = new StringTokenizer(br.readLine());
    		arr[i][0] = Integer.valueOf(st.nextToken());
    		arr[i][1] = Integer.valueOf(st.nextToken());
    	}
    	
    	Arrays.sort(arr, new Comparator<int[]>() {
    		public int compare(int[] A, int[] B) {
    			if (A[1] == B[1]) {
    				return A[0] - B[0];
    			}
    			return A[1] - B[1];
    		}
    	});
    	
    	int count = 0;
    	int end = -1;
    	for (int i=0; i<N; i++) {
    		if (arr[i][0] >= end) {
    			end = arr[i][1];
    			count++;
    		}
    	}
    	
    	System.out.println(count);
    }
}