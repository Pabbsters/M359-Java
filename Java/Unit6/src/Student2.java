public class Student2 {
    private String name;
    private Course2[] myClasses;

    public Student2(String name, Course2[] myClasses){
        this.name= name;
        this.myClasses= myClasses;

    }

    public Student2(String name){
        this.name= name;
        this.myClasses = new Course2[10];
    }
    public String toString() {
        String output= "";
        output+= "Student Name: " + this.name + "\n";
        for(int i=0; i < this.myClasses.length; i++){
            if(myClasses[i] != null) {
                output += "Per: " + myClasses[i].toString() + "\n";
            }
        }
        return output;
    }
}
