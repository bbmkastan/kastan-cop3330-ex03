package Base;

import  java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Bao Kastan
 */

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String quote = myApp.getQuote();
        String author = myApp.getAuthor();
        String outputString = myApp.createString(quote, author);

        myApp.printOutput(outputString);
    }

    public void printOutput(String outputString) {
        System.out.println(outputString);
    }

    public String getAuthor() {
        promptForAuthor();
        String author = getString();
        return author;
    }

    public String getQuote() {
        promptForQuote();
        String quote = getString();
        return quote;
    }

    public String getString() {
        return in.nextLine();
    }

    public String createString(String quote, String author) {
        return author + " says, " + '"' + quote +'"';
    }

    public void promptForQuote() {
        System.out.println("What is the quote? ");
    }

    public void promptForAuthor(){
        System.out.println("Who said it? ");
    }

}
