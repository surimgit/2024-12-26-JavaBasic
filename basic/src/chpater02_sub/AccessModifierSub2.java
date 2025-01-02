package chpater02_sub;

import chapter02.F_AccessModifier;
// import chapter02.*;
// chapter02 package에 선언된 F_AccessModifier 클래스를 사용하기 위해 import

public class AccessModifierSub2 extends F_AccessModifier{

	void method() {
//		현재 위치: 다른 패키지의 상속받은 하위 클래스
//		public, protected 접근 제어자는 접근 가능
		super.publicInt = 10;
		super.protectedInt = 10;
//		package, private 접근 제어자는 접근 불가능  
//		super.packageInt = 10;
//		super.privateInt = 10;
	}
	
}

class AccessModifier3 {
	void method() {
		F_AccessModifier instance = new F_AccessModifier();
//		현재 위치: 다른 패키지의 관련 없는 클래스
//		public 접근제어자만 접근 가능
		instance.publicInt = 0;
//		protected, package, private는 접근 불가능
//		instance.protectedInt = 10;
//		instance.packageInt = 10;
//		instance.privateInt = 10;	
	}
}