import java.util.HashMap;

public class HashMapList {
    public static void main(String[] args) {
        country_population();
    }
    static void country_population(){
        HashMap<String,Integer> population = new HashMap<String,Integer>();

        population.put("China",1439323776);
        population.put("United States",331002651);
        population.put("Indonesia",	273523615);

        for (String country:
                population.keySet()) {
            function.write(country+": "+population.get(country));
        }

    }

    static void str(){
        HashMap<String, String> list = new HashMap<String, String>();

        list.put("first_name","John");
        list.put("last_name","Doe");
        list.put("phone_number","+9999999999");

        function.write(list);
        function.write(list.get("last_name"));

        list.remove("phone_number");
        function.write(list);

        function.write(list.size());

        function.write(list.keySet());
        function.write(list.values());

        for (String val :
                list.keySet()) {
            function.write(val+">>");
        }

        for (String key :
                list.values()) {
            function.write("<<"+key);
        }

        list.clear();
        function.write(list);
    }
}