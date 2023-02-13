public class Phone {
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
    private static int hours;
    private static int data;
    public static int totalHours = 0;
    public static int totalData = 0;
    public static int timeCounter = 0;
    public static int dataCounter = 0;
    public static int timeAvg = 0;
    public static int dataAvg = 0;

    public Phone(String u, String a, int t, int d){
        user = u;
        app = a;
        timeLimit = t;
        dataLimit = d;
    }

    public int getHours(){
        return hours;
    }

    public void setHours(int hours){
        this.hours = hours;
    }

    public int getData(){
        return data;
    }

    public void setData(int data){
        this.data = data;
    }

    public String randomTime(){
        // min is 1 hr, max is 24 hrs
        String output = "";
        hours = (int)(Math.random() * 24) + 1;
        if(timeLimit <= hours){
            hours = timeLimit;
        }
        output += user + " has used " + app + " for " + hours + " hours out of " + timeLimit + " hours ";
        totalHours += hours;
        timeCounter++;
        return output;
    }

    public String randomData(){
        // min is 1 GB, max is 10 GB
        String output = "";
        data = (int)(Math.random() * 10) + 1;
        if(dataLimit <= data){
            data = dataLimit;
        }
        output += user + " has spent " + data + " GB out of " + dataLimit + " GB on " + app;
        totalData += data;
        dataCounter++;
        return output;
    }

    public String userLimit(){
        String output = "";
        if(timeLimit == hours){
            output += user + " has exceeded the time limit for " + app;
            output += "\n";
        }
        if(dataLimit == data){
            output += user + " has exceeded the data limit for " + app;
            output += "\n";
        }
        return output;
    }

    public static int hoursAvg(){
        timeAvg += totalHours / timeCounter;
        return timeAvg;
    }

    public static int storageAvg(){
        dataAvg += totalData / dataCounter;
        return dataAvg;
    }
}