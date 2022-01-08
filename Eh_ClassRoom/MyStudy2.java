public class MyStudy2
{
	public static void main(String[] args)
	{
		System.out.println("@");
		System.out.println("#");
		System.out.println("$");
		System.out.println("%");
		System.out.println("^");
		System.out.println("&");
		System.out.println("1 % 2");

		System.out.println("\""); // → 이건 아예 이상해. \이거만 문자열에 넣으면 출력 안돼.
		//System.out.print("\"); // → 이거도 이상함. 걍 \이게 문자열들어가면 
								//     바로 뒤에 "이거 안먹어 왤까?????????????????????????????????


		System.out.printf("@");
		System.out.printf("#");
		System.out.printf("$");
		//1System.out.printf("%");
		System.out.printf("^");
		System.out.printf("&");
		//System.out.printf("1 % 2");
		// → 포맷팅에 %이걸써서 printf(); 에 %들어가면 문자로 인식 못해서 
		//    다 런타임에러 발생. 왜냐면 컴파일때는 글쿠나 하는데
		//    런타임때 %이게 나왔는데 뭐하라고? 해서 에러!

	}
}

/*
@
#
$
%
^
&
1 % 2
"
@#$^&계속하려면 아무 키나 누르십시오 . . .
*/