# Na_Programmers
programmers question&amp;answer

programmers java 2단계 진행중. "배달"문제 해결할 것!
(아직 push안하고 스케치만 완료)

```java
package na;

import java.lang.reflect.Array;
import java.util.Arrays;

public class 배달 {
	public int solution(int N, int[][] road, int K) {
        int answer = 0;
        
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
        
        // 1부터 2,3,4,...까지 k거리 안에 갈 수 있는지를 구해보자!
        // count에다 거리(road[][2]를 ++)
        
        int len = road.length;
        for(int i=1;i<=N;i++) {
        	int count = 0;
        	while(true) {
        		// 이중for문?
        		// road[][0] -> road[][1]
        		// road[][0] -> road[][1] ...
        		// 이 작업 반복을 통해 N에 도달.
        		// K거리가 넘으면 break를 통해 반복문 종료.
                //
         		
        		if(count>K) break;
        	}
        }
        
        return answer;
    }
	public static void main(String[] args) {
		// 값이 있는 index출력
		Integer[] x = {1,1,1,3,2};
		System.out.println(Arrays.asList(x).indexOf(2));
		// 중복 될 경우 첫번째 찾은 index출력
	}
}

```
