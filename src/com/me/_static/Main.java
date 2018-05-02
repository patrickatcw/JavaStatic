package com.me._static;
//static field is also known as a class variable

//static methods and fields belong to the class, not to instances
//of the class, so can be called by referencing the class name(step 11)
//rather than a class instance

//main method is always static, there has to be an entry point, a program that"s
//executed when the program runs, but until the program runs, there a no class instances
//to call methods on
public class Main {

    public static void main(String[] args) {

        //step 6 instances
        StaticTest firstInstance = new StaticTest("1st Instance");
        System.out.println(firstInstance.getName() + " is instance number " + firstInstance.getNumInstances());

        StaticTest secondInstance = new StaticTest("2nd instance");
        System.out.println(secondInstance.getName() + " is instance number " + secondInstance.getNumInstances());
        //run
        //result; both are 1????
        /*1st Instance is instance number 1
        2nd instance is instance number 1*/

        //step 7
        //now go back to class and change
        //private int numInstances = 0; to static

        //step 8 run after step 7 change in statictest class
        //result;
        /*1st Instance is instance number 1
        2nd instance is instance number 2*/

        //step 9 make another instance
        StaticTest thirdInstance = new StaticTest("3rd instance");
        System.out.println(thirdInstance.getName() + " is instance number " + thirdInstance.getNumInstances());
        //run
        //result;
        /*1st Instance is instance number 1
        2nd instance is instance number 2
        3rd instance is instance number 3*/

    }

}
