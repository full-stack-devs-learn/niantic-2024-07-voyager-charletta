package com.niantic.ui;

import com.niantic.models.Student;

import java.util.List;
import java.util.Scanner;

public class UserInput
{
    private final Scanner scanner = new Scanner(System.in);

    public int homeScreenSelection()
    {
        System.out.println();
        System.out.println("What do you want to do?");
        System.out.println("  1) List Classes");
        System.out.println("  2) Display Class Details");
        System.out.println("  3) Display All Classes");
        System.out.println("  4) Create Class Summary Report");
        System.out.println("  0) Exit");
        System.out.print("Enter your choice: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public void displayClasses(List<String> files)
    {
        System.out.println();
        int count = 0;
        for(var file: files)
        {
            System.out.println(++count + ") " + file);
        }
    }

    public String getStringInput(String message)
    {
        System.out.print(message);
        return scanner.nextLine();
    }

    public int getIntInput(String message)
    {
        return Integer.parseInt(getStringInput(message));
    }

    public void displayStudents(String title, List<Student> students)
    {
        System.out.println();
        System.out.println(title);
        System.out.println("-".repeat(30));
        for (Student student : students)
        {
            System.out.println(student);
        }
    }
}
