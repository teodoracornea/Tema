package tema5;

import java.util.Objects;
import java.util.UUID;

public class Student implements Human {
    private String firstName;
    private String lastName;
    private Integer dateOfBirth;
    private Integer dateOfEnrollment;
    private String facultyName = "utcn";
    private String specializationName = "utcn";
    private StudentType type;
    private UUID uniqueID;


    @Override
    public String toString() {
        return "\n" +
                "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", dateOfEnrollment=" + dateOfEnrollment +
                ", facultyName='" + facultyName + '\'' +
                ", specializationName='" + specializationName + '\'' +
                ", type=" + type +
                ", uniqueID=" + uniqueID +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(dateOfBirth, student.dateOfBirth) && Objects.equals(dateOfEnrollment, student.dateOfEnrollment) && Objects.equals(facultyName, student.facultyName) && Objects.equals(specializationName, student.specializationName) && type == student.type && Objects.equals(uniqueID, student.uniqueID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, dateOfBirth, dateOfEnrollment, facultyName, specializationName, type, uniqueID);
    }

    public Student(String firstName, String lastName, Integer dateOfBirth, Integer dateOfEnrollment, String facultyName, String specializationName, StudentType type, UUID uniqueID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.dateOfEnrollment = dateOfEnrollment;
        this.facultyName = facultyName;
        this.specializationName = specializationName;
        this.type = type;
        this.uniqueID = uniqueID;
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

    @Override
    public Integer getDateOfHiring() {
        return null;
    }

    @Override
    public void setDateOfHiring(Integer DateOfHiring) {

    }

    public Integer getDateOfEnrollment() {
        return dateOfEnrollment;
    }

    public void setDateOfEnrollment(Integer dateOfEnrollment) {
        this.dateOfEnrollment = dateOfEnrollment;
    }

    @Override
    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    @Override
    public String getSpecializationName() {
        return specializationName;
    }

    @Override
    public void setSpecializationName(String specializationName) {
        this.specializationName = specializationName;
    }

    @Override
    public StudentType getType() {
        return type;
    }

    @Override
    public void setType(ScholarType type) {

    }

    public void setType(StudentType type) {
        this.type = type;
    }


    @Override
    public UUID getUniqueID() {
        return uniqueID;
    }

    @Override
    public void setUniqueID(UUID uniqueID) {
        this.uniqueID = uniqueID;
    }
}

