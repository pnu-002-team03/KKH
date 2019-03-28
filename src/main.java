import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//input text
		String text = input.nextLine();
		
		//example
		String right = "왜 안돼";

		System.out.printf("입력한TEXT: %s\n", text);
		
		
		//띄어쓰기 알고리즘 구현 예정
		System.out.println("[띄어쓰기 검사]");
		
		if(text.charAt(0) == '왜' && text.charAt(1) == ' '){
			System.out.println("Good\n");			
		}
		else{
			System.out.println("Bad\n");
		}
		
		//사전DB 확인 하여 맞춤법 일치 확인 예정
		System.out.println("[맞춤법 확인]");
		
		if(text.equals(right)){
			System.out.println("Good");
		}
		else{
			System.out.println("Bad");
		}
		// TODO Auto-generated method stub
		
	}

}
