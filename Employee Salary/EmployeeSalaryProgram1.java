public class EmployeeSalaryProgram1{

public static void main (String args[]){

SalariedEmployee emp1 = new SalariedEmployee("John Smith","30282903",12000);
HourlyEmployee emp2 = new HourlyEmployee();

emp2.setName("Anne James");
emp2.setAfm("40598760");
emp2.setHoursWorked(40);
emp2.setHourlyPayment(24);

Employee[] employees = new Employee[2];
employees[0]=emp1;
employees[1]=emp2;

for(Employee currentEmployee: employees){
System.out.print("\nName: ");
currentEmployee.displayName();
System.out.println("\nAFM: " +currentEmployee.getAfm());
System.out.println("Salary: " +currentEmployee.calcSalary());


if(currentEmployee instanceof HourlyEmployee){
HourlyEmployee employee = (HourlyEmployee)currentEmployee;
System.out.printf("Hours Worked: %d\n", emp2.getHoursWorked());
System.out.printf("Payment per Hour: %d\n", emp2.getHourlyPayment());
System.out.println();
}
}


for (int i=0;i<employees.length; i++){
System.out.printf("Employee[%d] is a %s\n",i,employees[i].getClass().getName());
}
}
}





