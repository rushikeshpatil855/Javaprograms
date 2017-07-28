import java.util.Scanner;

public class factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,number;
		int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number ");
		number=sc.nextInt();
		for(i=1;i<=number;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
