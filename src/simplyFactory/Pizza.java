package simplyFactory;

import java.util.ArrayList;

/**
 * Author: bing
 * Date: 2017-03-05 09:41
 * Email: dhuzbb@163.com
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
    }

    public void bake() {
        System.out.println("Baking " + name);
    }

    public void cut() {
        System.out.println("Cutting " + name);
    }

    public void box() {
        System.out.println("Boxing " + name);
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("---- " + name + " ----\n");
        sb.append(dough + "\n");
        sb.append(sauce + "\n");
        for (int i = 0; i < toppings.size(); i++) {
            sb.append((String) toppings.get(i) + "\n");
        }
        return sb.toString();
    }
}
