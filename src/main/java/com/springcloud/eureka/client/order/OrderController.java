package com.springcloud.eureka.client.order;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @GetMapping("/order/{id}")
    public String getOrder(@PathVariable("id") String orderId) {
        return orderService.getOrder(orderId);
    }
}
