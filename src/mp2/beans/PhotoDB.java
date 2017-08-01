package mp2.beans;

import java.io.File;
import java.util.ArrayList;

public class PhotoDB 
{
	ArrayList<String> files;
	
	public PhotoDB()
	{
		files = new ArrayList<String>();
		String location = "C:\\Users\\Patrick Sy\\Documents\\_MY_STUFF_\\College\\Year 2\\Term 3\\WEBAPDE\\MP2\\WEBAPDE MP2\\WebContent\\resources\\photos";
		System.out.print(location);
		File folder = new File(location);
		File[] listOfFiles = folder.listFiles();

	    for(int i = 0; i < listOfFiles.length; i++)
	    {
	    	System.out.println("Files found.");
	    	if (listOfFiles[i].isFile())
	    	{
	    		System.out.println("File " + listOfFiles[i].getName());
	    		files.add("resources/photos/" + listOfFiles[i].getName());
	    	}
	    }
	}
	
	public ArrayList<String> getFiles()
	{
		return files;
	}
}

