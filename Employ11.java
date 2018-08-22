package employsalarycal;
interface EmploySalary
{
    
    public double netSalaryCal();
}
abstract class Employ11 implements EmploySalary{
    String name;
    int id;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
class SalaryCalculate extends Employ11
{
    float salary;
    float basic_pay;
    float hra;
    float da;
    float annual_salary;
    double net_salary;
    double it; 
    public float getBasic_pay() {
        return basic_pay;
    }

    public void setBasic_pay(float basic_pay) {
        this.basic_pay = basic_pay;
    }

    public float getHra() {
        return hra;
    }

    public void setHra(float hra) {
        this.hra = hra;
    }

    public float getDa() {
        return da;
    }

    public void setDa(float da) {
        this.da = da;
    }
    public void annualSalaryCal()
    {
        salary=basic_pay+hra+da;
        annual_salary=12*salary;
    }
    public float getAnnual_salary() {
        return annual_salary;
    }
    public void itCheck()
    {
        if(annual_salary<=500000)
        {
            it=0;
        }
        else
        {
            it=0.1*annual_salary;
        }
    }
    @Override
    public double netSalaryCal()
    {
        net_salary=annual_salary-it;
        return net_salary;
    }
    public void display()
    {
        System.out.println("Name="+name+"\nId="+id+"\nbasic_pay="+getBasic_pay()+"\nhra="+getHra()+"\nda="+getDa()+"\nAnnual_salary="+getAnnual_salary()+"\nnet salary="+netSalaryCal());
    }
}
