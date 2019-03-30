package practice01;

public class Person {
    String Name;
    int age;
    public Person(String name, int age){
        this.Name = name;
        this.age = age;
    }
    public String getName(){
        return this.Name;
    }
    public int getAge(){
        return this.age;
    }
    public String introduce(){
        return "My name is " + this.Name + ". I am " + this.age + " years old.";
    }

}
