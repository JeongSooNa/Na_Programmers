package Programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 신고결과받기 {
	public static int[] solution(String[] id_list, String[] report, int k) {
		int[] answer = new int[id_list.length];
		int[] benCount = new int[id_list.length];
		// ben User 구하기
		for(String i : report) {
			String ben = i.split(" ")[1];
			for(int j=0;j<id_list.length;j++) {
				if(ben.equals(id_list[j])) benCount[j]++;
			}
		}
		List<String> benList = new ArrayList<String>();
		for(int i=0;i<id_list.length;i++) {
			if(benCount[i]>=k) benList.add(id_list[i]);
		}
		Map<String, String[]> map = new HashMap<String, String[]>();
		// 음...... 해보자
		
		
		return answer;
		
//		int[] answer = new int[id_list.length];
//        int idLen = id_list.length;
//        int repLen = report.length;
//        String[][] array = new String[idLen][repLen];
//        for(int i=0;i<idLen;i++) {
//        	array[i] = report[i].split(" ");
//        }
        //배열에서 중복 제거하기
        // 이건... 문자정렬,중복제거가 힘드네
        //count
        //find ban user
    }
	
	
	public static void main(String[] args) {
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2; //신고 2번 당하면 이용정지
		int[] result = solution(id_list,report,k);
		for(int i : result) {
			System.out.println(i);
		}
	}
}
