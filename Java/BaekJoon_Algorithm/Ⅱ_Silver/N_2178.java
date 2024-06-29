package baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class N_2178 {

	static int[][] miro;
	static boolean[][] visited;
	static int N, M;
	static int[] dx = {0, 1, 0, -1};
	static int[] dy = {1, 0, -1, 0};
			
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	N = Integer.valueOf(st.nextToken());
    	M = Integer.valueOf(st.nextToken());
    	
    	miro = new int[N][M];
    	visited = new boolean[N][M];
    	
    	for (int i=0; i<N; i++) {
    		st = new StringTokenizer(br.readLine());
    		String lineNum = st.nextToken();
    		
    		for (int k=0; k<M; k++) {
    			miro[i][k] = Integer.valueOf(lineNum.substring(k, k+1));
    		}
    	}
    	bfs(0, 0);
    	System.out.println(miro[N-1][M-1]);
    }
    
    static void bfs(int a, int b) {
    	Queue<int[]> queue = new LinkedList<>();
    	queue.offer(new int[] {a, b});
    	visited[a][b] = true;
    	
    	while(!queue.isEmpty()) {
    		int now[] = queue.poll();
    		for (int i=0; i<4; i++) {
    			int x = now[0] + dx[i];
    			int y = now[1] + dy[i];
    			if (x>=0 && y>=0 && x<N && y<M) {
    				if (miro[x][y]==1 && !visited[x][y]) {
    					visited[x][y] = true;
    					miro[x][y] = miro[now[0]][now[1]]+1;
    					queue.offer(new int[] {x, y});
    				}
    			}
    		}
    	}
    }
}