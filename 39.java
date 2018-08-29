class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int max,i;
	 Scanner sc=new Scanner(System.in);
	 int a[]=new int[10];
	 for(i=0;i<10;i++)
	       {
	          	a[i]=sc.nextInt();
	       }
	       max=a[0];
	       for(i=0;i<10;i++)
	       {
	 	         if(max<a[i])
	 	         {
	 		        max=a[i];
	 	         }
	       }
	 System.out.print(max);


	}
}
