public class Test {
     double d1=10.0;
     Double d2=20.0;
     Double d3=new Double(30.0);
     double d4= new Double(40.0);

     public static void main(String[] args) {
         Test t= new Test();
        System.out.println(t.d1 + t.d2 + t.d3.doubleValue() +t.d4);

    }


}
