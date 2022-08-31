public class SalariedEmployee extends Employee{
private int salary;

public SalariedEmployee(){
super();
salary=0;
}

public SalariedEmployee(String name, String ssn, int money){
super(name,ssn);
setSalary(money);
}
public void setSalary(int payment){
if(payment>0){
salary=payment;
}
else{
salary=0;
}
}


public int calcSalary(){
return salary;
}
}
