package domain;

/**
 * Class Manager extends Employee
 */
public class Manager extends Employee {
    /**
     *
     * @param employees employees
     * @param name name of Manager
     * @param jobTitle title of a job of Manager
     * @param level level of Manager
     * @param dept department of Manager
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Method that return Employees
     * @return String
     */
    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }

    /**
     *
     * @param employees employees
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }


    public Manager() {
        super();
        employees = new Employee[10];
    }


    private Employee[] employees;

    /**
     * Method that return name of Manager
     * @return String
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     *
     * @param employees employees
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }

    /**
     * Method that return employees
     * @return string
     */
    public Employee[] getEmployeesList() {
        return employees;
    }

    
}
