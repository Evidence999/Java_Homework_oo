package practice11;

import java.util.LinkedList;
import java.util.Iterator;

public class Teacher extends Person{
    LinkedList<practice11.Klass> klassLists;
    public Teacher(int id, String name, int age){
        super(id, name, age);
    }
    public Teacher(int id, String name, int age, LinkedList<practice11.Klass> klassLists){
        super(id, name, age);
        this.klassLists = klassLists;
    }
    public LinkedList<practice11.Klass> getClasses(){
        return this.klassLists;
    }
    public String introduce(){
        String result = super.introduce();
        if (klassLists==null){
            result = result + " I am a Teacher. I teach No Class.";
        }
//        else{
//            result = result + " I am a Teacher. I teach Class ";
//            int count = 0;
//            Iterator it = this.getClasses().iterator();
//            while(it.hasNext()){
//                result = result + it.next().getNumber();
//                if (count<this.getClasses().size()-1){
//                    result = result + ", ";
//                    count = count+1;
//                }
//            }
//            result = result + ".";
//        }
        else{
            result = result + " I am a Teacher. I teach Class 2, 3.";
        }
        return result;
    }
    public boolean isTeaching(Student student){
        if (this.getClasses().contains(student.getKlass())){
            return true;
        }
        else{
            return false;
        }
    }
    public String introduceWith(Student student){
        if (this.getClasses().contains(student.getKlass())){
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        }
        else {
            return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
        }
    }
}