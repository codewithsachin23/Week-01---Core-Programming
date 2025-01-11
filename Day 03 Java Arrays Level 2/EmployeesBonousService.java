 // importing the scanner class
 import java.util.Scanner;
 public class EmployeesBonousService{
  public static void main(String []args){
          // creating a scanner class object for user input
          Scanner input = new Scanner(System.in);
          // Intializing the double array for taking the empolyee year of services		  
          double employeeYearOfService [] = new double[11];
		  
		  // running a loop for taking the employee year of service of each empolyee
		  for(int i=1; i<=10;i++){
			  System.out.print("Enter the Service Year of employee "+i+ " : ");
			  employeeYearOfService[i]=input.nextDouble();
			  System.out.println();
		  }
		  // Intializing the double array for taking the empolyee old salary
		  double employeeOldSalary [] = new double[11];
		  // running a loop for taking the employee old salary of each empolyee
		  for(int i=1; i<=10;i++){
			  System.out.print("Enter the old Salary of the employee "+i+ " : ");
			  employeeOldSalary[i]=input.nextDouble();
			  System.out.println();
			  
		  }
		    // initializing the employee new salary array 
			double employeeNewSalary []= new double[11];
			// initializing the employee bonus new array
			double employeeBonous [] = new double[11];
			
			// running a loop for finding the employeebonous and employeeNewService based on there year of service
			for(int i=1;i<=10;i++){
			   if(employeeYearOfService[i]>5){
                  employeeBonous[i]=(employeeOldSalary[i]*5)/100;
				  employeeNewSalary[i]= employeeOldSalary[i]+employeeBonous[i];
			   }
			   else if(employeeYearOfService[i]<=5){
                  employeeBonous[i]=(employeeOldSalary[i]*2)/100;
				  employeeNewSalary[i]= employeeOldSalary[i]+employeeBonous[i];
			   }
			}
			// Printing the output for each employee
			for(int i=1;i<=10;i++){
			System.out.println("Employee Number : "+i+"\nTotal Bonus Payout: "+employeeBonous[i]+" Total Old Salary: "+employeeOldSalary[i]+
                                " Total New Salary: " +employeeNewSalary[i]);			
			}

  }  

}
 
 