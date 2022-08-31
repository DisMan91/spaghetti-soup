public class HourlyEmployee extends Employee{
private int hoursWorked;
private int hourlyPayment;

public HourlyEmployee(){
super();
hoursWorked=0;
hourlyPayment=0;
}

public HourlyEmployee(String name, String ssn, int hours, int rate){
super(name,ssn);
setHoursWorked(hours);
setHourlyPayment(rate);
}

public void setHoursWorked(int hours){
if(hours>0){
hoursWorked=hours;
}
else{
hoursWorked=0;
}
}
public int getHoursWorked(){
return hoursWorked;
}

public void setHourlyPayment(int rate){
if(rate>0){
hourlyPayment = rate;
}
else{
hourlyPayment=0;
}
}

public int getHourlyPayment(){
return hourlyPayment;
}

public int calcSalary(){
return hoursWorked*hourlyPayment;
}
}

