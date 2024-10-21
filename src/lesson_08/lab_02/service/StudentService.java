package lesson_08.lab_02.service;

import lesson_08.lab_02.entities.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    ArrayList<Student> studentList = new ArrayList<>();
    StudentService studentService;
    public Student inputInfo(Scanner scanner){
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student's scoreMath: ");
        Double scoreMath = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter student's scorePhysic: ");
        Double scorePhysic = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter student's scoreChemistry: ");
        Double scoreChemistry = Double.parseDouble(scanner.nextLine());
        return new Student(name, scoreMath, scorePhysic, scoreChemistry);
    }
    public void addStudent(Student student) {
        studentList.add(student);
    }
    public double getAvgScore(Student student) {
        return (student.getScoreMath() + student.getScorePhysic() + student.getScoreChemistry()) / 3.0;
    }
    public String getGrade(Student student) {
        double avgScore = getAvgScore(student);
        if (avgScore >= 8) {
            return "A";
        } else if (avgScore >= 6.5) {
            return "B";
        } else {
            return "C";
        }
    }

    public void displayAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students in the list.");
        } else {
            System.out.println("===================");
            System.out.println("List of students:");
            for (Student student : studentList) {
                System.out.println("Student ID: " + student.getId() +
                        ", Name: " + student.getName() +
                        ", Avg Score: " + String.format("%.2f", getAvgScore(student))  +
                        ", Grade: " + getGrade(student));
            }
        }
    }

    public void calculateGradePercentage() {
        if (studentList.isEmpty()) {
            System.out.println("No students available for grade percentage calculation.");
            return;
        }

        int countA = 0, countB = 0, countC = 0;

        // Count the number of students in each grade category
        for (Student student : studentList) {
            String grade = getGrade(student);
            switch (grade) {
                case "A":
                    countA++;
                    break;
                case "B":
                    countB++;
                    break;
                case "C":
                    countC++;
                    break;
            }
        }

        // Calculate percentage
        int totalStudents = studentList.size();
        double percentA = (countA * 100.0) / totalStudents;
        double percentB = (countB * 100.0) / totalStudents;
        double percentC = (countC * 100.0) / totalStudents;

        // Display the percentages
        System.out.println("===================");
        System.out.println("Grade Distribution:");
        System.out.printf("Grade A: %.2f%%\n", percentA);
        System.out.printf("Grade B: %.2f%%\n", percentB);
        System.out.printf("Grade C: %.2f%%\n", percentC);
    }
}
