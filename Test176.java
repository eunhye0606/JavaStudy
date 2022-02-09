/*===================================
■■■ 자바의 기본 입출력(I/O) ■■■
====================================*/

//Reader 실습
import java.io.Reader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test176
{
	public static void main(String[] args) throws IOException
	{
		int data;
		char ch;
		
		//System.in       : 자바 표준 입력 스트림 → 바이트 기반 스트
		//InputSteamReader: 바이트 기반 스트림을 → 문자 기반 스트림으로
		//	                변환해 주는 역할 수행(보조 스트림, 번역기)
		//Reader          : 문자 기반 스트림 객체
 		Reader rd = new InputStreamReader(System.in);

		System.out.println("\t문자열 입력(종료:Ctrl+z)");

		while( (data = rd.read()) != -1)	//System.in.read() : 바이트기반 읽음.
											//Reader.read()    : 문자기반 읽음.
		{
			ch = (char)data;

			//System.out.print("입력한 문자 \n: " + ch);	//print() : 문자기반 읽음.
			//System.out.print(ch);
			/*
			       문자열 입력(종료:Ctrl+z)
			안녕하세요
			안녕하세요
			*/
			System.out.write(ch);
			/*
			        문자열 입력(종료:Ctrl+z)
			안녕하세요
			HUX8?


			*/
		}
	}
}