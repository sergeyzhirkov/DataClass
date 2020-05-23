package com.sergeyzhirkov.dataclass;

import com.sergeyzhirkov.dataclass.data.Student;
import com.sergeyzhirkov.dataclass.service.StudentService;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Иванов", "Иван", "Иванович", new Date());

        System.out.println(new StudentService(student).validation());

        student.setAverageRating(3.5);
        student.setGrant(0);
        student.setCourse(2);
        student.setDateOfCrediting(new Date());
        student.setFaculty("Мех-мат");
        student.setFormOfPayment("бюджет");
        student.setFormOfTraining("очная");
        student.setGroupNumber(15);
        student.setMilitaryDuty(true);
        student.setResultEGE(255);
        student.setSpecialization("бакалавр");

        System.out.println(new StudentService(student).validation());

    }
}
