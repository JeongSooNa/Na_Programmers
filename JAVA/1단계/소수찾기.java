package Programmers;

import java.util.ArrayList;

public class 소수찾기 {
//	public  int solution1(int n) {
//        int answer = 0;
//        int[] array = new int[n];
//        for(int i=0;i<n;i++) array[i]=i+1;
//        for(int i=1;i<n-1;i++) {
//        	int tmp=0;
//        	for(int j=2;j<=array[i];j++) {
//        		if(array[i]%j==0) tmp++;
//        	}
//        	if(tmp==0) answer++;
//        }
//        return answer;
//    }
//	처음에는 배열을 만들어 풀라고 했는데 굳이 그럴 필요가 없음!
//	public  int solution(int n) {
//        int answer = 0;
//        int count = 0;
//        for(int i=2;i<=n;i++) {
//        	count=0;
//        	for(int j=2;j<i;j++) {
//        		if(i%j==0) {
//        			count++;
//        			break;
//        		}
//        	}
//        	if(count==0) answer++;
//        }
//        return answer;
//    }
//	public int solution3(int n) {
//        int answer = 0;
//        int arr[] = new int[n];
//        for(int i=0;i<n;i++) arr[i]=i+1;
//        
//        for(int i=1;i<n;i++) {
//        	int count=0;
//        	for(int j=2;j<arr[i];j++) {
//        		if(arr[i]%j==0) count++;
//        	}
//        	if(count!=0) arr[i] = 0;
//        }
//        
//        for(int i:arr) {
//        	if(i!=0) answer++;
//        }
//        return answer;
//    }
	
	// 제네릭 컬렉션즈를 사용해 풀어보자.
//	public int solution(int n) {
//        int answer = 0;
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        ArrayList<Integer> ansList = new ArrayList<Integer>();
//        for(int i=2;i<=n;i++) {
//        	list.add(i);
//        }
//        for(int i : list) {
//        	int checkX = 0;
//        	for(int k : ansList) {
//        		if(i%k==0) {
//        			checkX++;
//        			break;
//        		}
//        	}
//        	if(checkX==1) continue;
//        	int count=0;
//        	for(int j=2;j<=i;j++) {
//        		if(i%j==0) count++;
//        	}
//        	if(count==1) {
//        		ansList.add(i);
//        		answer++;
//        	}
//        }
//        return answer;
//    }
	
	// 배열을 생성. 에라토스테네스의 체 사용.
	public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n+1];
        for(int i=0;i<n+1;i++) arr[i]=i;
        arr[0]=0; arr[1]=0;
        for(int i:arr) {
        	// ArrayList를 통해 계산을 줄이거나 다른 배열의 배수값을 바꿀 방법이 있을까?
        	//  고민중..
        	if(i==0) continue;
        	int count = 0;
        	for(int j=2;j<=i;j++) {
        		if(i%j==0) count++;
        		if(count>1) break;
        	}
        	if(count==1) answer++;
        }
        return answer;
    }
}
