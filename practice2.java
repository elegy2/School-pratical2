import java.util.Scanner;

public class practice2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter start point ");
        int a = sc.nextInt();
        System.out.print("enter end point ");
        int b = sc.nextInt();
        int sum = 0;

        if(b<a){System.out.println("error end point smalller than start point");}
        else
        {
            for(int i = a;i<=b;i++)
                {
                    sum += i;

                }
        System.out.println(sum);
        }
    }
}
