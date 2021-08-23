package interface_ex;
interface Test{
	// 변수 인터페이스는 final 혹은 static 으로 생성해줘야 그 변수를 쓸 수 있음
	public static final int a = 12345;
	public final int a1 = 12345;
	public static int a2 = 12345;
	public static final String id = "홍길동";
	public static final String pwd = "12345";
}
public class Ex03 implements Test{
	public static void main(String[] args) {
		System.out.println(Test.id);
		System.out.println(Test.pwd);
		
		// implements를 했기 때문에 Test.을 생략해도 됨
		System.out.println( id );
		System.out.println( pwd );
	}
}
