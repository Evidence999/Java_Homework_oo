package practice08;

public class Klass {
    int number;
    Student leader;
    public Klass(int number){
        this.number = number;
    }
    public int getNumber(){
        return this.number;
    }
    public String getDisplayName(){
        return "Class "+this.number;
    }
    public void assignLeader(Student student){
        this.leader = student;
    }
    public Student getLeader(){
        return this.leader;
    }
}
