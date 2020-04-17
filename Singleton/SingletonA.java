public class SingletonA {
    public static void main(String[] args) {
       Student student1= Student.getInstance();
        Student student2= Student.getInstance();
        System.out.println(student1==student2);
        System.out.println(student1.toString()+"--"+student2.toString());
    }
}
class Student{
    private int id;
    private static Student stu= new Student(1);

    public int getId() {
        return id;
    }

    private Student(int id){
        this.id=id;
    }
    public static Student getInstance(){
        return stu;
    }
}