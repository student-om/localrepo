class A{
public void show()throws ClassNotFoundException{
    Class.forName("Demo");//tells to load class(not present in this file)
    System.out.println("class Demo is found");
}

}

// class Demo{
//    public static void main(String args[])throws ClassNotFoundException{
//     A a  = new A();
// line 10->    a.show();//execution will stop here if (throws) used in main method

//(imp -> )
//  here jvm is calling main method and at line 10 if exception is generated 
//  main method will throw exception to jvm and then jvm will stop the execution

//     Hello will not get printed here.
//     System.out.println("Hello");
//     //o/p->
//    }
// }


class Demo{
   public static void main(String args[]){
    
    A a  = new A();
    try{
    a.show();//execution keep to continue and Hello gets printed
    }
    catch(ClassNotFoundException e){
        System.out.println("class is not found");
    }
    System.out.println("Hello");
    //o/p->
   }
}
//Notes:

/*  When you use Class.forName("ClassName"), it tells Java to load the 
 class with the name "ClassName".*/

// This is useful if you want to use a class but don't know its name
//  until your program is running.

// You need to handle ClassNotFoundException, which occurs if the class 
// name you provided does not exist.

// If the class is found, it gets loaded into memory, and you can then
//  create instances of it or use its static methods.
///----------------------------------------------------------------
// In Java, the main method must be declared as static. 
// The main method is the entry point of any Java application, 
// and it has a specific signature that the Java Virtual Machine 
// (JVM) looks for when starting a program. This signature is:

// Static Methods: Static methods belong to the class itself rather than
//  an instance of the class. This means they can be called without 
//  creating an instance of the class.
// Program Entry Point: When you start a Java program, the JVM does not
//  create an instance of your class. It directly calls the main method.
//   Because main is static, it can be called without needing an 
//   instance of the class

//   If you try to declare the main method without static
//   the JVM will not recognize it as the entry point.
// You will get an error message similar to:

// vbnet

// Error: Main method not found in class MyClass, please define 
//the main method as:
//    public static void main(String[] args)

