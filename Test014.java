/*==============================================
�����ڹ��� ���� �� Ư¡ ����

//������ �ڷ���
// �ڹ��� �⺻ ����� : BufferdReader Ŭ����
//���� : �ӽñ�����.Ű���尰�� ��ġ
=============================================*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test014
{
	public static void main(String[] args) throws IOException 
										//--------------------
										//�������� �� ���� 
										//������ ������ �������� �ڹپ� ~ !
	{
		//Ű���� ����(����)
		//�� ����: BufferedReader Ŭ���� ����� �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//------------------------------------
		//     ���� �Է��� �о���̴� ��ġ
		//									  ----------------------
		//									   ����Ʈ �� ���� ������
		//															-----------
		//															����Ʈ �Է°�



		// �ֿ� ���� ����
		int r;		// ������
		final double PI = 3.141592;		// ������(������ ���ȭ)
		double area, length;		//����, �ѷ�

		//���� �� ó��
		// (1). ����ڿ��� �ȳ� �޼��� ���
		//System.out.print("���� ������ �Է� �ϼ��� : ");	//--X �����ϸ� ������ݽ�.
		System.out.print("���� ������ �Է� �ϼ��� : ");
		
		// (2). ����ڰ� �Է��� ���� �޾ƿ� ������ ���� r �� ��Ƴ���
		//r = br.readLine();		// BuffererdReader �� readLine() -> ���ڿ� ��ȯ
		//r = "80";

		// r = Integer.parseInt(br.readLine());
		// r = Integer.parseInt("80");
		// r = 80;

		//Integer.parseInt("80") --> 80
		// �Ű������� �Ѱܹ��� ���ڿ� �����͸� ���������� ��ȯ
		// ��, �� �� �Ѱܹ��� ���ڿ� �����ʹ� ���ڸ���̿��� �Ѵ�.
											//(NumberFormat)
		
		r = Integer.parseInt(br.readLine());
		// ����ڰ� �Է��� ���� BuffererReader(br)�� readLine
		// �޼ҵ带 Ȱ���Ͽ� ���ڿ� ���·� �о���� ��
		// �� ���� Integer.parseInt()�� ���� ������(������)���� ��ȯ�� ��
		// ���� ������ ������ ���� r�� ��Ƴ���



		//(3). ����, �ѷ� ����.
		area = r * r * PI;
		length = r * 2 * PI;
	

	
		// ��� ���
		
		System.out.printf("���� ���̴� %.2f �̾� ~ \n", area);
		System.out.format("�׸��� ���� �ѷ��� %f �̾� ~~~%n", length);

		System.out.format("�������� %d�� ���� ���̴� %f �̸�,\n ���� �ѷ��� %f�̴�. \n", r,area,length);


	}
}

/*
���� ���
���� ������ �Է� �ϼ��� : 45
���� ���̴� 6361.72 �̾� ~
�׸��� ���� �ѷ��� 282.743280 �̾� ~~~
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .




�������� 91�� ���� ���̴� 26015.523352 �̸�,
 ���� �ѷ��� 571.769744�̴�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/
