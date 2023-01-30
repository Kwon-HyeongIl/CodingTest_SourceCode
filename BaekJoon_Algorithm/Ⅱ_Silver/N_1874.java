package baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class N_1874 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.valueOf(br.readLine());
		Stack<Integer> stack = new Stack<>();
		int num = Integer.valueOf(br.readLine());
		int countNum = 1;
		
		R : while (true) {
			if (countNum <= n) {
				stack.push(countNum);
				countNum++;
				sb.append("+").append("\n");
			}
			
			if (countNum>n && stack.peek()>num) {
				System.out.print("NO");			
				break;
			}
			
			try {
			while (stack.peek() == num) {
				stack.pop();
				sb.append("-").append("\n");
				
				if (stack.empty() && countNum>n) {
					break R;
				}
				num = Integer.valueOf(br.readLine());
			}
			} catch (Exception e) {}
		}
		
		if (stack.empty()) {
			bw.write(String.valueOf(sb));
		}
		bw.flush();
		br.close();
	}
}