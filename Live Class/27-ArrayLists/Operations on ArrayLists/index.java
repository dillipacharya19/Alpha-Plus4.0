import java.util.ArrayList;

public class index {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        // Get Operation - 0(1 )
        int element = list.get(2);
        System.out.println(element);

        // Delete Operation - 0(n)
        list.remove(2);
        System.out.println(list);

        // Set Operation - 0(1)
        list.set(2, 10);
        System.out.println(list);

        // Contains Operation - 0(n)
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

    }
}