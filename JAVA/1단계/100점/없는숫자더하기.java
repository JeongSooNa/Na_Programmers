package Programmers;

public class 없는숫자더하기 {
	public int solution(int[] numbers) {
        int answer = 0;
        
        for(int i=0;i<10;i++) {
        	int count = 0;
        	for(int j=0;j<numbers.length;j++) {
        		if(numbers[j]==i) count++;
        	}
        	if(count==0) answer += i;
        }
        return answer;
    }
}
