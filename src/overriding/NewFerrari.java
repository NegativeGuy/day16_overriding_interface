package overriding;

// 자식 클래스
public class NewFerrari extends Ferrari{	// Ferrari를 상속
	public NewFerrari(int ye, int speed) {	// 생성자
		super(ye, speed);	// 부모 Ferrari 클래스로 아규먼트를 보냄
	}
	public void speed() { // 부모와 똑같은 이름의 매서드 생성
		// (overriding: 부모매서드가 아닌 자식(자신)의 매서드를 실행)
		System.out.println(getYe()+"년 페라리 속도 "+getSpeed()+"km 입니다.");
		// super.getYe, super.getSpeed라고 써도 됨
		System.out.println("터보 엔진으로 동작합니다.");
		// 부모 매서드에는 없던 추가내용
	}
	public void autoSystem() {
		System.out.println("자동운전 모드를 시작합니다");
	}
}
