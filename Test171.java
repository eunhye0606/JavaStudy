/*===================================================
■■■ 컬렉션 프레임워크(Collection Framework) ■■■
====================================================*/

// Set → HashSet, TreeSet
// - 순서 없음.
// - 중복을 허용하지 않은 구조(기본)

/*
○ TreeSet<E> 클래스
   
   java.util.TreeSet<E> 클래스는
   Set 인터페이스를 상속한 SortedSet 인터페이스를 구현한 클래스로
   데이터를 추가하면 데이터들이 자동으로 오름차순 정렬이 된다.
   (특별히 정렬 기능이 필요하지 않다면, hash가 성능이 더 좋음.)
*/

//============================================================================================
// 계층에 대한 개념. → 앞으로 데이터베이스와 연동하면서 많이 쓸 개념.

// VO	→ Value Object , 데이터를 격납하기 위한 계층, 값을 격납하기위한 객체로 만드는 경우.
// DTO	→ Data Transfer Object
// DAO	→ Data Access Object, A회사에 담당마크 현지.....현지없으면 다 따로 A회사 갔다와야함.
// 속성만 속하는 객체 VO, DTO..
// 실무에서는 VO나 DTO나 구분 잘 안함.. 
// 전송하기 위해서 격납하는 경우가 많기 때문에.
// 업무로직 적용되었는가, 비즈니스로직이 적용되어 있지 않는가로 나누는 경우도 있음.
//============================================================================================
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;


class GradeVO //VO계층
{
	//주요 속성 구성
	private String hak;			//-- 학번
	private String name;		//-- 이름
	private int kor,eng,mat;	//-- 국어점수,영어점수,수학점수

