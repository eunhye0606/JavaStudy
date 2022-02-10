import java.util.ArrayList;


class DefaultMenu
{
	int n;     // 에그마요1, bmt 2, 클럽 3
	int n2;    // 빵1 샐러드 2 사이드메뉴 3 현재 옵션 4

	defaultMenuselect()
	{
		System.out.print(“메뉴를 선택해 주세요(에그마요1, bmt 2, 서브웨이클럽 3) : );
		n = System.in.read();

		do 
		( System.out.print(“빵은 1 샐러드는 2) : );
		n2 = System.in.read();


		while n != 숫자

		if n2 ==1

		Bread 빵1 = new Bread();
		//bread.select(1);
		
		ArrayList<빵> bread = new ArrayList<빵>();
		bread.add(빵1);   // 추가 주문 적용되는지 확인★

		else if n2 == 2

		Salad 샐러드1 = new Salad();

		ArrayList<샐러드> salad = new ArrayList<샐러드>(); // static 보류
		salad.add(샐러드1);

		else if n2 == 3 //-- 사이드메뉴
		{
			사이드메뉴 사이드메뉴1 = new 사이드메뉴();

			ArrayList<사이드메뉴> 사이드메뉴 = new ArrayList<사이드메뉴>(); 
			사이드메뉴.add(사이드메뉴1);
		}

}


class Bread 
{
    빵종류;
    빵가격;
	빵길이;
    빵개수 =1;
    야채 커스텀 [] = {1,1,1};
    소스 커스텀 []; 
    치즈여부;

	빵 () //-- 생성자.
	{
		빵종류 select(디폴트 n) //에그마요, BMT 등등
		빵길이();
		야채 커스텀();
		소스 커스텀();
		치즈여부선택하기();
		추가메뉴메소드();
	}

	빵종류 select(디폴트 n) // 매개변수 보류 ★
	{
		if n == 1
		this.빵종류 = 에그마요
		this.빵가격 = 4500
		
		else if n ==2
		this 빵종류 = BMT
		this 빵가격  = 5500
	}
	빵길이 () 
	{
		빵길이 15? 30? 
		this.빵길이 = 사용자 입력값;
	}

	야채커스텀하기()
	{

		 System.out. print(“토마토, 양상추, 양파 선택안함은 0 공백구분: “); 1 0 1
		 this.야채배열 = 사용자 입력 값으로 초기화;
	}
	소스커스텀 메소드 () 
	{
		 System.out. print(“머스타드, 케찹, 랜치 드레싱 선택안함은 0 공백구분: “); 1 0 1
		 this.소스배열 = 사용자 입력 값으로 초기화;

	}
	치즈 선택 메소드()
	{
		n = 치즈 선택해라 1, 2, 3
		switch (n)
		{
		case 1: 슈레드
		case 2: 치즈종류 2 ...
		
		}
	}
	개수 추가 메소드()
	{
		n = 개수추가할래? 3
		while(n)
		{
			this.빵개수 ++; // -- 이러면 빵 개수변수의 수가 늘어남.
		}
	}

	추가메뉴메소드() 
	{
		Yes → DefaultMenu  dm = new DefaultMenu ()
			dm.defaultMenuselect();
		No  → new 결제 클래스(); // 이렇게 옮기는게 맞나 싶다 ! 
	}
}


class Salad
{
    샐러드가격;
    샐러드개수 =1;
    야채 커스텀 [] = {1,1,1};
    소스 커스텀 []; 
    치즈여부;

	샐러드 () //-- 생성자.
	{
		샐러드종류 select(디폴트 n)
		야채 커스텀();
		소스 커스텀();
		치즈여부선택하기();
		추가메뉴메소드();
	}

	샐러드종류 select(디폴트 n) // 매개변수 보류 ★
	{
		if n == 1
		this.샐러드종류 = 에그마요
		this.샐러드가격 = 4500 + 1700;
		
		else if n ==2
		this 샐러드종류 = BMT
		this 샐러드가격  = 5500 + 1700;
	}

	야채커스텀하기()
	{

		 System.out. print(“토마토, 양상추, 양파 선택안함은 0 공백구분: “); 1 0 1
		 this.야채배열 = 사용자 입력 값으로 초기화;
	}
	소스커스텀 메소드 () 
	{
		 System.out. print(“머스타드, 케찹, 랜치 드레싱 선택안함은 0 공백구분: “); 1 0 1
		 this.소스배열 = 사용자 입력 값으로 초기화;

	}
	치즈 선택 메소드()
	{
		n = 치즈 선택해라 1, 2, 3
		switch (n)
		{
		case 1: 슈레드
		case 2: 치즈종류 2 ...
		
		}
	}
	개수 추가 메소드()
	{
		n = 개수추가할래? 3
		while(n)
		{
			this.샐러드개수 ++; // -- 이러면 빵 개수변수의 수가 늘어남.
		}
	}

	추가메뉴메소드() 
	{
		Yes → DefaultMenu  dm = new DefaultMenu ()
			dm.defaultMenuselect();
		No  → 할인하기로 넘어가기
	}
}
	


class SideMenu
{
	사이드메뉴()
	{
	사이드종류선택하기();
	사이드개수선택하기();
	추가메뉴선택하기();
	}

	사이드종류선택하기()
	{
		사이드 뭐할래? 콜라면 1 맥주면 2 ...
		n = 사용자입력값; 
		if (1)
		{
			가격 
			개수메소드()
		} 
		else if (2 ) // 맥주
		{
			성인인증메소드(); boolean 반환
			if (true)
			{
				가격
				개수메소드()
			}
			else
				"성인아니라 맥주 못사";
		
	}

	개수메소드()
	{
		개수늘릴래? 3
		k = 사용자개수;
		while (k)
		{
			사이드메뉴개수++;

		}
	}
	추가메뉴메소드() 
	{
		Yes → DefaultMenu  dm = new DefaultMenu ()
			dm.defaultMenuselect();
		No  → 할인하기로 넘어가기
	}

	성인인증메소드()
	{
		주민번호유효성검사
		그 주민번호 앞자리 앞에 2개로 >= 20 이면 true 반환 아니면 false 반환
	}

} 
class 주문내역
{
	ArrayList<빵> 빵빵 = {빵1, 빵2, 빵3} → static 할지안할지 생각해라

		/*
		set빵길이(int n)
		{
			n = 빵.빵길이;
		}
		*/
		set주문내역넘겨주는메소드(n,n1,n2,n3,n4…)
		{
		System.out.print(빵 길이 : n);
		System.out.print(빵 종류 : n1);
		System.out.print(빵 가격 : n3);
		}

}


public class TempTest
{
	public static void main(String[] args)
	{		


	}
}