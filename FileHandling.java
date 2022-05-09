package assignment.com;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;


public class FileHandling {



	public static void main(String[] args) throws IOException {
		File f1=new File("abc.txt");
		if(f1.createNewFile()) {
			System.out.println("file"+ f1.getName()+"is created successfully");
			
		}
		else {
			System.out.println("file already exist");
		}
		if(f1.exists()) {
			System.out.println("the file name is" +f1.getName());
			System.out.println("path is" + f1.getPath() );
			System.out.println("absloute path is" + f1.getAbsolutePath());
			System.out.println(f1.isFile());
			System.out.println(f1.isDirectory());
			InputStreamReader isr =new InputStreamReader (System.in);
			
			BufferedReader br =new BufferedReader(isr);
			System.out.println("enter string");
			String str="hello";
			System.out.println("converting into upper case is: "+str.toUpperCase());}
		}
			
	}

	
	