package com.nikitina.university;

public class Professor {
    private String name;
    private int course;

    public Professor(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public void checkStudentsInGroup(Group group) {
        if (course == group.getCourse()) {
            int count = 0;
            System.out.println(name + " says: Let's check who is present today.");
            for (int i = 0; i < group.getSize(); i++) {
                if (group.getGroupList().get(i).getPresence()) {
                    count++;
                }
            }
            System.out.println("Today in our group we have " + count + " students. " + (group.getSize() - count) + " students are absent.");
        } else {
            System.out.println("It is the wrong group.");
        }
    }

}
