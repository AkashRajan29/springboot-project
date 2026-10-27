package com.example.foodorder.service;

import com.example.foodorder.model.FoodOrder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class FoodOrderService {
    private final List<FoodOrder> orders = new ArrayList<>();
    private final AtomicLong sequence = new AtomicLong(1);

    public List<FoodOrder> findAll() { return new ArrayList<>(orders); }

    public FoodOrder findById(Long id) {
        return orders.stream().filter(o -> o.getOrderId().equals(id)).findFirst()
                .orElseThrow(() -> new ResourceNotFoundException("Order not found: " + id));
    }

    public FoodOrder create(FoodOrder order) {
        order.setOrderId(sequence.getAndIncrement());
        orders.add(order);
        return order;
    }

    public FoodOrder update(Long id, FoodOrder input) {
        FoodOrder existing = findById(id);
        existing.setCustomerName(input.getCustomerName());
        existing.setFoodItem(input.getFoodItem());
        existing.setQuantity(input.getQuantity());
        existing.setPrice(input.getPrice());
        return existing;
    }

    public FoodOrder patch(Long id, FoodOrder input) {
        FoodOrder existing = findById(id);
        if (input.getCustomerName() != null) existing.setCustomerName(input.getCustomerName());
        if (input.getFoodItem() != null) existing.setFoodItem(input.getFoodItem());
        if (input.getQuantity() != 0) existing.setQuantity(input.getQuantity());
        if (input.getPrice() != null) existing.setPrice(input.getPrice());
        return existing;
    }

    public void delete(Long id) {
        FoodOrder existing = findById(id);
        orders.remove(existing);
    }
}
