import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = "";
		System.out.println("정수를 입력하세요.(1~12)");
		switch (Integer.valueOf(scan.nextLine())) {
		case 3:	case 4:	case 5:
			str = "봄";
			break;
		case 6:	case 7:	case 8:
			str = "여름";
			break;
		case 9:	case 10: case 11:
			str = "가을";
			break;
		case 12: case 1:	case 2:
			str = "겨울";
			break;
		default:
			str = "잘 못 입력.";		
			break;
		}
		System.out.println(str);
		
		scan.close();
	}
}
