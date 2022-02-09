/*===================================
■■■ 자바의 기본 입출력(I/O) ■■■
====================================*/

//OutputStream 실습
import java.io.OutputStream;
import java.io.IOException;

public class Test175
{
	public static void main(String[] args) throws IOException
	{
		// System.in : 자바의 표준 입력 스트림
		// System.out: 자바의 표준 출력 스트림

		OutputStream out = System.out;
		//조상객체		 = 자식 객체 : 업캐스팅.
		//                 Buffer있음
		// System.out을 OutputStream형태로 받아서 쓰는거라 Buffer없음.
		// InputSteam		OutputStream→ 바이트 기반의 조상.
		//즉, 자식들은 Buffer가 있음.

		// 배열 구성
		byte[] ch = new byte[3];
		ch[0] = 65;			// A
		ch[1] = 97;			// a
		ch[2] = 122;		// z


		out.write(ch);		//-- 밖으로 내보낼 데이터(변수)를 스트림에 기록.
							//   ▶ 물줄기 위에 데이터 올리기.

		out.flush();		//-- 기록된 스트림을 내보내는(밀어내는) 기능을 수행
							//   지금은 Buffer를 활용하지 않고 있는 상황이기 때문에
							//   생략이 가능한 코드.
							//   (Buffered 되어 있는 스트림(stream)일 경우 생략 불가)
							//	 버퍼가 채워질 때까지는 데이터들이 나가지 않아서 생략 불가.
							//   ▶ 물줄기 위에 있는 데이터들을 밀어내기.
							//		ex)주사기 피스톤

		out.close();        //-- 출력 스트림(물줄기)에 대한 리소스 반납.
							//   (out 스트림을(수도꼭지를) 잠가버린 상황)
							//   ▶ 물잠가서 물 더 이상 안흘려보낸다는 뜻!
		
		System.out.println("절대적인 신뢰를 갖고 있는 구문...");
		// out.close(); 로 수도꼭지 잠가서 
		// 이거 실행 안된다..



		// -- 『out.close();』 를 작성한 이후 출력되지 않는 구문
		//     출력되는 스트림(물줄기)을 닫았기 때문에...!
	}
}