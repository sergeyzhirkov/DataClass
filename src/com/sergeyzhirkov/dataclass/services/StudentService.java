package com.sergeyzhirkov.dataclass.services;

import com.sergeyzhirkov.dataclass.data.Student;

public class StudentService {
    private final Student student;

    public StudentService(Student student) {
        this.student = student;
    }

    public boolean validation() {
        return validateFirstName() &&
                validateLastName() &&
                validateMiddleName() &&
                validateDateOfBirth() &&
                validateAverageRating() &&
                validateCourse() &&
                validateDateOfCrediting() &&
                validateFaculty() &&
                validateFormOfPayment() &&
                validateFormOfTraining() &&
                validateGrant() &&
                validateGroupNumber() &&
                validateResultEGE() &&
                validateSpecialization() ;
    }

    public boolean validateFirstName() {
        return student.getFirstName() != null;
    }

    public boolean validateLastName() {
        return student.getLastName() != null;
    }

    public boolean validateMiddleName() {
        return student.getMiddleName() != null;
    }

    public boolean validateDateOfBirth() {
        return student.getDateOfBirth() != null;
    }

    public boolean validateFaculty() {
        return (student.getFaculty() != null);
    }

    public boolean validateDateOfCrediting() {
        return student.getDateOfCrediting() != null;
    }

    public boolean validateCourse() {
        return student.getCourse() > 0 && student.getCourse() <= 4;
    }

    public boolean validateFormOfTraining() {
        return (student.getFormOfTraining() != null);
    }

    public boolean validateFormOfPayment() {
        return (student.getFormOfPayment() != null);
    }

    public boolean validateGroupNumber() {
        return student.getGroupNumber() >= 1 && student.getGroupNumber() <= 30;
    }

    public boolean validateResultEGE() {
        return student.getResultEGE() >= 120 && student.getResultEGE() <= 300;
    }


    public boolean validateSpecialization() {
        return (student.getSpecialization() != null);
    }

    public boolean validateAverageRating() {
        return student.getAverageRating() < 5.0001 && student.getAverageRating() > 1.9999;
    }

    public boolean validateGrant() {
        return student.getGrant() >= 0;
    }
}
