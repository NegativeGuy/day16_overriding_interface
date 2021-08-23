package abstract_ex;

/*
Abstract를 사용하는 이유
프로그램 기능 상 꼭 실행되야하는 매서드를 혹시 까먹고
코드를 안 짜거나 상속만 받고 중요 클래스를 추가 하지 않는 등의
실수를 예방하기 위해 그 매서드를 추가 하지 않을경우
클래스 자체가 실행되지 않음으로서 문제가 있는 것을 알려주는 기능이다.
*/
abstract class Abstact{ // 클래스를 만들때 abstract를 붙여줌
	protected int num;		// 인스턴스 변수
	public void setNum(int num) {	// 일반 매서드(실체화-내용이 있는)
		this.num = num;
	}
	public abstract void combo(); // 추상 매서드 (추상화-틀만 만들어 둠)
	// {}(body)도 쓰지 않고 당연히 내용도 없다
}
class NewAbstract extends Abstact{	// Abstract 상속
	public void combo() {	// 오버라이딩
		// 위에 추상화를 해놨기 때문에 
		// 오버라이딩을 하지 않으면 이 클래스를 호출해도 클래스가 실행이 안됨
		System.out.println(num+" 단 콤보 공격 & 2대 더 때리기");
		
	}
}
public class Ex01 {
	public static void main(String[] args) {
//		NewAbstract b = new NewAbstract();
//		b.setNum(3);
//		b.combo();
		
		Abstact a = new NewAbstract();	//부모 이름으로 자식의 객체를 만듬
		a.setNum(3);	// 자식에게 없는 부모 매서드지만 상속으로 사용가능
		a.combo();	// 부모 자식 모두 있는 매서드지만 오버라이딩으로 자식매서드 실행
	}
}
