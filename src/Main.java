import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        List<String> st = new ArrayList<>();
        st.add("Java");
        st.add("Python");
        st.add("Perl");
        st.add("C++");
        st.add("Java");
        st.add("C++");
        st.add("C#");
        System.out.println(st);
        Set<String> set = new HashSet<>(st);
        System.out.println(set);
        System.out.println();

        Map<String, Integer> contacts = new HashMap<>();
        contacts.put("Bob Thomas", 1);
        contacts.put("Ted Lasso", 2);
        contacts.put("Kim Coates", 3);
        contacts.put("Charlie Hunnam", 4);
        contacts.put("Ron Perlman", 5);
        contacts.put("Katey Sagal", 6);
        contacts.put("Mark Boone Junior", 7);
        contacts.put("Tommy Flanagan", 8);
        contacts.put("Maggie Siff", 9);
        contacts.put("Dayton Callie", 10);
        for (Map.Entry<String, Integer> mapping : contacts.entrySet()) {
            System.out.println(mapping.getKey() + " " + mapping.getValue());
        }
        System.out.println();

        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1,2,3,5,4,3,2,1,2,3,5));
//            Нашел еще такой способ вводить сразу с значениями, но на всякий и наш прописал как на уроке делали)
//            ArrayList<Integer> array = new ArrayList<>();
//            array.add(1);
//            array.add(2);
//            array.add(3);
//            array.add(5);
//            array.add(4);
//            array.add(3);
//            array.add(2);
//            array.add(1);
//            array.add(2);
//            array.add(3);
//            array.add(5);
            System.out.println(counterCatch(array, 2));
    }
    public static int counterCatch(ArrayList<Integer> arrayList, int value){
        int count = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == value) {
                count++;
            }
        }
        return count;
    }
}