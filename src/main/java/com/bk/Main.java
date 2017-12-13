package com.bk;


import com.bk.animals.Cat;

public class Main {
    private String message;


    public static void main(String[] args) {
        int number = 5;
        float floatNumber = 0.3f;
        double doubleNumber =0.3d;
        char key = 's';
        char key2 = '\uAF39';
        boolean isValid = true;

        Cat zsdasdasdasds = new Cat("Tomas", 4);


        System.out.println("Hello World");
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
