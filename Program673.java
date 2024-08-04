import java.util.*;

class Program673
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        int i = 0;
        int iCnt = 0;

        for(i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == ' ')
            {
                iCnt++;
            }
        }
        System.out.println("Number of white spaces are : " + iCnt);
    }
}
