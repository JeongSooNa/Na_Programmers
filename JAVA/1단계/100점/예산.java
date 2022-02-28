package stop_u;

import java.util.Arrays;

public class Stop_u {
	public static int solution(int[] d, int budget) {
        int answer = 0;
        int len = d.length;
        Arrays.sort(d);
        for(int i=0;i<len;i++) {
        	budget -= d[i];
        	if(budget<0) break;
        	answer++;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		
	}
}
