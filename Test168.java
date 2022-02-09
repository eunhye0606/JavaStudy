/*===================================================
���� �÷��� �����ӿ�ũ(Collection Framework) ����
====================================================*/

/*
�� List �������̽�
   - ������ ����, �迭�� ����, �ߺ��� ���
   - �ֿ� ���� Ŭ����
     Vector(����ȭ ����)
	 ArrayList(����ȭ �������� ����)
	 LinkedList(ü��, ��ũ, ����)

*/
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Test168
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();

		list.add("����");
		list.add("�λ�");
		list.add("��õ");
		list.add("�뱸");
		list.add("����");
		list.add("����");
		list.add("���");
		list.add("����");

		System.out.println("list ���� ������ Ȯ�� : " + list);
		//--==>>list ���� ������ Ȯ�� : [����, �λ�, ��õ, �뱸, ����, ����, ���, ����]

		System.out.println("��ü ���� : " + list.size());
		//--==>>��ü ���� : 8

		//ù ��° ��Ҹ� ���
		System.out.println("ù ��° ��� : " + list.get(0));
		//--==>>ù ��° ��� : ����

		System.out.println("������ ��� : " +list.get(list.size()-1));
		//--==>>������ ��� : ����

		// ó�� ��ġ�� "�ѱ�" �߰�
		list.add(0,"�ѱ�");
		System.out.println("ù ��° ��ġ�� �ѱ� : " + list);
		//--==>>ù ��° ��ġ�� �ѱ� : [�ѱ�, ����, �λ�, ��õ, �뱸, ����, ����, ���, ����]
		//      ù ��° ��ġ�� �ѱ��� ����
		//      �ڷ� �� �и�.
		


		// ó�� ��ġ�� ������(���)�� "���ѹα�"���� ����
		list.set(0,"���ѹα�");
		System.out.println("���ѹα����� ���� : " +list);
		//--==>>���ѹα����� ���� : [���ѹα�, ����, �λ�, ��õ, �뱸, ����, �� ��, ���, ����]


		//"����" ���翩�� Ȯ��
		if (list.contains("����"))
		{
			System.out.println("������ �����մϴ�.");
		}
		//--==>>������ �����մϴ�.

		//"����"�� �� ��° �ε����� ��ġ�ϴ��� Ȯ��
		int n = list.indexOf("����");
		System.out.println("������ " + n + "��°�� ��ġ�մϴ�.");
		//--==>>������ 1��°�� ��ġ�մϴ�.


		//"���ѹα�" �����
		//��list.remove("���ѹα�");
		list.remove(list.indexOf("���ѹα�"));//��
		System.out.println("���ѹα� ����: " + list);
		//--==>>���ѹα� ����: [����, �λ�, ��õ, �뱸, ����, ����, ���, ����]
	
		

		//list�� ��ü ��� ���
		System.out.println(" ��ü ��� ��� ��");
		for (int idx=0;idx<list.size() ;idx++ )
		{
			System.out.println(list.get(idx) + " " );
		}
		System.out.println();
		/*
		��ü ��� ��� ��
		����
		�λ�
		��õ
		�뱸
		����
		����
		���
		����
		*/
		
		System.out.println(" ���� ���...��");
		for (int idx = list.size()-1;idx>=0 ;idx-- )
		{
			System.out.println(list.get(idx) + " " );
		}
		System.out.println();
		/*
		 ���� ���...��
		����
		���
		����
		����
		�뱸
		��õ
		�λ�
		����
		*/
		//list�� ��ü ��� ���
		System.out.println(" ��ü ��� ��� ��");
		for (String s:list)
		{
			System.out.print(s + " ");
		}
		System.out.println();
		//--==>> ��ü ��� ��� ��
		//		���� �λ� ��õ �뱸 ���� ���� ��� ����


		System.out.println(" ��ü ��� ��� ��");
		Iterator<String> it = list.iterator();
		while (it.hasNext())
		{
			String s = it.next();
			System.out.print(s + " ");
		}
		System.out.println();
		//--==>> ��ü ��� ��� ��
		//		 ���� �λ� ��õ �뱸 ���� ���� ��� ����
		

		System.out.println(" ��ü ��� ��� ��");
		ListIterator<String> li = list.listIterator();
		while (li.hasNext())
		{
			System.out.print(li.next() + " ");
		}
		System.out.println();
		//--==>> ��ü ��� ��� ��
		//		 ���� �λ� ��õ �뱸 ���� ���� ��� ����
		

		System.out.println("���� ���...��");
		while (li.hasPrevious())
		{
			String s =li.previous();
			System.out.print(s + " " );
		}
		System.out.println();
		//--==>>���� ���...��
		//		���� ��� ���� ���� �뱸 ��õ �λ� ����
	
	
	
	
	
	
	
	
	}
}