/*===================================================
■■■ 컬렉션 프레임워크(Collection Framework) ■■■
====================================================*/
// 벡터 자료구조 객체 선언 및 생성 시
// 사용자 정의 클래스 활용
// → 자료형


import java.util.Vector;

// 사용자 정의 클래스 설계 → 자료형처럼 활용
class MyData
{
	// 주요 속성 구성 → 주요 변수 선언(멤버 변수)

	private String name; //-- 이름
	private int age;	 //--나이

	
	// 멤버 변수가 모두 private라서 외부에서 활용을 못하니..
	//getXxx() → getter
	//setXxx() → setter

	//getter / setter 구성 (멤버 변수를 활용하기 위한 메소드 - 약속)
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}
	
	//생성자(매개변수 2개인 생성자) → 사용자 정의 생성자
	public MyData(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	// ※ 사용자 정의 생성자가 구성될 경우
	//    default 생상자가 자동으로 삽입되지 않기 때문에
	//    default 생성자 형태의 생성자를 사용자 정의 생성자로
	//    추가 구성하게 되는 것이 일반적인 클래스 설계 과정
	//    (단, 반드시 설계해야 할 필요는 없음)

	// 생성자(매개변수 없는 생성자) → 사용자 정의 생성자
	public MyData()
	{
		name = "";
		age = 0;
	}

}
public class Test164
{
	public static void main(String[] args)
	{
		// 벡터 자료구조 생성
		Vector<MyData> v = new Vector<MyData>();
		// 벡터 구조 v 만들건데
		// MyData 데이터 형태만 담을 거야.

		// 벡터 자료구조 v에
		// 홍은혜 13세/ 김정용 7세 / 이윤태 78세
		// 담아내기
		//①
		/*
		MyData st1 = new MyData();
		st1.setName("홍은혜");
		st1.setAge(13);
		v.add(st1);

		MyData st2 = new MyData();
		st2.setName("김정용");
		st2.setAge(7);
		v.add(st2);

		MyData st3 = new MyData();
		st3.setName("이윤태");
		st3.setAge(78);
		v.add(st3);
		*/
//========================================================================
		//②
		/*
		MyData st1 = new MyData("홍은혜", 13);
		v.add(st1);
		MyData st2 = new MyData("김정용", 7);
		v.add(st2);
		MyData st3 = new MyData("이윤태", 78);
		v.add(st3);
		*/
//========================================================================
		//③
		v.add(new MyData("홍은혜",13));
		v.add(new MyData("김정용",7));
		v.add(new MyData("이윤태",78));
//========================================================================

		/*
		String [] strArr = {"홍은혜", "김정용","이윤태"};
		int [] nArr = {13, 7, 78};
		//MyData mydata = new MyData();
		//MyData [] mdArr;
		//mdArr = new MyData[strArr.length];

		MyData[] mdArr = new MyData[strArr.length];

		for (int i = 0;i<mdArr.length ;i++ )
		{
			mdArr[i] = new MyData();
			mdArr[i].setName(strArr[i]);
			mdArr[i].setAge(nArr[i]);		
		}
		// 여기까지가 MyData 인스턴스 생성과 데이터 담음
		// 그걸 벡터에 넣기
		for (MyData mydata:mdArr)
		{
			v.add(mydata);
		}
		*/
		/*
		String a;
		int b;
		
		for (int i =0;i<strArr.length ;i++ )
		{
			mdArr[i] = new MyData();
			for (String s:strArr)
			{
				a =mdArr[i].setName(s); // 이걸로 변환 ㄴㄴ
				
			}
			for (int n:nArr)
			{
				b =mdArr[i].setAge(n);
			}

			v.add(a);
		}

		for (MyData m:mdArr)
		{
			v.add(m);
		}
		*/

		//벡터 요소 전체 출력
		// 실행 예)
		// 이름 : 홍은혜, 나이 : 13
		// 이름 : 김정용, 나이 :  7
		// 이름 : 이윤태, 나이 : 78
//=================================================================================	

		// 출력
		// ①
		/*
		for (MyData obj:v) // 제네릭 표현식이 MyData니까!
		{
			System.out.printf("이름:%s, 나이%d세\n",obj.getName(),obj.getAge());
		}
		System.out.println();
		*/
		/*
		이름:홍은혜, 나이13세
		이름:김정용, 나이7세
		이름:이윤태, 나이78세
		*/
//=================================================================================
		for (int i = 0;i<v.size() ;i++ )
		{
			System.out.printf("이름:%s, 나이%d세\n",v.elementAt(i).getName(),v.elementAt(i).getAge());
											  //    -- 
											  //     -------------
											  //    벡터.요소하나꺼낸다.
											  //    MyData타입
		}
		System.out.println();
		/*
		이름:홍은혜, 나이13세
		이름:김정용, 나이7세
		이름:이윤태, 나이78세
		*/
//=================================================================================
		//③ 많이 쓰는 방법!!
		for (Object temp:v) //이런저런 형태를 담아서 Object로 꺼내자.
		{
			System.out.printf("이름 %s , 나이 %3d세\n",((MyData)temp).getName(), ((MyData)temp).getAge());// Object를 MyData타입으로 다운캐스팅!!
		}
		System.out.println();

		/* 
		내가한거
		for (MyData m:v) // 벡터 자료구조에서 하나씩 빼면 그건 MyData타입.
		{
			System.out.printf("이름 : %s, 나이: %3d\n",m.getName(),m.getAge());
		}
		System.out.println();
		*/
		

		
	}
}
/*
내가 한거 
홍은혜13세 김정용7세 이윤태78세
계속하려면 아무 키나 누르십시오 . . .
*/
/*
이름 : 홍은혜, 나이:  13
이름 : 김정용, 나이:   7
이름 : 이윤태, 나이:  78
*/