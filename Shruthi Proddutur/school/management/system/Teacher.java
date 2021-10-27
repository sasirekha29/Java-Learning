package school.management.system;

/**
 * This class is responsible for keeping the track of teachers id, name salary
 */
public class Teacher {
    private int id;
    private String name;
    private int salary;
    private String subject;
    private int salaryEarned;

    /**
     * creates a new teacher object
     * @param id -- id of the teacher
     * @param name -- name of the teacher
     * @param salary -- teacher's salary
     * @param subject -- subject that teacher teaches
     */
    public Teacher(int id, String name, int salary, String subject){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.subject = subject;
        this.salaryEarned = 0;
    }
    // getter (teacher name)
    public String getName(){
        return name;
    }
    // getter (teacher id)
    public int getId(){
        return id;
    }
    // getter (teacher salary)
    public int getSalary(){
        return salary;
    }
    //getter (teacher subject)
    public String getSubject(){
        return subject;
    }

    /**
     * setting the salary
     * @param salary -- salary of the teacher
     */
    public void setSalary(int salary){
        this.salary = salary;
    }

    /**
     * adds to salary
     * removed from total money earned by the school
     * @param salary
     */
    public void receiveSalary(int salary){
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }
}






















