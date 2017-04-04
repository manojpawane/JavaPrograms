class InsertionSort
{
	
  public static void main(String[] args) 
  {
	String[] arr={"bata","Samba","leonidas","justin "};
	int n=arr.length;	
	System.out.println("Before sorting..");
	for(String a:arr)
		System.out.print(a+" ");
	System.out.println("\n ");
	

	 sort(arr,n);
	 System.out.println("Array After Sorting");
	 for(String a:arr)
	   {		 
		 System.out.print(a+" ");
	   }
	}

   public static void sort(String a[], int n)
   {	 
	 for(int i=1;i<n;i++)
	 {		 
		 String data = a[i];
		 int hole = i;
		 while((hole>0) && (data.compareToIgnoreCase(a[hole-1]))<0)
		 {
			 a[hole]=a[hole-1];
			 hole--;			 
		 }
		 a[hole]=data;
		 
	 }
 }
}
