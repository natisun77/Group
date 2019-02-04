package com.nataliia.nikitina;

import java.util.ArrayList;

public class Group {
    private ArrayList<Student> groupList;
    private int course;

    public Group(int groupCourse) {
        groupList = new ArrayList<>();
        course = groupCourse;
    }

    public int getSize() {
        return groupList.size();
    }

    public int getCourse() {
        return course;
    }

    public ArrayList<Student> getGroupList() {
        return groupList;
    }

    public void addToGroup(Student st) {
        if (st.getCourse() == course) {
            groupList.add(st);
        }
    }

    public void groupInfo() {
        System.out.println("Group has " + groupList.size() + " students.");
    }

    public void elections() {
        if (groupList.size() > 5) {
            System.out.println("Let's vote.");
            for (int i = 0; i < groupList.size(); i++) {
                if (groupList.get(i).getPresence()) {
                    groupList.get(i).vote();
                }
            }
        } else {
            System.out.println("We do not have enough students today.");
        }
    }

    public void getResultsOfElections() {
        Student winner = null;
        int max = 0;

        for (int i = 0; i < groupList.size() - 1; i++) {
            int studentChance = groupList.get(i).getGrade() + groupList.get(i).getPopularity();
            if (groupList.get(i).getPresence()) {
                if (studentChance > max) {
                    max = studentChance;
                    winner = groupList.get(i);
                }
            }
        }
        if (winner != null) {
            System.out.println("According to elections group leader is " + winner.getName());
        } else {
            System.out.println("During the elections leader was not chosen");
        }
    }
}
