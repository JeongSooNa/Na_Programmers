package Programmers;

public class 문자열다루기기본 {
	public boolean solution(String s) {
        boolean answer = true;
        if(s.length()!=4&&s.length()!=6) return false;
        answer=s.matches("[+-]?\\d*(\\.\\d+)?\\ ?");
        return answer;
    }
}
