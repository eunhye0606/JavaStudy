/*===================================================
■■■ 컬렉션 프레임워크(Collection Framework) ■■■
====================================================*/

//Map → Hashtable, HashMap
// - java.util.Map 인터페이스는
//   키(Key)를 값(value)에 매핑(mapping)하여
//   동일한 키를 등록할 수 없고, 유일해야 한다.
//   즉, 하나의 키 값에 대응하는 하나의 값을 갖는 자료구조이다.


/*
○ Hashtable<K, V> 클래스
   
   - 해시테이블 구조를 객체 모델링한 클래스로
     검색이 용이하기 때문에 사용 빈도가 높은 편에 속한다.

   - 해시테이블이란?
     키(key)와 그에 상응하는 데이터(value)로
	 구분된 데이터 구조이다.

   - 데이터를 저장하고 검색하기 위해서 키(key)로 접근하며
     이 구조에서는 키 값을 부여하면 해당 데이터가 변환된다.

   - 또한, Hashtable 클래스는 key 또는 value 의 값으로 null을 허용하지 않는다.
*/
import java.util.Hashtable;

public class Test172
{

	private static final String[] names
		= {"이연주","이호석","김태형","김민성","최문정","이시우"};

	private static final String[] tels
		={"010-0000-0000","010-1111-1111","010-2222-2222","010-3333-3333",
		"010-4444-4444","010-5555-5555"};

	public static void main(String[] args)
	{
		//Hashtable 자료구조 인스턴스 생성
		Hashtable<String, String> ht = new Hashtable<String, String>();


		// ht 라는 Hashtable 자료구조에 배열(names, tels)에 담겨있는
		// 데이터를 요소로 담아내기
		// → put(k,v)
		for (int i =0;i<names.length ;i++ )
		{
			ht.put(names[i], tels[i]); // names과 tels가 쌍을 이루며 담김.
									   // 반복문 12번아니고 6번 돔.
		}


		//ht 라는 Hashtable 의 값을...key 를 이용하여 검색
		// → get(k)
		String findName1 = "김태형";
		String str = ht.get(findName1);
		if (str != null)
		{
			System.out.println(findName1 + " 전화번호 : " + str);
		}
		System.out.println();
		//--==>>김태형 전화번호 : 010-2222-2222



		//ht 라는 Hashtable 자료구조에 ... key 가 존재하는지의 여부 확인
		//→ containsKey()
		String findName2 = "이아린";
		if (ht.containsKey(findName2))
		{
			System.out.println(findName2 + "데이터가 존재합니다. " );
		}
		else
			System.out.println(findName2 + "데이터가 존재하지 않습니다.");
		System.out.println();
		//--==>>이아린데이터가 존재하지 않습니다.

		String findName3 = "최문정";
		if (ht.containsKey(findName3))
		{
			System.out.println(findName3 + "데이터가 존재합니다." );
		}
		else
			System.out.println(findName3 + "데이터가 존재하지 않습니다.");
		System.out.println();
		//--==>>최문정데이터가 존재합니다.



		//ht 라는 Hashtable 자료구조에 .... value 가 존재하는지의 여부 확인
		// → contains()
		String findTel1 ="010-1111-1111";
		if (ht.contains(findTel1))
		{
			System.out.println(findTel1 + "데이터가 존재합니다.");
		}
		else 
			System.out.println(findTel1 + "데이터가 존재하지 않습니다.");
		System.out.println();
		//--==>>010-1111-1111데이터가 존재합니다.





		//ht 라는 Hashtable 자료구조에서 『김민성』 데이터 삭제
		// → remove()
		ht.remove("김민성");
		//-- 『remove()』 메소드는 인자값으로 key를 넘겨받지만
		//    이 때, key만 삭제되는 것이 아니다.
		//    해당 key와 연결되어(매핑되어) 있는 value도 함께 remove() 된다.


		// 삭제(remove()) 이후 key가 존재하는지 확인.

		if (ht.containsKey("김민성"))
		{
			System.out.println("민성이가 존재합니다.");
		}
		else
			System.out.println("민성이 어디가쩌?!!?!");

		System.out.println();
		//--==>>민성이 어디가쩌?!!?!





		// 삭제(remove()) 이후 value가 존재하는지 확인
		if (ht.contains("010-3333-3333"))
		{
			System.out.println("민성이 번호 있음");
		}
		else
			System.out.println("민성이 번호도 같이 사라짐.");
		System.out.println();
		//--==>>민성이 번호도 같이 사라짐.
		




		// ※ null 관련 처리

		//ht.put(null, null);		    //-- key,value 모두 null → 런타임 에러
		//NullPointerException


		//ht.put("홍은혜",null);	    //-- value가 null        → 런타임 에러
		//NullPointerException


		//ht.put(null,"010-1234-5678"); //-- key가 null          → 런타임 에러
		//NullPointerException

		// "중복된 데이터를 허용하지 않는다"와 다름.
		// null은 안돼. 이거임.




		// 중복된 Key 입력 → key는 중복불가능.
		ht.put("이연주","010-1111-1112");
		
		System.out.println("이연주의 전화번호 : " + ht.get("이연주"));
		System.out.println();
		//--==>>이연주의 전화번호 : 010-1111-1112
		//      기존 "010-1111-1111" 에서 "010-1111-1112"로 변경되었음을 확인
		//     (덮어쓰기 개념)
		
		

		// 중복된 value 입력 → value는 중복가능.
		ht.put("양윤정","010-4444-4444");
		
		System.out.println("최문정의 전화번호 : " + ht.get("최문정"));
		System.out.println("양윤정의 전화번호 : " + ht.get("양윤정"));
		//--==>>
		//		최문정의 전화번호 : 010-4444-4444
		//		양윤정의 전화번호 : 010-4444-4444

		// ※ value는 중복된 값이 입력되어도 기존 데이터에 아무런 영향을 미치지 않음.

	}
}