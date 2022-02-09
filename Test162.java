/*===================================================
���� �÷��� �����ӿ�ũ(Collection Framework) ����
====================================================*/
import java.util.Vector;
import java.util.Collections;

public class Test162
{
	// ���� ���ڿ� �迭 ���� �� �ʱ�ȭ
	private static final String[] colors
		= {"����", "���", "�ʷ�", "�Ķ�", "����", "����"};

	public static void main(String[] args)
	{
		// ���� �ڷᱸ�� ����
		Vector<String> v = new Vector<String>();

		// ���� �ڷᱸ�� v �� colors �迭 �����͸� ��ҷ� �߰�
		for (String color:colors)
		{
			v.add(color);
		}

		System.out.println("ù ��° ��� : " + v.firstElement());
		System.out.println("�� ��° ��� : " + v.get(1));
		System.out.println("������ ��� : " + v.lastElement());
		System.out.println("����� ���� : " + v.size());
		/*
		ù ��° ��� : ����
		�� ��° ��� : ���
		������ ��� : ����
		����� ���� : 6
		*/

//=============================================================================================

		//�� ù ��° ��Ҹ� "�Ͼ�"���� ��.�� �� set()
		v.set(0,"�Ͼ�");
		System.out.println("�ٲ� ù ��° ��� : " + v.firstElement());
		System.out.println("�ٲ� �� ��° ��� : " + v.get(1));
		System.out.println("�ٲ� ����� ���� : " + v.size()); //-- �̰� �þ�� ���Ե� ��.
		/*
		�ٲ� ù ��° ��� : �Ͼ�
		�ٲ� �� ��° ��� : ���
		�ٲ� ����� ���� : 6
		*/
		// ���� �� �Ͼ����� �ٲ�!!
//=============================================================================================
		// �� ù ��° ��ҿ� "��Ȳ" ��.�� �� insertElemantAt()
		v.insertElementAt("��Ȳ",0);
		//--==>>��ü ��� : ��Ȳ �Ͼ� ��� �ʷ� �Ķ� ���� ����
//=============================================================================================
		//�� ��ü ���
		System.out.print("��ü ��� : ");
		for (String str:v)
		{
			System.out.print(str + " " );
		}
		System.out.println();
		//--==>>��ü ��� : �Ͼ� ��� �ʷ� �Ķ� ���� ����
		
//=============================================================================================

		// �� �������� ����
		Collections.sort(v);

		// �� �������� ���� �� ��ü ���
		System.out.print(" �������� ���� �� ��ü ��� :");
		for (String str:v )
		{
			System.out.print(str + " " );
		}
		System.out.println();
		//--==>> �������� ���� �� ��ü ��� :��� ���� ���� ��Ȳ �ʷ� �Ķ� �Ͼ� 
		//       ������ ����

//=============================================================================================
		
		// �� �˻�
		// Collections.binarySearch();
		// �˻� ��� ����
		// ��, �������� ������ ����Ǿ� �ִ� �ڷῡ ���ؼ��� ����� �����ϴ�. check~!!
		// �˻� ����� �������� ���� ��� ������ ��ȯ�Ѵ�.

		int idxBlue = Collections.binarySearch(v,"�Ķ�");
		System.out.printf("�Ķ� : %d ��° �ε����� ��ġ�ϰ� �ִ�. \n", idxBlue);
		//--==>>�Ķ� : 5 ��° �ε����� ��ġ�ϰ� �ִ�.
//=============================================================================================
		
		int idxNavi = Collections.binarySearch(v,"����");
		System.out.printf("���� : %d ��° �ε����� ��ġ�ϰ� �ִ�. \n", idxNavi);
		System.out.println();
		//--==>>���� : -1 ��° �ε����� ��ġ�ϰ� �ִ�.

//=============================================================================================

		//�� �������� ����
		Collections.sort(v, Collections.reverseOrder()); 
		// -- ���������� �����ϴ� �޼ҵ�� ������ �����ϴ�.
		//    �������ڷ����� �� ���� Order��.
		//    ���������ε� order�� ��¤��.

		// �������� ���� �� ��ü ���
		System.out.print(" �������� ���� �� ��ü ��� : ");
		for (String str:v )
		{
			System.out.print(str+ " " );
		}
		System.out.println();
		//--==>>�������� ���� �� ��ü ��� : �Ͼ� �Ķ� �ʷ� ��Ȳ ���� ���� ���
		

		//�� �������� ���� �� �˻� �׽�Ʈ
		idxBlue = Collections.binarySearch(v,"�Ķ�");
		System.out.printf("�Ķ��� %d��° �ε����� ��ġ�ϰ� �ִ�.\n",idxBlue);
		//--==>>�Ķ��� -8��° �ε����� ��ġ�ϰ� �ִ�.
		//           ------- �� ����
		//           �˻� ��� ����.

//=============================================================================================
       
	    idxBlue = Collections.binarySearch(v,"�Ķ�",Collections.reverseOrder());
		System.out.printf("�Ķ��� %d��° �ε����� ��ġ�ϰ� ����.\n",idxBlue);
		//--==>>�Ķ��� 1��° �ε����� ��ġ�ϰ� ����.
		
	}
}