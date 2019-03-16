package com.nikitina.university;

public class Main {
    public static void main(String[] args) {
        Group groupOfStudents = new Group(2);
        Professor ourProfessor1 = new Professor("Ivanov", 3);
        Professor ourProfessor2 = new Professor("Petrov", 2);

        Student st1 = new Student(1, "Kolya", 3, 72, 87, true);
        Student st2 = new Student(2, "Valya", 2, 77, 91, false);
        Student st3 = new Student(3, "Olya", 2, 62, 95, true);
        Student st4 = new Student(4, "Vitya", 2, 88, 87, false);
        Student st5 = new Student(5, "Oleg", 5, 61, 99, true);
        Student st6 = new Student(6, "Lesya", 2, 94, 72, false);
        Student st7 = new Student(7, "Vanya", 2, 79, 66, true);
        Student st8 = new Student(8, "Anya", 2, 63, 77, true);
        Student st9 = new Student(9, "Denis", 1, 77, 88, false);
        groupOfStudents.addToGroup(st1);
        groupOfStudents.addToGroup(st2);
        groupOfStudents.addToGroup(st3);
        groupOfStudents.addToGroup(st4);
        groupOfStudents.addToGroup(st5);
        groupOfStudents.addToGroup(st6);
        groupOfStudents.addToGroup(st7);
        groupOfStudents.addToGroup(st8);
        groupOfStudents.addToGroup(st9);

        groupOfStudents.groupInfo();
        ourProfessor1.checkStudentsInGroup(groupOfStudents);
        ourProfessor2.checkStudentsInGroup(groupOfStudents);
        groupOfStudents.elections();
        groupOfStudents.getResultsOfElections();

    }
}
