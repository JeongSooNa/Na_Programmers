package Programmers;

import java.util.Arrays;

public class 문자열내마음대로정렬하기 {
	public static String[] solution(String[] strings, int n) {
		int leng = strings.length;
        String[] answer = new String[leng];
        for(int i=0;i<leng;i++) {
        	int len = strings[i].length();
        	answer[i]=strings[i].substring(n, len)+strings[i].substring(0, n);
        }
        Arrays.sort(answer);
        for(int i=0;i<leng;i++) {
        	int len = answer[i].length();
        	answer[i]=answer[i].substring(len-n, len)+answer[i].substring(0, len-n);
        }
        return answer;
        // 맞는데 뭔가 안된다.. 채점시 100점 안나옴, 통과
    }
	public static void main(String[] args) {
		String[] x = {"sun","bed","car"};
		for(String i:solution(x, 1)) System.out.println(i);
	}
}
