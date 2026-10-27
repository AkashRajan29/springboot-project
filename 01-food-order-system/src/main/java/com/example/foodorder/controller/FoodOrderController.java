package com.example.foodorder.controller;

import com.example.foodorder.model.FoodOrder;
import com.example.foodorder.service.FoodOrderService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/orders")
public class FoodOrderController {
    private final FoodOrderService service;

    public FoodOrderController(FoodOrderService service) { this.service = service; }

    @GetMapping
    public List<FoodOrder> getAll() { return service.findAll(); }

    @GetMapping("/{id}")
    public FoodOrder getById(@PathVariable Long id) { return service.findById(id); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public FoodOrder create(@Valid @RequestBody FoodOrder order) { return service.create(order); }

    @PutMapping("/{id}")
    public FoodOrder update(@PathVariable Long id, @Valid @RequestBody FoodOrder order) {
        return service.update(id, order);
    }

    @PatchMapping("/{id}")
    public FoodOrder patch(@PathVariable Long id, @RequestBody FoodOrder order) {
        return service.patch(id, order);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) { service.delete(id); }

    @ExceptionHandler(com.example.foodorder.service.ResourceNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String, String> notFound(RuntimeException ex) {
        return Map.of("error", ex.getMessage());
    }
}
