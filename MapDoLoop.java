import java.util.*;
public class MapDoLoop {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("1","Josh");
        map.put("2","Zero");
        map.put("3","G-Dragon");
        map.put("4","Deasung");
        map.put("5","TOP");
        map.put("6","Teayang");
        map.put("7","Seungri");

        System.out.println(String.format("第%s种：",1));
        for(Map.Entry<String,String> e : map.entrySet()){
            System.out.println(String.format("The Key:%s,\tTheValue:%s",e.getKey(),e.getValue()));
        }

        System.out.println(String.format("第%s种：",2));
        for(String key : map.keySet()){
            System.out.println(String.format("The Key:%s,\tTheValue:%s",key,map.get(key)));
        }

        System.out.println(String.format("第%s种：",3));
        Iterator<Map.Entry<String, String>> itera = map.entrySet().iterator();
        while(itera.hasNext()){
            Map.Entry<String,String> entry = itera.next();
            System.out.println(String.format("The Key:%s,\tTheValue:%s",entry.getKey(),entry.getValue()));
        }

        System.out.println(String.format("第%s种：",4));
        map.forEach((key,value) -> {System.out.println(String.format("The Key:%s,\tTheValue:%s",key,value));});

    }
}