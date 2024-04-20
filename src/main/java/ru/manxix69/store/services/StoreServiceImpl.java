package ru.manxix69.store.services;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import ru.manxix69.store.items.Store;

import java.util.List;

@Service
public class StoreServiceImpl implements StoreService{
    private Store store;
    public StoreServiceImpl(Store store) {
        this.store = store;
    }

    @Override
    public List<Integer> add(@RequestParam(name = "ID") List<Integer> ids) {
        return store.addItems(ids);
    }

    @Override
    public List<Integer>  get() {
        return store.getItems();
    }

}
