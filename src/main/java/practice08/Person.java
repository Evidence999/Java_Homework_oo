package practice08;

public class Person {
    int id;
    String Name;
    int age;
    public Person(int id, String name, int age){
        this.id = id;
        this.Name = name;
        this.age = age;
    }
    public String getName(){
        return Name;
    }
    public int getAge(){
        return age;
    }
    public String introduce(){
        return "My name is " + this.Name + ". I am " + this.age + " years old.";
    }
    public int getId(){
        return this.id;
    }
    public boolean equals(Person person){
        if (person == this){
            return true;
        }
        if (person instanceof Person) {
            if (person.getId() != this.getId()) {
                return false;
            }
        }
        return true;
    }
}