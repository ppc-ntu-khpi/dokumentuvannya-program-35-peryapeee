package domain;

/**
 * Class Artist extends Employee
 */
public class Artist extends Employee {
    /**
     *
     * @param skiils skills of Artist
     * @param name name of Artist
     * @param jobTitle title of a job of Artist
     * @param level level of Artist
     * @param dept department of Artist
     */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }

    /**
     * @param skiils skills of Artist
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }

    /**
     *
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }

    /**
     *  Method that return skills of Artist
     * @return String
     */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    private String[] skiils;

    /**
     * Method that return skills
     * @return String
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     *
     * @param skills skills of Artist
     */
    public void setSkills(String[] skills) {
        this.skiils=skills;
    }

    /**
     * Method that return list of skills
     * @return String
     */
    public String[] getSkillsLSist() {
        return skiils;
    }
}
