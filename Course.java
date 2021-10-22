package NewDreamTeam;

public class Course {

    private String courseName;
    private int courseLvl;

    public Course(String courseName, int courseLvl) {
        this.courseName = courseName;
        this.courseLvl = courseLvl;
    }

    public int getCourseLvl() {
        return courseLvl;
    }

    public boolean doIt(Team team){
        if (getCourseLvl() > team.getFitLvl()) {
            return false;
        } else
            return true;
    }
}
