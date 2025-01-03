package chapter02;

// 접근 제어자(access modifier): 클래스, 메서드, 필드에 대해서 외부 접근에 대한 제어를 하는 것
// public: 모든 패키지에서 접근 가능
// protect: 같은 패키지 내부, 외부 패키지의 자손 클래스에서 접근 가능
// default: 같은 패키지 내의 클래스에서 접근 가능
// private: 오직 같은 클래스 내에서만 접근 가능

// 특정 클래스 파일(.java파일)에서 public 클래스는 
// 파일명과 일치해야 하고 단 하나만 지정 가능
// public class ExampleClass{
//	
// }

class AccessModifierSub1 {
	void method(){
		F_AccessModifier instance = new F_AccessModifier();
//		현재 위치: 같은 패키지 내에 다른 클래스
//		public, protected, package 접근 제어자는 같은 패키지 내부에서 접근 가능
//		private는 같은 클래스가 아니면 접근 불가능
		instance.publicInt = 10;
		instance.protectedInt = 10;
		instance.packageInt = 10;
//		instance.privateInt = 10;	
	}
}



public class F_AccessModifier {
	public int publicInt;
	protected int protectedInt;
	int packageInt;
	private int privateInt;
	
	public static void main(String[] args) {
		F_AccessModifier instance = new F_AccessModifier();
		instance.publicInt = 10;
		instance.protectedInt = 10;
		instance.packageInt = 10;
		instance.privateInt = 10;		
	}
}
