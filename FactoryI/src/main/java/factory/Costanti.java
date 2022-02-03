package factory;

import java.util.ArrayList;
import java.util.List;

public class Costanti {
    public static final String PIZZA = "pizza";
    public static final String PASTA = "pasta";
    public static final String HAMBURGER = "hamburger";

    private Costanti(){}

    public static List<String> getList(){
        List<String> lst = new ArrayList<>();
        lst.add(Costanti.PIZZA);
        lst.add(Costanti.PASTA);
        lst.add(Costanti.HAMBURGER);
        return lst;
    }
}
