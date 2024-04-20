package ru.manxix69.store.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.manxix69.store.services.StoreService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class StoreController {
    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }
    @GetMapping("/greeting")
    public String greeting() {
        return "Hi!";
    }

    @GetMapping("/add")
    public List<Integer> add(@RequestParam(name = "ID") List<Integer> ids) {
        return storeService.add(ids);
    }

    @GetMapping("/get")
    public List<Integer> get() {
        return storeService.get();
    }

}
