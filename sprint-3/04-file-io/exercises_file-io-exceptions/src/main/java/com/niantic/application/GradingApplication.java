package com.niantic.application;


import com.niantic.models.Assignment;


import com.niantic.services.GradesFileService;
import com.niantic.services.GradesService;
import com.niantic.services.ReportService;
import com.niantic.ui.UserInput;


import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class GradingApplication implements Runnable
{
    private final GradesService gradesService= new GradesFileService();
    private final UserInput ui = new UserInput();


    @Override
    public void run()
    {
        while (true)
        {
            int choice = ui.homeScreenSelection();

                switch (choice)
                {
                    case 1:
                        displayAllFiles();
                        break;
                    case 2:
                        displayFileScores();
                        break;
                    case 3:
                        displayStudentAverages();
                        break;
                    case 4:
                        displayAllStudentStatistics();
                        break;
                    case 5:
                        displayAssignmentStatistics();
                        break;
                    case 6:
                        createStudentSummaryReport();
                        break;
                    case 0:
                        UserInput.displayMessage("Goodbye");
                        System.exit(0);
                    default:
                        UserInput.displayMessage("Please make a valid selection");
                }
            }


    }

}
private void displayAllFiles()
{       // todo: 1 - get and display all student file names


        String[] files= gradesFileService.getFileNames();
        System.out.println();
        System.out.println("Display File Names");
        System.out.println("-".repeat(20));

        UserInput.waitForUser();
        for (var file:files){System.out.println(file);
        }



    }

private void displayFileScores() {
        // todo: 2 - allow the user to select a file name
        // load all student assignment scores from the file - display all files

        String[] files = gradesService.getFileNames();

        int choice = UserInput.homeScreenSelection();;
        String fileSelected= files[choice - 2];
        System.out.println("You selected: " + fileSelected);

        List<Assignment> assignments = gradesService.getAssignments(fileSelected);
        if (!assignments.isEmpty()) {
            System.out.println();
            System.out.println("Show Scores For: "
                    + assignments.getFirst().getFirstName()
                    + " "
                    + assignments.getFirst().getLastName());
            System.out.println("=".repeat(40));
        }
        assignments.forEach(System.out::println);

        UserInput.waitForUser();

    }

private void displayStudentAverages()
    {
        // todo: 3 - allow the user to select a file name
        // load all student assignment scores from the file - display student statistics (low score, high score, average score)

        String[] files = gradesService.getFileNames();

        int choice = UserInput.homeScreenSelection();
        String fileSelected = files[choice - 1];
        System.out.println("You selected: " + fileSelected);

        List<Assignment> assignments = gradesService.getAssignments(fileSelected);
        if (!assignments.isEmpty()) {
            System.out.println();
            System.out.println("Show Statistics For: "
                    + assignments.get(0).getFirstName()
                    + " "
                    + assignments.get(0).getLastName());
            System.out.println("=".repeat(40));


            var lowScore = assignments.stream()
                    .mapToDouble(Assignment::getScore)
                    .min()
                    .orElse(0.0);

            var highScore = assignments.stream()
                    .mapToDouble(Assignment::getScore)
                    .max()
                    .orElse(0.0);

            var averageScore = assignments.stream()
                    .mapToDouble(Assignment::getScore)
                    .average()
                    .orElse(0.0);

            // Print the statistics
            System.out.printf("Low Score:   %.2f\n", lowScore);
            System.out.printf("High Score:  %.2f\n", highScore);
            System.out.printf("Average Score:  %.2f\n", averageScore);

            UserInput.waitForUser();

        }
        }

private void displayAllStudentStatistics()
    {
        // todo: 4 - Optional / Challenge - load all scores from all student and all assignments
        // display the statistics for all scores (low score, high score, average score, number of students, number of assignments)

        }

    private void displayAssignmentStatistics() {
        // todo: 5 - Optional / Challenge - load all scores from all student and all assignments
        // display the statistics for each assignment (assignment name, low score, high score, average score)
        // this one could take some time
    }

   public void createStudentSummaryReport()
   {
       String[] files= gradesService.getFileNames();
       System.out.println();
       System.out.println("Display File Names");
       System.out.println("-".repeat(20));

       var assignmentNames = gradesService.getFileNames();
       var scores = parseStudentName(files.[choice]);

       for (var file:files){System.out.println(file);
       }

    }

    private String parseStudentName() {
        String fileName = new String();
        return fileName.replace(".csv", "")
                .replace("_", " ")
                .substring(10);


    }
}

public void main() {
}