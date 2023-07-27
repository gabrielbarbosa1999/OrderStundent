package dev.gabrielbarbosa.OrderStudent.services;

import dev.gabrielbarbosa.OrderStudent.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order) {
        double valueDiscount = order.getBasic() * (order.getDiscount() / 100);
        double totalPriceDiscount = order.getBasic() - valueDiscount;
        double shoipping = shippingService.shipment(order);
        return totalPriceDiscount + shoipping;
    }

}
