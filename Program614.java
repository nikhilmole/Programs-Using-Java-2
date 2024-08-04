import java.util.*;

class Program614
{
    public static void main(String Argv[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iNo = sobj.nextInt();

        int iDigit = 0;
        int iSum = 0;

        while(iDigit >= 10)
        {
            while(iNo != 0)
            {
                iDigit = iNo  % 10;
                iSum = iSum + iDigit;
                iNo  = iNo / 10;
            }
            if(iSum >= 10)
            {
                iNo = iSum;
                iSum = 0;
            }
        }
        System.out.println("Generic root is : "+iSum);

    }
}