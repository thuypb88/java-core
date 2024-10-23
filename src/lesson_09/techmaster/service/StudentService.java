package lesson_09.techmaster.service;

import lesson_09.techmaster.entities.Student;
import lesson_09.techmaster.entities.Techmaster;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StudentService {
    public Student inputInfo(Scanner scanner){
        System.out.println("Enter student's name: ");
        String name = scanner.nextLine();
        System.out.println("Enter student's grade: ");
        String classify = scanner.nextLine();
        Student student = new Student(name, classify);
        return student;
    }

    public void updateClassify(Scanner scanner, Techmaster techmaster){
        System.out.println("Enter student ID: ");
        int id = Integer.parseInt(scanner.nextLine());
       // boolean checkExisted = false;
        Student student = findStudentById(id, techmaster);
        if(student != null){
            System.out.println("Enter the classify of the student: ");
            String classify = scanner.nextLine();
            student.setClassify(classify);
            System.out.println("Classify updated successfully for student ID = " + id);
        } else {
            System.out.println("No students available with ID = " + id);
        }
      /*  for(Student st: techmaster.getClassroom().getStudents()){
            if(st.getId() == id){
                checkExisted = true;
                System.out.println("Enter the classify of the student: ");
                String classify = scanner.nextLine();
                st.setClassify(classify);
                break;

            }
        }
        if(!checkExisted)
            System.out.println("No students available with id = " + id);

       */
    }
    public void deleteStudent(Scanner scanner, Techmaster techmaster){
        System.out.println("Enter student ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        // boolean checkExisted = false;
        Student student = findStudentById(id, techmaster);
        if(student != null){
            techmaster.getClassroom().getStudents().remove(student);
            System.out.println("Student with ID = " + id + " has been deleted.");
        } else {
            System.out.println("No students available with ID = " + id);
        }

    }
    public Student findStudentById(int id, Techmaster techmaster){
        for(Student st: techmaster.getClassroom().getStudents()){
            if(st.getId() == id){
                return st;
            }
        }
        return null;
    }

}
