package class29;



import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo8 {
    public static void main(String[] args) {
        //how can we remove the elements from a map based on the values and keyes
        HashMap<String, Double> fruit= new HashMap<>();
        fruit.put("Apple", 2000.0);// auto upcasting does not work with wrappers (2000 will not be automatically converted to 2000.0)
        fruit.put("Orange", 20.0);
        fruit.put("Kiwi", 10.2);
        fruit.put("Bannana", 50.5);
        fruit.put("Apple", 10.5);
        Iterator<Map.Entry<String ,Double>> iterator= fruit.entrySet().iterator();
        while (iterator.hasNext()){
            Entry<String ,Double> en =iterator.next();
            if(en.getKey().contains("e")&& en.getValue()>15){
                iterator.remove();
            }
        }
        System.out.println(fruit);
    }
}
