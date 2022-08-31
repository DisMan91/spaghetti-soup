public abstract class Employee{
private String fullName;
private String afm;

public Employee(){
fullName = null;
afm=null;
}

public Employee(String name, String ssn){
fullName = name;
afm=ssn;
}

public void setName(String name){
fullName=name;
}

public void displayName(){
System.out.print(fullName);
}
public void setAfm(String ssn){
afm=ssn;
}

public String getAfm(){
return afm;
}


public abstract int calcSalary();
}
