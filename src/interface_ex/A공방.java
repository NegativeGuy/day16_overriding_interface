package interface_ex;

// 인터페이스에는 추상화(기능이 없는)로 만든 매서드만 있어여 한다
// 이것은 어떤 기능을 하는 매서드라기 보다는
// 서로 다른 개발자가 하나의 프로젝트를 할 때
// 기본 틀을 서로 약속하기 위해 알림역할을 위해 적어놓은 매서드들이다.
// 일종의 틀만 존재하는 개념
// 이 틀을 기준으로 앞으로 각자 코드를 작성하자는 약속이다.
// 남이 만든 복잡한 코드들을 볼 때에도
// 인스턴스를 보면 어떤 구조로 만들어졌는지 한눈에 알아보기 쉽다.

public interface A공방 { // 'A공방'이라는 인터페이스 생성
	public void attack();
	public void defense();

//	만약 아래처럼 인스턴스 내에 기능을 하는(내용이 있는) 매서드가 포함되면 에러가 발생함  

//	public void test{
//		System.out.println("실체화 매서드는 에러 남");
//	}

}
