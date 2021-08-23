package interface_ex;

// 두 사람이 지상군과 공군에 대해 각각class를 만든다고 가정 했을 때
// 각자 자기만의 스타일로 코드를 짜게 될 것이다.
// 나중에 서로의 클래스를 합칠 때 코드가 통일성이 없어서
// 기능은 정상적으로 실행되어도 코드가 복잡해 보일 수 있다.
// 그래서 미리 코드의 스타일을 정해서 코드의 통일성을 갖출 수 있다.

// 아래는 인터페이스를 쓰지 않은 예제
class A지상군{
	public void 공격() {
		System.out.println("지상군이 공격 합니다");
	}
	public void 방어() {
		System.out.println("지상군이 방어 합니다");
	}
}
class A공군{
	public void 미사일공격() {
		System.out.println("비행기 출격~");
	}
	public void 방어시스템() {
		System.out.println("미사일을 방어!!");
	}
	public void defense() {
		System.out.println("방어 미사일 발사!!");
	}
	
}
public class Ex01 {
	public static void main(String[] args) {
		// 두명이 각각 class를 만들기 때문에 코드의 통일성이 없다
		// 그래서 인터페이스를 통해서 서로간의 규약을 정한다
		A지상군 army = new A지상군();
		army.공격();
		army.방어();
		A공군 airForce = new A공군();
		airForce.미사일공격();
		airForce.방어시스템();
		airForce.defense();
	}
}
