package list;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ProbJason 
{
  public static void main(String[] args) throws FileNotFoundException, IOException, ParseException 
  {
	double itemPrice=0;
	int itemTotal=0;
double grosstotal=0;
	    JSONParser parser=new JSONParser();
	 
		Object obj=parser.parse(new FileReader("/home/bridgeit/JavaPrograms/list/src/list/prop.json"));
		JSONObject jsonobj=(JSONObject) obj;
		JSONArray jsonarr=(JSONArray) jsonobj.get("data");
		String []data={"Rice","Wheat","pulses"};
		for(int i=0;i<jsonarr.size();i++)
		{
			JSONObject jobj=(JSONObject) jsonarr.get(i);
			JSONArray secondarr=(JSONArray) jobj.get(data[i]);
			
			for(int j=0;j<data.length;j++)
			{
				JSONObject jsonobj1=(JSONObject) secondarr.get(j);
				System.out.println("Name:"+jsonobj1.get("name"));
				
				
				Object jsonobj2=/*(JSONObject) */jsonobj1.get("weight");
				 int quantity = Integer.parseInt((String) jsonobj2);
				 System.out.println("Quantity:"+jsonobj1.get("weight"));
				
				
				Object jsonobj3=jsonobj1.get("price");
				double price=Double.parseDouble((String)jsonobj3);
				System.out.println("Price:"+price);
						
					
				        
				        itemPrice = quantity*price;
				        itemTotal += itemPrice;
				        System.out.println("Item Price : "+itemPrice);
				        System.out.println();
				        
				        
					}
						
						
						System.out.println("Item Total Price : "+itemTotal);
						
						double total = itemTotal;
						itemTotal = 0;
						grosstotal += total; 
				}
				
			    System.out.println("Total Price : "+grosstotal);
			    

				
				
			}
		
		
	
	}

  
