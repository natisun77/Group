package com.nataliia.nikitina;

public class Student {
    private String name;
    private int course;
    private int grade;
    private int popularity;
    private boolean presence;

    public Student(int id, String name, int course, int grade, int popularity, boolean presence) {

        if (name.length() > 3) {
            this.name = name;
        } else {
            this.name = "NoName";
        }
        if (course > 0 && course < 7) {
            this.course = course;
        }
        if (grade > 60 && grade <= 100) {
            this.grade = grade;
        }
        if (popularity > 0 && popularity <= 100) {
            this.popularity = popularity;
        }
        this.presence = presence;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public int getGrade() {
        return grade;
    }

    public int getPopularity() {
        return popularity;
    }


    public boolean getPresence() {
        return presence;
    }

    public void vote() {
        System.out.println(name + ": I vote.");
    }
}


