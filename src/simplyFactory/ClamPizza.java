package simplyFactory;

/**
 * Author: bing
 * Date: 2017-03-05 09:47
 * Email: dhuzbb@163.com
 */
public class ClamPizza extends Pizza {
    public ClamPizza() {
        name = "Clam Pizza";
        dough = "Thin crust";
        sauce = "White garlic sauce";
        toppings.add("Clams");
        toppings.add("Grated parmesan cheese");
    }
}
