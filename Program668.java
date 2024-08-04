import java.util.Scanner;

class Matrix 
{
    public int rows;
    public int cols;
    public int Arr[][];

    public Matrix(int rows, int cols) 
    {
        this.rows = rows;
        this.cols = cols;
        Arr = new int[rows][cols];
    }

    public void accept() 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                Arr[i][j] = sobj.nextInt();
            }
        }
    }

    public void display() 
    {
        System.out.println("Elements from the matrix:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                System.out.print(Arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public int Summation()
    {
        int iSum = 0;
        int i = 0;
        int j = 0;
        for(i = 0; i < rows; i++)
        {
            for(j = 0; j < cols; j++)
            {
                iSum = iSum + Arr[i][j];
            }
        }
        return iSum;
    }
}

class Program567 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int rows = sobj.nextInt();

        System.out.println("Enter the number of columns: ");
        int cols = sobj.nextInt();

        Matrix mobj = new Matrix(rows, cols);

        mobj.accept();
        mobj.display();

        int iRet = mobj.Summation();
        System.out.println("Summation is : "+iRet);
    }
}
