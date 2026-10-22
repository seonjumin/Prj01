
public class LiteralTest {

	public static void main(String[] args) {
		//Data : Literal 상수
	    int num = 1;
	    String name = " 카리나";
	    double height = 167.3;
	    float weight = 48.5f;
	    int bYear = 2003;
	    int tYear = 2026;
	    String address = "";
	    char grade = 'A';
	    boolean adult = true;
	    boolean male = false;
	    //int balance = 12345678900;
	    long lBalance = 12345678900L;
	    
	    System.out.println("번호: " + num);
	    System.out.println("이름: " + name);
	    System.out.println("키: " + height);
	    System.out.println("무게: " +weight);
	    System.out.println("성적: " + grade);
	    System.out.println("나이: " + (tYear - bYear));
	    
	    int data = 65;
	    System.out.printf("문자:%c 숫자:%d", data,data); //char, decimal int
	    														//10진수
	    System.out.println();
	    String name1 = "이순신";
	    System.out.println(name1.compareTo("이이"));
	    
	    

	}

}
