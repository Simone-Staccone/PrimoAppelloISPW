package factory;

public class Client {
    public static void main(String[] args){
        Client c = new Client();
        Factory factory = new Factory();
        Food food = factory.makeFood("pizza");

        if(c.makeOrder(food))
            c.eat(food);

        food = factory.makeFood("pasta");

        if(c.makeOrder(food))
            c.eat(food);

        food = factory.makeFood("hamburger");

        if(c.makeOrder(food))
            c.eat(food);
    }

    private void eat(Food food) {
        food.eat();
    }

    private boolean makeOrder(Food food) {
        boolean ret;
        ret = food.order();
        return ret;
    }
}
