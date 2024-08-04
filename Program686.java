import java.util.*;

class Program686
{
    public static void main(String[] Arg)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        str = str.trim();
        str = str.replaceAll("\\s+"," ");

        String Arr[] = str.split(" ");

        StringBuffer temp = null;
        String finalstr = new StrinBuffer("");
        
        for(String s : Arr)
        {
            temp = new StringBuffer(s);
            temp = temp.reverse();
            finalstr.append(temp);
            finalstr.append(" ");
        }
        Syetm.out.println(finalstr);
    }
}
