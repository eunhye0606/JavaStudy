import java.util.Scanner;
import java.util.Random;

import java.util.ArrayList;


class WoonSa
{
	public static void main(String[] args)
	{
		//주요 변수 선언
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		String user; //-- 생년월일
		String userY;// 사용자 생년월일 맞니?
		ArrayList <String> strAli = new ArrayList <String>();
		ArrayList <String> strAli2 = new ArrayList <String>();
		ArrayList <String> strAli3 = new ArrayList <String>();

		String [] colors = {"빨강","노랑","초록","파랑","보라","하양","검정"};
		String [] mddm = {"으네", "수정", "깨돌", "렙돌", "라니", "라갱", "진돌", "종민"};

		int rdNum;// 몇번째 운세 출력할건지
		int rdNum2;// 몇번째 행운의 색 출력할건지

		String user2; //무딱모입니까?

		//2.랜덤으로 오늘의 운세 배열안의 문자열 출력해주기
		strAli.add("술을 사주지 않으면\n당신은 애인과 헤어질겁니다 저런~!\n 애인이 없다면 앞으로 3년간은 솔로입니다!!");
		strAli.add("맛있는걸 사주세요!");
		strAli.add("불주먹 맛을 보여주세요!그러면 좋은 일이 일어납니다.");
		strAli.add("선물을 사주면 원하는 일이 오늘 이루어집니다!");
		
		for (String s: colors)
		{
			strAli2.add(s);
		}
		

		rdNum = rd.nextInt(strAli.size());
		rdNum2 = rd.nextInt(strAli2.size());
		//System.out.println(mddm.length);
		int rdNum3 = rd.nextInt(mddm.length);
		//System.out.println(rdNum3);
		

	

		//1.사용자에게 생년월일(19980606) 8자리 받기
		while (true)
		{
			do
			{
				System.out.print("생년월일(ex.19980606) 8자리를 입력해 주세요 : " );
				user = sc.next();
				if (user.length()!=8)
				{
					System.out.print("8자리로 『다.시』입력해주세요! :");
					user = sc.next();
				}
				System.out.printf("입력하신 정보 생년월일【%s】가 맞습니까? :",user);
				userY = sc.next();
			}
			while (!userY.equals("y")&&!userY.equals("Y"));
			
			System.out.print("당신은 무딱모 소속 입니까 ? (Y/N) : " );
			user2 = sc.next();
			

			if (user2.equals("y") ||user2.equals("Y") )
			{	
				System.out.println("\n\na★★★당신의 오늘의 운세는? 두근두근~!!★★★");
				System.out.println("[오늘의 지령]\n 지령을 무시하면 무시무시한 일이 일어납니다!");
				System.out.print("당신은 " + mddm[rdNum3] +" 에게 ");
				System.out.println(strAli.get(rdNum));
				System.out.print("당신의 행운의 색은 ?" + strAli2.get(rdNum2)+"입니다!\n\n");
			}
			else
			{
				strAli3.add("당신은 으네에게 술을 사주지 않으면\n당신은 애인과 헤어질겁니다 저런~!\n 애인이 없다면 앞으로 3년간은 솔로입니다!!");
				strAli3.add("당신은 으네에게 맛있는걸 사주세요!");
				strAli3.add("당신은 으네에게 엉덩이를 맞으세요!!그러면 좋은 일이 일어납니다.");
				strAli3.add("당신은 으네에게 선물을 사주면 원하는 일이 오늘 이루어집니다!");

				int rdNum4 = rd.nextInt(strAli3.size());
				
				System.out.println("\n\na★★★당신의 오늘의 운세는? 두근두근~!!★★★");
				System.out.println("[오늘의 지령]\n 지령을 무시하면 무시무시한 일이 일어납니다!");
				System.out.println(strAli3.get(rdNum));
				System.out.println();
				System.out.println();
			}
		
		}
	}	
}