/*==============================================
�����ڹ��� ���� �� Ư¡ ����

//����
// �ﰢ���� �غ��� ���̿� ���̸� ����ڷκ��� �Է¹޾�
//�� �ﰢ���� ���̸� ���ϴ� ���α׷��� �����϶�.


// ���� ��)
// ��ﰢ���� ���� ���ϱ��
// - �ﰢ���� �غ� �Է� : 3
// - �ﰢ���� ���� �Է� : 5

// >> �غ��� 3, ���̰� 5�� �ﰢ���� ���� : xxx
// ����Ϸ��� �ƹ� Ű��......


//���� �ν� �� �м�
//�ﰢ���� ���� = �غ� * ���� / 2
//����ڷκ��� �����͸� �Է¹޾� ó�� - BufferedReader Ȱ��
=============================================*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// import java.io.*; ��� ���赵 �� ������ �ؼ�. �ٵ� ���� ����

public class Test015
{
	public static void main(String[] args) throws IOException //��br.readLine() ������
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	

	int length, height; //�غ�, ����
	double area; //���� ���̴� �Ǽ�����
	
	System.out.println("��ﰢ���� ���� ���ϱ��");
	System.out.print(" - �ﰢ���� �غ� �Է� : ");
	
		
	length = Integer.parseInt(br.readLine());
	
	System.out.print(" - �ﰢ���� ���� �Է� : ");
	height = Integer.parseInt(br.readLine());
	

	//�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
	//area = length * height / 2 //�̰� ������ ����. �Ǽ� ������� �����ؾ���.

	//area = double(length * height /2); // �̰� �� 8.000000�̷���
	//8.0000
	//7.5
	
	area = (double)length * height /2; //�ϳ��� �Ǽ��� �ٲ�.
	//area = (double)length * height /2.0; //�̰� ����


	// �״ϰ� ~ ������ �Ǽ��� ������ �����ϸ� �Ǽ��� ����Ѵٰ� 
	// + , - , * , % �� ��� �ɱ�? �� MyStudy1.java
	
	//�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
	//System.out.print(); // �����Ͽ��� �߻�
	System.out.printf("\n >> �غ��� %d, ���̰� %d�� �ﰢ���� ���� : %.2f\n",length,height,area);

	}
}

/*
���� ���
��ﰢ���� ���� ���ϱ��
 - �ﰢ���� �غ� �Է� : 3
 - �ﰢ���� ���� �Է� : 5

 >> �غ��� 3, ���̰� 5�� �ﰢ���� ���� : 7.50
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/