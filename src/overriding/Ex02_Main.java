package overriding;

import java.util.ArrayList;

class AA extends ArrayList{	// ArrayList 상속받음
	public void aa() {
		System.out.println("자식의 기능 실행");
	}
	public Object get(int i) {	// ArrayList에 Object라는 같은 이름의 매서드가 있음
		// 따라서 overriding 되므로 아래의 return이 호출된 곳으로 보내짐
		return "자식이 만든 get이다";
	}
	public boolean add(Object o) {
		System.out.println("추가하는 기능");
		return true;
	}

//class BB extends String{	// final이 붙으면 상속이 안되기 때문에 상속불가
final class BB{	//String은 아래처럼 그냥 개체만들거나 하여 쓴다
	String s = new String();
	String ss;
	public void bb() {
		System.out.println("bb의 기능");
	}
}
class CC{
	BB b = new BB();	//BB가 final이기 때문에 삭속을 못함. 그래서 객채를 생성
	public void bb() {
		b.bb();
		System.out.println("cc의 기능");
	}
	
}
}
public class Ex02_Main {
	public static void main(String[] args) {
		AA a = new AA();	// 객체 생성
		a.add("안녕하세요");	//ArrayList를 상속 받았기 때문에 바로 사용 가능
		System.out.println("저장값 : "+a.get(0));
	}
}
