package Programmers;

public class 짝수와홀수 {
	public String solution(int num) {
        String answer = "";
        if(num%2==0){
          answer="Even";
          return answer;
        }else{
          answer="Odd";
          return answer;
        } 
        // if 2개를 쓰면 100점이 안나오는데
        // if else를 쓰면 100점!
        // 왜지? 나머지가 음수일 경우나 다른 경우의 수가 있을까?
        // 수학자한테 물어보면 될 것 같다.

        // ==0 / !=0 으로 하면 또 100점!
        // 그냥 0/1 그 외의 결과값들도 있거나 있으면 했나보다
    }
}
