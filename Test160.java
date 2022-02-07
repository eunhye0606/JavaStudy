/*===================================================
■■■ 컬렉션 프레임워크(Collection Framework) ■■■
====================================================*/
/*
○ Vector(벡터) → 컬렉션 프레임워크가 완성된 이후, 안쓰는 클래스 but 8줄 잘보기.

   자바의 자료 구조 기능을 제공하는 클래스들 중 가장 기본적인 클래스로
   배열과 비슷하지만, 배열과 달리 다른 종류의 데이터 형을 가진
   ----							  ----------------------
   『동질의 성격, 크기 확장 x, 길이 변화 x』
   데이터 요소를 가질 수 있으며, 데이터가 가득차면 자동으로 저장 영역을
                                 ----------------------
   확장시키게 된다.



   또한, 객체 레퍼런스를 저장하기 때문에 (벡터는 프리미티브형을 담을 수 없다. 배열하고의 차이점)
   JDK 1.5 이전에는 자바 기본형 데이터는 저장할 수 없었으나
   JDK 1.5 이후부터는 오토박싱 / 오토언박싱 기능이 지원되면서
   기본 데이터형도 저장이 가능하다.




   벡터 클래스의 기본 구조는
   시퀀스(Sequence) 데이터 구조에 기반하며(ex.은행의 순번)
   시쿼스 데이터 접근을 순차적인 인덱스 값에 대한 위치로 접근하게 된다.
   따라서, 자료구조의 양 끝단에서만 접근이 가능한 큐나 
   한쪽 끝에서만 접근이 가능한 스택과 달리
   시퀀스 개념의 인덱스 값을 이용하여 자료 구조의 임의의 지점에서
   저장 및 접근이 가능하다.


   벡터의 시퀀스 구조는
   List 인터페이스를 통해 제공받고 있기 때문에
   List 인터페이스의 모든 메소드를 사용할 수 있다.
	
	
   【리스트 - 순서
   셋 - 복주머니
   맵 - 복주머니 + 밖에 key로 원하는 value에 접근가능.
   → 벡터는 이걸 자바 쪽에서 잘 정리하기 이전에 나온 클래스】
      그래서 벡터만의 독특한 성질이 있음. 못없애.
	  원래 가진 메소드 + List 인터페이스 구현한 메소드가 있음.
	  중복되는 메소드 많음.
	  컬렉션 프레임워크가 다져지고 나온 클래스들은 규칙적인 메소드가 있음.
	  But, 벡터처럼 이전에 나온애들은 원래 메소드에 + 규칙적인 메소드가 붙음
	  So, 유사한 기능의 메소드 들이 많다!


   -void add(int index, E element) ← 매개변수 순서 다름!
   -void insertElementAt(E obj, int index) ← 매개변수 순서 다름!
    주어진 위치에 객체를 저장한다.
	주어진 위치에 객체부터 오른쪽으로 하나씩 이동한다. (딸기, 포도, 참외 -- 키위)
	add(0, "사과")
	insertElementAt("사과",0)
	



   - void addElement(E obj)
   - boolean add(E e)
     객체를 벡터 끝에 추가한다.

   - void removeElementAt(int index)
   - E remove(int index)
     주어진 위치의 객체를 제거한다.
	 제거 후 주어진 위치 다음의 객체부터 하나씩 왼쪽으로 이동한다.
	 E remove(int index) 메소드는 저장되었던 객체를 반환한다.

   - boolean removeElement(Object obj)
   - boolean remove(Object obj)
     대상 객체를 제거한다.
	 제거 후 주어진 위치 다음의 객체부터 하나씩 왼쪽으로 이동한다.
	 객체가 정상적으로 제거되었으면 true 를 반환한다.

   - void removeAllElement()
   - void clear()
     벡터의 모든 요소를 제거한다.

   - void setElementAt(E obj, int index)
   - E set(int index, E element)
     벡터의 index 위치에 주어진 객체를 저장한다.
	 주어진 위치에 저장되어 있던 객체는 소멸한다. (→ 덮어쓰기의 개념)
	 (위에는 0번째에 사과넣으면 뒤로 미는데
	   set은 딸기를 사과로 덮어쓰는 개념!)

   - E elementAt(int index)
   - E get(int index)
     주어진 위치에 저장된 객체를 반환한다.

   - Enumeration<E> elements()
     벡터의 모든 요소를 반환한다.

   - int indexOf(Object o)
     주어진 객체가 저장된 위치를 반환한다.
	 존재하지 않을 경우 『음수』를 반환한다. cf)String 클래스

   - int indexOf(Object o, int index) cf) 문자열 클래스
     주어진 객체가 저장된 위치를 index 위치부터 찾아서 반환한다.
	 index 위치는 스캔을 시작하는 위치.

   - boolean contatins(Object o)
     벡터가 주어진 객체를 포함하고 있는지의 여부를 반환한다.
   
   - void ensureCapacity(int minCapacity) cf) StringBuffer
     벡터의 용량을 주어진 크기보다 크도록 조절한다.

   - E firstElement()
     벡터의 첫 번째 요소의 데이터를 반환한다. 쳌

   - E lastElement()
     벡터의 마지막 요소의 데이터를 반환한다.

   - void setSize(int newSize)
     벡터의 크기를 조절한다.
	 만약 주어진 크기가 현재 크기보다 작다면 나머지는 버린다.
	 반대로 주어진 크기가 현재 크기보다 크다면
	 빈 공간은 null 객체로 채우게 된다.
	 (객체를 참조하지 않음을 의미)

   - int capacity()
     현재 벡터의 용량을 반환한다.

   - int size() cf) StringBuffer
     현재 벡터의 저장된 객체의 갯수(size)를 반환한다.

   - int trimTosize() cf)손톱깎기
	 벡터의 용량을 저장된 객체의 객수에 맞도록 최소화한다.

	
	나머지 프레임워크 아이들은 API 잘 찾아보세요.
*/
import java.util.Vector;
import java.util.Iterator;


