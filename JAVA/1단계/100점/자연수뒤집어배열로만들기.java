package Programmers;

public class 자연수뒤집어배열로만들기 {
	public static int[] solution(long n) {
        String n_s = Long.toString(n);
        int len = n_s.length(); 
		int[] answer = new int[len];
		String arr[] = new String[len];
		arr = n_s.split("");
        for(int i=0;i<len;i++) {
        	answer[len-1-i] = Integer.parseInt(arr[i]);
        }
        return answer;
    }
	public static void main(String[] args) {
		long n = 1234;
		for(int i : solution(n)) {
			System.out.println(i);
		}
	}
}
