package com.niantic.services;

import com.niantic.models.Assignment;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradesFileService implements GradesService
{

    @Override
    public String[] getFileNames()
    {
        File folder = new File("files");
        return folder.list();
    }

    @Override
    public List<Assignment> getAssignments(String fileName)
    {
        File file = new File("files/" + fileName);
        List<Assignment> assignments = new ArrayList<>();

        try(Scanner reader = new Scanner(file))
        {
            // this skips the header row
            reader.nextLine();

            while(reader.hasNextLine())
            {
                String line = reader.nextLine();
                var columns = line.split(",");

                int assignNumber = Integer.parseInt(columns[0]);
                String firstName = columns[1];
                String lastName = columns[2];
                String assignName = columns[3];
                int score = Integer.parseInt(columns[4]);

               Assignment assignment= new Assignment(assignNumber,firstName, lastName,assignName, score);
                assignments.add(assignment);
            }
        }
        catch (Exception e)
        {
            // swallow exception
            System.out.println(e.getMessage());
        }
        return assignments;
    }

    // write the code to load the assignments arraylist
        // look at getStudents() method in the demo app


    @Override
    public List<Assignment> getAllAssignments(String[] fileNames)
    {
        List<Assignment> allAssignments = new ArrayList<>();
        File directory = new File("files");
        String[] files = directory.list();

        for (String fileName : fileNames) {
            allAssignments.addAll(getAssignments(fileName));
        }

        return allAssignments;
    }
}
