
public class TestFileClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.io.File file = new java.io.File("image/us.gif");
		System.out.println("Dose it exist?"+file.exists());
		System.out.println("The file has "+file.length()+" bytes");
		System.out.println("Can it be read?"+file.canRead());
		System.out.println("Can it be write?"+file.canWrite());
		System.out.println("Is it a directory?"+file.isDirectory());
		System.out.println("Is it a file?"+file.isFile());
		System.out.println("Is it absolute?"+file.isAbsolute());
		System.out.println("Is it hidden?"+file.isHidden());
		System.out.println("Absolute path is?"+file.getAbsolutePath());
		new java.util.Date(file.lastModified());
	}

}