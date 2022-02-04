/*===================================================
■■■ 컬렉션 프레임워크(Collection Framework) ■■■
====================================================*/

/*
○ 큐(Queue)
   
   큐(Queue)는 선입선출의 FIFO(First Input First Output) 구조로
   먼저 입력된 자료를 먼저 출력하며
   Queue 인터페이스를 구현한 클래스는 큐와 관련된 다양한 기능을 제공한다.


※ Queue 인터페이스 인스턴스를 생성하기 위해서는
   new 연산자를 이용하여 Queue 인터페이스를 구현한(implements)
   클래스의 생성자를 호출한다.

   ex) Queue ob = new LinkedList();

○ 주요 메소드

   - E element()
     : 큐의 head 요소를 반환하며 삭제하지 않는다.

   - boolean offer(E o)
     : 지정된 요소를 큐에 삽입한다.

   - E peek()
     : 큐의 head 요소를 반환하고 삭제하지 않으며
	   큐 자료구조가 empty 인 경우 null 을 반환한다.

   - E poll()
     : 큐의 head 요소를 반환하고 삭제하며
	   큐 자료구조가 empty인 경우 null을 반환한다.

   - E remove()
     : 큐의 head 요소를 반환하고 삭제한다.
*/
import java.util.Queue;
import java.util.LinkedList;
public class Test158
{
	public static void main(String[] args)
	{
		// Queue myQue = new Queue();
		// 이거 왜 안된다고???? 인터페이스라서
		// LinkedList → Queue를 구현하는 자료구조 중 하나
		Queue<Object> myQue = new LinkedList<Object>();

		// 데이터 준비
		String str1 = "우수정";
		String str2 = "이지연";
		String str3 = "박현수";
		String str4 = "이윤태";

		//myQue 라는 Queue 자료구조에 데이터 추가
		myQue.offer(str1);
		myQue.offer(str2);
		myQue.offer(str3);
		//myQue.offer(str4);
		boolean test = myQue.offer(str4); //--offer()은 boolean을 반환하기 때문에 이거도 가능

		//테스트(확인)
		//System.out.println(myQue);
		//--==>>[우수정, 이지연, 박현수, 이윤태]
		//      데이터 컨트롤은 이렇게 하면 안돼
		//      일종의 더미 데이터(가짜, 짭)
		//    확인 차원에서만 써라.
		
		//Queue 자료구조에서 요소를 제고하지 않고 head 요소 반환
		// 뒤에, 중간꺼 못꺼내요~!
		System.out.println("값 1 : " + (String)myQue.element()); //element()는 Object를 반환하니 String으로 형변환.
		System.out.println("값 2 : " + (String)myQue.element());//근데 형변환 안해도 되는디 데이터 컨트롤 ~ 할라고 String형변환.
		//--==>>값 1 : 우수정
		//		값 2 : 우수정

		System.out.println();

		String val;
//=========================================================================
		//①
		
		//peek()
		//--큐의 head 요소 반환. 제거 안함.
		//  큐가 empty 일 경우 null 반환.
		/*
		while (myQue.peek() != null)//망보기
		{
			//poll()
			//-- 큐의 head 요소 반환. 제거함.
			//   큐가 empty 일 경우 null 반환.
			val = (String)myQue.poll();
			System.out.println("요소 : " + val);
		}

		System.out.println();
		*/
		/*
		요소 : 우수정
		요소 : 이지연
		요소 : 박현수
		요소 : 이윤태
		*/
//=========================================================================
		//① - ①
		/*
		while (myQue.poll() != null)
		{
			//poll()
			//-- 큐의 head 요소 반환. 제거함.
			//   큐가 empty 일 경우 null 반환.
			val = (String)myQue.poll();
			System.out.println("요소 : " + val);
		}
		System.out.println();
		*/
		/*
		요소 : 이지연
		요소 : 이윤태
		*/

//=========================================================================		

		//②
		/*
		while (true) //무한 루프
		{
			val = (String)myQue.poll();

			if (val == null)
			{
				break; //멈추고 빠져나간다. 가장 가까운 반복문을
			}
			else
				System.out.println("요소 : " + val);
		}
		System.out.println();
		*/
		/*
		요소 : 우수정
		요소 : 이지연
		요소 : 박현수
		요소 : 이윤태
		*/

//=========================================================================
		//③
		/*
		while (!myQue.isEmpty()) //망보기
		{
			val = (String)myQue.poll();
			System.out.println("요소 : " + val);
		}
		System.out.println();
		*/
		/*
		요소 : 우수정
		요소 : 이지연
		요소 : 박현수
		요소 : 이윤태
		*/



	}
}