package domain;

/**
 *
 */
public class Employee {
    /**
     * Method that return Informaton about Employee
     * @return String
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }


    private String name;
    private String jobTitle;
    private int ID;
    private int level;
    private String dept;

   // private static int employeesCount = 0;

    /**
     *
     * @param name name of Employee
     * @param jobTitle title of a job of Employee
     * @param level level of Employee
     * @param dept department of Employee
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }

    public Employee() {
        ID = (int)(Math.random()*1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
    }

    /**
     *
     * @param job title of a job of Employee
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }

    /**
     *  Method that return title of a job of Employee
     * @return String
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Method that return name of Employee
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param level level of Employee
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }

    /**
     * Method that return level of Employee
     * @return int value
     */
    public int getLevel() {
        return level;
    }

    /**
     * Method that return department of Employee
     * @return String
     */
    public String getDept() {
        return dept;
    }

    /**
     *
     * @param dept department of Employee
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     *
     * @param name name of Employee
     */
    public void setName(String name) {
//        boolean correctName = true;
//        for (int i = 0; i < name.length(); i++) {
//            char s = name.charAt(i);
//            if (Character.isDigit(s)) {
//                correctName = false;
//            }
//        }
//        if (correctName) {
//            this.name = name;
//        } else {
//            this.name = "John Doe";
//        }
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}
