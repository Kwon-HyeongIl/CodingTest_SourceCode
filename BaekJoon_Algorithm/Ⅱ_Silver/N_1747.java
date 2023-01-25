package baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_1747 {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int N = Integer.valueOf(br.readLine());
    	
    	int[] arr = new int[1003002];
    	int[] cal = new int[7];
    	int min = 0;
    	
    	for (int i=2; i<arr.length; i++) {
    		arr[i] = i;
    	}
    	
    	for (int i=2; i<Math.sqrt(arr.length); i++) {
    		if (arr[i]==0) {
    			continue;
    		}
    		for (int k=i+i; k<arr.length; k+=i) {
    			arr[k] = 0;
    		}
    	}
    	T : for (int i=N; i<arr.length; i++) {
    		if (arr[i]==0) {
    			continue;
    		}
    		int temp = arr[i];
    		int count = 0;
    		
    		while (temp > 0) {
    			cal[count] = temp % 10;
    			temp /= 10;
    			count++;
    		}
    		
    		int left = 0;
    		int right = count-1;
    		
    		while (left < right) {
    			if (cal[left] != cal[right]) {
    				continue T;
    			} else {
    				left++; right--;
    			}
    		}
    		min = arr[i];
    		break;
    	}
    	
    	System.out.println(min);
    }
}