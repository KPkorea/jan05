package is_a_has_a;
//클래스의 관계
//is a, 	has a 관계가 있다
/*
 * is a : ~은 ~이다.
 * 
 * 
 * has a : ~은 ~을 가지고 있다.
 * 
 * 
 */

class Human{
	String name;
	int age;
	int gender;
}
//이 상속관계에서는 학생이 사람을 상속받고있습니다.
//학생은 사람이다가 성립됩니다 이런 관계를 is a 관계 라고 합니다.


class Student extends Human{
	int number; // 학번
	String major; // 전공
}


class Gun{
	String name;
	int shot;//총알
	
}
//has a : 경찰은 총을 가지고있습니다.
// 경찰 클래스 속에 총 클래스의 객체를 멤버로 가지고있는 경우
class Police{
	Gun gun;
}










public class Is {
	public static void main(String[] args) {
		
		Police police = new Police();
		Gun gun = new Gun();
		police.gun = gun;
		police.gun.name = "총이름";// "polic.gum" is null 
		
		
		
	}
}
