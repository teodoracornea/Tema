package Tema5;

import java.util.UUID;

public interface Human {

    String getFirstName();

    void setFirstName(String firstName);

    String getLastName();

    void setLastName(String lastName);

    String getSpecializationName();

    void setSpecializationName(String specializationName);

    Integer getDateOfBirth();

    void setDateOfBirth(Integer dateOfBirth);

    Integer getDateOfHiring();

    void setDateOfHiring(Integer DateOfHiring);

    String getFacultyName();

    void setFacultyName(String facultyName);

    ScholarType getType();

    void setType(ScholarType type);

    UUID getUniqueID();

    void setUniqueID(UUID uniqueID);


}
