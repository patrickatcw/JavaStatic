package com.me._static;

//step 1 class
public class StaticTest {

    //step 2 variables / fields
    //private int numInstances = 0;
    private static int numInstances = 0;  //step 7 change to static, then back to main for step 8
    private String name;

    //step 3 constructor for just name
    public StaticTest(String name) {
        this.name = name;
        //step 4 to iterate
        numInstances++;
    }

    //step 5 getter for both
    //public int getNumInstances() {
    public static int getNumInstances() { //step 10 changed to a static method, back to main for step 11
        return numInstances;
    }

    public String getName() {
        return name;

        //step 6 to main

    }
}