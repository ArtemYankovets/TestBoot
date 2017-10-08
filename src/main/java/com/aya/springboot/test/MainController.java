package com.aya.springboot.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.aya.springboot.test.domain.Item;
import com.aya.springboot.test.repository.ItemRepository;

@Component
public class MainController {

    @Autowired
    private ItemRepository itemRepository;

    public void showData(){
        for (Item item: itemRepository.findAll()) {
            System.out.println("item = " + item.getName());
        }
    }
}
