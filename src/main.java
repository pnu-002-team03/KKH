import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//input text
		String text = input.nextLine();
		
		//example
		String right = "�� �ȵ�";

		System.out.printf("�Է���TEXT: %s\n", text);
		
		
		//���� �˰��� ���� ����
		System.out.println("[���� �˻�]");
		
		if(text.charAt(0) == '��' && text.charAt(1) == ' '){
			System.out.println("Good\n");			
		}
		else{
			System.out.println("Bad\n");
		}
		
		//����DB Ȯ�� �Ͽ� ����� ��ġ Ȯ�� ����
		System.out.println("[����� Ȯ��]");
		
		if(text.equals(right)){
			System.out.println("Good");
		}
		else{
			System.out.println("Bad");
		}
		// TODO Auto-generated method stub
		
	}

}