public class Test160
{
	// 정적 문자열 배열 선언 및 초기화
	private static final String[] colors
		= {"검정", "노랑", "초록", "파랑", "빨강", "연두"};

	public static void main(String[] args)
	{
		int i;
		String str;

		//Vector(벡터) 자료구조 v 생성
		Vector<Object> v = new Vector<Object>();


		// v 라는 벡터 자료구조에 colors 배열에 담겨있는 데이터 담아내기
		// add()
		for (i = 0;i<colors.length ;i++ )
		{
			v.add(colors[i]);
		}

		//마지막 요소에 하양 추가 ( 맨 마지막에! )
		v.addElement("하양");
		

		// Vector은 다른 자료구조와 달리(큐, 스택..)
		// 요소가 삭제되지 않아도 다른 요소를 꺼낼 수 있다.
		//firstElement()
		str = (String)v.firstElement();
		System.out.println("첫 번째 요소 : " + str);
		//--==>>첫 번째 요소 : 검정

		//get()
		str = (String)v.get(1);
		System.out.println("두 번째 요소 : " + str);
		//--==>>두 번째 요소 : 노랑

		//get()
		str = (String)v.get(0);
		System.out.println("첫 번째 요소 : " +str);
		//--==>>첫 번째 요소 : 검정

		//elementAt()
		str = (String)v.elementAt(1);
		System.out.println("두 번째 요소 : " +str);
		//--==>>두 번째 요소 : 노랑

		//lastElement()
		str = (String)v.lastElement();
		System.out.println("마지막 요소 : " + str);
		//--==>>마지막 요소 : 연두


		//마지막 요소 하양 추가 . v.addElement("하양");
		//--==>>마지막 요소 : 하양

		// ※ 벡터 자료구조에 요소 추가 시 (→ add() / addElement())
		//    인덱스 마지막(가장 끝)의 위치에 추가되는 것을 확인할 수 있다.

		System.out.println(v.size());
		//--==>> 7
		//       검정 노랑 초록 파랑 빨강 연두 하양
		//================================================================
		

		// 전체 요소 출력
		// 『Iterator(이터레이터 or 아이터레이터)』
		// 『hasNext()』 → 망보는 메소드 , 다음 데이터 요소가 있는지의 여부를 반환
		// 『next()』→ 값을 가지고 오는 메소드, 다음 데이터 요소를 직접적으로 반환
		// Vector에는 hasNext(), next()가 없어서 ..
		Iterator<Object> it = v.iterator();
		//                    ------------
		//                    벡터 그릇에 이터레이터 끼우기


		while(it.hasNext()) //검정 보고 true.....
		{
			str = (String)it.next(); // 검정 노랑 초록...
			System.out.print(str + " ");
		}
		System.out.println();
		//--==>>검정 노랑 초록 파랑 빨강 연두 하양

		/*
		                                   ▼
		======================================
		   검정 노랑 초록 파랑 빨강 연두 하양
		======================================
		*/


	}
}