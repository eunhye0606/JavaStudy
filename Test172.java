/*===================================================
���� �÷��� �����ӿ�ũ(Collection Framework) ����
====================================================*/

//Map �� Hashtable, HashMap
// - java.util.Map �������̽���
//   Ű(Key)�� ��(value)�� ����(mapping)�Ͽ�
//   ������ Ű�� ����� �� ����, �����ؾ� �Ѵ�.
//   ��, �ϳ��� Ű ���� �����ϴ� �ϳ��� ���� ���� �ڷᱸ���̴�.


/*
�� Hashtable<K, V> Ŭ����
   
   - �ؽ����̺� ������ ��ü �𵨸��� Ŭ������
     �˻��� �����ϱ� ������ ��� �󵵰� ���� �� ���Ѵ�.

   - �ؽ����̺��̶�?
     Ű(key)�� �׿� �����ϴ� ������(value)��
	 ���е� ������ �����̴�.

   - �����͸� �����ϰ� �˻��ϱ� ���ؼ� Ű(key)�� �����ϸ�
     �� ���������� Ű ���� �ο��ϸ� �ش� �����Ͱ� ��ȯ�ȴ�.

   - ����, Hashtable Ŭ������ key �Ǵ� value �� ������ null�� ������� �ʴ´�.
*/
import java.util.Hashtable;

public class Test172
{

	private static final String[] names
		= {"�̿���","��ȣ��","������","��μ�","�ֹ���","�̽ÿ�"};

	private static final String[] tels
		={"010-0000-0000","010-1111-1111","010-2222-2222","010-3333-3333",
		"010-4444-4444","010-5555-5555"};

	public static void main(String[] args)
	{
		//Hashtable �ڷᱸ�� �ν��Ͻ� ����
		Hashtable<String, String> ht = new Hashtable<String, String>();


		// ht ��� Hashtable �ڷᱸ���� �迭(names, tels)�� ����ִ�
		// �����͸� ��ҷ� ��Ƴ���
		// �� put(k,v)
		for (int i =0;i<names.length ;i++ )
		{
			ht.put(names[i], tels[i]); // names�� tels�� ���� �̷�� ���.
									   // �ݺ��� 12���ƴϰ� 6�� ��.
		}


		//ht ��� Hashtable �� ����...key �� �̿��Ͽ� �˻�
		// �� get(k)
		String findName1 = "������";
		String str = ht.get(findName1);
		if (str != null)
		{
			System.out.println(findName1 + " ��ȭ��ȣ : " + str);
		}
		System.out.println();
		//--==>>������ ��ȭ��ȣ : 010-2222-2222



		//ht ��� Hashtable �ڷᱸ���� ... key �� �����ϴ����� ���� Ȯ��
		//�� containsKey()
		String findName2 = "�̾Ƹ�";
		if (ht.containsKey(findName2))
		{
			System.out.println(findName2 + "�����Ͱ� �����մϴ�. " );
		}
		else
			System.out.println(findName2 + "�����Ͱ� �������� �ʽ��ϴ�.");
		System.out.println();
		//--==>>�̾Ƹ������Ͱ� �������� �ʽ��ϴ�.

		String findName3 = "�ֹ���";
		if (ht.containsKey(findName3))
		{
			System.out.println(findName3 + "�����Ͱ� �����մϴ�." );
		}
		else
			System.out.println(findName3 + "�����Ͱ� �������� �ʽ��ϴ�.");
		System.out.println();
		//--==>>�ֹ��������Ͱ� �����մϴ�.



		//ht ��� Hashtable �ڷᱸ���� .... value �� �����ϴ����� ���� Ȯ��
		// �� contains()
		String findTel1 ="010-1111-1111";
		if (ht.contains(findTel1))
		{
			System.out.println(findTel1 + "�����Ͱ� �����մϴ�.");
		}
		else 
			System.out.println(findTel1 + "�����Ͱ� �������� �ʽ��ϴ�.");
		System.out.println();
		//--==>>010-1111-1111�����Ͱ� �����մϴ�.





		//ht ��� Hashtable �ڷᱸ������ ����μ��� ������ ����
		// �� remove()
		ht.remove("��μ�");
		//-- ��remove()�� �޼ҵ�� ���ڰ����� key�� �Ѱܹ�����
		//    �� ��, key�� �����Ǵ� ���� �ƴϴ�.
		//    �ش� key�� ����Ǿ�(���εǾ�) �ִ� value�� �Բ� remove() �ȴ�.


		// ����(remove()) ���� key�� �����ϴ��� Ȯ��.

		if (ht.containsKey("��μ�"))
		{
			System.out.println("�μ��̰� �����մϴ�.");
		}
		else
			System.out.println("�μ��� ���¼?!!?!");

		System.out.println();
		//--==>>�μ��� ���¼?!!?!





		// ����(remove()) ���� value�� �����ϴ��� Ȯ��
		if (ht.contains("010-3333-3333"))
		{
			System.out.println("�μ��� ��ȣ ����");
		}
		else
			System.out.println("�μ��� ��ȣ�� ���� �����.");
		System.out.println();
		//--==>>�μ��� ��ȣ�� ���� �����.
		




		// �� null ���� ó��

		//ht.put(null, null);		    //-- key,value ��� null �� ��Ÿ�� ����
		//NullPointerException


		//ht.put("ȫ����",null);	    //-- value�� null        �� ��Ÿ�� ����
		//NullPointerException


		//ht.put(null,"010-1234-5678"); //-- key�� null          �� ��Ÿ�� ����
		//NullPointerException

		// "�ߺ��� �����͸� ������� �ʴ´�"�� �ٸ�.
		// null�� �ȵ�. �̰���.




		// �ߺ��� Key �Է� �� key�� �ߺ��Ұ���.
		ht.put("�̿���","010-1111-1112");
		
		System.out.println("�̿����� ��ȭ��ȣ : " + ht.get("�̿���"));
		System.out.println();
		//--==>>�̿����� ��ȭ��ȣ : 010-1111-1112
		//      ���� "010-1111-1111" ���� "010-1111-1112"�� ����Ǿ����� Ȯ��
		//     (����� ����)
		
		

		// �ߺ��� value �Է� �� value�� �ߺ�����.
		ht.put("������","010-4444-4444");
		
		System.out.println("�ֹ����� ��ȭ��ȣ : " + ht.get("�ֹ���"));
		System.out.println("�������� ��ȭ��ȣ : " + ht.get("������"));
		//--==>>
		//		�ֹ����� ��ȭ��ȣ : 010-4444-4444
		//		�������� ��ȭ��ȣ : 010-4444-4444

		// �� value�� �ߺ��� ���� �ԷµǾ ���� �����Ϳ� �ƹ��� ������ ��ġ�� ����.

	}
}