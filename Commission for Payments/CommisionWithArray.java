import java.util.Scanner;

public class CommisionWithArray{

public static void main (String args[]){

Scanner input  = new Scanner (System.in);

String myText = "Welcome to the Commission Calculator. \nPlease Enter the amount of"
+"monthly Salaries\n";
System.out.println(myText);


int[] salaries = new int [6];
double[] percentageKeep = new double [6]; 
double[] newSalary = new double [6];

for(int i=0; i<salaries.length; i++)
{

   int currentEmploy = i + 1;
   System.out.println("Enter Salary for Employee No" + currentEmploy);
   salaries[i] = input.nextInt();
}

for(int i=0; i<salaries.length; i++){
int currentEmploy = i + 1;

if(salaries[i] <= 1000){
   percentageKeep[i] = salaries[i] * 0.05;
}else if(salaries[i] > 1000 && salaries[i] <= 2000){
   percentageKeep[i] = salaries[i] * 0.085;
}else{
   percentageKeep[i] = salaries[i] * 0.12;
}

newSalary[i] = salaries[i] - percentageKeep[i];

System.out.println("New Salary for employee no "+ currentEmploy + " is " + newSalary[i]);
System.out.printf("The Comission for employee no %d is %.2f \n", currentEmploy, percentageKeep[i]);
      }
   }
}