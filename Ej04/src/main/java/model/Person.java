package model;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class Person {
    private String fullName;
    private LocalDate dateOfBirth;
    private String hobbies;

    public Person(String fullName, LocalDate dateOfBirth, String hobbies) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.hobbies = hobbies;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public int getAge() {
        if (dateOfBirth == null) {
            throw new IllegalArgumentException("dateOfBirth cannot be null");
        }

        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }


    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", hobbies='" + hobbies + '\'' +
                '}';
    }
}
