package factory;

import java.util.List;

public class Factory {
    public Food makeFood(String type){
        int num = -1;
        List<String> typeList = Costanti.getList();

        for(num = 0;num<typeList.size();num++)
        {
            if(typeList.get(num).compareTo(type) == 0)
                break;
        }

        switch (num) {
            case 1:
                return makePizza();
            case 2:
                return makePasta();
            case 3:
                return makeHamburger();
            default:
                throw new IllegalArgumentException("Invalid type : " + type,null);
        }
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
