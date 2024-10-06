package ru.manxix69.store.items;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.*;

@Component
@SessionScope
public class Store {
    private final List<Integer> items = new ArrayList<>();

    public boolean addItems(List<Integer> list) {
        return items.addAll(list);
    }

    public List<Integer> getItems() {
        return Collections.unmodifiableList(items);
    }
}
