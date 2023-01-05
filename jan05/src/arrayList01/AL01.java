package arrayList01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

//랩퍼 클래스 생각하고 할 컬랙션

public class AL01 {
	public static void main(String[] args) {
	// < > 제네릭 1.5 추가 되었습니다. 내부 타입 요소 지정
		ArrayList<Integer> list = new ArrayList<Integer>();
		//값 추가 .add();
		
		list.add(150);
		list.add(110);
		list.add(100);
		list.add(99);
		list.add(85);
		list.add(75);
		
		//값 출력
		System.out.println(list);
		//.get(index);
		for(int i = 0; i<list.size() ; i++) {
			//System.out.println(list.get(i));
		}
		
		for (Integer integer : list) {
			System.out.println(integer);
		}
		
		//size()
		System.out.println(list.size());//정수타입 반환
		
		
		//list의 마지막 데이터 출력
		System.out.println(list.get(list.size()-1));
		
		//1~20까지 짝수만 순서대로 저장해주세요
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		for(int i = 1; i<21; i++) {
			if(i % 2 ==0) {
				list2.add(i);
				
			}
		}
		System.out.println(list2);
		
		list2.remove(0);
		
		System.out.println(list2);
		
		list.clear();//초기화
		System.out.println(list.size());//0
		
		for(int i=1; i<=20;i++) {
			list.add(i);
			
		}
		
		System.out.println(list);
		
		for(int i=0; i<list.size();i++) {
			if(list.get(i) % 2 == 1) {
				list.remove(i);
			}
		}
		System.out.println(list);
		for(int i = 0; i<20;i++) {
			if(i % 2 !=0) {
				list.add(i-1,i);
			}
		}
		System.out.println(list);
		
		
		
		
		
		
		list.add(0, 100);

//		System.out.println(list.size());
//		System.out.println(list.get(0));
//		System.out.println(list);
		
		//값이 있어?
		list.contains(20);
		System.out.println(list.contains(100));
		
		list.isEmpty();//비어있어?
		
		list.subList(0, 10); // 이사
		
		Collections.shuffle(list);//섞기
		System.out.println(list);
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		//값의 위치를 반환
		list.indexOf(10);
		//없다면 -1 있다면 index
		System.out.println(list.indexOf(99));
		
		
		
		
		
		
	}

	private static ArrayList<Integer> list(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
