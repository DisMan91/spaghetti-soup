public class FullTimeEmployee{

protected String firstName;
protected String lastName;
protected double monthlySalary;

public FullTimeEmployee(){
firstName = null;
lastName = null;
setMonthlySalary(0.0);
}

public FullTimeEmployee(String name, String surname, double salary){
firstName = name;
lastName = surname;
setMonthlySalary(salary);
}

public void setFirstName(String name){
firstName = name;
}

public String getFirstName(){
return firstName;
}

public void setLastName(String surname){
lastName = surname;
}

public String getLastName(){
return lastName;
}

public void setMonthlySalary(double salary){
if(salary>0){ monthlySalary =  salary; 
}
else{
monthlySalary = 0;
   }
}

public double getMonthlySalary(){
return monthlySalary;
}
}