import java.util.*;

class Employee
{
    public int EID;
    public String Ename;
    public String EAddress;
    public int ESalary;

    private static int Counter;

    static
    {
        Counter = 0;
    }

    public Employee(String B, String C, int D)
    {
        this.EID = ++Counter;
        this.Ename = B;
        this.EAddress = C;
        this.ESalary = D;
    }

    void DisplayInfo()
    {
        System.out.println("EID : "+EID+" Name : "+Ename+" Address : "+EAddress+" Salary : "+ESalary);
    }
}

class MarvellousDBMS
{
    public LinkedList <Employee> lobj;

    public MarvellousDBMS()
    {
        System.out.println("Marvellous DBMS started succesfully...");
        lobj = new LinkedList<Employee>();
    }

    // Insert into Employee values(1,"Sagar","Pune",11000);
    public void InsertIntoTable(String name, String Address, int Salary)
    {
        Employee eobj = new Employee(name,Address,Salary);
        lobj.add(eobj);
    }

    // Select * from emplyee;
    public void SelectStar()
    {
        System.out.println("Data from the Employee Databsae : ");
        for(Employee eref : lobj)
        {
            eref.DisplayInfo();
        }
    }

    // Select * from emplyee where Eid = 3;
    public void SelectSpecific(int ID)
    {
        System.out.println("Information of Employee whose EID is : "+ID);

        for(Employee eref : lobj)
        {
            if(eref.EID == ID)
            {
                eref.DisplayInfo();
                break;
            }
        }
    }

    // Select * from emplyee where Ename = "Sagar";
    public void SelectSpecific(String Name)
    {
        System.out.println("Information of Employee whose Name is : "+Name);

        for(Employee eref : lobj)
        {
            if(Name.equals(eref.Ename))
            {
                eref.DisplayInfo();
            }
        }
    }

    // delete from Emplyee where EID = 3;
    public void DeleteFrom(int ID)
    {
        int index = 0;
        boolean bflag = false;

        for(Employee eref : lobj)
        {
            if(eref.EID == ID)
            {
                bflag = true;
                break;
            }
            index++;
        }

        if(bflag == false)
        {
            System.out.println("Unable to delete the element from database as given id is not present");
        }
        else
        {
            lobj.remove(index);
        }
    }

    // delete from Emplyee where Ename = "Sagar";
    public void DeleteFrom(String Name)
    {
        int index = 0;
        boolean bflag = false;

        for(Employee eref : lobj)
        {
            if(Name.equals(eref.Ename))
            {
                bflag = true;
                break;
            }
            index++;
        }

        if(bflag == false)
        {
            System.out.println("Unable to delete the element from database as given Name is not present");
        }
        else
        {
            lobj.remove(index);
        }
    }

    // Select Sum(ESalary)  from Employee;
    public void AggregateSum()
    {
        int iSum = 0;

        for(Employee eref : lobj)
        {
            iSum = iSum + eref.ESalary;
        }
        System.out.println("Summation of salary : "+iSum);
    }

     // Select max(ESalary)  from Employee;
    public void AggregateMax()
        {
            int iMax = 0;
    
            for(Employee eref : lobj)
            {
                if(eref.Esalary > iMax)
                {
                    iMax = eref.Esalary;
                }
            }
            System.out.println("Maximum salary is  : "+iMax);
        }
    
        // Select Min(ESalary)  from Employee;
    public void AggregateMin()
        {
            int temp = lobj.get(0);
    
            for(Employee eref : lobj)
            {
                if(eref.Esalary < iMin)
                {
                    iMin = eref.Esalary;
                }
            }
            System.out.println("Maximum salary is  : "+Min);
        }

        // Select Avg(ESalary)  from Employee;
    public void Aggregateavg()
    {
        int iSum = 0;

        for(Employee eref : lobj)
        {
                iSum = iSum + eref.Esalary;
        }
        System.out.println("Maximum salary is  : "+iSum / lobj.size());
    }
 

}

class program656
{
    public static void main(String Arg[])
    {
        System.out.println("-------- Marvellous Database Management System --------");
        Scanner sobj = new Scanner(System.in);
        MarvellousDBMS mobj = new MarvellousDBMS();

        while(true)
        {
            System.out.println("---------------------------------------------");
            System.out.println("Please select your choice base on requirement");
            System.out.println("---------------------------------------------------------------------")

            System.out.println("1 : Insert new record into the table");
            System.out.println("2 : Display all records");
            System.out.println("3 : Insert new record into the table");
            System.out.println("4 : Insert new record into the table");

        }

    }
}