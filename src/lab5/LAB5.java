package lab5;

public class LAB5 {
    
    public static void main(String[] args) {
        rectangle r = new rectangle();
        r.setLength(10);
        r.setWidth(10);
        System.out.println(r.getarea());
        System.out.println(r.getperimeter());
        r.setLength(-1);
    }
    
}
