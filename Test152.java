/*================================
■■■ 예외(Exception) 처리 ■■■
=================================*/

//Test153.java 파일과 비교~!!!

class Demo
{
	private int value; //-- 전역변수 0으로 자동 초기화.

	public void setValue(int value)
	{
		if (value <= 0)
		{
			return;				//-- 종료 → 메소드 종료.
								//return 용도 2가지 알기.
		}
		this.value = value;
	}

	public int getValue()
	{
		return value;
	}
}





public class Test152
{
	public static void main(String[] args)
	{
		Demo ob = new Demo();
		ob.setValue(-3);
		int result = ob.getValue(); //-- 오른쪽 이미 0
		System.out.println(result);
	}
}
/*
0
계속하려면 아무 키나 누르십시오 . . .
*/