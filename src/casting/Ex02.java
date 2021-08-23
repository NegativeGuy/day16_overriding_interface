package casting;
class Parents{
	public void familyName() {
		System.out.print("이 ");
	}
	public void name() {
		familyName();
		System.out.println("순신");
	}
}
class Daugther extends Parents{
	public void name() { // 오버라이딩
		familyName();
		System.out.println("국주");
	}
}
class Son extends Parents{
	public void name() { // 오버라이딩
		familyName();
		System.out.println("기광");
	}
}

public class Ex02 {
	public static void main(String[] args) {
		/*
		기존의 방식대로 각각의 객체 생성하면 아래와 같다
		Parents p = new Parents();
		p.name();
		Daugther d = new Daugther();
		d.name();
		Son s = new Son();
		s.name();
		*/
		
		// 캐스팅을 활용한 예
		// 부모로 변수를 하나 만들고 부모객체를 생성
		Parents p = new Parents();
		// 부모 자신의 매서드 실행 
		p.name();

		// 같은 변수p로 자식의 객체(Daugther) 만듬
		p = new Daugther();
		// Daugther의 매서드 실행
		p.name();
		
		// 같은 변수p로 다른 자식의 객체(Son) 만듬
		p = new Son();
		// Son의 매서드 실행
		p.name();
	}
}
