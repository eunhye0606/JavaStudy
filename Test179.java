/*=============================================
���� ��ü ����ȭ(Object Serialization) ����
==============================================*/
//PDA
//��������
//RMI: ���� ��ü ��� ���
/*
�� ��ü ����ȭ(Object Serialization)��
   
   �޸𸮿� ������ Ŭ���� ��ü�� ��� ������ ���� ���¸�(�ν��Ͻ� ���� �� Ŭ������ ����
   														 �޸𸮿� �ö󰡴� ���� �ƴ϶�
														 �޸𸮴� RAM ROM �Ӹ��ƴ϶�
														 ������ �� �ִ�. 
														 �ν��Ͻ� ������ ���޸𸮿�
														 �ö󰡴� �� ��� ������.
														 �޼ҵ���� ���޸� ������ �ƴ�
														 �ٸ� �������� �����Ҽ��ִ� ���� ����)
	
	�� �޸� - ���������� �� ��ü����ȭ�� ���. �� �޸𸮿� �ִ� ��� ������
	���� �޸� - �ڷᱸ���� ��
	����ƽ �޸� - static ����, static �޸�.

   �״�� �����ؼ� ���Ͽ� �����ϰų�
   ��Ʈ��ũ�� ���� ������ �� �ִ� �������
   ��� ������ ���� �����Ѵٰų�
   �ٸ� ��Ʈ��ũ�� �ִ� ȣ��Ʈ�� ���� ���� ��� ����ϰ� �ȴ�.

   ��, ��ü ����ȭ�� ���빰�� ����Ʈ ������ ��ȯ�Ͽ�(���빰 : ��ü�� �����ϴ� ������)
   ���� �Ǵ� ��Ʈ��ũ�� ���� �ۼ���(��Ʈ��)�� �����ϰ�
   ������ִ� ������ �� ��, ��ü�� ��� ������ �޸𸮸����� ������ ���� ���Ѵ�.

   ����, �޼ҵ�� �����ڴ� ��ü ����ȭ�� ��󿡼� ���ܵȴ�.


�� ��ü ����ȭ�� ����
   
   ��ü ��ü�� ������ ����� ���Ŀ� ���ֹ��� �ʰ�(����, ����..�̷��ſ� ���� ����
   													Object�� �����ؼ�)
   ��ü�� ���Ͽ� ���������ν� ���Ӽ��� ������ �� ������(pc�� ������ ����. DB�� ����
   														���Ͽ� �����ص� ���Ӽ� ����)
   ��ü ��ü�� ��Ʈ��ũ�� ���� �ս��� ��ȯ�� �� �ְ� �ȴ�.

   ��ü ����ȭ�� �ڹ� 1.1 ���Ŀ� ���ԵǾ��µ�
   �� ������ RMI �� Bean �����̾���.
   RMI �� ���� ��ü ����� �����ؾ� �ϱ� ������
   ��ü�� �״�� �̵��� �� �־�� �Ѵ�.
   ���� �̸� �����ϱ� ���ؼ��� ��ü ����ȭ�� �ʼ����̴�.

   ����, Bean�� ���� �� ���¿� ���� ������ ������ ��
   �� ��ü ����ȭ�� ����ϸ� ���ϰ� ��ü ���¸� ������ �� �ִ�.

�� RMI(Remote Method Invocation) �� ��Ծ��.
   ���� �ٸ� ���� �����ġ�� �����ϴ� �Լ���
   ȣ���ϰ� �����ϴ� ����� ����Ѵ�.
   ���� �ٸ� ��� ������ ��ġ�� ������ ���� ��ü�� ����
   ��� ������ �����ϴ� �������� �����ϸ� ���ڴ�.


�� Bean(��) �� �߿��� Spring����!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
   C/S ������ �𵨿��� ������ ������ �ش��ϸ�,
   ���� ������ ����Ʈ���� ��ü�� ���� �� �ְ� �ϴ� ������Ʈ ���.
   �ۼ��� ��ü�� ������ �����ϸ� ������Ʈ�� ���� ���Խ�ų �� �ֵ��� �Ѵ�.
   Ŭ���̾�Ʈ���� ���̶�� ���α׷� ������Ʈ�� �й��ϴ� ������� ó��.
   ������Ʈ ���� ��Ģ(���) == Bean �Ծ�
   ����� ī��Ʈ --> ��ũ --> USB

�� Serializable �������̽�
   
   ��ü ����ȭ�� �ϱ� ���� ���� ��ü ����ȭ�� �����ϵ���
   java.io.Serialzable �������̽��� ������ �־�� �Ѵ�.
   �� �������̽��� ��ü ����ȭ�� �����Ǿ�� �Ѵٴ� �����
   JVM ���� �˷��ִ� ������ �����Ѵ�.
   ����, Serializable �������̽���
   �ٸ� �������̽��� �޸� �����ؾ� �� �޼ҵ尡 ���� ������ 
   ���� ���� ���ָ� �ȴ�.

   ����)
   �� 
   public class Ŭ������ implements Serializble
   {
	   //...
   }

   �� 
   Serializble �������̽��� ������ ��
   ObjectInputStream Ŭ������ ObjectOutputStream Ŭ������ �̿��Ͽ�
   ��ü ������ ������� �����ϰ� �ȴ�.

   �� ��� ������ static ���� ����� ���
      (��, Ŭ���� ������ ���)
	  ��ü ����ȭ�� ��󿡼� ���ܵȴ�.

�� Object Stream

   java.io.ObjectInputStream
   ObjectInputStream Ŭ������ ObjectOutputStream Ŭ������ ���� �� ����Ʈ���
   ���Ͽ� ����Ǿ� �ִ� ��ü�� ��Ʈ��ũ�� ���� ���޵� ��ü��
   ����ȭ�� �����ϴ� ����� �����Ѵ�.
   ��, java.io.Serializble �������̽���
   java.io.Externalizable �������̽��� �������ִ� ��ü�� ���ؼ���
   ����� �����ϴ�.
   ��, Serializble �������̽��� Externalizable �������̽���
   ������ ��ü������ ����� �����ϴٴ� ���̴�.
   �� ��, readObject() �޼ҵ带 �̿��Ͽ�
   ��Ʈ�����κ��� ����ȭ�� ��ü�� ���� �� ������

   �̷��� ���� ��ü�� �迭, ���ڿ� �Ǵ� �� ��ü ��
   ������ ��(Type)���� ĳ���� �� �־�� �Ѵ�.

*/

