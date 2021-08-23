package overriding;

// 부모 클래스
public class Ferrari {
	private int ye, speed;	// 인스턴스 변수
	public Ferrari(int ye, int speed) {	//생성자
		this.ye = ye;
		this.speed = speed;
	}
	public void speed() {	//매서드
		System.out.println(ye+"년 페라리 속도 "+speed+"km 입니다.");
	}
	public int getYe() {return ye;}
	public int getSpeed() {return speed;}
	
}
