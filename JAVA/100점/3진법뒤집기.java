package stop_u;

public class three진법뒤집기 {
	class Solution {
	    public int solution(int n) {
	        int answer = 0;
	        int len = (int)(Math.log10(n)/Math.log10(3))+1;
	        int[] array = new int[len];
	        int tmp = n;
	        for(int i=0;i<len;i++) {
	        	array[i]=tmp%3;
	        	tmp=tmp/3;
	        }
	        for(int i=0;i<len;i++) {
	        	answer += array[i]*(Math.pow(3, len-1-i));
	        }
	        return answer;
	    }
	}
	public static void main(String[] args) {
		int len = (int)(Math.log10(45)/Math.log10(3));
		System.out.println(len);
	}
}
