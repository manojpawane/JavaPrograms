package com.bridgelabz.controller;

import com.bridgelabz.implementation.AddressBook;
import com.bridgelabz.service.Service;

public class Controller 
{
	
		Service service=new AddressBook();
		public void addperson()
		{
		service.addperson();
		
		}
		/*void search()
		{
			ab.search();
		}*/
		public void display()
		{
		//Service service=new AddressBook();
		service.display();
		}
		
		public void search()
		{
			service.search();
		}
		
		public void delete()
		{
			service.delete();
		}

		public void update()
		{
			service.update();
		}
		public void sortbyname()
		{
			service.sortbyzip();
		}
		
		public void sortbyzip()
		{
			service.sortbyzip();
		}
		public void createaddressbook()
		{
			service.createaddressbook();
		}
	

}
