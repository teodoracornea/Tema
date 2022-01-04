package Tema5;

import java.util.UUID;

public interface Human {

    UUID getUniqueID();

    void setUniqueID(UUID uniqueID);

    String getSpecializationName();

    void setSpecializationName(String specializationName);

    String getLastName();

    void setLastName(String lastName);

    String getFirstName();

    void setFirstName(String firstName);

    Integer getDateOfBirth();

    void setDateOfBirth(Integer dateOfBirth);

    Integer getDateOfHiring();

    void setDateOfHiring(Integer DateOfHiring);

    String getFacultyName();

    void setFacultyName(String facultyName);

    ScholarType getType();


}
