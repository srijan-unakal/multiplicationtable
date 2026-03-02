package tables;
import java.util.Scanner;
public class tables {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("This program prints multiplication tables of any given no. and upto desired count");
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		System.out.println("Enter the count : ");
		int count = sc.nextInt();
		int res = 0 ;
		for (int i=1;i<=count;i++) {
			res = a * i;
			System.out.println(a +"*" +i+"="+res);
		}
		sc.close();

	}

}