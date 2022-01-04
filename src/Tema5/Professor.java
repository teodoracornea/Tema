package Tema5;

import java.util.UUID;

public class Professor implements Human {
    String firstName;
    String lastName;
    Integer dateOfBirth;
    Integer dateOfHiring;
    String specializationName;
    ProfessorType type;
    UUID uniqueID;

    public Professor(UUID uniqueID) {
        this.uniqueID = uniqueID;
    }

    public UUID getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(UUID uniqueID) {
        this.uniqueID = uniqueID;
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
    public ScholarType getType() {
        return type;
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


}
