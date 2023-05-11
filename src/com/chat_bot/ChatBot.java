package com.chat_bot;

import java.util.Scanner;

import java.time.LocalDate;

import java.time.Period;

public class ChatBot {
    public static void main(String[] args) {

        greeting();
        askName();
        guessAge();
        count();
        knowledge();

    }

    public static void greeting() {

        Scanner input = new Scanner(System.in);
        System.out.println("Hi! I am your ChatBot!");
    }

    public static void askName() {

        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("I'm sorry, could you repeat that?");
        String nameAgain = input.nextLine();

        if (nameAgain == name) {
            System.out.println("Nice to meet you " + name + "!");
        } else {
            System.out.println("One more time. Just to be sure");
            name = input.nextLine();
            System.out.println("Thank you! Nice to meet you, " + name + " !");
        }
    }

    public static int guessAge() {
        Scanner input = new Scanner(System.in);

        System.out.println("What year were you born?");
        int birthYear = input.nextInt();
        System.out.println("What month were you born in (enter month number)?");
        int birthMonth = input.nextInt();
        System.out.println("What day were you born on?");
        int birthDay = input.nextInt();

        // Calculate age
        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
        int age = period.getYears();

        // Print age
        System.out.println("I am going to guess that you are: " + age + " years old.");
        return age;
    }

    public static void count() {
        Scanner input = new Scanner(System.in);

        System.out.println("I'm up for a challenge. Enter a number between 1 and 100 and I will count for you:");
        int counter = input.nextInt();
        System.out.println("Sounds good. I will count to " + counter + " for you!");

        for (int i = 1; i <= counter; i++) {
            System.out.println(i);
        }

        System.out.println("That was a breeze!!!");
    }

    public static void knowledge() {
        Scanner input = new Scanner(System.in);

        System.out.println("Now it's your turn for a challenge! Answer the following multiple choice question...");
        System.out.println("When creating your main method in Java, which of these four words do you NOT use?");
        System.out.println("A. static");
        System.out.println("B. new");
        System.out.println("C. main");
        System.out.println("D. public");

        boolean answer = false;

        while(!answer) {
            System.out.println("Enter: A, B, C or D");
            String correctAnswer = input.nextLine();

            switch (correctAnswer.toUpperCase()) {
                case "A":
                    System.out.println("Wrong, try again");
                    break;
                case "B":
                    System.out.println("NICE!!! You really know your Java!");
                    answer = true;
                    break;
                case "C":
                    System.out.println("Sorry, try again.");
                    break;
                case "D":
                    System.out.println("Nope, try again");
                    break;
                default:
                    System.out.println("Enter a valid answer choice");
                    break;
            }
        }
    }
}
