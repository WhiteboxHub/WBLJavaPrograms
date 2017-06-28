package File;
import java.io.File;
public class ListFileNamesinDirectory {	
	    public static void main(String[] args) 
	    {File folder = new File("C:/Users/Jane/JovyJavaSeleniumWorkspace/WBLProgramList/src/File");	         
	        File[] files = folder.listFiles();	         
	        for (File file : files) 
	        {
	            if (file.isFile())
	            {
	                System.out.println(file.getName());
	            }
	        }
	    }
	}
	
	


