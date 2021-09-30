package com.example.f21comp1011gcw4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String s1 = new String("JAVA");
        String s2 = new String("JAVA");
        String s3 = new String("Java");

        System.out.printf("s1.equals(s2) : %b%n", s1.equals(s2));
        System.out.printf("s1.equals(s3) : %b%n", s1.equals(s3));
        System.out.printf("s1.equalsIgnoreCase(s3) : %b%n", s1.equalsIgnoreCase(s3));
        System.out.printf("s1 == s2 : %b%n", s1==s2);

        String s4 = "Java";
        String s5 = "Java";
        System.out.printf("s4 == s5 : %b%n", s4==s5);

        System.out.printf("s1.compareTo(s2) : %d%n", s1.compareTo(s2));
        System.out.printf("s1.compareTo(s3) : %d%n", s1.compareTo(s3));
        System.out.printf("s3.compareTo(s1) : %d%n", s3.compareTo(s1));

        List<String> names = Arrays.asList("Johhny","Fred","Wilma","Betty");
        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);

        System.out.printf("\"Johnny\".compareTo(\"Fred\") : %d%n","Johnny".compareTo("Fred"));
        System.out.printf("\"Johnny\".compareTo(\"Ted\") : %d%n","Johnny".compareTo("Ted"));

        System.out.printf("s1.concact(s2) = %s%n", s1.concat(s2));
        System.out.printf("s1 + s2 = %s%n", s1 + s2);

        System.out.printf("s1.contains(\"VA\") : %b%n", s1.contains("VA"));
        System.out.printf("s1.contains(\"va\") : %b%n", s1.contains("va"));

        System.out.println(String.format("%.1f ", 98.7365635252452));

        for (int i=1; i<=10;i++)
        {
            for (int j=1 ; j<=10; j++)
                System.out.printf("%4d",i*j);
            System.out.println();
        }

        String longWord = "supercalifragilisticexpialidocious";
        System.out.printf("s1.subString(0,6) : \"%s\"%n",longWord.substring(0,5));

        String csv = "Franklin,Wright,Professor";
        System.out.printf("First name : %s%n", csv.substring(0,csv.indexOf(',')));

        System.out.printf("longword.replaceAll(\"a\",\"ZZZZ\") : %s%n",
                                    longWord.replaceAll("a","ZZZZ"));

    }
}
