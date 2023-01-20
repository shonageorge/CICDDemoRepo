package com.ust.SampleStudentProgram.SampleStudentProgram.model;

public class Student {

    private int id;
    private String name;
    private String classNo;
    private double mark;

    public Student(int id, String name, String classNo, double mark) {
        this.id = id;
        this.name = name;
        this.classNo = classNo;
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classNo='" + classNo + '\'' +
                ", mark=" + mark +
                '}';
    }


}
