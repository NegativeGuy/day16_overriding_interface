package casting;

/*
casting(형변환)

up casting
- 자식 형태의 값을 부모 형태로 변환하는 것

down casting
- 부모 형태의 값을 자식 형태로 변환하는 것
*/


class A01{	// 부모 클래서 생성
	public void getText() {	//부모 getText 매서드
		System.out.println("A클래스");
	}
}
class B01 extends A01{	// 자식 매서드 생성
	public void getText() {	//오버라이딩(부모의 매서드와 동일한 이름의 매서드 생성)
		System.out.println("B클래스");	// 내용은 부모 매서드와 다름
	}
}
class C01 extends A01{	// 또 다른 자식 매서드 생성
	public void getText() {	//오버라이딩
		System.out.println("C클래스");
	}
}
public class Ex01 {
	public static void main(String[] args) {
		/*
		아래는 기존의 방법대로 객체와 변수를 만들어 사용하는 방법으로
		각각의 클래스 수대로 객체와 변수를 만들어줘야 한다.
		
		B01 b = new B01();
		b.getText();	//오버라이딩 되어 자식의 매서드가 실행
		C01 c = new C01();
		c.getText();	//오버라이딩 되어 자식의 매서드가 실행
		*/
		
		//up casting 활용
		A01 a = new B01();	// 부모의 클래스로 변수를 이용해서 자식의 객체를 생성
		a.getText();	// 해당 자식 클래스의 매서드 실행
		a = new C01();	// 같은 변수로(일종의 재활용) 다른 자식 클래스 객체 생성
		a.getText();	// 다른 자식 클래스의 매서드 실행
	}
}
