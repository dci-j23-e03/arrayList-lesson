import java.util.*;

public class Main {
    public static void main(String[] args) {

        // no-args constructor
        List<String> names = new ArrayList<String>(); // first way
        ArrayList<String> names2 = new ArrayList<>(); // second way, preffered

        var cities = names; // use var when you don't know the exact type

        if (cities instanceof ArrayList) {
            System.out.println("cities are ArrayList");
        }
        if (cities instanceof LinkedList) {
            System.out.println("cities are LinkedList");
        }

        LinkedList<String> names3 = new LinkedList<>();
        names = names3;
//        names2 = names3; different types, compiler error

        // constructor with capacity
        List<String> strings = new ArrayList<>(30);

        // constructor with another Collection (Set, List...)
        List<String> strings1 = new ArrayList<>(names3);
        Set<String> ourSet = new HashSet<>();
        List<String> strings2 = new ArrayList<>(ourSet);

        // of method
        String[] cities2 = {"Berlin", "London", "New York"};
        List<String> strings3 = List.of(cities2);
        List<String> strings4 = List.of("Madrid", "Porto", "Rome");
//        strings4.add("London"); not possible to add values in this case
        System.out.println(strings4);

        // operations
        List<String> message = new ArrayList<>();
        message.add("Hello");
        message.add("students!");
        System.out.println(message);
        message.add(1, "DCI");
        System.out.println(message);
        String replaced = message.set(1, "all");
        System.out.println("We have replaced " + replaced + " with all");
        System.out.println(message);
        System.out.println(message.size());
        message.remove("all");
        System.out.println(message);
        System.out.println(message.size());
        message.remove(1);
        System.out.println(message);
        System.out.println(message.get(0));

        if (message.contains("DCI")) {
            System.out.println("Message is ok!");
        } else {
            message.add("DCI");
        }
        System.out.println(message);

        System.out.println(message.indexOf("DCI") == message.lastIndexOf("DCI") ?
                "indexOf and lastIndexOf returned the same index" :
                "indexOf and lastIndexOf didn't return the same index");

        for (String messagePart : message) {
            System.out.println(messagePart);
        }

        // advanced iteration, don't have to remember
        message.forEach(System.out::println);

        Iterator<String> it = message.iterator();
        while (it.hasNext()) {
            it.next();
        }

//        var numbers = new ArrayList<int>(); not valid, compile time error
        var numbers1 = new ArrayList<Integer>();

        // expert round: equals() vs deepEquals()
        int[][] a = { {1, 2, 3}, {5, 5, 5}, {9, 9, 9} };
        int[][] b = { {1, 2, 3}, {5, 5, 5}, {9, 9, 9} };
        System.out.println(Arrays.equals(a, b));
        System.out.println(Arrays.deepEquals(a, b)); // this should be used with multidimensional arrays

        // LinkedList
        LinkedList<String> stringList = new LinkedList<>();
        stringList.add("apples");
        stringList.add("bananas");
        System.out.println(stringList);
        stringList.addFirst("tomatoes");
        System.out.println(stringList);
        stringList.removeFirst();
        System.out.println(stringList);
        stringList.removeFirst();
        System.out.println(stringList);
    }
}