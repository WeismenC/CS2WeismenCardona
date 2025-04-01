package app.adapters.order;

import app.adapters.order.entity.OrderEntity;
import app.domain.models.Order;
import app.ports.OrderPort;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@SpringBootApplication
@ComponentScan(basePackages = "app")
@Service
public class AdpOrder implements OrderPort {
    public static Order toModel(OrderEntity entity) {
        Order model = new Order(
                entity.getOrderId(),
                entity.getPetId(),
                entity.getOwnerId(),
                entity.getVeterinarianId(),
                entity.getMedication(),
                entity.getDosage(),
                entity.getOrderDate()
        );

        if (entity.isCancelled()) {
            model.cancelOrder();
        }

        return model;
    }

    public static OrderEntity toEntity(Order model) {
        OrderEntity entity = new OrderEntity();
        entity.setOrderId(model.getOrderId());
        entity.setPetId(model.getPetId());
        entity.setOwnerId(model.getOwnerId());
        entity.setVeterinarianId(model.getVeterinarianId());
        entity.setMedication(model.getMedication());
        entity.setDosage(model.getDosage());
        entity.setOrderDate(model.getOrderDate());
        entity.setCancelled(model.isCancelled());

        return entity;
    }

    @Override
    public void saveOrder(Order order) {

    }

    @Override
    public Order findOrderById(long orderId) {
        return null;
    }

    @Override
    public void updateOrder(Order order) {

    }

    @Override
    public Order findOrderById(String orderId) {
        return null;
    }
}
