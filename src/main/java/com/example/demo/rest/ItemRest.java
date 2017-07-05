package com.example.demo.rest;

import com.example.demo.entity.Item;
import com.example.demo.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by jaquesyang on 2017/7/5.
 */
@RestController
@RequestMapping("/rest/item")
public class ItemRest {

    @Autowired
    ItemRepository repository;

    @RequestMapping("")
    public List<Item> list() {
        return repository.findAll();
    }

    @RequestMapping("/{id}")
    public Item detail(@PathVariable Long id) {
        return repository.findOne(id);
    }
}
