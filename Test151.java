/*================================
■■■ 예외(Exception) 처리 ■■■
=================================*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test151
{

	private String[] data = new String[3];

	public void proc() //throws IOException //→ checked exception
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String str;
		int n = 0;
		

		//이미 메소드 내에서 예외처리해서
		//main()에서 proc()를 호출해도 문제 안생김.
		try
		{
			System.out.print("이름 입력[종료:Ctrl+z] : ");

			while ( (str = br.readLine()) != null )//→ 컨트롤+z == null
			{
				data[n++] = str;
				System.out.print("이름 입력[종료:Ctrl+z] : ");
			}
		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}
		catch (ArrayIndexOutOfBoundsException e1) //--이거 언체크드임??????????????????
		{										//--unchecked exception 예압 런타입에러는 무조건 이거인지 알기!!!!!!!!!!!!!!!
			System.out.println("예외 발생~!!!");
			System.out.println("getMessage:" + e1.getMessage());
			System.out.println("printStackTrace...쨘");
			e1.printStackTrace();
		}

		System.out.println("입력된 내용...");
		for (String s:data )
		{
			if (s != null) //→ 컨트롤+z == null
			{
				System.out.println(s);
			}
		}
	
	}





	public static void main(String[] args) //throws IOException 
	                                       //→ proc()메소드에서
										   //   던져서
										   // main()내부에 있음
										   // 그래서 main()도 던짐

	{
		Test151 ob = new Test151();
		ob.proc();
	}
}

/*
이름 입력[종료:Ctrl+z] : d
이름 입력[종료:Ctrl+z] : 1
이름 입력[종료:Ctrl+z] : d
이름 입력[종료:Ctrl+z] : d
예외 발생~!!!
getMessage:3
printStackTrace...쨘
java.lang.ArrayIndexOutOfBoundsException: 3
        at Test151.proc(Test151.java:32)
        at Test151.main(Test151.java:69)
입력된 내용...
d
1
d
계속하려면 아무 키나 누르십시오 . . .


자바에서 알아서 메소드가 런타임시스템으로
에러나면 알려주는데
왜 우리가 직접하는가?
우리는 지금 콘솔기반이라 출력만 보여주는데
저 안에서 뭔가를 할 수 있다! 이거임
웹상에서 파일을 만들던가
이런 예외가 발생했을 때, 로그기록을 발생하거나
앱에 들어오지마도 만들 수 있음.

『우리가 컨트롤 한다.』
*/