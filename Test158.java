/*===================================================
���� �÷��� �����ӿ�ũ(Collection Framework) ����
====================================================*/

/*
�� ť(Queue)
   
   ť(Queue)�� ���Լ����� FIFO(First Input First Output) ������
   ���� �Էµ� �ڷḦ ���� ����ϸ�
   Queue �������̽��� ������ Ŭ������ ť�� ���õ� �پ��� ����� �����Ѵ�.


�� Queue �������̽� �ν��Ͻ��� �����ϱ� ���ؼ���
   new �����ڸ� �̿��Ͽ� Queue �������̽��� ������(implements)
   Ŭ������ �����ڸ� ȣ���Ѵ�.

   ex) Queue ob = new LinkedList();

�� �ֿ� �޼ҵ�

   - E element()
     : ť�� head ��Ҹ� ��ȯ�ϸ� �������� �ʴ´�.

   - boolean offer(E o)
     : ������ ��Ҹ� ť�� �����Ѵ�.

   - E peek()
     : ť�� head ��Ҹ� ��ȯ�ϰ� �������� ������
	   ť �ڷᱸ���� empty �� ��� null �� ��ȯ�Ѵ�.

   - E poll()
     : ť�� head ��Ҹ� ��ȯ�ϰ� �����ϸ�
	   ť �ڷᱸ���� empty�� ��� null�� ��ȯ�Ѵ�.

   - E remove()
     : ť�� head ��Ҹ� ��ȯ�ϰ� �����Ѵ�.
*/
import java.util.Queue;
import java.util.LinkedList;
public class Test158
{
	public static void main(String[] args)
	{
		// Queue myQue = new Queue();
		// �̰� �� �ȵȴٰ�???? �������̽���
		// LinkedList �� Queue�� �����ϴ� �ڷᱸ�� �� �ϳ�
		Queue<Object> myQue = new LinkedList<Object>();

		// ������ �غ�
		String str1 = "�����";
		String str2 = "������";
		String str3 = "������";
		String str4 = "������";

		//myQue ��� Queue �ڷᱸ���� ������ �߰�
		myQue.offer(str1);
		myQue.offer(str2);
		myQue.offer(str3);
		//myQue.offer(str4);
		boolean test = myQue.offer(str4); //--offer()�� boolean�� ��ȯ�ϱ� ������ �̰ŵ� ����

		//�׽�Ʈ(Ȯ��)
		//System.out.println(myQue);
		//--==>>[�����, ������, ������, ������]
		//      ������ ��Ʈ���� �̷��� �ϸ� �ȵ�
		//      ������ ���� ������(��¥, ¬)
		//    Ȯ�� ���������� ���.
		
		//Queue �ڷᱸ������ ��Ҹ� �������� �ʰ� head ��� ��ȯ
		// �ڿ�, �߰��� ��������~!
		System.out.println("�� 1 : " + (String)myQue.element()); //element()�� Object�� ��ȯ�ϴ� String���� ����ȯ.
		System.out.println("�� 2 : " + (String)myQue.element());//�ٵ� ����ȯ ���ص� �Ǵµ� ������ ��Ʈ�� ~ �Ҷ�� String����ȯ.
		//--==>>�� 1 : �����
		//		�� 2 : �����

		System.out.println();

		String val;
//=========================================================================
		//��
		
		//peek()
		//--ť�� head ��� ��ȯ. ���� ����.
		//  ť�� empty �� ��� null ��ȯ.
		/*
		while (myQue.peek() != null)//������
		{
			//poll()
			//-- ť�� head ��� ��ȯ. ������.
			//   ť�� empty �� ��� null ��ȯ.
			val = (String)myQue.poll();
			System.out.println("��� : " + val);
		}

		System.out.println();
		*/
		/*
		��� : �����
		��� : ������
		��� : ������
		��� : ������
		*/
//=========================================================================
		//�� - ��
		/*
		while (myQue.poll() != null)
		{
			//poll()
			//-- ť�� head ��� ��ȯ. ������.
			//   ť�� empty �� ��� null ��ȯ.
			val = (String)myQue.poll();
			System.out.println("��� : " + val);
		}
		System.out.println();
		*/
		/*
		��� : ������
		��� : ������
		*/

//=========================================================================		

		//��
		/*
		while (true) //���� ����
		{
			val = (String)myQue.poll();

			if (val == null)
			{
				break; //���߰� ����������. ���� ����� �ݺ�����
			}
			else
				System.out.println("��� : " + val);
		}
		System.out.println();
		*/
		/*
		��� : �����
		��� : ������
		��� : ������
		��� : ������
		*/

//=========================================================================
		//��
		/*
		while (!myQue.isEmpty()) //������
		{
			val = (String)myQue.poll();
			System.out.println("��� : " + val);
		}
		System.out.println();
		*/
		/*
		��� : �����
		��� : ������
		��� : ������
		��� : ������
		*/



	}
}