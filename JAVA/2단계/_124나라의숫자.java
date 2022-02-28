class Solution {
    public String solution(int n) {
        String answer = "";
        if(n%3==0) n=n-3;
        while(true) {
        	if(n%3==0) answer = "4"+answer;
        	if(n%3==1) answer = "1"+answer;
        	if(n%3==2) answer = "2"+answer;
        	n=n/3;
        	if(n==0) break;
        }
        
        return answer;
    }
}

// 10진법의 수들을 나열한 후 3진법, [1,2,4]진법으로 나타내어 규칙을 살펴본 결과
// 3의 배수일 때 (-3)을 하는 과정이 필요하여 
// 3의 배수일 때 -3하여 계산한 값을 return할 수 있도록 구현.
// 하지만 Test는 통과하나 그 이후 어딘가서 값이 틀려 채점 시 점수x
// 머선일이고