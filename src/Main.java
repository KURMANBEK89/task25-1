import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Car,InfoCar>hashMap = new HashMap<>();
        hashMap.put(new Car(22,6677),new InfoCar(2020,"A4",15000,"black"));
        hashMap.put(new Car(11,1098),new InfoCar(2021,"Patriot",13000,"blue"));
        hashMap.put(new Car(33,1145),new InfoCar(2019,"Exceed",11500,"white"));
        for(Map.Entry entry: hashMap.entrySet()){
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }
    }
}