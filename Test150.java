/*================================
■■■ 예외(Exception) 처리 ■■■
=================================*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;




public class Test150
{
	private String[] data = new String[3];

	public void proc() throws IOException //→ chekcked exception
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String str;
		int n = 0;

		System.out.print("이름 입력[종료:Ctrl+z] : ");

		while ( (str = br.readLine()) != null )//→ 컨트롤+z == null
		{
			data[n++] = str;
			System.out.print("이름 입력[종료:Ctrl+z] : ");
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


	public static void main(String[] args) throws IOException
	{
		Test150 ob = new Test150();
		ob.proc(); //--→ 이 메소드를 부르는 main()에서도 IOException 해야함.
	}
}

/*
이름 입력[종료:Ctrl+z] : dddd
이름 입력[종료:Ctrl+z] : r
이름 입력[종료:Ctrl+z] : erq
이름 입력[종료:Ctrl+z] : fff
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
                                     →unchecked exception
									 
        at Test150.proc(Test150.java:27)
        at Test150.main(Test150.java:46)
계속하려면 아무 키나 누르십시오 . . .
*/

/*
이름 입력[종료:Ctrl+z] : aa
이름 입력[종료:Ctrl+z] : dd
이름 입력[종료:Ctrl+z] : ^Z → null이다.
입력된 내용...
aa
dd
계속하려면 아무 키나 누르십시오 . . .
*/