import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SequentialSearch {

	public static void main(String[] args) {
		int ar[]= {23,47,19,63,57,56,75,73,82,83,47,11};
		int i,num;
		int key=0,index=0;
		num= ar.length;
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ã���� �ϴ� ���ڸ� 2�ڸ��� �Է��ϼ���.");
		try {
			key = Integer.parseInt(in.readLine());
			
		}catch(Exception e) {
			System.out.println("�Է¿���");
		}
		for(i=0;i<num;i++)
			if(ar[i]==key) {
				index=i+1;
			}
	
	if(index==0) {
		System.out.println("ã���� �ϴ� ���� �����ϴ�.");
	}
	else {
		System.out.println("ã�� ����" + index + "��°�� �ֽ��ϴ�.");
		}
	}
}