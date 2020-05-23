package com.sergeyzhirkov.dataclass.data;

import java.util.Date;

public class Student {
    private String firstName;           // имя
    private String lastName;            // фамилия
    private String middleName;      // отчество
    private Date dateOfBirth;           // дата рождения
    private Faculty faculty;             // факультет
    private Date dateOfCrediting;       // дата зачисления
    private int course;                 // курс
    private FormOfTraining formOfTraining;      // форма обучения
    private FormOfPayment formOfPayment;       // форма оплаты
    private int groupNumber;            // номер группы
    private int resultEGE;              // результаты ЕГЭ при поступлении
    private Specialization specialization;      // специализация
    private double averageRating;       // средняя оценка
    private boolean militaryDuty;       // военная обязаность
    private int grant;                  // стипендия

    public Student() {
    }

    public Student(String lastName, String firstName, String middleName, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Date getDateOfCrediting() {
        return dateOfCrediting;
    }

    public void setDateOfCrediting(Date dateOfCrediting) {
        this.dateOfCrediting = dateOfCrediting;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public FormOfTraining getFormOfTraining() {
        return formOfTraining;
    }

    public void setFormOfTraining(FormOfTraining formOfTraining) {
        this.formOfTraining = formOfTraining;
    }

    public FormOfPayment getFormOfPayment() {
        return formOfPayment;
    }

    public void setFormOfPayment(FormOfPayment formOfPayment) {
        this.formOfPayment = formOfPayment;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int getResultEGE() {
        return resultEGE;
    }

    public void setResultEGE(int resultEGE) {
        this.resultEGE = resultEGE;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    public boolean isMilitaryDuty() {
        return militaryDuty;
    }

    public void setMilitaryDuty(boolean militaryDuty) {
        this.militaryDuty = militaryDuty;
    }

    public int getGrant() {
        return grant;
    }

    public void setGrant(int grant) {
        this.grant = grant;
    }
}
