package Tema5;

public enum ProfessorType implements ScholarType{
    PROFESSOR("prof"),
    ASSOCIATE("as"),
    ASSISTENT("asist");

   private String experience;
    ProfessorType(String experienta){
        this.experience = experienta;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
}
