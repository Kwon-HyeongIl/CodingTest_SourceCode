package baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class N_1715 {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int N = Integer.valueOf(br.readLine());
    	PriorityQueue<Integer> queue = new PriorityQueue<>();
    	
    	for (int i=0; i<N; i++) {
    		queue.add(Integer.valueOf(br.readLine()));
    	}
    	
    	int sum = 0;
    	int first = 0;
    	int second = 0;
    	
    	while (queue.size() != 1) {
    		first = queue.remove();   
    		second = queue.remove();   
    		
    		sum += first + second;
    		queue.add(first + second);   
    	}
    	
    	System.out.println(sum);
    }
}