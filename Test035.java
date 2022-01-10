/*=====================================
■■■실행 흐름의 컨트롤(제어문)■■■
======================================*/
//홀수, 짝수, 영
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test035
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;

		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());

		//String result;
		String result = "판정 불가";

		if(n == 0)
		{
			result = "영";
		}
		else if (n % 2 == 0)
		{
			result = "짝수";
		}
		else if (n % 2 != 0)
		{
			result = "홀수";
		}
		/*else 
			result = "판정 불가";*/
		
		System.out.println(n + " → " + result); 
		// 자바는 영짝홀 아닐 때, 어쩌라고?
		// 컴파일에러발생.
		// 자바는 if구문으로 result를 채우는구나
		// else가 없으니 영짝홀은 나누는데
		// 나머지는 뭐어쩌라는거지?
		//그래서 에러!!!!!!!!!!1

		//그래서 else
		//       초기화


/*		if (n%2==0)
		{
			System.out.print(n + "	→ 짝수 ");
		}
		else if (n%2!=0)
		{
			System.out.print(n + " → 홀수 ");
		}
		else
			System.out.println(n + " → 영");
/*
임의의 정수 입력 : 0
0       → 짝수 계속하려면 아무 키나 누르십시오 . . .
0도 나누면 나머지 0이라서
짝수로 판별됨.!
*/

//→ 그래서 0인지 먼저 처리해야지
//   짝수랑 0구분이 n%2 ==0조건에 다 맞음!

	}
}
// ※ 조건문을 구성할 때에는
//    항상 조건의 구성 순서에 유의해야 한다.


// ※ if ~ else 구문의 중첩 구문은
//	  반드시 else로 끝나야 하는 것이 아니다.
//	  다만, 출력해야 할 구문을 처리하는 과정에서
//	  문제가 발생하지 않는 구문으로 작성해야 한다.


// ※ 조건문 구성 과정에서 이외의 영역(else)을
//    업무에 포함된 내용으로 처리하는 것은 바람직하지 않을 경우가 있다.
//    불가능한 경우는 어쩔 수 없더라도
//    가급적이면 업무에 포함되지 않는 내용을
//    이외의 영역(else)에서 처리할 수 있도록 하자.
// ex)주민번호, 010 등




