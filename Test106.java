 /*===============================================
■■■ 메소드 중복정의(Method Overloading) ■■■
================================================*/ 

// Method Overloading이 가능한 형태와 불가능한 형태
 public class Test106
 {
	 public static void main(String[] args)
	 {
		 print(3.14); //-- 자바는 대입연산자 있으면 오른쪽부터처리
		 			  //-- 값반환이고 나발이고 몰라 둘다 같은 말.
					  //-- 반환이 없든 (void)이든 double이든 자바는 몰라
		 double result = print(3.14);
	 }
	// public static void print() {}
	 //public static void print() {} //--default (x)

	// public static void print(int i) {}
	 //public static void print(int j) {} //-- 이건 안돼 (x)
	 								    //-- 밖에서 이름붙히는게 아님

	// public static void print(char c) {}    //-- 일단 됨. 근데 자동형변환 규칙 check~!!
	 
	// public static void print(int i,int j) {}

	// public static void print(double d) {}

	 //public static void print(double e) {return 10.0} //--정의 불가 void인데 return자료형 반환이라
	

	 public static double print(double e) {return 10.0;}//--(x) check~!!

 } 