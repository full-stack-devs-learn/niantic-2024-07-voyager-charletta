package com.niantic.services;

import com.niantic.models.Assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ReportService
{
    public void createStudentSummaryReport(String Scores)
{
    LocalDate today = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy_MM_dd");
    String fileName = "reports/" + today.format(formatter) + "_" + Scores + ".txt";

    File file = new File(fileName);

    //try (PrintWriter out = new PrintWriter(file))
    {
        //out.println(statistics.getAssignmentName();
        //out.println("-".repeat(30));
       // out.printf("Low GPA:                 %.2f\n", statistics.getLowGpa());
        //out.printf("High GPA:                %.2f\n", statistics.getHighGpa());
        //out.printf("Average GPA:             %.2f\n", statistics.getLAverageGpa());
       // out.println("-".repeat(30));
        //statistics.getAssignmentName().forEach(student -> out.println(student));
    }
    //catch (FileNotFoundException e)
    {

    }
}
}
