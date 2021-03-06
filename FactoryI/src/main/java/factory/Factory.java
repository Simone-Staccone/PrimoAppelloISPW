package factory;

import java.util.List;

public class Factory {
    public Food makeFood(String type){
        int num;
        List<String> typeList = Costanti.getList();

        for(num = 0;num<typeList.size();num++)
        {
            if(typeList.get(num).compareTo(type) == 0)
                break;
        }

        switch (num) {
            case 0:
                return makePizza();
            case 1:
                return makePasta();
            case 2:
                return makeHamburger();
            default:
                return makeNonOrdinabile();
        }
    }

    private Food makeNonOrdinabile() {
        return new NonOrdinabile();
    }

    private Food makePizza() {
        return new Pizza();
    }

    public Food makePasta(){
        return new Pasta();
    }

    public Food makeHamburger(){
        return new Hamburger();
    }
}
