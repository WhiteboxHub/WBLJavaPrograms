package File;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
public class FileCopy {	
public static void main(String[] args) throws IOException{
File sourceFile = new File("C:/Users/Jane/JovyJavaSeleniumWorkspace/WBLProgramList/src/File/sample.txt");	         
 File destFile = new File("C:/Users/Jane/JovyJavaSeleniumWorkspace/WBLProgramList/src/File/DestFile.txt");	         
Files.copy(sourceFile.toPath(), destFile.toPath());	         
System.out.println("Success");
	    }
	}


