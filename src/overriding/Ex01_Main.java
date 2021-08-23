package overriding;

public class Ex01_Main {
	public static void main(String[] args) {
		/*
		overriding
		- 상속받은 부모의 메서드를 자식의 필드에서 내용변경(패치)하는 것
		- 부모 메서드에는 없던 기능을 자식이 상속받아 내용추가 할 때도 사용
		
		조건
		- 부모 메서드의 형식과 동일하게 자식 메서드를 만드는 것
			1) 반환타입이 같아야 한다
			2) 매개변수의 개수와 타입이 같아야 한다
			3) 접근 제한자가 부모와 같거나 커야 한다
			- private < package < protected < public
		*/
		
		// 같은 패키지의 Ferrari와 NewFerrari 클래스 활용
		
		/*
		Ferrari fe = new Ferrari(2021, 350);
		fe.speed();
		*/
		
		// 위 처럼 부모 클래스로 객체를 만들어 쓰지 않고
		// 상속받은 자식 클래스로 객체를 만들어 부모로부터 받은 매서드에 추가기능까지 넣어서 실행
		
		NewFerrari fe = new NewFerrari(2022, 400);
		fe.speed();
		fe.autoSystem();
	}
}
