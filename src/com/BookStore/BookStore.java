package com.BookStore;

import java.util.Scanner;

public class BookStore {

    public static void main(String[] args) {

        //Define book properties

        String title;
        String author;
        String  price;
        String publisher;
        String ISBN;


        //scan size of book
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many books do you want to Add: ");
        int size=scanner.nextInt();
        String[] books=new String[size];


        //read book properties from user or keyboard
        for(int i=0;i<books.length;i++){
            System.out.println("Enter Book Title: ");
            String bookTitle=scanner.next();

            System.out.println("Enter Book Author: ");
            String bookAuthor=scanner.next();

            System.out.println("Enter Book Price: ");
            String bookPrice=scanner.next();

            System.out.println("Enter Book Publisher: ");
            String bookPublisher =scanner.next();

            System.out.println("Enter Book ISBN: ");
            String isbn=scanner.next();

            // bundling all properties
            String bookInfo=bookTitle+","+bookAuthor+","+bookPrice+","+bookPublisher+","+isbn;
            books[i]=bookInfo;

        }

        //Display list of book

        System.out.print("    "+"Title"+"      ");
        System.out.print("    "+"Author"+"    ");
        System.out.print("    "+"Price"+"    ");
        System.out.print("    "+"Publisher"+"    ");
        System.out.print("  "+"ISBN"+"    \n");
        System.out.print("   "+"========"+"  ");
        System.out.print("   "+"========"+"  ");
        System.out.print("   "+"========"+"  ");
        System.out.print("   "+"========"+"  ");
        System.out.print("      "+"========"+"    \n");


        // Get all book list

        for(String book:books){
            String[] singleBook=book.split(",");
            System.out.print("    "+singleBook[0]+"    ");
            System.out.print("    "+singleBook[1]+"    ");
            System.out.print("    "+"£"+singleBook[2]+"    ");
            System.out.print("    "+singleBook[3]+"    ");
            System.out.print("       "+singleBook[4]+"    \n");
        }


        // Calculate books Stock

        double totalCost=0;
        double maximum=0;
        double minimum=0;

        for(String book:books){
            String[] singleBook=book.split(",");
            double bookPrice=Double.parseDouble(singleBook[2]);

            totalCost+=bookPrice;

            if(bookPrice>maximum){
                maximum=bookPrice;
            }

            minimum=bookPrice;
            if(bookPrice<minimum){
                minimum=bookPrice;
            }

        }

        //Display Book Stock

        System.out.println("========Totals Stocks===========");

        System.out.println("Total number of books: "+books.length);
        System.out.println("Total cost of books: "+"£"+totalCost);
        System.out.println("Maximum cost of a book: "+"£"+maximum);
        System.out.println("Minimum cost of book: "+"£"+minimum);
        System.out.println("Average cost of book: "+"£"+totalCost/books.length);


    }
}