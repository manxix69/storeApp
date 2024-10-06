package ru.manxix69.store.services;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StoreService {
    boolean add(List<Integer> ids);

    List<Integer> get();
}
