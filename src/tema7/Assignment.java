package tema7;

//homework point 1
public class Assignment implements Comparable<Assignment> {
    private Integer id;
    private Integer courseNumber;
    private String title;
    private String description;
    private DifficultyLevel level;

    public Assignment(Integer id, Integer courseNumber, String title, String description, DifficultyLevel level) {
        this.id = id;
        this.courseNumber = courseNumber;
        this.title = title;
        this.description = description;
        this.level = level;
    }

    @Override
    public int compareTo(Assignment other) {
        int comparisonResultForId = Integer.compare(this.id, other.getId());
        if(comparisonResultForId != 0){
            //the two elements are not equal
            return comparisonResultForId;
        }
        //the ids are equal so we compare them by title
        int comparisonResultByTitle =  this.title.compareTo(other.getTitle());
        if (comparisonResultByTitle != 0){
            return comparisonResultByTitle;
        }
        return this.level.compareTo(other.getLevel());
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(Integer courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DifficultyLevel getLevel() {
        return level;
    }

    public void setLevel(DifficultyLevel level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Tema7.Assignment{" +
                "id=" + id +
                ", courseNumber=" + courseNumber +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", level=" + level +
                '}';
    }
}
