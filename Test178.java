/*===================================
■■■ 자바의 기본 입출력(I/O) ■■■
====================================*/
//Reader Writer 실습
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.io.IOException;



public class Test178
{
	public void process(InputStream is) //System.in을 InputStream으로 업캐스팅해서 매개변수로 줌. 안바꾸면 System.in을 그대로쓰나? 
										// System.in → System클래스의 in 변수 static이구나.
										// public static final InputStream in
										// System 객체 안에 InputStream 객체가 이미 있음. 그래서 생성자 new 안해도 가능한것! 자바에서 해줌!
	{									//InputStream이 조상객체라 이거 가능!
		int data;
		System.out.println("문자열 입력(종료:Ctrl+z)");

		try
		{	//매개변수 is 라는 바이트 기반 객체(InputStream)를
			//문자 스트림으로 변환하여
			// → InputSteamReader 가 수행
			// Reader 타입의 rd에서 참조할 수 있도록 처리.
			Reader rd = new InputStreamReader(is); //is : 바이트기반을
												   // 문자기반으로 바꿈.
												   //InputSteam을 InputStreamReader로 번역
												   //굳이 위에 업캐스팅 할 이유가 이것인가?


		
			// 바이트 기반 스트림인 자바 기본 출력 스트림 (System.out)을
			// 문자 스트림으로 변환하여
			// → OutputStreamWrite 가 수행
			// Writer 타입의 wt에서 참조할 수 있도록 처리.
			Writer wt = new OutputStreamWriter(System.out); //System.out: 자바 기본 출력
							// 문자기반의 출력 스트림으로 바꿈.

			while ((data = rd.read())!= -1)
			{
				wt.write(data);	//-- 내보내는 스트림 물줄기에 기록
				wt.flush();		//-- 기록한 스트림 밀어내어 내보냄.
			}
		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}
	}



	public static void main(String[] args)
	{
		Test178 ob = new Test178();
		ob.process(System.in);
	}
}
/*

문자열 입력(종료:Ctrl+z)
1234
1234
안녕하세요
안녕하세요
abcd
abcd
가나다라
가나다라
*/