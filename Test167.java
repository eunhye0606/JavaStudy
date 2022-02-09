/*===================================================
■■■ 컬렉션 프레임워크(Collection Framework) ■■■
====================================================*/
//List(컬렉션을 대표하는 인터페이스 중 하나.)
//     → Vector, ArrayList,...
// 순서 있음
// 배열과 유사
// 중복 허용

//1. Vector 는 가급적으로 사용하지말아라.(우리가 공부하기 위해 씀)
//   ArrayList를 적극적으로 활용해라
//2. Vetor 동기화, 동시성 기능 포함(기능 ↑ 성능 ↓ 특히나, 동기화,동시성, 싱크 이런건 특히!)
//   ArrayList는 X

/*
○ ArrayList 클래스

   - ArrayList 와 Vector 클래스는
     List를 크기 변경이 가능한 배열로 구현한 것으로(배열은 크기 변동 불가능)
	 차이점은 Vector 클래스의 객체는 기본적으로 동기화 되지만,
	 ArrayList 는 그렇지 않다는 점이다.

   - 비동기화 컬렉션은 동기화된 컬렉션보다 더 나은 성능을 제공하며(기능,성능 반비례)
     스레드들이 컬렉션을 공유하지 않는 프로그램에서는
	 일반적으로 ArrayList를 Vector 보다 더 선호하며,
	 ArrayList 는 동기화를 고려하지 않은 Vector 처럼 동작함으로써
	 스레드 동기화에 따르는 부담을 가지지 않기 때문에
	 Vector 보다 더 빠르게 실행된다.

   - null 을 포함한 모든 요소를 허용하여
     List 인터페이스를 구현하는 것 외에 리스트에 격납하기 위해
	 내부적으로 사용되는 배열의 사이즈를 조작하는 메소드를 제공한다.
*/
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Test167
{
	public static void main(String[] args)
	{
		//ArrayList 자료구조 인스턴스 생성
		//①
		//ArrayList<String> list = new ArrayList<String>();

		//②
		//Vector<String> list = new Vector<String>();

		//③
		//List<String> list = new Vector<String>();

		//④
		List<String> list1 = new ArrayList<String>();
		//자료구조는 List인데
		//List를 구현한 클래스가 Vector하고 ArrayList클래스임.
//=================================================================

		//list1 자료구조에 요소 추가 → add()
		list1.add("쇼생크탈출");
		list1.add("스파이더맨");
		list1.add("인셉션");
		
//=================================================================

		// ArrayList 인스턴스 생성
		List<String> list2 = new ArrayList<String>(list1);

		// list2 에 요소 추가
		list2.add("어바웃타임");


		//ArrayList 인스턴스 생성
		List<String> list3 = new ArrayList<String>();
	
		
		//list3 에 list의 전체 요소 추가 → addAll()
		list3.addAll(list2);

//=================================================================
		// "스파이더맨" 앞에 "레미제라블" 추가
		// ① "스파이더맨" 찾기 → indexOf() → 위치값 인덱스 반환
		int n = list3.indexOf("스파이더맨");

		//테스트
		System.out.println("스파이더맨 인덱스 값: " + n);
		//--==>>스파이더맨 인덱스 값: 1

		// ② "스파이더맨" 찾은 인덱스 위치에 "레미제라블" 삽입 → add()
		list3.add(n,"레미제라블");

		//테스트
		System.out.println("스파이더맨 자리에 레미제라블: " + list3);
		//--==>>스파이더맨 자리에 레미제라블: [쇼생크탈출, 레미제라블, 스파이더맨, 인셉션, 어바웃타임]
		// 출력 → 더미 데이터 확인
		System.out.println("================================================");
		System.out.println("list1 : " + list1);
		//--==>>list1 : [쇼생크탈출, 스파이더맨, 인셉션]
		System.out.println("list2 : " + list2);
		//--==>>list2 : [쇼생크탈출, 스파이더맨, 인셉션, 어바웃타임]
		System.out.println("list3 : " + list3);
		/*
		list1 : [쇼생크탈출, 스파이더맨, 인셉션]
		list2 : [쇼생크탈출, 스파이더맨, 인셉션, 어바웃타임]
		list3 : [쇼생크탈출, 레미제라블, 스파이더맨, 인셉션, 어바웃타임]
		*/

//=================================================================
		
		//출력 →listIterator() 메소드를 활용하여 출력
		System.out.println("================================================");
		ListIterator<String> li = list3.listIterator();
		//ListIterator은 인터페이스. 그래서 메소드로 생성????????????
		while (li.hasNext())
		{
			System.out.print(li.next() + " " );
		}
		System.out.println();
		//--==>>쇼생크탈출 레미제라블 스파이더맨 인셉션 어바웃타임


		//List 자료구조 → 순서에 집착
		// 역순으로 접근할 수 있는 메소드가 있음.
		//출력 → 역순으로 접근
		while (li.hasPrevious())
		{
			System.out.print(li.previous() + " " );
		}
		System.out.println();
		//--==>>어바웃타임 인셉션 스파이더맨 레미제라블 쇼생크탈출



	}
}