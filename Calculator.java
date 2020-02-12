import java.util.Scanner;
class Calculator
{
    public static void main()
    {
        int i=1;
        int n,x,y,f,Res;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st Number");
        x=sc.nextInt();
        while(i>0)
        {
        System.out.println("Enter the Choice");
        n=sc.nextInt();
        switch(n)
        {
            
            case 1:
             System.out.println("Enter the 2nd Number");
             y=sc.nextInt();
            Res=x+y;
            x=Res;
            break;
            case 2:
             System.out.println("Enter the 2nd Number");
             y=sc.nextInt();
             Res=x-y;
             x=Res;
            break;
            case 3:
             System.out.println("Enter the 2nd Number");
             y=sc.nextInt();
            Res=x*y;
            x=Res;
            break;
            case 4:
             System.out.println("Enter the 2nd Number");
             y=sc.nextInt();
            Res=x/y;
            x=Res;
            break;
            case 5:
            default:
        }
        i--;
        System.out.println("If you want to do any other operation Press any other no. else type 0");
        f=sc.nextInt();
        if(f!=0)
        {
            i=1;
        }
    }
System.out.println("The result is "+Res);
}
}
       