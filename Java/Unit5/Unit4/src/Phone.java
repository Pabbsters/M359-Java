public class Phone {
    // within the phone object, there will be three constructors
    // #1. name of user
    // #2. apps that are in the phone
    // #3. time limit for app
    // #4. data limit for app
    // #5. amount of time spent using a specific app (time will be randomized)
    // #6. amount of data spent using a specific app (data will be randomized)

    private String user;
    private String app;
    private int timeLimit;
    private int dataLimit;
    private int hours;
    private int data;

    public Phone(String u, String a, int t, int d){
        user = u;
        app = a;
        timeLimit = t;
        dataLimit = d;
    }

    public int getHours(){
        return hours;
    }

    public int getData(){
        return data;
    }

    public String randomTime(){
        // min is 1, max is 24
        String output = "";
        hours = (int)(Math.random() * 24) + 1;
        output += user + " has used " + app + " for " + hours + " hours out of " + timeLimit + " hours ";
        return output;
    }

    public String randomData(){
        // min is 1GB, max is 10GB
        String output = "";
        data = (int)(Math.random() * 10) + 1;
        output += user + " has spent " + data + " GB out of " + dataLimit + " GB on " + app;
        return output;
    }

    public String userLimit(){
        String output = "";
        if(timeLimit < hours){
            output += user + " has exceeded the time limit for " + app;
            output += "\n";
        }
        else {
            output += user + " has used " + app + " for " + hours + " hours out of " + timeLimit + " hours ";
        }

        if(dataLimit < data){
            output += user + " has reached the data limit for " + app;
            output += "\n";
        }
        return output;
    }
}