package com.sergeyzhirkov.dataclass;

import com.sergeyzhirkov.dataclass.data.*;
import com.sergeyzhirkov.dataclass.services.StudentService;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Иванов", "Иван", "Иванович", new Date());

        System.out.println(new StudentService(student).validation());

        student.setAverageRating(3.5);
        student.setGrant(0);
        student.setCourse(2);
        student.setDateOfCrediting(new Date());
        student.setFaculty(Faculty.MEH_MAT);
        student.setFormOfPayment(FormOfPayment.BUDGET);
        student.setFormOfTraining(FormOfTraining.DISTANT);
        student.setGroupNumber(15);
        student.setMilitaryDuty(true);
        student.setResultEGE(255);
        student.setSpecialization(Specialization.BACALAVR);

        System.out.println(new StudentService(student).validation());

    }
}
