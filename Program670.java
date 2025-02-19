import java.util.Scanner;

class Matrix 
{
    public int rows;
    public int cols;
    public int[][] Arr;

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
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
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

    public int summation() 
    {
        int sum = 0;
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                sum += Arr[i][j];
            }
        }
        return sum;
    }

    public int maximum() 
    {
        int max = Arr[0][0];
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                if (Arr[i][j] > max) 
                {
                    max = Arr[i][j];
                }
            }
        }
        return max;
    }

    public int minimum() 
    {
        int min = Arr[0][0];
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                if (Arr[i][j] < min) 
                {
                    min = Arr[i][j];
                }
            }
        }
        return min;
    }

    public void rowSum() 
    {
        for (int i = 0; i < rows; i++) 
        {
            int sum = 0;
            for (int j = 0; j < cols; j++) 
            {
                sum += Arr[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + " is: " + sum);
        }
    }
    public int DigonalSum()
    {
        int i = 0;
        int j = 0;
        int Sum = 0;

        if(rows != cols)
        {
            System.out.println("Unable to perform the addition of elements");
            System.out.println("Because the marix is noot a square matrix");
        }
        for(i = 0; i  < rows; i++)
        {
            for(j = 0; (j <  cols);  j++)
            {
                if ((i == j)) 
                {
                    Sum = Sum + Arr[i][j];
                }
            }
        }
        return Sum;
    }
}

public class Program670 
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

        int sum = mobj.summation();
        System.out.println("Summation is: " + sum);

        int max = mobj.maximum();
        System.out.println("Maximum number is: " + max);

        int min = mobj.minimum();
        System.out.println("Minimum number is: " + min);

        mobj.rowSum();

        int diagonalSum = mobj.DigonalSum();
        System.out.println("Diagonal summation is: " + diagonalSum);
    }
}
