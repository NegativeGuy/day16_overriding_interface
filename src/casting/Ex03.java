package casting;

import java.util.ArrayList;

class AAA{
	public String getText() {
		return "AAA클래스";
	}
}
public class Ex03 {
	public static void main(String[] args) {
		Object a = new AAA();
		// Object는 모든 클래스의 조상클래스기 때문에
		// 위의 형태로도 객체를 생성할 수 있다
		// 그러나 자식의 매서드를 사용하려면
		// 아래처럼 down casting(형변환)을 해줘야 한다
		AAA aa = (AAA)a;
		aa.getText();
		
		ArrayList arr = new ArrayList();
		arr.add("test"); 
		// 이때 "test"는 String형(test)가 아닌 Object형(test)로 저장됨
		String s = (String)arr.get(0);
		// 따라서 String s 에 대입할 때 
		// Object형을 String형에 바로 대입 할 수 없기 때문에
		// (String)형으로 형변환을 해줘야 한다
	}
}
