package Programmers;

import java.util.ArrayList;

public class 제일작은수제거하기 {
	
	// 제네릭 컬렉션으로 풀자!
	public int[] solution(int[] arr) {
		int[] s = {-1};
		if(arr.length==1) return s;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int min = arr[0];
        for(int i : arr) {
        	if(i<min) min=i;
        }
        for(int i : arr) {
        	if(i!=min) ans.add(i);
        }
        int[] answer = new int[ans.size()];
        for(int i=0;i<ans.size();i++) {
        	answer[i] = ans.get(i);
        }
        return answer;
    }
//	public int[] solution(int[] arr) {
//		int len = arr.length;
//		int[] len1 = {-1};
//		if(len==1) return len1;
//		int[] answer = new int[len-1];
//		
//		int count = 0;
//		int min = 1000;
//		for(int i=0;i<len;i++) {
//			if(min>arr[i]) min=arr[i];
//		}
//		for(int i=0;i<len;i++) {
//			if(arr[i]==min) break;
//			count++;
//		}
//		
//		for(int i=0;i<len;i++) {
//			if(arr[i]==min) break;
//			answer[i]=arr[i];
//		}
//		for(int i=count;i<len-1;i++) {
//			answer[i]=arr[i-1];
//		}
//		
//        return answer;
//    } //0점..?
}
