package baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class N_1377 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		MyIndex[] arr = new MyIndex[N];
		
		for (int i=0; i<N; i++) {
			arr[i] = new MyIndex(Integer.valueOf(br.readLine()), i);
		}
		
		Arrays.sort(arr);
		int max = 0;
		for (int i=0; i<N; i++) {
			if (max < arr[i].index-i) {
				max = arr[i].index-i;
			}
		}
		System.out.println(max+1);
	}
}

class MyIndex implements Comparable<MyIndex> {
	int value;
	int index;
	
	public MyIndex(int value, int index) {
		this.value = value;
		this.index = index;
	}

	@Override
	public int compareTo(MyIndex o) {
		return this.value - o.value;
	}
}