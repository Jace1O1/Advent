import java.util.Scanner;

public class Day2Part1 {
   public static void main(String[] args) {
      Scanner stdin = new Scanner(System.in);
      int score = 0;
      while (stdin.hasNextLine()) {
         String str = stdin.next();
         String str2 = stdin.next();

         score += sc(str, str2);
      }
      System.out.println(score);
   }

   public static int sc(String str, String str2) {
      if (str.equals("A") && str2.equals("X")) {
         return 4;
      }
      if (str.equals("A") && str2.equals("Y")) {
         return 8;
      }
      if (str.equals("A") && str2.equals("Z")) {
         return 3;
      }
      if (str.equals("B") && str2.equals("X")) {
         return 1;
      }
      if (str.equals("B") && str2.equals("Y")) {
         return 5;
      }
      if (str.equals("B") && str2.equals("Z")) {
         return 9;
      }
      if (str.equals("C") && str2.equals("X")) {
         return 7;
      }
      if (str.equals("C") && str2.equals("Y")) {
         return 2;
      }
         return 6;
   }
}

import java.util.Scanner;

public class Day2Part2 {
   public static void main(String[] args) {
      Scanner stdin = new Scanner(System.in);
      int score = 0;
      while (stdin.hasNextLine()) {
         String str = stdin.next();
         String str2 = stdin.next();

         score += sc(str, str2);
      }
      System.out.println(score);
   }

   public static int sc(String str, String str2) {
      if (str.equals("A") && str2.equals("X")) {
         return 3;
      }
      if (str.equals("A") && str2.equals("Y")) {
         return 4;
      }
      if (str.equals("A") && str2.equals("Z")) {
         return 8;
      }
      if (str.equals("B") && str2.equals("X")) {
         return 1;
      }
      if (str.equals("B") && str2.equals("Y")) {
         return 5;
      }
      if (str.equals("B") && str2.equals("Z")) {
         return 9;
      }
      if (str.equals("C") && str2.equals("X")) {
         return 2;
      }
      if (str.equals("C") && str2.equals("Y")) {
         return 6;
      }
         return 7;
   }
}
