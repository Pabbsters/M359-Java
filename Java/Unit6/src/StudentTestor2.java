import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentTestor2 {
    public static void main(String[] args) throws FileNotFoundException {

        File myFile = new File("studentScheduleData.txt");
        Scanner scan = new Scanner(myFile);
        Course2[] classes= new Course2[8];
        Student2[] students= new Student2[scan.nextInt()];
        scan.nextLine();
        for(int x= 0; x< students.length; x++) {
            if (scan.hasNextLine()){
            String stuName = scan.nextLine();
            for (int i = 0; i < classes.length; i++) {
                String teachName = scan.nextLine();
                String sub = scan.nextLine();
                String cGrade = scan.nextLine();
                int period = scan.nextInt();

                if (scan.hasNextLine()) {
                    scan.nextLine();
                }
                if (teachName.equals("None") || cGrade.equals("None")) {
                    classes[i] = new Course2(sub, period);
                }
                classes[i] = new Course2(teachName, sub, cGrade, period);
            }
            students[x] = new Student2(stuName,classes);
            System.out.println(students[x].toString());
        }

      /*  String teachName = scan.nextLine();
        String sub= scan.nextLine();
        String cGrade= scan.nextLine();
        int period= scan.nextInt();
        scan.nextLine();
        String teachName2 = scan.nextLine();
        String sub2= scan.nextLine();
        String cGrade2= scan.nextLine();
        int period2= scan.nextInt();
        scan.nextLine();
        String teachName3 = scan.nextLine();
        String sub3= scan.nextLine();
        String cGrade3= scan.nextLine();
        int period3= scan.nextInt();
        scan.nextLine();
        String teachName4 = scan.nextLine();
        String sub4= scan.nextLine();
        String cGrade4= scan.nextLine();
        int period4= scan.nextInt();
        scan.nextLine();
        String teachName5 = scan.nextLine();
        String sub5= scan.nextLine();
        String cGrade5= scan.nextLine();
        int period5= scan.nextInt();
        scan.nextLine();
        String teachName6 = scan.nextLine();
        String sub6= scan.nextLine();
        String cGrade6= scan.nextLine();
        int period6= scan.nextInt();
        scan.nextLine();
        String teachName7 = scan.nextLine();
        String sub7= scan.nextLine();
        String cGrade7= scan.nextLine();
        int period7= scan.nextInt();
        scan.nextLine();
        String teachName8 = scan.nextLine();
        String sub8= scan.nextLine();
        String cGrade8= scan.nextLine();
        int period8= scan.nextInt();
        scan.nextLine();
        //   scan.nextLine(); // remove the end of line (EDL) character / return

        Course2 span= new Course2(teachName, sub, cGrade, period);
        Course2 compSci = new Course2(teachName2, sub2, cGrade2, period2);
        Course2 eng= new Course2(teachName3, sub3, cGrade3, period3);
        Course2 math= new Course2(teachName4, sub4, cGrade4, period4);
        Course2 well= new Course2(teachName5, sub5, cGrade5, period5);
        Course2 chem= new Course2(teachName6, sub6, cGrade6, period6);
        Course2 apush= new Course2(teachName7, sub7, cGrade7, period7);
        Course2 band= new Course2(teachName8, sub8, cGrade8, period8);


        Course2 spanish= new Course2("Houchins", "Spanish", "A+", 1);
        Course2 cs= new Course2("DeSteph","Computer Science", "A+", 2);
        Course2 orch= new Course2("Caballero","Orchestra", "A", 3);
        Course2 lunch = new Course2("Lunch", 4);
        Course2 lang= new Course2("Munao", "AP Lang", "B+", 5);
        Course2 gov= new Course2("Han", "Gov", "A-", 6);
        Course2 chemistry= new Course2("Carlson", "Chemistry", "A", 7);
        Course2 sh= new Course2("Study Hall", 6);

        Course2 [] classes= {span, compSci, eng, math, well, chem, apush, band}; */




    }
    }
}
