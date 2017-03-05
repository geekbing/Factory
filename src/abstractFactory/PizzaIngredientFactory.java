package abstractFactory;

import abstractFactory.ingredient.*;

/**
 * Author: bing
 * Date: 2017-03-06 00:13
 * Email: dhuzbb@163.com
 */
public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();

}
