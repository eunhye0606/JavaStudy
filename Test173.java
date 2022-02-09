/*===================================================
���� �÷��� �����ӿ�ũ(Collection Framework) ����
====================================================*/
//Map �� Hashtable, HashMap
// - java.util.Map �������̽���
//   Ű(Key)�� ��(value)�� ����(mapping)�Ͽ�
//   ������ Ű�� ����� �� ����, �����ؾ� �Ѵ�.
//   ��, �ϳ��� Ű ���� �����ϴ� �ϳ��� ���� ���� �ڷᱸ���̴�.


/*
�� HashMap<K, V> Ŭ����
   
  - Hashtable Ŭ������ ���������� Map �������̽����� ��ӹ���
    HashMap Ŭ������ ����� Hashtatle �� ����������
    Synchronazetion �� ���� ������ ���ü� ������ ���ٸ�
    (��, ��Ƽ ������ ���α׷��� �ƴ� �����)
    HashMap�� ����ϴ� ���� ������ ����ų �� �ִ�.

  - ����, HashMap �� Hashtable Ŭ�����ʹ� �޸� null �� ����Ѵ�.

  ������: Hashtable �� ����ȭ ����, HashMap�� ����ȭ ���� X
                       null ���� X,           null ���� O
*/

import java.util.HashMap;
import java.util.Map;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test173
{
	public static void main(String[] args) throws IOException
	{

		//HashMap �ڷᱸ�� �ν��Ͻ� ����
		//��
		//HashMap<String, String> map = new HastMap<String,String>();


		//�� �� �ڷᱸ�� ���� = HashMap();
		//                      ---------- �� ���Ⱑ �ν��Ͻ� ����. 
		//                      ��, HashMap �ν��Ͻ� �����ؼ�
		//   ����Ÿ���� map ������ HashMap�� ��´�.
		//   Map�� �� ŭ. ��ĳ����! �� Map�� �� ū ������?
		//   Map �������̽��� �ؽ����� �����ؼ�. ���!
		Map<String,String> map = new HashMap<String,String>();

		


		//map �̶�� HashMap �ڷᱸ���� ��� �߰�
		// �� put();
		map.put("���","���¿�Ŭ��");
		map.put("��ȭ","�����̴���");
		map.put("��ȭ","������ũ");

		// ���� Ȯ��
		//System.out.println("���� Ȯ�� : " + map);
		//--==>>���� Ȯ�� : {���=���¿�Ŭ��, ��ȭ=�����̴���, ��ȭ=������ũ}



		//null,null �Է� �õ�    �� �����۵�
		map.put(null, null);
		//���� Ȯ��
		//System.out.println("null,null Ȯ�� : \n" + map);
		//--==>>null,null Ȯ�� : 
		//      {null=null, ���=���¿�Ŭ��, ��ȭ=�����̴���, ��ȭ=������ũ}




		//value�� null �Է� �õ� �� �����۵�
		map.put("�Ҽ�",null);
		//System.out.println("�Ҽ�, null Ȯ�� : \n" + map);
		//--==>>�Ҽ�, null Ȯ�� :
		//		{null=null, �Ҽ�=null, ���=���¿�Ŭ��, ��ȭ=�����̴���, ��ȭ=������ũ}
		
		
		
		//key�� null �Է� �õ�   �� �����۵�
		map.put(null,"�����ϴ»��");
		//System.out.println("null, �����ϴ»�� Ȯ�� : \n"+map);
		//--==>>null, �����ϴ»�� Ȯ�� :
		//		{null=�����ϴ»��, �Ҽ�=null, ���=���¿�Ŭ��, ��ȭ=������ ����, ��ȭ=������ũ}

		//-- ���� ������ �Է� ������ ���� ��� ������ ������ �Է��� ����������
		//   ������ null �� key�� ���ε� "�����ϴ»��"��
		//   ���� null �� key�� �����ϴ� null�� ����� ��Ȳ�� �߻��ϰ� �ȴ�.
		//   ��, HashMap�� null�� �ϳ��� ������ key�� �����Ѵ�.(�ν��Ѵ�.)




		System.out.println("==================================================");


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		System.out.print("ī�װ�, Ÿ��Ʋ �Է�(�ĸ� ����) : " );
		String[] temp;

		for (String str;(str = br.readLine()) != null ; )
		{
			temp = str.split(",");
			if (temp.length<2)
			{
				System.out.print("ī�װ�, Ÿ��Ʋ �Է�(�ĸ� ����) : ");
				continue;
			}
			map.put(temp[0].trim(), temp[1].trim());
			System.out.println(map);
			// �� �ȳ����� map��....
		}
	}
}