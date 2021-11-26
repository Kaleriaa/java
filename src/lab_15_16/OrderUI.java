package lab_15_16;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrderUI extends JFrame {

    JMenuBar menuBar = new JMenuBar();
    public OrderUI(){
        super("Food order");
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        menuBar.add(createFileMenu());
        setJMenuBar(menuBar);
        setSize(500, 500);
        setVisible(true);
    }
    private JMenu createFileMenu() {
        JMenu file = new JMenu("Menu");
        JMenuItem dish = new JMenuItem("Dish");
        JMenuItem drink = new JMenuItem("Drink");
        JMenuItem exit = new JMenuItem(new OrderUI.ExitAction());
        JMenuItem dish1 = new JMenuItem("Pizza: 4 cheeses, peperoni: 590");
        JMenuItem dish2 = new JMenuItem("Salad: Greek, Caesar: 330");
        JMenuItem dish3 = new JMenuItem("Lasagna: 660");
        JMenuItem alco = new JMenuItem("Alcoholic");
        JMenuItem non_al = new JMenuItem("Non-alcoholic");
        drink.add(alco); drink.add(non_al);
        dish.add(dish1); dish.add(dish2); dish.add(dish3);
        file.add(dish);
        file.addSeparator();
        file.add(drink);
        file.addSeparator();
        file.add(exit);

        return file;
    }

        class ExitAction extends AbstractAction
        {
            private static final long serialVersionUID = 1L;
            ExitAction() {
                putValue(NAME, "Exit");
            }
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        }


    public static void main(String[] args) throws OrderAlreadyException {
        TableOrder restaurantOrder = new TableOrder();
        restaurantOrder.add(new Dish("Lasagna", "Tasty Italian dish", 600));
        restaurantOrder.add(new Drink("Juice", "Orange", 190, DrinkTypeEnum.JUICE, 0));

        //System.out.println(Arrays.toString(restaurantOrder.getMenu()));
        //System.out.println("\n" + "Restaurant orders: ");
        OrderManager orderManager = new OrderManager();
        orderManager.add(restaurantOrder, 1);

        //System.out.println(orderManager.orders());
        OrderManager orderManager1 = new OrderManager();
        InternetOrder internetOrder = new InternetOrder();
        internetOrder.add(new Dish("Lasagna", "Tasty Italian dish", 600));
        internetOrder.add(new Drink("Juice", "Orange", 190, DrinkTypeEnum.JUICE, 0));
        Address address = new Address("Moscow", 111, "pr.Mira", 15, 24);
        Customer customer = new Customer("Ivanov", "Ivan", 20, address);

        String cust = customer.getFirstName()+ " " + customer.getSecondName()+ " " + customer.getAge()
                + "-> " + customer.getAddress();
        orderManager1.add(internetOrder, cust);
        System.out.println(orderManager1.getInternetOrder());
    }
}
