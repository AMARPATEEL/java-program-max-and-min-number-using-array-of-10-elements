import java.util.Scanner;
public class Array_01
{
    public static void main(String[] args) 
    {
        int max,min;
        Scanner Scan = new Scanner(System.in);
        int a[] = new int[10];
        System.out.println("Enter 10 elements:");
        for(int i = 0; i < 10; i++)
        {
            a[i] = Scan.nextInt();
        }
        max=a[0];
        for(int i = 0; i < 10; i++)
        {
            if(max < a[i])
            {
                max = a[i];
            }
        }
        System.out.println("Maximum value:"+max);
	min=a[0];
	for (int i=0; i<10; i++)
	{
		if(min >a[i])
		{
			min=a[i];
		}
	}
	System.out.println("Minimum value:"+min);
    }
}