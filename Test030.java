/*==============================================
■■■연산자(Operator)■■■
//삼항 연산자 == 조건 연산자

//사용자로부터 임의의 정수를 입력받아
//입력받은 정수가 양수인지, 음수인지, 0인지 구분하여
// 단, 입력 데이터는 BufferedReader 의 readLine() 
// 을 통해 넘겨받을 수 있도록 한다.
//또한, 조건연산자(삼항연산자)를 활용하여 기능을 
//구현할 수 있도록 한다.

// 실행 예)
// 임의의 정수 입력 : -12
// -12 → 음수
// 계속하려면 아무 키나 누르세요..

// 임의의 정수 입력 : 257
// 257 → 양수
// 계속하려면 아무 키나 누르세요...

// 임의의 정수 입력 : 0
// 0 → 영
// 계속하려면 아무 키나 누르세요..
=============================================*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test030
{
	public static void main(String[] args) throws IOException
	{

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	int n; // 사용자 입력 정수
	String result; //양음영


	System.out.print("임의의 정수 입력 : ");
	n = Integer.parseInt(br.readLine());

	
	result = ((n == 0) ? "영" : ((n > 0) ? "양수" : "음수"));
	//							--------   --------  -----
	//      ---------   -----   ----------------------------
	//result = (n != 0) ? ((n > 0) ? "양수" :"음수") : "영" );

	System.out.printf("%d → %s",n,result);
	System.out.println();

	}
}

/*
임의의 정수 입력 : 5
5 → 양수
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : -10
-10 → 음수
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 0
0 → 영
계속하려면 아무 키나 누르십시오 . . .

*/