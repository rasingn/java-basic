public class Main {
    
    public static void main(String[] xx) {
        Toyota avalon =new Toyota();
        avalon.setModel("avalon");
        avalon.setV(6);
        avalon.shift("x");
        avalon.setAutoPark(false);

        Nissan altima =new Nissan();
        altima.setModel("altima");
        altima.setV(4);
        altima.shift("n");
        

        Cars car=new Cars();
        car.setModel("car");
        car.setV(4);
        car.shift("n");
        
    }
}
