import java.util.*;
public class InputMismatchExceptionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean continueInput = true;
		
		do{
			try{
				System.out.println("Enter an integer:");
				int number = input.nextInt();
				System.out.println("The number enter is "+number);
				continueInput = false;
			}
			catch(InputMismatchException ex){
				System.out.println("Try again.("+"Incorrect input:an integer is required)");
				input.nextLine();//丢弃当前输入行，所以用户可以键入一个新行
			}
		}while(continueInput);
	}

}
