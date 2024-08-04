import java.util.*;

class Program667
{
    public static void main(String Argv[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+"," ");

        System.out.println(str);

        String Arr[] = str.split(" ");

        HashMap <String, Integer>hobj = new HashMap<String, Integer>();

        int Frequency = 0;
        for(String A : Arr)
        {
            if(hobj.containsKey(A))
            {
                Frequency = hobj.get(A);
                hobj.put(A,Frequency+1);
            }
            else
            {
                hobj.put(A,1);
            }
        }

        Set <String>setobj = hobj.keySet();
        System.out.println(setobj);


        int iMax = 0;
        String temp = null;

        for(String B : setobj)
        {
           if(hobj.get(B) > iMax)
           {
            iMax = hobj.get(B);
            temp = B;
           }
        }
        System.out.println(temp+ " is a word occurs maximum times : "+iMax+" times");
    }
}