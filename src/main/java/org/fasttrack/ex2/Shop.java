package org.fasttrack.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Shop<T extends ShopItem>{
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> findByCategory(Category cat) {
        List<T> result = new ArrayList<>();
        for(T item : items) {
            if(item.category() == cat) {
                result.add(item);
            }
        }
        return result;
    }

    public List<T> findWithLowerPrice(int maxPrice) {
        List<T> result = new ArrayList<>();
        for(T item : items) {
            if(item.price() <= maxPrice){
                result.add(item);
            }
        }
        return result;
    }

    public Optional<T> findByName(String name) {
        return items.stream().filter(item -> item.name().equals(name)).findFirst();
    }

    public Optional<T> removeItem(String name) {
        Optional<T> itemToRemove = findByName(name);
        itemToRemove.ifPresent(items::remove);
        return itemToRemove;
    }
}
