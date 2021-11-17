package lab_15_16;

import java.util.ArrayList;
import java.util.List;

public class TableOrder implements Order{
    int size;
    List<MenuItem> menuItem = new ArrayList<>();

    @Override
    public boolean add(MenuItem item) {
        return menuItem.add(item);
    }
    public String[] getMenu(){
        String[] str = new String[menuItem.size()];
        for (int i = 0; i < menuItem.size(); i++){
            str[i] = menuItem.get(i).getName() + " " + menuItem.get(i).getDescription() + " " + menuItem.get(i).getCost();
        }
        return str;
    }

    @Override
    public String[] itemName() {
        String[] str = new String[menuItem.size()];
        for(int i = 0; i < menuItem.size(); i++)
            str[i] = menuItem.get(i).getName();
        return str;
    }

    @Override
    public int itemQuantity(String itemName) {
        int k = 0;
        while (menuItem.contains(itemName)){
            k++;
        }
        return k;
    }

    @Override
    public int itemQuantity() {
        return menuItem.size();
    }

    @Override
    public MenuItem[] getItems() {
        return new MenuItem[0];
    }

    @Override
    public boolean remove(String itemName) {
        return menuItem.remove(itemName);
    }

    @Override
    public boolean remove(MenuItem item) {
        return menuItem.remove(item);
    }

    @Override
    public boolean removeAll(String itemName) {
        return menuItem.remove(itemName);
    }

    @Override
    public double costTotal() {
        double sum = 0;
        for(int i = 0; i < menuItem.size(); i++)
            sum += menuItem.get(i).getCost();
        return sum;
    }

    @Override
    public Customer getCustomer() {
        return null;
    }

    @Override
    public void setCustomer(Customer newCustomer) {
    }
}
