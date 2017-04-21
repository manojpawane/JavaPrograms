
   package collections;

    import java.util.HashMap;
    import java.util.LinkedHashSet;
	
	public class OverrideHashcode  
	{
		
	public boolean equals(Object obj) 
		{
			return false;
		
		}
		public static void main(String[] args) 
		{
			LinkedHashSet linkhashset = new LinkedHashSet<>();
			HashMap<String, String> hashMap=new HashMap<>();
			
		
			
			Employee1 emp = new Employee1(10, "Manoj", 50000);
			
			linkhashset.add(emp);
			linkhashset.add(emp);
			
			System.out.println(linkhashset);
			
		}
		
	}

	class Employee1 
	{
		 int id;
		 String name;
		 double salary;
		static  int hashcode =0;
		
		public Employee1(int id, String name, double salary) {
			this.id = id;
			this.name = name;
			this.salary = salary;
		}

		
	 
		
		public int hashCode() 
		{
			return hashcode++;
		}

		
	
		
		public String toString() 
		{
			return "Employee1 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
		}

	}




	