	//생성자(사용자 정의 생성자 → 5개의 매개변수를 가진 생성자)
	GradeVO(String hak, String name, int kor, int eng, int mat)
	{
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	//생성자(사용자 정의 생성자 → 매개변수 없는 생성자)
	// -- 매개변수가 존재하는 생성자를 사용자 정의 생성자로 구성하였기 때문에
	//    default 생성자가 자동으로 삽입되지 않을 것을 우려하여
	//    추가로 정의한 생성자
	GradeVO()
	{
	}

	//getter/setter 구성
	public String getHak()
	{
		return hak;
	}

	public void setHak(String hak)
	{
		this.hak = hak;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getKor()
	{
		return kor;
	}

	public void setKor(int kor)
	{
		this.kor = kor;
	}

	public int getEng()
	{
		return eng;
	}

	public void setEng(int eng)
	{
		this.eng = eng;
	}

	public int getMat()
	{
		return mat;
	}

	public void setMat(int mat)
	{
		this.mat = mat;
	}

	//추가 메소드 정의(총점 산출)
	public int getTot()
	{
		return kor + eng + mat;
	}
}

//GradeVO cannot be cast to java.lang.Comparable
//Compara할 수 있도록 재정의.
class MyComparator<T> implements Comparator<T>
//                T타입으로 구성할거야 → 이걸로 메소드나 return 타입 정의 가능.
// 제네릭이 없다면 return 자료형을 int, float ... 다 정의..
// 일반 class 아니라 자료구조 class는 요소가 다 다른타입으로
// 들어가도 돼서 제네릭 표현식을 쓴다!.
// 제네릭을 명시하는 순간. 자료구조클래스 안에 메소드들이
// 그걸 따라해서 return 자료형,매개변수를 정의된 제네릭을 따름.
{

	//비교 메소드 재정의
	@Override
	public int compare(T o1, T o2)
	{
		GradeVO s1 = (GradeVO)o1; //o1를 GradeVO 타입으로 캐스팅
		GradeVO s2 = (GradeVO)o2;

		// 학번 기준(오름차순)
		//return Integer.parseInt(s1.getHak())-Integer.parseInt(s2.getHak());
		//return Integer.parseInt("2201123")-Integer.parseInt("2201124");
		//return 2201123-2201124;
		//return -1

		// 학번 기준(내림차순)
		//return Integer.parseInt(s2.getHak())-Integer.parseInt(s1.getHak());

		//총점 기준(오름차순)
		//return s1.getTot() - s2.getTot(); //뒤에가 더 크다!

		//총점 기준(내림차순)
		//return s2.getTot() - s1.getTot(); //앞이 더 크다! 『return 뒤에가 어떤 말인지. → 정렬』
		

		//이름 기준(오름차순)
		// return 정수형; // 정수형을 반환해야하는 상황.
		//return s1.getName().compareTo(s2.getName()); 


		//이름 기준(내림차순)
		return s2.getName().compareTo(s1.getName());
		// 객체.메소드(매개변수)
	}

}
public class Test171
{
	public static void main(String[] args)
	{
		//TreeSet 자료구조 인스턴스 생성
		TreeSet<String> set = new TreeSet<String>();

		// TreeSet 자료구조 set에 요소 추가 → add();
		set.add("슬램덩크");
		set.add("하울의움직이는성");
		set.add("하이큐");
		set.add("토이스토리");
		set.add("알라딘");
		set.add("코코");
		set.add("심슨");
		set.add("스파이더맨");
		set.add("어드벤쳐타임");
		set.add("짱구는못말려");
		set.add("포켓몬스터");
		set.add("원피스");

		//Iterator 를 활용한 set 요소 전체 출력
		Iterator<String> it = set.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		/*
		스파이더맨
		슬램덩크
		심슨
		알라딘
		어드벤쳐타임
		원피스
		짱구는못말려
		코코
		토이스토리
		포켓몬스터
		하울의움직이는성
		하이큐
		→ 가나다순으로 정렬되어있음. ① 관찰.
		*/

		// TreeSet 자료구조 인스턴스 생성
		//TreeSet<GradeVO> set2 = new TreeSet<GradeVO>();
		TreeSet<GradeVO> set2 = new TreeSet<GradeVO>(new MyComparator<GradeVO>());
		//TreeSet이 필요로 하는 compare가 MyComparator에서 재정의된 메소드가
		// 포함됨.

		set2.add(new GradeVO("2201123", "김민성" ,90, 80, 70));
		set2.add(new GradeVO("2201124", "박현지" ,91, 81, 71));
		set2.add(new GradeVO("2201125", "이윤태" ,98, 79, 77));
		set2.add(new GradeVO("2201141", "정은정" ,96, 86, 76));
		set2.add(new GradeVO("2201135", "김상기" ,99, 82, 72));
		

		
	
		/*
		내가 한거 다 런타임 에러 뜸.
		Exception in thread "main" java.lang.ClassCastException:
		//System.out.println(set2);
		for (GradeVO g:set2)
		{
			System.out.printf("%s %s %d %d %d\n",g.getHak(),g.getName(),
				g.getKor(), g.getEng(), g.getMat());
		}
		*/
		
		
		/*
		Iterator<GradeVO> it2 = set2.iterator();
		while (it2.hasNext())
		{
			System.out.println(it2.next());
		}
		*/
//===========================================================================
		//Iterator 를 활용한 set 요소 전체 출력
		// 컬렉션 자료구조를 통해 객체를 담아 쓸 거임 ~앞으로는!!
		// 그러므로 컬렉션에는 객체형태로 담는 경우가 많다.
		/*
		Iterator<GradeVO> it2 = set2.iterator();
		while (it2.hasNext())
		{
			System.out.println(it2.next());
		}
		*/
		//--==>> 아 역시 내가 틀린줄, 에러 발생(런타임에러) ② 관찰
		/*
		Exception in thread "main" java.lang.ClassCastException: 
		GradeVO cannot be cast to java.lang.Comparable
        at java.util.TreeMap.compare(TreeMap.java:1294)
        at java.util.TreeMap.put(TreeMap.java:538)
        at java.util.TreeSet.add(TreeSet.java:255)
        at Test171.main(Test171.java:164)
		자료구조 안에 객체를 채워 넣음. 데이터를 넣은 것이 아니라.
		ClassCastException라는 예외발생.
		정렬 : 비교하고 자리바꾸기의 반복
		객체들 사이에서도 비교가 가능하도록 만들어 줘야함!!!!


		compare() 메소드 재정의(오버라이딩) 했을 때....
		GradeVO@15db9742
		GradeVO@6d06d69c
		GradeVO@7852e922
		GradeVO@4e25154f
		GradeVO@70dea4e

		객체를 직접 꺼내겠다 → Object 의 toString()으로 반환.
		이렇게 하면 안돼

		*/
		// 학번 오름차순.
		Iterator<GradeVO> it2 = set2.iterator();
		while (it2.hasNext())
		{
			GradeVO vo = it2.next();
			System.out.printf("%7s %7s %4d %4d %4d %6d\n",
				vo.getHak(),vo.getName(),vo.getKor(),
				vo.getEng(),vo.getMat(),vo.getTot());
		}
		/*
		학번 기준(오름차순)
		2201123     김민성   90   80   70    240
		2201124     박현지   91   81   71    243
		2201125     이윤태   98   79   77    254
		2201135     김상기   99   82   72    253
		2201141     정은정   96   86   76    258
		
		학번 기준(내림차순)
		2201141     정은정   96   86   76    258
		2201135     김상기   99   82   72    253
		2201125     이윤태   98   79   77    254
		2201124     박현지   91   81   71    243
		2201123     김민성   90   80   70    240
		*/
//===========================================================================



	}
}