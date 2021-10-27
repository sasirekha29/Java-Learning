package school.management.system;
// this is responsible for keep tracking of students (id, name, grade, fees paid)
public class student {
    private int id;
    private String name;
    private int grade;
    private int Class;
    private int feesPaid;
    private int feesTotal;

    // creating a new student obj by initializing

    /**
     * fees for every student is 20000
     * fees paid initially is zeo
     * @param id-- unique id of the student
     * @param name -- name of the student
     * @param grade -- marks(grade) of the student
     */
    public student(int id, String name, int grade, int Class){
        feesPaid = 0;
        feesTotal = 20000;
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.Class = Class;

    }
    // not altering the name and id of the student

    /**
     * used to update the student grade
     * @param grade --  updated grade of the student
     */
    public void setGrade(int grade){
        this.grade = grade;

    }

    /**
     * add the fees to feesPaid (initial = 0 if student paid 5000 so now 0+5000 = 5000)
     * the school is going to receive the funds.
     * @param fees -- fees that student pays
     */
    public void payFees(int fees){
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }
    // getter for student
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getGrade(){
        return grade;
    }
    public int getclass(){
        return Class;
    }
    public  int getFeesPaid(){
        return feesPaid;
    }
    public int getFeesTotal(){
        return feesTotal;
    }

    /**
     *
     * @return -- the remaining fees
     */
    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }
}




























