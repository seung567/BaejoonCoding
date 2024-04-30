import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		while(true){
			int numA = sc.nextInt();
			int numB = sc.nextInt();
			System.out.println(numA-numB);
			break;
		}
    }
}