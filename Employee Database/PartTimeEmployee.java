public class PartTimeEmployee extends FullTimeEmployee{

private double hourlyWork;
private double rate;

public PartTimeEmployee(){

super();
setHourlyWork(0.0);
setRate(0.0);
}

public PartTimeEmployee(String name, String surname, double salary, double hours, double comission){
super(name,surname,salary);
setHourlyWork(hours);
setRate(comission);
}

public void setHourlyWork(double hours){
if(hours>0){
hourlyWork = hours;
}
else{
hourlyWork = 0;
}
}

public double getHourlyWork(){
return hourlyWork;
}

public double calculateSalary(){
if((rate>0)&&(hourlyWork>0)){
   monthlySalary = hourlyWork*rate;
}
else{
   monthlySalary=0;
}
return monthlySalary;
}

public void setRate(double comission){
if(comission>0){
rate = comission;
}
else{
rate = 0;
   }

}
}
