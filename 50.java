class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int n,p=0;
	  Scanner sc=new Scanner(System.in);
	  n=sc.nextInt();
	  while(n!=1)
	  {
	  	if(n%2!=0)
	  	{
	  	 p=1;
	  	}
	  	n=n/2;
	  }
	  if(p==1)
	  System.out.println("no");
	  else
	  System.out.println("yes");
	}
}
