public class Constructor {
    public static void main(String[] args) {
        Student st1 = new Student("Dipti");
        System.out.println(st1.name);
    }
}
class Student{
    String name;
    int roll;
    Student(){
    //This is a non-parametrised constructor. Constructor is a special type of function, which has no return type. This function is called when a object is created. We can say, a constructor intitalizes an object.
    //At the time of calling the constructor, memory for object is allocated.
    //Everytime, when one object is created, constructor is created atleast once.
    //Non-Parametrised constructor doesn't accept any arguments;
    //If you won't create a constructor, Java compiler will automatically create a constructor in your respective class.
        System.out.println("Hello");
    }
    Student(String name){
        this.name=name;
        //This is a parametrised constructor, which accepts a string as argument.
    }
}
