import java.util.Scanner;
import java.util.ArrayList;
class Employee{
 String name;
 String id;
 int hourlyRate;
 
 static ArrayList<Employee> arr = new ArrayList<>();
 static Scanner sc = new Scanner(System.in);
 
 
 Employee(String name,String id,int hourlyRate){
 this.name = name;
 this.id = id;
 this.hourlyRate = hourlyRate;
 }
 
 public static void addEmployee(){
 sc.nextLine();
 System.out.println("Name:");
 String s1 = sc.nextLine();
 System.out.println("ID:");
 String s2 = sc.nextLine();
 System.out.println("Hourly Rate:");
 int s3 = sc.nextInt();
 
 storeToArray(new Employee(s1,s2,s3));
 }
 
 public static void storeToArray(Employee e){
 //non static me static chalta hai...
 arr.add(e);
 
 }
 
 public static double calculateHourlySalary(Employee e){
 System.out.println(" H/M ? Choose one");
 if(sc.next().charAt(0) == 'M'){
   System.out.println("How much Minutes You Have Worked?");
   double a1 = sc.nextDouble();
   double b1 = a1/60;
   //System.out.println("Your Hourly Salary is:" + b1 * e.hourlyRate);
   return b1 * e.hourlyRate;
 }
 if(sc.next().charAt(0) == 'H'){
  System.out.println("How much Hours You Have Worked?");
  double a1 = sc.nextDouble();
  //System.out.println("Your Hourly Salary is:" + a1 * e.hourlyRate);
  return a1 * e.hourlyRate;
 }
 
 else{
 //System.out.println("Invalid Input");
 return 0.0;
 }
 
 }
 
 public static void calculateSalaryOfParticularEmployee(ArrayList<Employee> list){
 System.out.println("Enter the name of the Employee Whose Salary Needs To be Calculated:");
  sc.nextLine();
   String s = sc.nextLine();
 
 for(int i=0;i<list.size();i++){
  if(s.equals(list.get(i).name)){
  double g = calculateHourlySalary(list.get(i));
   if(g != 0.0){
   System.out.println("Salary of s" + list.get(i).name + " is: " + g);
   }
   else{
   System.out.println("You Didn't Choose one of the Option Button H/M");
   }
  
  }
  else{
   System.out.println("Employee With This Name is Not Found");
  }
 
 }
 
 }
 
 public static void main(String args[]){
 
    System.out.println("Add Employee (1) | Calculate Salary Of an Employee (2)?");
    int a = sc.nextInt();
    if(a == 1){
    System.out.println("Press y/Y to add Employee | Press n/N to close option");
   
     while(sc.next().charAt(0) == 'Y'){
     addEmployee();
     System.out.println("Add more Employee? Y/N");
     
     }
    }
    
   System.out.println("Do you Want to calculate the Salary of a particular employee in the Office? Y/N");
   if(sc.next().charAt(0) == 'Y'){
    calculateSalaryOfParticularEmployee(arr);
   }
   else{
   
   }
    
    
 }
 
 
 
 
 
}
