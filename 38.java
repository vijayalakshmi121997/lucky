class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,b;
	   Scanner sc=new Scanner(System.in);
	   a=sc.nextInt();
	   b=sc.nextInt();
	   a=a^b;
	   b=a^b;
	   a=a^b;
	   System.out.print(a+" "+b);
}
}
