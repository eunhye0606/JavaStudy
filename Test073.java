/*=====================================
���� Ŭ������ �ν��Ͻ� ����
======================================*/

//�� CircleTest.java ���ϰ� ��Ʈ ~!!

// ���� ���̿� �ѷ� ���ϱ�
// ���� ���̿� �ѷ��� ���� �� �ִ� Ŭ������ �����Ѵ�.
// (Ŭ������ : CircleTest) �� CircleTest.java
// BufferedReader�� readLine() Ȱ��.

// ���� ���� = ������ * ������ * 3.141592
// ���� �ѷ� = ������ * 2 * 3.141592

// ���� ��)
// ������ �Է� : xx


// >> �������� xx�� ����
// >> ���� : xx.xx
// >> �ѷ� : xx.xx
// ����Ϸ��� �ƹ� Ű�� ��������....
import java.io.IOException;
//�ν��Ͻ� �����Ҷ�, import�� �ʿ���� ������????????
// ���������������� ���������� ���� ���丮�ȿ� �־


public class Test073
{
	public static void main(String[] args) throws IOException //--����, �Ʊ�� ���� �����̶� �̰� �ѹ���
															  //  import�ϸ� �ƴµ� ������ �ٸ� �����̴ϱ� 
															  //  �������! 
	{
		// CircleTest Ŭ���� ��� �ν��Ͻ� ����
		// CircleTest �ν��Ͻ� ����
		// CircleTest ��ü ����
		CircleTest cc = new CircleTest();

		cc.input();
		double area = cc.circleArea();
		double length = cc.circleLength();
		cc.circlePrint(area,length);
		
	}
}

/*
������ �Է� : 10
�������� 10�� ����
���� : 314.16
�ѷ� : 62.83
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/