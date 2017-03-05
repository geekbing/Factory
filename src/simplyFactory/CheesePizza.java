package simplyFactory;

/**
 * Author: bing
 * Date: 2017-03-05 09:46
 * Email: dhuzbb@163.com
 */
public class CheesePizza extends Pizza {

    public CheesePizza() {
        name = "Cheese Pizza";
        dough = "Regular Crust";
        sauce = "Marinara Pizza Sauce";
        toppings.add("Fresh Mozzarella");
        toppings.add("Parmesan");
    }
}
