package com.kevinstreet.groupproject;

public class GroupProjectTester {
    public static void main(String[] args) {
        GroupProjectTester tester = new GroupProjectTester();
        String displayName = tester.displayName("Mr", "Paul", "Kelly");
        System.out.println(displayName);
    }

    private String displayName(String title, String firstName, String surname) {
        String titleUpper = title.toUpperCase();
        char firstNameInitial = firstName.charAt(0);
        String surnameUpper = surname.toUpperCase();
        return "Hello " + titleUpper + "," + firstNameInitial + " " + surnameUpper + "";

    }
}
