/*=====================================
■■■ 클래스와 인스턴스 ■■■
======================================*/

//※ CircleTest.java 파일과 세트 ~!!

// 원의 넓이와 둘레 구하기
// 원의 넓이와 둘레를 구할 수 있는 클래스를 설계한다.
// (클래스명 : CircleTest) → CircleTest.java
// BufferedReader의 readLine() 활용.

// 원의 넓이 = 반지름 * 반지름 * 3.141592
// 원의 둘레 = 반지름 * 2 * 3.141592

// 실행 예)
// 반지름 입력 : xx


// >> 반지름이 xx인 원의
// >> 넓이 : xx.xx
// >> 둘레 : xx.xx
// 계속하려면 아무 키나 누르세요....
import java.io.IOException;
//인스턴스 생성할때, import가 필요없는 이유는????????
// ▶▶▶▶▶▶▶▶ 물리적으로 같은 디렉토리안에 있어서


public class Test073
{
	public static void main(String[] args) throws IOException //--아하, 아까는 같은 파일이라 이거 한번만
															  //  import하면 됐는데 지금은 다른 파일이니까 
															  //  해줘야해! 
	{
		// CircleTest 클래스 기반 인스턴스 생성
		// CircleTest 인스턴스 생성
		// CircleTest 객체 생성
		CircleTest cc = new CircleTest();

		cc.input();
		double area = cc.circleArea();
		double length = cc.circleLength();
		cc.circlePrint(area,length);
		
	}
}

/*
반지름 입력 : 10
반지름이 10인 원의
넓이 : 314.16
둘레 : 62.83
계속하려면 아무 키나 누르십시오 . . .
*/