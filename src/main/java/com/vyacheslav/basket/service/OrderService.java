package com.vyacheslav.basket.service;

import java.util.List;

public interface OrderService {
    List<Integer> addItems(List<Integer> idList);

    List<Integer> getItems();
}
