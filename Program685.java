import java.util.*;

class Program685
{
    public static void main(String[] Arg)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();
        StringBuffer sb = new StringBuffer(str);

        sb = sb.reverse();
        System.out.println("Reverse string is : "+sb);
    }
}
