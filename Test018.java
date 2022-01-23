/*==============================================
■■■자바의 개요 및 특징 ■■■
=============================================*/
public class Test018
{
	public static void main(String[] args)
	{
		System.out.print("AAA");
		System.out.print("BBB");
		System.out.print("CCC\n");
		/*
		AAABBBCCC
		계속하려면 아무 키나 누르십시오 . . .

		*/

		System.out.println();
		//개행 
		//System.out.print(); 에러발생.

		System.out.printf("123");
		System.out.printf("1234\n%n");
		//printf(); == print(); 와 같음 에러발생

		System.out.printf("안녕%d하세요\n",123);




		System.out.printf("%d\n",123);
		System.out.printf("%10d\n",123);
		System.out.printf("%8d\n",123);
/*
123
       123
     123
*/

		//양수 강조법
		System.out.printf("%+d\n",123);
		System.out.printf("+%d\n",123);
/*
+123
+123
*/
		
		System.out.printf("%d\n",+123);
		//123



		//음수
		//System.out.printf("%-d\n",365);
		//런타임 에러 발생


		System.out.printf("-%d\n",365);
		System.out.printf("%d\n",-365);
/*
-365
-365
*/

		//System.out.printf("%d\n",'A');
		//처리가 아니라 표현이니까 아스키문자 - int 아니야
		//런타임 에러 돼
		
		//문자는 %c, 문자열은 %s
		System.out.printf("%c\n",'4');
		System.out.printf("%s\n","132232");
/*
4
132232
*/

		System.out.printf("%h\n", 365);
//HEX 16진수로 바꿔서
//DEC 10진수
//OCT 8진수
//BIN 2진수 → 이건 비트자나 ,,,, 2진수는 표현 못해?
		System.out.printf("%o\n",365);


		System.out.printf("%b\n", true);
		
		System.out.printf("%.2f\n",123.4344234);
		//→ 반올림.

		System.out.printf("%.2f\n", 123.231);
		System.out.printf("%.2f\n", 123.235);
/*
123.23
123.24
*/

		System.out.printf("%8.2f\n", 123.236);
		//  123.24
		//dot도 자리 하나
		// 앞에 두 자리

		System.out.printf("%2.2f\n",123.236);
		//123.24 
		//쟤가 준 자리수가 우리자루에 비해 적으면
		//걍 무시깜

		System.out.printf("%3d\n",1231313);
		//1231313
		//int도 마찬가지


	}
}