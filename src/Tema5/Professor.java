package Tema5;

import java.util.Objects;
import java.util.UUID;

public class Professor implements Human {
    String firstName;
    String lastName;
    Integer dateOfBirth;
    Integer dateOfHiring;
    String specializationName;
    ProfessorType type;
    UUID uniqueID;

    public Professor(String firstName, String lastName, Integer dateOfBirth, Integer dateOfHiring, String specializationName, ProfessorType type, UUID uniqueID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.dateOfHiring = dateOfHiring;
        this.specializationName = specializationName;
        this.type = type;
        this.uniqueID = uniqueID;
    }

    @Override
    public String toString() {
        return "\n" +
                "Professor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", dateOfHiring=" + dateOfHiring +
                ", specializationName='" + specializationName + '\'' +
                ", type=" + type +
                ", uniqueID=" + uniqueID +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return Objects.equals(firstName, professor.firstName) && Objects.equals(lastName, professor.lastName) && Objects.equals(dateOfBirth, professor.dateOfBirth) && Objects.equals(dateOfHiring, professor.dateOfHiring) && Objects.equals(specializationName, professor.specializationName) && type == professor.type && Objects.equals(uniqueID, professor.uniqueID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, dateOfBirth, dateOfHiring, specializationName, type, uniqueID);
    }



    public Integer getDateOfHiring() {
        return dateOfHiring;
    }

    public String getSpecializationName() {
        return specializationName;
    }

    public void setDateOfHiring(Integer dateOfHiring) {
        this.dateOfHiring = dateOfHiring;
    }

    @Override
    public String getFacultyName() {
        return null;
    }

    @Override
    public void setFacultyName(String facultyName) {

    }

    @Override
    public ProfessorType getType() {
        return type;
    }

    @Override
    public void setType(ScholarType type) {

    }

    public void setType(ProfessorType type) {
        this.type = type;
    }

    public void setSpecializationName(String specializationName) {
        this.specializationName = specializationName;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public Integer getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Integer dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public UUID getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(UUID uniqueID) {
        this.uniqueID = uniqueID;
    }



}
