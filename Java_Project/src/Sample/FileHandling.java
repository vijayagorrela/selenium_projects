package Sample;



import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
	public static void main(String[]args) throws IOException
	{
		File  abc = new File("/home/vijaya/Desktop/Selenium.txt");
		abc.createNewFile();
		abc.delete();

}
}