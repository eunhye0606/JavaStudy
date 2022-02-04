/*================================
■■■ 예외(Exception) 처리 ■■■
=================================*/

//Test152.java 파일과 비교~!!!

//※ throw					ch)throws(우리가 여태 사용했던거)
//   : 예외를 발생시킬 때.	   :예외를 밖으로 던질 때.
class Demo
{
	private int value; //-- 전역변수 0으로 자동 초기화.

	public void setValue(int value) throws Exception //얘가 폭탄 머금고 있으니 이거 처리.
	{								//여기서 던지면 ★
		if (value <= 0)
		{
			//return;				//-- 종료 → 메소드 종료.
								//return 용도 2가지 알기.

			throw new Exception("value는 0보다 작거나 같을 수 없습니다.");
			// 이름만 안붙었지 인스턴스 생성 호출.
			// 예외도 객체란다.
			//checked exception이 setValue()안에 있는 중
		}
		this.value = value;
	}

	public int getValue()
	{
		return value;
	}
}


public class Test153
{
	public static void main(String[] args) //throws Exception ①
	{
		Demo ob = new Demo();


		//②
		try //★ 여기서 예외처리!
		{
			ob.setValue(-3); //-->> 여기 수행 했나? 확인하기 print로!
			int result = ob.getValue(); //-- 오른쪽 이미 0
			System.out.println(result);
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
	}
}
/*
java.lang.Exception: value는 0보다 작거나 같을 수 없습니다.
계속하려면 아무 키나 누르십시오 . . .
*/