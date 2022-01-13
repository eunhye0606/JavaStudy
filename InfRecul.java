/*=====================================
■■■ 메소드의 재귀 호출 ■■■
======================================*/

public class InfRecul
{
	public static void main(String[] args)
	{
		showHi(10);
		//System.out.println("안뇽"); → Hi~
									//   안뇽
									// showHi 하고 다시와서 출력.
		
		
	}
	public static void showHi(int cnt)
	{
		System.out.println("Hi~");

		if (cnt == 1)	//이게 없으면 -21억까지 감. Like 반복문 무너뜨리는거처럼.
		{
			return;
		}

		showHi(--cnt);
	}
}



/*	public static void showHi(int cnt)
	{
		
		
		
		showHi(cnt--);	//postfix는 다음 호출에서 적용 .그래서 showHi(10)인채로
						// 여기서 무한반복임.
						//그래서 showHi(cnt--);

						// showHi(1)이 호출되면
						// showHi(0).
						// if문이 실행안돼.
		
		if (cnt == 1)	//얘가 문제임. 마지막에 계속 1이 main에서 호출되니까 계속찍힘.
			return;	
	}
	
	// Hi 10번찍고 어디감?
	// 계속 showHi(10) 호출임. 포스트픽스때문에.
}
*/