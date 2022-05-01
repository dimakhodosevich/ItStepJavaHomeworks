package by.itstep.khodosevich.firstproject.module.data;

public class Student {

    public static final int AMOUNT_OF_STUDENT = 3;
    public static final String NAME = "NAME:";
    public static final String ACTIVITY = "ACTIVITY:";
    public static final String GROUP = "GROUP:";
    public static final String SLOGAN = "SLOGAN:";
    public static final String ID = "ID:";


    private String name;
    private String slogan;
    private String groupNumber;
    private String activity;
    private static int counter;
    private int id;


    static {
        counter = 1;
    }

    {
        id = counter;
        counter++;
    }

    public Student() {
        name = "empty";
        slogan = "empty";
        groupNumber = "empty";
        activity = "empty";
    }

    public Student(String name, String slogan, String groupNumber, String activity) {
        this.name = name;
        this.slogan = slogan;
        this.groupNumber = groupNumber;
        this.activity = activity;
    }

    public Student(Student student) {
        this.name = student.name;
        this.slogan = student.slogan;
        this.groupNumber = student.groupNumber;
        this.activity = student.activity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getName() {
        return name;
    }

    public String getSlogan() {
        return slogan;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public String getActivity() {
        return activity;
    }

    public static int getCounter() {
        return counter-1;
    }

    public int getID() {
        return id;
    }


    public String toString() {
        String msg = String.format("%-5s %-25s %-25s %-15s %-35s"
                , this.id, this.name, this.groupNumber, this.activity, this.slogan);
        return msg;
    }
}
