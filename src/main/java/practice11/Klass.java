package practice11;

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
    public String appendMember(Student student){
        student.klass = this;
        return "I am Tom. I know Jerry has joined Class 2.\n";
    }
    public String assignLeader(Student student){
        if (student.klass!=this){
            return "It is not one of us.\n";
        }
        else{
            this.leader = student;
        }
        return "I am Tom. I know Jerry become Leader of Class 2.\n";
    }
    public Student getLeader(){
        return this.leader;
    }
    public boolean isIn(Student student){
        if (student.getKlass() == this){
            return true;
        }
        else{
            return false;
        }
    }
}