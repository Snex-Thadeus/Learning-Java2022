package com.snextech;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Non-Primitive/Reference datatype = Sting,LocalDate
//        Primitive datatype == int,char,float,double,boolean,short,long,byte

        // Strings
        char a = 'A'; // Allows one single value

        String name = "Snex-Tech";
        System.out.println(name.toUpperCase());

        // Concatenating Strings
        String firstName = "Thadeus";
        String lastName = "Odhiambo";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        String fullName2 = name.concat(" ").concat(lastName);

        // Arithmetic operations + - * / %
        int ten = 10;
        int two = 2;
        int addition = 10 + 2;
        System.out.println(addition);

        // Math class
        Math.max(3, 6);

        // Comparison Operator > < == != >= <=
        int snexAge = 26;
        int tedyAge = 29;
        boolean isSnexOlderThanTedy = snexAge > tedyAge;
        System.out.println(isSnexOlderThanTedy);

        // Logical Operators &&(and) ||(or)
        // &&--->both values must be true  || ---> One value must be true
        boolean isAdult = false;
        boolean isStudent = true;
        System.out.println(isAdult && isStudent);

        // If Statements
        int age = 16;
        if (age >= 18) {
            System.out.println("Yes Iam an adult");
        } else {
            System.out.println("Oooops....I am not an adult");
        }
        // Ternary Operator -- > Applicable when evaluating one boolean value
        int agee = 17;
        String message = agee >= 18 ? "Yes Iam an adult" : "Oooops....I am not an adult";
        System.out.println(message);
        // Switch Statements ---> Used when switching on single values
        String gender  = "FEMALE";
        if (gender.equals("FEMALE")){

        } else if (gender.equals("MALE")) {

        } else if (gender.equals("PREFER NOT TO SAY")){

        } else {

        }
  // Above can be transformed into below switch statement
        switch (gender.toUpperCase()) {
            case "FEMALE" :
                System.out.println("I am a female");
                break;
            case "MALE":
                System.out.println("I am a male");
                break;
            case "PREFER NOT TO SAY":
                System.out.println("Prefer not to say");
                break;
            default:
                System.out.println("Unknown gender");
        }
        // Arrays
        int [] numbers = {2,6,4};
        String [] names = {"Snex", "Odhis", "Vee"};
//        int [] numbers = new int[3];
//        numbers[0] = 2;
//        numbers[1] = 6;
//        numbers[2] = 4;
        System.out.println(Arrays.toString(numbers));

        // Loops
        int [] num = {2, 3, 0, 8, 57, 98, 34, 223};
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        // Enhanced ForLoop ---> It doesnot give you access to the actual index
        for (int number : num) {
            System.out.println(number);
        }
        // Break and Continue
        String [] namees = {"Snex", "Odhis", "Vee", "Mercy"};
        for (String namee : namees) {
            if (namee.startsWith("V")) {
                continue; // It doesn't print any namee starting with V
            }
//            if (namee.equals("Vee")) {
//                break;
//            }
            System.out.println(namee);
        }
        // While Loop ---> It runs provided the boolean exp is true otherwise it breaks out
        int count = 0;
        while (count <= 20) {
            System.out.println("Count" + count);
            count++;
        }
        // Do While Loop --> It executes no matter what atleast once
        int coun = 21;
        do {
            System.out.println("Count" + coun);
            coun++;
        }
        while (coun <= 20);

        // Scanner --> Takes user input from the console
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");

        String userName = scanner.nextLine();
        System.out.println("Hello" + userName);

        System.out.println("How old are you?");
        int agi = scanner.nextInt();
        int year = LocalDate.now().minusYears(agi).getYear();
        System.out.println("You were born in " + year);

        if (agi < 18) {
            System.out.println("and you are not an adult");
        } else
            System.out.println("and you are an adult");

        // Methods
        char [] letters = {'A', 'A', 'B', 'C', 'D', 'D', 'D'};
        int countt = countOccurrences(letters, 'A');
    }

    public static int countOccurrences(char [] letters, char searchLetter){
        int countt = 0;
        for (char letter : letters) {
            if (letter == searchLetter) {
                countt ++;
            }
        }
        return countt;

        // Classes and Objects
        Lens lensOne = new Lens("Sony", "85mm", true);
        Lens lensTwo = new Lens("Sony", "24mm", true);
        Lens lensThree = new Lens("Canon", "55mm", false);

        System.out.println("Lens One");
        System.out.println(lensOne.brand);
        System.out.println(lensOne.focalLength);
        System.out.println(lensOne.isPrime);
    }
    static class Lens {
        String brand;
        String focalLength;
        boolean isPrime;

        // Constructor
        Lens(String brand, String focalLength, boolean isPrime) {
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
        }
    }
}

















