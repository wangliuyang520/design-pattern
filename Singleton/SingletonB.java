public class SingletonB {
    static Teacher  teacher2;
    public static void main(String[] args) {

//        Teacher teacher1= Teacher.getInstance();
//        Teacher teacher2= Teacher.getInstance();
//        System.out.println(teacher1==teacher2);
//        System.out.println(teacher1.toString()+"--"+teacher2.toString());


        Teacher teacher1 = Teacher.getInstance();
        Thread thread = new Thread(()->teacher2=Teacher.getInstance());
        thread.start();
        System.out.println(teacher1 == teacher2);
        System.out.println(teacher1.toString() + "--" + teacher2.toString());

    }

    private static void run() {
        teacher2 = Teacher.getInstance();
    }
}

class Teacher {
    private int id;
    private static Teacher tc;

    public int getId() {
        return id;
    }

    private Teacher(int id) {
        this.id = id;
    }

    public static Teacher getInstance() {
        if (tc == null) {
            synchronized (SingletonB.class) {
                if (tc == null) {
                    tc = new Teacher(0);
                }
            }
        }
        return tc;
    }
}