package lab_15_16;

import java.util.HashMap;

public class OrderManager {
    HashMap<Integer, Object> orderHashMap = new HashMap<Integer, Object>();
    HashMap<String, Object> orderHashMap1 = new HashMap<String, Object>();

    public void add(Order o, int table) throws OrderAlreadyException {
        String str = String.join(",", o.getMenu());
        if (orderHashMap.containsKey(table))
            throw new OrderAlreadyException(table);
        else orderHashMap.put(table, str);
    }
    public Object getOrder(int table){
        return orderHashMap.get(table);
    }

    public void add(Dish dish, int table) throws OrderAlreadyException{
        if (orderHashMap.containsKey(table))
            throw new OrderAlreadyException(table);
        else orderHashMap.put(table, dish);
    }
    public void removeOrder(int table){
        orderHashMap.remove(table);
    }
    public HashMap orders(){
        return orderHashMap;
    }



    public void add(Order o, String customer) {
        String str = String.join(",", o.getMenu());

        orderHashMap1.put(str, customer);
    }
    public Object getOrder(String address){
        return orderHashMap1.get(address);
    }
    public void removeOrderInternet(String address){
        orderHashMap1.remove(address);
    }
    public HashMap getInternetOrder(){
        return orderHashMap1;
    }
}
