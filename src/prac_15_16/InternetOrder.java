package prac_15_16;

import java.util.ArrayList;
import java.util.List;


public class InternetOrder implements Order{
    List<Item> list = new ArrayList<>();

    public boolean addPosition(Item item){
        return list.add(item);
    }
    public int count(){
        return list.size();
    }

    @Override
    public boolean remove(String food) {
        return list.remove(food);
    }

    @Override
    public void deleteAll(String name) {
        list.clear();
    }
    @Override
    public String[] getDishes(){
        String[] str = new String[list.size()];
        for (int i = 0; i < list.size(); i++){
            str[i] = list.get(i).getName() + " " + list.get(i).getDescription() + " " + list.get(i).getCost();
        }
        return str;
    }

    @Override
    public int costAll() {
        int sum = 0;
        for(int i = 0; i < list.size(); i++)
            sum += list.get(i).getCost();
        return sum;
    }

    @Override
    public int orderName(String p) {
        int k = 0;
        while (list.contains(p)){
            k++;
        }
        return k;
    }


}
