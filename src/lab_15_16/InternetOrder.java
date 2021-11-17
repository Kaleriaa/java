package lab_15_16;

import java.util.ArrayList;
import java.util.List;

public class InternetOrder implements Order{

    List<MenuItem> internet = new ArrayList<>();
    @Override
    public boolean add(MenuItem item) {
        return internet.add(item);
    }
    public String[] getMenu(){
        String[] str = new String[internet.size()];
        for (int i = 0; i < internet.size(); i++){
            str[i] = internet.get(i).getName() + " " + internet.get(i).getDescription() + " " + internet.get(i).getCost();
        }
        return str;
    }

    @Override
    public String[] itemName() {
        String[] str = new String[internet.size()];
        for(int i = 0; i < internet.size(); i++)
            str[i] = internet.get(i).getName();
        return str;
    }

    @Override
    public int itemQuantity(String itemName) {
        int k = 0;
        while (internet.contains(itemName)){
            k++;
        }
        return k;
    }

    @Override
    public int itemQuantity() {
        return internet.size();
    }

    @Override
    public MenuItem[] getItems() {
        return new MenuItem[0];
    }

    @Override
    public boolean remove(String itemName) {
        return internet.remove(itemName);
    }

    @Override
    public boolean remove(MenuItem item) {
        return internet.remove(item);
    }

    @Override
    public boolean removeAll(String itemName) {
        return false;
    }

    @Override
    public double costTotal() {
        double sum = 0;
        for(int i = 0; i < internet.size(); i++)
            sum += internet.get(i).getCost();
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
