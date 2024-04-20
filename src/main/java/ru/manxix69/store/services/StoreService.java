package ru.manxix69.store.services;

import ru.manxix69.store.items.Store;

import java.util.List;


public interface StoreService {
    List<Integer> add(List<Integer> ids);

    List<Integer>  get();
}
