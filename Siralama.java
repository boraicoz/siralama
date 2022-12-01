import java.util.Scanner;
public class Siralama {
    public static void main(String[] args) {
        int a,b,c;
        Scanner in=new Scanner(System.in);
        System.out.print("a:");
        a=in.nextInt();
        System.out.print("b:");
        b=in.nextInt();
        System.out.print("c:");
        c=in.nextInt();
        if ((a>b)&&(a>c))
        {
            if (b>c)
                System.out.println("a>b>c");
             else
                System.out.println("a>c>b");
        }
        else if ((b>c)&&(b>a))
        {
            if (c>a)
                System.out.println("b>c>a");
            else
                System.out.println("b>a>c");
        }
        else
        {
            if (a>b)
                System.out.println("c>a>b");
            else
                System.out.println("c>b>a");
        }

    }
}
