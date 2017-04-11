package list;

import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.*;
public class json 
{
	public static void main(String[] args) 
	{
		JSONParser parser=new JSONParser();
		try
		{
			Object obj=parser.parse(new FileReader("/home/bridgeit/JavaPrograms/list/src/list/properties.txt"));
						
			JSONObject jsonobj=(JSONObject) obj;
			JSONArray ricedetails=(JSONArray) jsonobj.get("Rice");
			Iterator iterator=ricedetails.iterator();
			while(iterator.hasNext())
			{
				System.out.println(iterator.next());
				
			}
			System.out.println("\n\n");
			
			JSONArray wheatdetails=(JSONArray) jsonobj.get("Wheat");
			Iterator iterator1=wheatdetails.iterator();
			while(iterator1.hasNext())
			{
				System.out.println(iterator1.next());
				
			}
			System.out.println("\n\n");
			
			
			JSONArray pulsesdetails=(JSONArray) jsonobj.get("pulses");
			Iterator iterator2=pulsesdetails.iterator();
			while(iterator2.hasNext())
			{
				System.out.println(iterator2.next());
			
			}
			
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		
	}

}
