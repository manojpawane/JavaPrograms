package list;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class json
{
  public static void main(String[] args) throws FileNotFoundException, IOException, ParseException 
  {
	

	    JSONParser parser=new JSONParser();
	 
		Object obj=parser.parse(new FileReader("/home/bridgeit/JavaPrograms/list/src/list/prop.json"));
		JSONObject jsonobj=(JSONObject) obj;
		JSONArray jsonarr=(JSONArray) jsonobj.get("data");
		
		for(int i=0;i<jsonarr.size();i++)
		{
			JSONObject jobj=(JSONObject) jsonarr.get(i);
			System.out.println(jobj);
		}
		
	
	}

  }
