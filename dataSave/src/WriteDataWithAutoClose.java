
public class WriteDataWithAutoClose {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		java.io.File file = new java.io.File("scores.txt");
		if(file.exists()){
			System.out.println("scores.txt");
			System.exit(1);
		}
//		try(java.io.PrintWriter output = new java.io.PrintWriter(file);){
//			output.print("John T Smith ");
//			output.println(90);
//			output.print("Eric K Jones ");
//			output.println(85);
//		}
	}

}
