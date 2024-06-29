package baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class N_1744 {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int N = Integer.valueOf(br.readLine());
    	PriorityQueue<Integer> queue = new PriorityQueue<>(N);
    	
    	for (int i=0; i<N; i++) {
    		queue.add(Integer.valueOf(br.readLine()));
    	}
    	
    	int a = 0;
    	int b = 0;
    	int sum = 0;
    	
    	while (queue.size() >= 2) {
    		a = queue.remove();
    		b = queue.remove();
    		
    		if (a<0 && b==0) {
    			break;
    		} else if (a<0 && b>0) {
    			sum += a;
    			queue.add(b);
    			break;
    		} else if (a==0) {
    			queue.add(b);
    			break;
    		} else if (a>0) {
    			queue.add(a);
    			queue.add(b);
    			break;
    		}
    		
    		sum += a*b;
    	}
    	
    	if (queue.size()%2 == 0) {
    		while (queue.size() >= 2) {
    			a = queue.remove();
    			b = queue.remove();
    			
    			if (a==1 || b==1) {
    				sum += a+b;
    				continue;
    			}
    			
    			sum += a*b;
    		}
    	} else {
    		sum += queue.remove();
    		
    		while (queue.size() >= 2) {
    			a = queue.remove();
    			b = queue.remove();
    			
    			if (a==1 || b==1) {
    				sum += a+b;
    				continue;
    			}
    			
    			sum += a*b;
    		}
    	}
    	
    	if (queue.size() == 1) {
    		sum += queue.remove();
    	}
    	
    	System.out.println(sum);
    }
}