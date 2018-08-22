package employsalarycal;
import java.util.Scanner;
public class employtest {
    public static void main(String[]args)
    {
        Scanner emp=new Scanner(System.in);
        SalaryCalculate s=new SalaryCalculate();
        System.out.println("Enter the name of the employ");
        s.name=emp.nextLine();
        s.setName(s.name);
        System.out.println("enter id:");
        s.id=emp.nextInt();
        s.setId(s.id);
        System.out.println("enter basic pay");
        s.basic_pay=emp.nextLong();
        s.setBasic_pay(s.basic_pay);
        System.out.println("enter hra");
        s.hra=emp.nextLong();
        s.setHra(s.hra);
        System.out.println("enter da");
        s.da=emp.nextLong();
        s.setDa(s.da);
        s.annualSalaryCal();
        s.itCheck();
        s.display();
    }
}
