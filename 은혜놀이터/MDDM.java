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
		String [] mddmMember = {"����","��","����","����","�ҿ�","����","����","����"};
		String [] position = {"ȸ��","��ȸ��","�ѹ�","�󱼸���","�뿹1","�뿹2","�뿹3","������"};

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
		
		

		System.out.println("������ ������ " +year + "�⵵ ������ ��å�� ��ǥ�մϴ�.��");
		if (!ali1.isEmpty())
		{
			for (int i = 0 ;i<mddmMember.length ;i++ )
			{
				n1 = rd.nextInt(ali1.size());
				n2 = rd.nextInt(ali2.size());
				System.out.printf("\t%s���� ��å�� %s�Դϴ�.",ali1.get(n1),ali2.get(n2));
				ali1.remove(n1);
				ali2.remove(n2);
				System.out.println();
				System.out.println();
			}
		}		
		System.out.println();
	}
}