import java.io.File;
import java.util.Hashtable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


import java.io.FileInputStream;
import java.io.ObjectInputStream;


import java.util.Enumeration;


public class Test179
{
	public static void main(String[] args) throws Exception //--��� Exception�� lang��Ű�� �ȿ��־ ���� import ���ص���.
	{
		String appDir = System.getProperty("user.dir"); //--charaterSet���� �غ�.

		//�׽�Ʈ
		//System.out.println(appDir);
		//--==>>C:\JavaStudy
		//���丮 ��� ��ȯ
		
		//���� ��ü ����
		File f0 = new File(appDir, "\\data\\test.ser"); //--test.ser�� �����̸�.
		//-- appDir �� C:\JavaStudy (���ڿ��ȿ� \\�ΰ��� \�ϳ��� ǥ���ϱ� ����.)
		//-- appDir ��ġ�� ��������(�߽�����) "\\data\\test.ser" ��
		//   �����ϰڴٴ� �ǹ�
		//   ��������� ��C:\JavaStudy\data\test.ser�� ����

		//�׽�Ʈ ��
		//System.out.println(f0.getParentFile().exists());
		//-- ����� ����� �� �� �ֵ��� ���� ��ΰ� �����ϴ°�?
		//--==>>false
		//-- ��test.ser�� ������ ������� ���͸� ��ΰ� �����Ǿ� ���� �ʴ�.

		//-- JavaStudy �ȿ� data ���丮 ����!

		//�׽�Ʈ ��
		//��C:\JavaStudy�� ��ο� ��data�� ���͸� ���� �� �ٽ� Ȯ��
		//System.out.println(f0.getParentFile().exists());
		//--==>>true
		//-- ��test.ser�� ������ ������� ���͸� ��ΰ� �����Ǿ� �ִ�.

		



		// !(���丮 ��ΰ� �����Ǿ� �ִٸ�..)
		// ���丮 ��ΰ� �����Ǿ� ���� �ʴٸ�...
		if (!f0.getParentFile().exists())
		{
			f0.getParentFile().mkdirs();
			//                 ���丮���� ����ڴ�.
		}




		//Hashtable �ڷᱸ�� �ν��Ͻ� ����(MAP �ڷᱸ�� �������̽��� �����ϴ� Ŭ����)
		Hashtable<String,String> h1 = new Hashtable<String,String>();

		// ������ h1 �̶�� Hashtable �ڷᱸ���� ��� �߰�
		h1.put("2202091","��ȣ��");
		h1.put("2202097","������");
		h1.put("2202090","�ֹ���");
		h1.put("2202094","�ּ���");
		h1.put("2202099","������");

		//�׽�Ʈ
		//System.out.println(h1.get("2202094"));
		//--==>>�ּ���


		// ���� ���� ��� ��Ʈ�� ����(�������� ����)
		FileOutputStream fos = new FileOutputStream(f0);
		// ���� �� ������ ���� ���� �ֱ⿡ checked exception. ������ ����
		//-- ���� ���� ��� ��Ʈ��(���ٱ�)��
		//   f0 ��� ���� ��ü�� ���ڴ�.
		// �� �̰Ŷ� ���� ��
		//InputStreamReader isr = new InputStreamReader(System.in);


		//��ü ���� ��� ��Ʈ�� ����
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//-- ��ü ���� ��� ��Ʈ��(���ٱ�)����
		//   fos ��� ���� ���� ��� ��Ʈ���� ���ΰڴ�.
		// �� �̰Ŷ� ���� ��
		//BufferedReder br = new BufferedReader(isr);


		//���� line 177 ~ 190 �� ������ ����
		//ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f0));


		// line 194 �� ����� ���� ����(���������� ������ ����)
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// �� ObjectOutputStream Ŭ������
		//    ��ü���� ����ϴ� ����� �����ϴ� Ŭ������
		//    ��� ��Ʈ���� ����ϱ� ����
		//    ���������� ��ü ����ȭ�� �����ϰ� �ȴ�.
		//    �ڹ� �⺻�� ������ �Ǵ� ��ü���� 
		//    ���Ͽ� �����ϰų� ��Ʈ��ũ�� ���� �����ϱ� ����
		//    ������ ��ü�� ����ȭ�ϴ� ����� �����ϴ� ���̴�.


		oos.writeObject(h1);
		//--������ ��Ʈ���� ������ ��ü�� ���

		oos.close();
		//--ObjectOutputStream ���ҽ� �ݳ�

		fos.close();
		//-- FileOutputStream ���ҽ� �ݳ�

		// (��ü�� ����ȭ�Ͽ� ���Ϸ�) �������� ��~!!! output
//================================================================================================

		// (��ü�� ����ȭ�Ͽ� ������ ����) �о���̱� ����~!!! input ������ȭ!!

		// f0 ���� ��ü�� �����Ѵٸ�...
		if (f0.exists())
		{
			FileInputStream fis = new FileInputStream(f0);
			ObjectInputStream ois = new ObjectInputStream(fis);

			//ois(ObjectInputStream)�� ���� �о���� ��ü(Object)��
			//ĳ����(Hashtable)�Ͽ�	(h1��ü�� ���� Ÿ���� Hashtable�̶�)
			//h2 ��� Hashtable �ڷᱸ���� ��Ƴ���
			// Object obj = ois.readObject(); 
			Hashtable h2 = (Hashtable)ois.readObject();	//--�ٿ�ĳ������
														//Hashtable �� Object�ؼ� ��������
														//���⼭ �ٽ� Hashtable
			
			ois.close();
			//--ois �ݳ� �� ObjectInputStream ���ҽ� �ݳ�

			fis.close();
			//--fis �ݳ� �� FileInputStream ���ҽ� �ݳ�

			// ��������ϸ� �о���̱� ��~!!!
//================================================================================================
			

			// �о���� h2 ��ü�� ���� Ȯ��
			String key;
			String value;

			// �� Iterator ����� �� ����~!!!
			Enumeration e = h2.keys();

			while (e.hasMoreElements())
			{
				key = (String)e.nextElement(); // �ٿ�ĳ����
				//-- Hashtable �ڷᱸ���� ������� key ���� �о���̴� ����

				//�׽�Ʈ
				//System.out.println(key);
				/*
				2202091
				2202099
				2202090
				2202097
				2202094
				*/

				value = (String)h2.get(key); //�ٿ�ĳ����
				//--Hashtable �ڷᱸ���� ������� key�� Ȱ���Ͽ� value�� ���� ����
				System.out.println(key + " �� " + value);
			}

			
		}
	}
}
/*
���� �ǹ� X
Key - Value�� �������� ��.

2202091 �� ��ȣ��
2202099 �� ������
2202090 �� �ֹ���
2202097 �� ������
2202094 �� �ּ���
*/