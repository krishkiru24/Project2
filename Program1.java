import java.util.Scanner;
class Program1
{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		int num=scr.nextInt();
		int fact=1;
		while(num>0)
		{
			fact=fact*num;
			num--;
		}
			System.out.println(fact);
	}
}