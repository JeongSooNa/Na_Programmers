package stop_u;

public class 음양더하기 {
	public int solution(int[] absolutes, boolean[] signs) {
       int answer = 0;
       int len = absolutes.length;
       for(int i=0;i<len;i++) {
    	   if(signs[i]==false) absolutes[i]= -(absolutes[i]);
    	   answer += absolutes[i];
       } 
       return answer;
    }
}
