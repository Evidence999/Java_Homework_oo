package practice10;

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
    public void appendMember(Student student){
        student.klass = this;
    }
    public String assignLeader(Student student){
        if (student.klass!=this){
            return "It is not one of us.\n";
        }
        else{
            this.leader = student;
        }
        return "";
    }
    public Student getLeader(){
        return this.leader;
    }
}