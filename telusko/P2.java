//playing with refrences
    // File: A.java
 class A {
    public void show1() {
        System.out.println("show1");
    }
}

// File: B.java
 class B extends A {
    public void show() {
        System.out.println("show");
    }
}

// File: Demo.java
 class Demo {
    public static void main(String[] args) {
        A a = new B();
        B b  = (B)a;
    
        b.show();
        b.show1();
        System.out.println("Hello World");
    }
}

// Step 1 (A a = new B();):

//     Here, we create an object a of type A but assign it an instance of B. 
//     This is possible because B is a subclass of A. This technique is called
//      polymorphism, where a subclass object can be referred to by a superclass reference
//       variable.

// Step 2 (B b = (B) a;):

//     Next, we create an object b of type B and explicitly cast a to B. Since a was 
//     originally pointing to an instance of B, this cast is valid. Now, b also refers 
//     to the same instance of B that a refers to.
