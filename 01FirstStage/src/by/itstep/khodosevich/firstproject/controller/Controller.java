package by.itstep.khodosevich.firstproject.controller;

import by.itstep.khodosevich.firstproject.module.data.Student;
import by.itstep.khodosevich.firstproject.view.Printer;

import static by.itstep.khodosevich.firstproject.module.data.Student.*;

public class Controller {
    public static void main(String[] args) {

        Student[] arrayStudent = new Student[AMOUNT_OF_STUDENT];

        arrayStudent[0] = new Student("Dima Khodovevich", "Never give up",
                "SuperJava J3021", "Ingeneer");

        arrayStudent[1] = new Student("Ivanov Ivan", "Java is super",
                "SuperJava J3021", "Student");

        arrayStudent[2] = new Student();

        System.out.printf("%1$-5s %2$-25s %4$-25s %4$-15s %5$-35s\n", ID, NAME, ACTIVITY, GROUP, SLOGAN);

        for (int i = 0; i < arrayStudent.length; i++) {
            Printer.printToConsole(arrayStudent[i].toString());
        }

        System.out.println("Numbers of student: " + Student.getCounter());
    }
}
