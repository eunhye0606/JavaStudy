import java.util.ArrayList;
import java.util.Random;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

class MDDM
{
	public static void main(String[] args)
	{
		String [] mddmMember = {"은혜","라갱","수정","란희","소영","진돌","종민","깨돌"};
		String [] position = {"회장","부회장","총무","얼굴마담","노예1","노예2","노예3","진돌이"};

		Random rd = new Random();
		int n1;
		int n2;
		int year;

		Calendar c = new GregorianCalendar();
		year = c.get(Calendar.YEAR);
		

		ArrayList<String> ali1 = new ArrayList<String>();
		for (int i = 0;i<mddmMember.length ;i++ )
		{
			ali1.add(mddmMember[i]);
		}
		System.out.println(ali1);

		
		ArrayList<String> ali2 = new ArrayList<String>();
		for (int i = 0;i<position.length ;i++ )
		{
			ali2.add(position[i]);
		}
		
		

		System.out.println("【새로 조정된 " +year + "년도 무딱모 직책을 발표합니다.】");
		if (!ali1.isEmpty())
		{
			for (int i = 0 ;i<mddmMember.length ;i++ )
			{
				n1 = rd.nextInt(ali1.size());
				n2 = rd.nextInt(ali2.size());
				System.out.printf("\t%s님의 직책은 %s입니다.",ali1.get(n1),ali2.get(n2));
				ali1.remove(n1);
				ali2.remove(n2);
				System.out.println();
				System.out.println();
			}
		}		
		System.out.println();
	}
}