public class OOPS {
    public static void main(String[] args) {
        // Student s1 = new Student("Karan");
        // System.out.println(s1.name);

        // Fish shark = new Fish();
        // shark.eat();

        // Dog Sheru = new Dog();
        // Sheru.eat();
        // Sheru.legs = 4;
        // System.out.println(Sheru.legs);

        // Calculator calc = new Calculator();
        // System.out.println(calc.sum(5, 5));
        // System.out.println(calc.sum(5, 3, 2));
        // System.out.println(calc.sum((float)5.0, (float)5.0));

        // Cow Nando = new Cow();
        // Nando.eat();
    }
}

// class Student{
//     String name;
//     int roll_no;
//     Student(String name){
//         this.name = name;
//     }
// }


//This is example of Single level Inheritance
//Base Class
// class Animal{
//     String color;

//     void eat(){
//         System.out.println("Eats");
//     }

//     void breathe(){
//         System.out.println("Breathes");
//     }
// }

// //Derived class
// class Fish extends Animal {
//     int fins;
//     void swim(){
//         System.out.println("Swims");
//     }
// }


//This is example of Multilevel Inheritance
// this is base class
// class Animal{
//     String color;

//     void eat(){
//         System.out.println("Eats");
//     }

//     void breathe(){
//         System.out.println("Breathes");
//     }
// }

// this is derived class from animal
// class Mammal extends Animal{
//     int legs;
// }

// this is derived class derived from a derived class
// class Dog extends Mammal{
//     String breed;
// }


// This is example of Heirarchial Inheritance
// This is base class
// class Animal{
//     String color;

//     void eat(){
//         System.out.println("Eats");
//     }

//     void breathe(){
//         System.out.println("Breathes");
//     }
// }

// this is derived class1 derived from animal
// class Mammal extends Animal{
//     int legs;
// }

// // this is derived class2 derived from animal
// class Dog extends Animal{
//     String breed;
// }


// this is example of method overloading(Polymorphism)
// class Calculator{
//     int sum(int a,int b){
//         return a+b;
//     }

//     int sum(int a,int b,int c){
//         return a+b+c;
//     }

//     float sum(float a, float b){
//         return a+b;
//     }
// }

// This is example of method overriding(Polymorphism)
// class Animal{
//     void eat(){
//         System.out.println("Eats anything");
//     }
// }

// class Cow extends Animal{
//     void eat(){
//         System.out.println("Eats only Grass");
//     }
// }