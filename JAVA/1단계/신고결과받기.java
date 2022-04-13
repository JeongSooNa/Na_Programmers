package Programmers;

import java.util.ArrayList;
import java.util.List;

public class 신고결과받기 {
	public static int[] solution(String[] id_list, String[] report, int k) {
		int[] answer = new int[id_list.length];
		int[] benCount = new int[id_list.length];
		// report 중복제거
		List<String> report2 = new ArrayList<String>();
		for(String i : report) {
			if(!report2.contains(i)) report2.add(i);
		}
		// ben User 구하기
		for(String i : report2) {
			String ben = i.split(" ")[1];
			for(int j=0;j<id_list.length;j++) {
				if(ben.equals(id_list[j])) benCount[j]++;
			}
		}
		List<String> benList = new ArrayList<String>();
		for(int i=0;i<id_list.length;i++) {
			if(benCount[i]>=k) benList.add(id_list[i]);
		}
		// 중복제거된 report에서 각 id별 ben된 answer++하기
		for(int i=0;i<id_list.length;i++) {
			for(String j : report2) {
				if(!id_list[i].equals(j.split(" ")[0])) continue;
				if(!benList.contains(j.split(" ")[1])) continue;
				for(int l=0;l<id_list.length;l++) {
					if(id_list[l].equals(j.split(" ")[0])) answer[l]++;
				}
			}
		}
		return answer;
		// 시간초과가 뜬다.. id_list, report를 따로 int형 변수로 변환해 index값을 이용해 검색?
		
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
	public static int[] solution2(String[] id_list, String[] report, int k) {
        int len = id_list.length;
        // 중복제거 먼저
        List<String> repList = new ArrayList<String>();
        for(String i : report) {
        	if(!repList.contains(i)) repList.add(i);
        }
        // report를 int형 id index로 변경
        int[][] rep = new int[repList.size()][2];
        for(int i=0;i<repList.size();i++) {
        	String[] tmp = repList.get(i).split(" ");
        	for(int j=0;j<len;j++) {
        		if(tmp[0].equals(id_list[j])) rep[i][0]=j;
        	}
        	for(int j=0;j<len;j++) {
        		if(tmp[1].equals(id_list[j])) rep[i][1]=j;
        	}
        }
        // benCount
        int[] benCount = new int[len];
        for(int i=0;i<rep.length;i++) benCount[rep[i][1]]++;
        
        for(int i=0;i<rep.length;i++) {
        	
        }
        int[] answer = new int[len];
        return answer;
    }
	
	
	public static void main(String[] args) {
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2; //신고 2번 당하면 이용정지
		int[] result = solution2(id_list,report,k);
		for(int i : result) {
			System.out.println(i);
		}
	}
}
