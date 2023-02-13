public class PhoneTester {
    public static void main(String[] args) {
        Phone user1 = new Phone("RuD", "TikTok", 4, 8);
        Phone user2 = new Phone("Bob", "YouTube", 13, 4);
        Phone user3 = new Phone("Ron", "Snapchat", 6, 6);
        System.out.println(user1.randomTime());
        System.out.println(user1.randomData());
        System.out.println(user1.userLimit());
        System.out.println(user2.randomTime());
        System.out.println(user2.randomData());
        System.out.println(user2.userLimit());
        System.out.println(user3.randomTime());
        System.out.println(user3.randomData());
        System.out.println(user3.userLimit());
        System.out.println(Phone.hoursAvg());
        System.out.println(Phone.storageAvg());
    }
}