import java.util.*;

class Program679
{
    public static void main(String[] Arg)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        str = str.replaceAll("\\s+", " ").trim();
        String Arr[] = str.split(" ");

        int iCnt = 0;
        int i = 0;

        for(i = 0; i < Arr.length; i++)
        {
            System.out.println("Length of"+Arr[i]+"is : "+Arr[i].length());
        }
        
    }
}
