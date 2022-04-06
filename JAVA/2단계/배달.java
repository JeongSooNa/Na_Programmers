package Programmers;

public class 배달 {
	public int solution(int N, int[][] road, int K) {
		// 제공 된 배열의 각 index값을 이용해
        // 1번 마을부터 K거리 안에 있는 마을들의 갯수를 구해야함.
        // N : 마을의 갯수
        // road[][0] : 마을1
        // road[][1] : 마을2
        // road[][2] : 마을1,2 사이의 거리
        // K : 배달갈 수 있는 거리 (road의 합이 K이하이면) 배달가능 마을
        // 다이어그램, 연결그림 그려보아 확인할 것!

        // 1. while문을 이용해 K이하로 도착할 수 있는지 반복해보자
        // 2. 그 외 방법 생각

        // 1번 마을에 배달이 가능해야하므로 1~N번마을까지 for문(1)
        // for문(2)는 경로의 경우의 수 만큼 돌리기. (K 넘기면 break)
		int answer = 0;
		
		for(int i=1;i<=N;i++) {
			int index = i;
			int length = 0;
			while(index != 1) {
				// 1번마을까지 이동하는 로직 구현
				// 길이 여러갈래면 짧은 길 선택.
				for(int j=0;j<road.length;j++) {
					if(road[j][0]==i) {
						index=road[j][1];
						length += road[j][2];
					}
					if(road[j][1]==i) {
						index=road[j][0];
						length += road[j][2];
					}
				}
				// ...
				// 알고리즘이 안풀린다.
				// Generic, Vector, MAX 등 이용하는데
				// 뭔지 모르겠다.
				// 슬프다.
			}
			
		}

		return answer;
	}
}
