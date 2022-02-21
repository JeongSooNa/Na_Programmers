package stop_u;

public class 이상한문자만들기 {
	public static String solution(String s) {
        String answer = "";
        int len =s.length();
        String arr[] = s.split("");
        int count=0;
        for(int i=0;i<len;i++) {
        	if(arr[i].equals(" ")) count=1;
        	if(count%2==0) arr[i]=arr[i].toUpperCase();
        	else arr[i]=arr[i].toLowerCase();
        	count++;
        }
        for(String i : arr) answer += i;
        return answer;
    }
	public static void main(String[] args) {
		String s="try helllo world";
		System.out.println(solution(s));
	}
}
