/*================================
■■■ 예외(Exception) 처리 ■■■
=================================*/

// 예외 다시 던지기
// 내 이후의 계층들이 이것을 다시 확인해야 할 때.
// 선원이 배에 물 센거 처리하고 지 혼자 알면 안돼
// 1등 항해사에게 알리기. → 선장한테 알리기
// 지가 할일은 하고 보고받는 사람한테 다시 알리기
// 이거도 자유롭게 컨트롤해야함.


public class Test154
{
	public static void main(String[] args)
	{
		Test154 ob = new Test154();

		try
		{
			int a = ob.getValue(-2);//⑦예외 발생
			System.out.println("a : " + a);
		}
		catch (Exception e)	//⑧ 예외 잡아내기
		{
			System.out.println("ⓑ printStackTrace....쨘쨘");
			e.printStackTrace();
		}
	}



	public int getData(int data) throws Exception //예외 던지기
	{
		if (data < 0)
		{
			throw new Exception("data 가 0 보다 작습니다.");
			// ① 예외 발생   (try ~ catch || throws)
		}
		return data + 10;
	}


								  //⑥ 잡아낸 예외를 다시 던지는 것이 가능하도록 처리
	public int getValue(int value) throws Exception
	{
		int a = 0;
		
		try
		{
			a = getData(-2);
			// ② 예외 발생
		}
		catch (Exception e) //③ 예외 잡아내기(throws 필요없음.)
		{
			//④ 잡아낸 예외에 대한 처리
			System.out.println("ⓐ printStackTrace..........쨘");
			e.printStackTrace();


			//check~!!!
			//⑤ 잡아낸 예외를 다시 던지기
			throw e;
			//-- ③에서 잡아낸 예외를 다시 던진다.
			//   이 안에서 폭탄 가진거와 같음.
		}



		return a;

	}
}