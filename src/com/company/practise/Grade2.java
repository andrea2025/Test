package com.company.practise;


public class Grade2 {

    private String courseName;
    private int age;
    private int balance;

    public Grade2(String name) {
        this.courseName = name;
    }

    //method overloading (polymorphism)
    public Grade2(String name, int age) {
        this.courseName = name;
        this.age = age;
    }

    public void setCourseName(String name) {
        this.courseName = name;
    }

    public String getCourseName() {
        return this.courseName;
    }

    private int getAge() {
        return this.age;
    }

    private int getBalance() {
        return this.balance + 1000;
    }

    public String getDisplayMessage() {
        return ("\n\nName = " + getCourseName() + "\nAge = " + getAge() + "\nBalance = " + getBalance());
    }

    public static double determineClassAverage(double[] scores) {
        if (scores == null || scores.length == 0) {
            return 0;
        }
        double total = 0;

        for (double score : scores) {
            total += score;
        }
        return total / scores.length;
    }


}