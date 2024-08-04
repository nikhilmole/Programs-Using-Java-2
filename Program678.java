import java.util.*;

class Program678
{
    public static void main(String[] Arg)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        str = str.replaceAll("\\s+", " ").trim();
        String Arr[] = str.split(" ");

        System.out.println("Number of words are : " + Arr.length);
    }
}
