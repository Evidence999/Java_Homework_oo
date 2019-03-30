package practice07;

public class Klass {
    public int number;
    public Klass(int number){
        this.number = number;
    }
    public int getNumber(){
        return this.number;
    }
    public String getDisplayName(){
        return "Class "+this.number;
    }
}
