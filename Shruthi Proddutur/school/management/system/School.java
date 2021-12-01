package school.management.system;

import java.util.List;

/**
 * here we are implementing the arraylist for teachers and students
 */
public class School {
    private List<Teacher> teacher; // multiple teacher
    private List<student> student; // multiple student
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * new school object is created
     * @param teacher -- list of teachers is created
     * @param student -- list of students is created
     */
    public School(List<Teacher> teacher, List<school.management.system.student> student) {
        this.teacher = teacher;
        this.student = student;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }



    /**
     *
     * @return -- the list of teachers from the school
     */
    public List<Teacher> getTeacher() {
        return teacher;
    }

    /**
     * adds the teacher to the school
     * @param teachers -- new teacher
     */
    public void addTeacher(Teacher teachers){
        teacher.add(teachers);
    }
    public void setTeacher(List<Teacher> teacher) {
        this.teacher = teacher;
    }

    /**
     *
     * @return -- the list of student in the school
     */
    public List<school.management.system.student> getStudent() {
        return student;
    }

    /**
     *  adds the new student to the school
     * @param Student -- new student to be added
     */
    public void addStudent(student Student) {
        student.add(Student);
    }

    /**
     *
     * @return -- the total money earned by the school
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * adds the total money earned by the school
     * @param MoneyEarned -- money that is supposed to be added
     */
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /**
     *
     * @return -- the total money spent by the school
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * going to update the money spent by the school
     */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }
}























