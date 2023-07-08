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

    }
}