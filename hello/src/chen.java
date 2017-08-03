import java.util.Scanner;


public class chen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n;
//		n = input.nextInt();
		boolean y;
		y = true;
		night(9);
		System.out.println(max(3.9,8.4,5.6));
		java.util.Date loandate = new java.util.Date();
		System.out.println(loandate.toString());
		
	}
	public static int max(int a,int b)
	{
		if(a > b)
			return a;
		else
			return b;
	}
	public static double max(double a,double b)
	{
		if(a > b)
			return a;
		else
			return b;
	}
	public static double max(double a,double b,double c)
	{
		return max(max(a,b),c);
	}
	public static void night(int n)
	{
		for(int i = 1;i <= n;i++){
			for(int j = 1;j <= i;j++){
				System.out.print(i +"*"+ j + "=" +i*j);
			}
			System.out.println();
		}
	}

}
