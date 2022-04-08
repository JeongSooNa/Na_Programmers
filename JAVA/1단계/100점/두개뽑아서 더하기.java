package Programmers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

public class 두개뽑아서더하기 {

	public int[] solution(int[] numbers) {
		HashSet<Integer> list = new HashSet<>();
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				list.add(numbers[i] + numbers[j]);
			}
		}
		int[] answer = list.stream().sorted().mapToInt(Integer::intValue).toArray();
		// 스트림생성().중개연산().최종연산() 으로 구성되어있다.
		// 파이프라인 : . 으로 연계할수 있는 방법
		return answer;
	}

	public static void main(String[] args) {
		// 기존
		String[] strArr = {"aaa", "bbb", "ccc"};
		List<String> strList = Arrays.asList(strArr);

		// 스트림 생성
		Stream<String> strStream1 = strList.stream();
		Stream<String> strStream2 = Arrays.stream(strArr);

		// 스트림 출력
		strStream1.sorted().forEach(System.out::println);
		strStream2.sorted().forEach(System.out::println);
		
		System.out.println(strStream1);
	}
}
