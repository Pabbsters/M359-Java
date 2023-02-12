public class Course2 {
    private String teacherName;
    private String subject;
    private String currentGrade;
    private int period;

    public Course2(String teacherName, String subject, String currentGrade, int period){
        this.teacherName= teacherName;
        this.subject= subject;
        this.currentGrade= currentGrade;
        this.period= period;
    }

    public Course2(String subject, int period){
        this.subject= subject;
        this.period= period;
        this.currentGrade="None";
        this.teacherName ="None";
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCurrentGrade() {
        return currentGrade;
    }

    public void setCurrentGrade(String currentGrade) {
        this.currentGrade = currentGrade;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }
    public String toString() {
        if (currentGrade.equals("None") || teacherName.equals("None")) {
            return period + " " + " " + subject + " " + " " + "\t";
        } else {
            return period + " " + currentGrade + "\t" + subject +  "\t\t" + teacherName;
        }
    }
}
