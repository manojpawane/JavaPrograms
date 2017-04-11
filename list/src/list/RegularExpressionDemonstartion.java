package list;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
public class RegularExpressionDemonstartion 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException 
	{
		Scanner sc=new Scanner(System.in);
		int content;
		String string="";
		File f=new File("/home/bridgeit/JavaPrograms/list/src/list/regular.txt");
		FileInputStream fileinputstrem=new FileInputStream(f);
	    while((content=fileinputstrem.read())!=-1)
	    {
		string=string+(char)content;
	    }
	    System.out.println(string);
	    
	   /* System.out.println("Enter Name");
		String name = sc.next(); 
		Pattern r = Pattern.compile("<<name>>");
        Matcher m = r.matcher(string);
	     
		if(m.find())
		{
			string=string.replace(string.substring(m.start(),m.end()), name);
		}*/
		
		System.out.println("Enter full Name");
		String lname=sc.nextLine();
		String []name=lname.split("\\s");
		String Name=name[0];
	
		
		Pattern rfullname = Pattern.compile("<<full name>>");
		
        Matcher matches = rfullname.matcher(string);
    	boolean CheckName = Pattern.matches("[A-Z][a-zA-Z]*[\\s][A-Z][a-zA-Z]*", lname);
		if(matches.find())
		{
			string=string.replace(string.substring(matches.start(), matches.end()),lname);
		}
		
		
		Pattern r = Pattern.compile("<<name>>");
        Matcher m = r.matcher(string);
		if(m.find())
		{
			string=string.replace(string.substring(m.start(),m.end()), Name);
		}
		
	        System.out.println("Enter Number");
			String number = sc.next(); 
			Pattern rnum = Pattern.compile("xxxxxxxxxx");
	        Matcher mnum = rnum.matcher(string);
		     
			if(mnum.find())
			{
				string=string.replace(string.substring(mnum.start(),mnum.end()), number);
			}
			

			
			
			DateFormat DateFormat = new SimpleDateFormat("dd/MM/yyyy");
			String Date = DateFormat.format(new Date());
		
			 
			Pattern rdate = Pattern.compile("XX/XX/XXXX");
	        Matcher mdate = rdate.matcher(string);
		     
			if(mdate.find())
			{
				string=string.replace(string.substring(mdate.start(),mdate.end()),Date);
			}
System.out.println(string);

	    
	
	
	
	}
	
}
	
	

