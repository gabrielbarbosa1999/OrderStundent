package dev.gabrielbarbosa.OrderStudent.services;

import dev.gabrielbarbosa.OrderStudent.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {
        double priceOrder = order.getBasic();

        if(priceOrder >= 200) {
            return 0;
        } else if(priceOrder >= 100) {
            return 12.00;
        }
        return 20.00;
    }

}
