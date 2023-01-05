package wrapper;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

//랩퍼클래스
//능력단위 : (비NCS) 웹 표준기술
//능력단위요소 : (비NCS) 웹 표준기술

/* 자료구조?
 * 컬렉션은 참조값(레퍼런스 R타입)만 담을수있습니다.
 * 
 * P타입은 저장할수없습니다.
 * 그래서 랩퍼 클래스로 변환 후 저장합니다.
 * 
 * 기본 자료형의 값을 컬랙션에 저장하기위해서 사용합니다.
 * 모든 기본 자료형에 대해 그에 대응되는 래퍼 클래스가 있습니다.
 * 
 * 기본 자료형의 값을 멤버 변수에 저장하고
 * 이 값 주변으로 값을 감싸고 잇는 메소드가 있다고해서
 * 랩퍼(wrapper, 감싸다) 클래스라고 불립니다.
 * 
 * 기본 타입		랩퍼 클래스명
 * 
 * 	byte				Byte
 *	short				Short
 * 	int					Integer-------
 * 	long				Long
 * 	float				Float
 * 	double				Double
 * 	char				Character-----
 * 	boolean				Boolean
 * 
 * 프로모션??
 */

public class Wrapper {
	public static void main(String[] args) {
		
		Byte b = new Byte((byte) 127);
		Byte b2 = 127;
		
		Integer iNum = new Integer(127);
		Integer iNum2 = 127;//오토박싱 <-> 언박싱
		
		byte bNum = iNum2.byteValue();//캐스팅이 아닙니다.
		short sNum = iNum2.shortValue();
		float fNum = iNum2.floatValue();
		
		iNum = Integer.MAX_VALUE;
		System.out.println(iNum);//2147483647
		iNum = Integer.MIN_VALUE;
		System.out.println(iNum);//-2147483648
		
		System.out.println(  Byte.MAX_VALUE     );//127
		System.out.println(Byte.MIN_VALUE);//-128
		
		System.out.println(Double.MAX_VALUE);//1.7976931348623157E308
		
		System.out.println(Byte.MAX_VALUE / Byte.MIN_VALUE);
		System.out.println(Byte.MIN_VALUE / Byte.MAX_VALUE);
		
		
		//오토박싱
		Integer iNum3 = 127;
		Integer iNum4 = new Integer(127);
		//형 변환이 아닙니다. 기본타입이 참조타입으로 바뀝니다.
		
		if(iNum3 == 127) {
			System.out.println("같아요");
		}else {
			System.out.println("달라요");
		}
		
		System.out.println(iNum3.equals(127));
		//같은면 true, 다르면 false
		System.out.println(iNum3.compareTo(300));
		//같으면 0, 앞숫자가 크면 1, 뒷숫자가 크면 -1
		
		
		//오토박싱
		int number = iNum3;
		//iNum3이 참조하고 있는 객체안에 있는 int 값이
		//객체 밖으로 나와 number 에 들어갑니다.
		System.out.println(number);
		
		Object obj = 10;
		System.out.println(obj);
		
		int result = (int)obj;
		System.out.println(result);
		
		result = (Integer)obj;
		result = ((Integer) obj).intValue();
		
		
		Set<Integer> lotto = new HashSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		Map<Integer, Integer>map;
		
	}
}


