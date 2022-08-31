public class ProgEmployees{

public static void main (String args[]){

FullTimeEmployee emp1 = new FullTimeEmployee();
PartTimeEmployee emp2 = new PartTimeEmployee();

emp1.setFirstName("John");
emp1.setLastName("Smith");
emp1.setMonthlySalary(1200.0);
emp2.setFirstName("Jane");
emp2.setLastName("Doe");
emp2.setRate(40);
emp2.setHourlyWork(30);

System.out.printf("Employee 1 Name %s %s\nSalary: %.2f",emp1.getFirstName(), emp1.getLastName(),emp1.getMonthlySalary());
System.out.printf("\nEmployee 2 Name %s %s\nSalary: %.2f",emp2.getFirstName(), emp2.getLastName(),emp2.calculateSalary());
   }
}


