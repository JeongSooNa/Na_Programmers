package Programmers;

import java.util.ArrayList;

public class 같은숫자는싫어 {
	public static int[] solution(int []arr) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(arr[0]);
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==arr[i-1]) continue;
			list.add(arr[i]);
		}
		int[] answer = new int[list.size()];
		for(int i=0;i<list.size();i++) answer[i] = list.get(i);
		return answer;


		// int len = arr.length;
		// int count = 0;
		// for(int i=1;i<len;i++) {
		// 	if(arr[i-1]==arr[i]) count++;
		// }
		// int[] answer = new int[len-count];
		// int count1 = 0;
		// for(int i=0;i<(len-count1);i++) {
		// 	for(int j=count1;j<len-1;j++) {
		// 		answer[i]=arr[j];
		// 		count1++;
		// 		if(answer[i]!=arr[j+1]) break;
		// 	}
		// }
		// answer[len-count-1] = arr[len-1];
		// return answer;
		//로직은 맞는데 44433 이게 에러가 뜬다.. 머지 배열?for문 문제?
	}
	public static void main(String[] args) {
		int[] arr = {1,1,3,3,0,1,1};
		int result[] = solution(arr);
		for(int i : result) {
			System.out.println(i);
		}
	}
}
