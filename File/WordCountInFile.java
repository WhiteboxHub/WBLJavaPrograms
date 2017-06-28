package File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCountInFile {
	public static void main(String[] args) 
    {
        BufferedReader br = null;
                        
        int charCount = 0;
        int wordCount = 0;         
        int lineCount = 0;
         
        try
        {
          br = new BufferedReader(new FileReader("C:/Users/Jane/JovyJavaSeleniumWorkspace/WBLProgramList/src/File/sample.txt"));
          String currentLine = br.readLine();
          while (currentLine != null)
            {lineCount++;
             String[] words = currentLine.split(" ");           
                wordCount = wordCount + words.length;    
                 
                for (String word : words)
                {
                    charCount = charCount + word.length();
                }               
                currentLine = br.readLine();
            }            
            System.out.println("Number Of Chars in the File : "+charCount);             
            System.out.println("Number Of Words in the File : "+wordCount);             
            System.out.println("Number Of Lines in the File : "+lineCount);
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                br.close();           
            }
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
    }    
}
