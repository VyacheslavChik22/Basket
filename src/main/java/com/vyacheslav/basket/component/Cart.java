package com.vyacheslav.basket.component;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;
import static java.util.Collections.addAll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Component
@SessionScope
public class Cart {
    private  final List<Integer> items;
    public Cart(){
        this.items = new ArrayList<>();
    }
    public List<Integer> addItems(List<Integer> idList){
        addAll(idList);
        return idList;
    }

    public List<Integer> getItems() {
        return Collections.unmodifiableList(items);
    }
}
