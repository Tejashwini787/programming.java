class car {
    static int totalcar=0;
    String brand;
    car(String brand){
        this.brand=brand;
        totalcar++;
    }

}
public class staticvarbemo {
    public static void main( String [] args) {
        new car("toyota");
        new car("honda");
        System.out.println(car.totalcar);
    }
}
