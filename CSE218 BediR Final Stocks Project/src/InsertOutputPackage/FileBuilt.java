package InsertOutputPackage;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class FileBuilt
{
	private LinkedList<String> contentList;
	
	public FileBuilt(String src) 
	{
		readFile(new File(src));
	}
	
	public FileBuilt(File file) 
	{
		readFile(file);
	}
	
	public LinkedList<String> getContentList()
	{
		return contentList;
	}
	
	private void readFile(File file) 
	{
		contentList = new LinkedList<>();
		try 
		{
			Scanner input = new Scanner(file);
			while (input.hasNextLine())
			{
				contentList.add(input.nextLine());
			}
			input.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
