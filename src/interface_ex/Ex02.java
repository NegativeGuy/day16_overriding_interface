package interface_ex;

import java.util.Scanner;

// 상속과 마찬가지로 interface도 상속처럼 쓸 수 있음
// extends 대신 implements로 상속 받음
class B지상군 implements A공방{ //A공방 인터페이스를 impements. extends와 비슷
	// 무조건 인터페이스에 있는 추상화 코드를 오버라이딩 해와야 함
	public void attack() {
		총알구비();
		System.out.println("지상군이 공격 합니다");
	}
	public void defense() {
		방탄조끼();
		System.out.println("지상군이 방어 합니다");		
	}
	// 위에 attack, defense는 
	// A공방에 있는 인터페이스를 그대로 가져와서 기능을 추가한 것
	
	// 아래는 이 클래스에만 있는 추가 매서드들
	public void 총알구비() {
		System.out.println("총알을 구비 합니다");
	}
	public void 방탄조끼() {
		System.out.println("방탄 조끼를 착용 합니다");
	}
}

class B공군 implements A공방{
	public void attack() {
		System.out.println("공군이 공격 합니다");				
	}
	public void defense() {
		System.out.println("공군이 방어 합니다");		
	}
}
public class Ex02 {
	public static void main(String[] args) {
		/*
		B지상군 지상군 = new B지상군();
		B공군 공군 = new B공군();
		*/
		// 위에는 기존의 클래스들을 각각 객체와 변수를 만들어 주는 방식
		// 아래는 인터페이스를 통해 하나의 객체와 변수를 만들고 그 변수를 공유하는 방식
		A공방 a = null;	// 부모(인스턴스)로 변수를 하나 만듬
		System.out.println("적이 처들어 왔습니다");
		System.out.println("1.지상군 2.공군");
		int choice = 0;
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if(num==1) {
			System.out.println("지상군 선택");
			a = new B지상군();	
			//if문 조건에 따라 a변수를 이용해 원하는 클래스의 객체를 만들 수 있음
		}
		else {
			System.out.println("공군 선택");
			a = new B공군();
			// 마찬가지로 a변수 하나로 또 다른 클래스의 객체를 만들 수 있음
		}
		
		System.out.println("1.공격 2.방어");
		choice = input.nextInt();
		if(choice == 1) {
			a.attack();	// 위에 if문 조건에 따라 클래스가 정해지므로 
			// 따로 구분없이 매서드만 호출해도 알아서 그 클래스의 매서드가 실행됨		 
		}
		else {
			a.defense();
		}
		
		// 아래는 각각의 클래스별 변수와 객체를 만들었을 떄의 예시로
		// 위의 코드보다 길고 복잡한 코드가 된다
		/*
		if(choice == 1 && num == 1)
			a.attack();
		else if(choice == 2 && num == 1)
			지상군.defense();
		if(choice == 2 && num == 1)
			공군.attack();
		else if(choice == 2 && num == 2)
			공군.defense();
		*/
	}
}
