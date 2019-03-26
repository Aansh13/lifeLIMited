import java.util.*;
class life
{
  public static void main(string args[])
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {	
	int q=0;
	String s[]=new String[3]
	s[0]=sc.nextLine();
	s[1]=sc.nextLine();
	s[2]=sc.nextLine();
	for(int i=0;i<2;i++)
	{		
		for(int j=0;j<2;j++)
		{
			if(s[i].charAt(j)=='l'&&s[i+1].charAt(j)=='l'&&s[i].charAt(j+1)=='l')
			{
				q=1;
			}
		}
	}
	if(q==1)
		System.out.println("yes");
	else
		System.out.println("no");
    }
  }
}
