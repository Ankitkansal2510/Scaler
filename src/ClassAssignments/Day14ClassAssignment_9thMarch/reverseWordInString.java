package ClassAssignments.Day14ClassAssignment_9thMarch;

import java.util.Scanner;

/***
 * Problem Description
 * Write a program to reverse the words present in a string. Everything else should be preserved.
 * Check example input/output. Note: There are no punctuation and special characters in the string.
 * The string will only contain alphanumeric characters and spaces.
 *
 *
 * Example Input
 * Everyone loves data science
 *
 *
 * Example Output
 * enoyrevE sevol atad ecneics
 *
 * */
public class reverseWordInString {
    public static void main(String[] args) {
       // String word = "Programming is fun";
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String word=s.nextLine();
        BasicCode(word);
        System.out.println();
        AdvanceCode(word);
    }

   private static void  BasicCode(String word){
       String s="" ;
       for (int i = 0; i < word.length(); i++) {
           if (word.charAt(i) == ' ' || i==word.length()-1) {
               if(i==word.length()-1){
                   s=s+word.charAt(i);
               }
               reverseWord(s);
               System.out.print(" ");
               s="";
           }
           s=s+word.charAt(i);


       }
   }
    private static void reverseWord(String s){
        s=s.trim();
       for(int i=s.length()-1;i>=0;i--){
           System.out.print(s.charAt(i));
       }

    }

    private static void AdvanceCode(String words){
        String s[]=words.split("\\s");
        for(String word:s){
            StringBuilder stringBuilder=new StringBuilder(word);
            System.out.print(stringBuilder.reverse()+" ");
        }

    }
}

