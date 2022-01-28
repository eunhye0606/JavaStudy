/*=====================================
���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
======================================*/
//===================================================================================================
//StringBuffer Ŭ����

/*
�� StringBuffer Ŭ������
   ���ڿ��� ó���ϴ� Ŭ������ String Ŭ�������� ��������
   String Ŭ������ ���� ���ڿ� �������� ������ �Ұ���������
   StringBuffer Ŭ������ ���ڿ��� ����� ��
   ���� ���ڿ��� ���� �ܰ迡�� ������ �� �ִ�.


   ��, StringBuffer ��ü�� �������� ���̸� �����Ƿ�
   ��ü�� �����ϴ� �������� �̸� �� ũ�⳪ ���� �����ϰų�
   ���� ������ ������ ũ�⸦ �ٲ� �� �ִ� ����� �����Ѵ�.

   ���� JDK 1.5 ���ĺ��ʹ�
   ���ڿ��� ó���ϴ� StringBuilder ��� Ŭ������ �����Ѵ�.
   �� String�� StringBuffer���� ���簡 ª��.
   StringBuilder Ŭ������ ����� StringBuffer Ŭ������ ����������
   ���� ū �������� muti-thread unsafe ��� ���̴�.
                    ------------------
					���� ó���� �������� �ʴ�.
   ��, Syncronization �� ���� ������
   StringBuffer ���� ������ ���ü�(����ȭ)������ ���ٸ�
   StringBuilder �� ����ϴ� ���� ������ ����ų �� �ִ�.

   ����� ���ٰ� ������ ������ �ƴ�.
   ���� ó�� �����Ѱ� StringBudffer ����� ����.
   StringBudiler ������ ����
   �ϳ��� ��ɿ� �����̸� ������ ���ٴ� ����.
*/
//===================================================================================================
public class Test140
{
	public static void main(String[] args)
	{
		StringBuffer sb1 = new StringBuffer("korea");
		StringBuffer sb2 = new StringBuffer("korea");

		System.out.println(sb1 == sb2);		//String��ü�� ���� ==�����ڰ� �ּҸ� ���ؼ� false�� �߰�(ũ��񱳾ƴ�) �� new�� ���� �ٸ� �޸�
		System.out.println(sb1.equals(sb2)); //String��ü�� ��� equals()�� ���ڿ��ǰ��� ���ؼ� true�� ���ٵ�
											//Object equalse()�� ==ó�� �ּҸ� ���ؼ�
											//�׷��� String�� ���� �������̵��ؼ� ���ڿ��� ���� ���ߴ�.
											//����� �Ѵ� false�߳�
											//�ͱ�???????????????????
											//���⼭�� �������̵����ؼ� false�����. Object�� �״�� ���!!!
		//--==>>false
		//		false




		System.out.println(sb1);
		//--==>>korea
		System.out.println(sb1.toString());
		//toString() Object�� ������ �ִ�. ��
		//Object : Ŭ������@�ؽ��ڵ� ��
		//StiringBuffer : ���ڿ��� ���� ��ȯ �� �׷��� String�� ��!

		System.out.println(sb1.toString());
		//				   ---------------
		//                      ���ڿ�.
		//          
		//�������̵��ص� ��ȯ�ڷ����� �������ϴ� ���� ���Ǿ���.


		//toString()�� ���ڿ� ��ȯ. �� �ٽ� Ȯ��
		

		System.out.println(sb1.toString().equals(sb2.toString()));
		//                 --------------
		//                   ���ڿ���üString
		//                                       --------------
		//                                        ���ڿ���üString
		//--==>>true


		//String.equals() �� static�޼ҵ��̱���.
		//equals() �� Object���� �þ�.
		// ���� ~ String�� equals()�� �������̵��߱���..

		// ==�� object�� equals()�� ��ü�� �ּҸ� ���Ѵ�! �ܡܡ�

		System.out.println("=====================================");

		StringBuffer sb3 = new StringBuffer();
		//-- StringBuffer �⺻ ������ ȣ��(�ν��Ͻ� ���� ����)
		//   �⺻������ �����Ǵ� ������ ũ��� ��16��

		System.out.println("���� ũ�� : " + sb3.capacity());//���Լ���
		//--==>>���� ũ�� : 16

		System.out.println(sb3);
		//--==>>�� ������ �������.

		String name = "ȫ�浿";
		name += "�̼���";
		name +="������";
		System.out.println(name); //String���� �ϸ� ���� ��ȿ������ ��~�� �޸� �ٽ� �Ҵ��ϰ� ���� �޸𸮾ȿ��ִ��� ������ ��. ������ ������.
		//--==>>ȫ�浿�̼��Ű�����

		sb3.append("seoul"); //-- sb3 += "seoul"; ���Լ���
		sb3.append("korea"); //-- sb3 += "korea";
		sb3.append("�츮����");//--sb3 += "�츮����";
		sb3.append("���ѹα�");//--sb3 += "���ѹα�";

		System.out.println(sb3);//-- ��ȯ : StringBufferŸ�Ԣ�
		//--==>>seoulkorea�츮������ѹα�
		System.out.println(sb3.toString()); //--��ȯ : StringŸ�Ԣ�
		//--==>>seoulkorea�츮������ѹα�

		System.out.println("���� ũ�� : " + sb3.capacity());
		//--==>>���� ũ�� : 34
		//���빰�� �߰� �Ǿ��µ� ����ũ�Ⱑ Ŀ����!��

		//////////////////////////////////////////////////////////////////

		String temp1 = "java and oracle";
		System.out.println(temp1.toUpperCase());//���Լ��� String
		//--==>>JAVA AND ORACLE

		String temp2 = "JAVA AND ORACLE";
		System.out.println(temp2.toLowerCase());//���Լ��� String
		//--==>>java and oracle


		//�׷��ٸ� StringBuffer������??
		//System.out.println(sb3.toUpperCase());
		//System.out.println(sb3.toLowerCase());
		//--==������! �� �޼ҵ���� ������!
		// String�޼ҵ�� StringBuffer�� StringBuild�� ��ȯ�ؼ� ���� �ȴ�!��

		String temp3 = sb3.toString();
		System.out.println(temp3.toUpperCase()); //�� sb3�� �ٲ�. 
		//--==>>SEOULKOREA�츮������ѹα�

		//System.out.println(sb3.toString().toLowerCase());
		//--==>>seoulkorea�츮������ѹα�


		//sb3�� ���Ѱ� �ƴ�. sb3�� �״�� StringBufferŸ���ε� �װ� toString()�ϰ� toLowerCase()�ؼ� ����ض�!!
		//sb3�� seoulkorea�츮������ѹα�

		//�� ��� ���ڿ�(sb3) �� seoul �տ�
		//   "�ѱ�" �̶�� ���ڿ� �߰�
		//   �� "�ѱ�seoulkorea�츮������ѹα�"

		//sb3.insert(0,"�ѱ�");���Լ������Լ������Լ������Լ������Լ���StringBuffer�Լ��� ~  String���� ������
		System.out.println("seoul�տ� ���ѱ��� �߰� : " + sb3.insert(0,"�ѱ�"));
		//--==>>seoul�տ� ���ѱ��� �߰� : �ѱ�seoulkorea�츮������ѹα�


		//��� ���ڿ�(sb3) �� korea ���ڿ� �ڿ�
		//"���"�̶�� ���ڿ� �߰�
		// ��, ��� ���ڿ��� �ε����� ������ ���� Ȯ������ �ʰ�...

		String xxx=sb3.toString();
		System.out.println(xxx.indexOf("korea"));
		//--==>>7
		System.out.println("xxx�� ������ �ε����� ����̳� : " + xxx.lastIndexOf("a"));
		//--==>>xxx�� ������ �ε����� ����̳� : 11

		//sb3.insert(11,"���");
		System.out.println("sb3�ڿ� ����� �������� : " + sb3.insert(12,"���"));
		//--==>>sb3�ڿ� ����� �������� : �ѱ�seoulkorea����츮������ѹα�
		// ���� Ǯ�� ������ �̷��� �߽��ϴ�.
		// 1. StringBuffer�� String���� �ٲ� ������ �����Ѵ�.
		// 2. �� �������� korea�� ������� ��� �ε������� Ȯ���Ѵ�. �ֳ��ϸ� StringBuffer�� insert�� ���� �ε�����ȣ�� ���ؾ���.
		//    - �׷��� korea����������� ���ʿ䰡 ������
		//    - �ڿ��� �ѱ��̴ϱ� �ڿ������� �ε��� Ȯ���ؼ� a�� ������ �ε��� ��ȣȮ���ϰ� --> �������� ���߳ĸ� �� String���� �� indexOf�ִ���
		//      �˰� ���� ���̱��� toString�ؼ� ã���ǵ� �׷��ʿ� ���� �� 
		//    �ű� ���� ����� �ִ´� . �� ��

		//-- �� ���� ���� �Ѱ� ���� sb3�� insert�� ����� �̹� �߰��ż� �����ٲ� �����ڤ����ڤ����ڤ����ڤ����ڤ����ڤ����ڤ�����
		//i

		

		//--�ε��� ��ȣ�� "��"���� ��ĭ ���ڸ����� 0���� �����ϴϱ�!!!!!!!!!
		//System.out.println("������ ������� ���ٷ� �������� : " + sb3.insert(sb3.indexOf("��"),"��Ǳ�ǲ�����"));
		//--==>> �̷��� �����ϰ� ������ �����̴� indexOf("��")����. ��ڴ�ڴ��
		//--==>>������ ������� ���ٷ� �������� : �ѱ�seoulkorea�����Ǳ�ǲ����ӿ츮������ѹα�


		// return �ڷ����� ����� ��ü�� ���� �ٲ�°� ����� �� ������.
		// void�� ��� �ٲ�� ��찡 ����.

		// ����� korea�� �ε��� + korea.length

		System.out.println(sb3);
		//-- �ѱ�seoulkorea����츮������ѹα�



		// �� ��� ���ڿ�(sb3) ���� 
		//    ���츮���� ���ڿ� ����.

		//sb3.delete(14,18);
		//-- �ڿ� �Ű�����-1����. ����.
		//System.out.println(sb3);
		//--==>>�ѱ�seoulkorea������ѹα�
		//System.out.println(sb3.delete(14,18));
		//System.out.println(sb3.indexOf("�츮����"));



		System.out.println(sb3.delete(sb3.indexOf("�츮����"),sb3.indexOf("�츮����")+"�츮����".length()));
		//--==>>�ѱ�seoulkorea������ѹα�
		//System.out.println(sb3.delete(sb3.indexOf("�츮����")),"�츮����");
		//-->> insertó�� �Ҷ��ߴµ� �̰� �ȵ�. delete�� �Ű������� int,int�� ����.

		/*
		 method AbstractStringBuilder.delete(int,int) is not applicable
		 (actual and formal argument lists differ in length)
		 method StringBuffer.delete(int,int) is not applicable
         (actual and formal argument lists differ in length)
		 ����� ���. StringBuilder�� �߻�Ŭ�����ε�? �߻�ƴѵ�? ����?????????????�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
		 �۰� StringBuilder �� StringBuffer�� delete(int,int)��!!
		*/
		



		//�� ��� ���ڿ�(sb3)����
		//   ��korea������ ���ڿ� ����(korea ����)
		//sb3.delete(7,18);
		//System.out.println(sb3.delete(7,18));
		//--==>>�ѱ�seoul

		System.out.println(sb3.delete(sb3.indexOf("korea"),sb3.length()));
		//--==>>�ѱ�seoul
		System.out.println("���� ũ�� : " +sb3.capacity());
		//--==>>���� ũ�� : 34
		// �þ ����ũ�Ⱑ �״�γ�????????
		// ���۴� �þ���� ������ �ʴ´�~



		//���ڿ�(sb3)�� ���� Ȯ��
		System.out.println("sb3�� ���� :  " +sb3.length());
		//--==>>sb3�� ���� :  7
		// StringBuffer���� length��� �޼ҵ尡 �ֱ��� Ȯ�� ����.

		//���� ũ�� ����
		// �� ���� ���ڿ��� ��Ƶ� �� �ִ� ������ ũ���...
		sb3.trimToSize(); //--��������� ������ �䵶�䵶

		//���� ũ�� ���� ���� ���� ũ�� Ȯ��
		System.out.println("����ũ�� ������ Ȯ�� : " + sb3.capacity());
		//--==>>����ũ�� ������ Ȯ�� : 7
		//-- ����ũ�� 16�̶�� ????************************************************



		








		



	}
}