package app.ports;

import app.domain.models.Order;

public interface OrderPort {
    public void saveOrder(Order order);
    
    public Order findOrderById(long orderId);
    
    public void updateOrder(Order order);
    
	public Order findOrderById(String orderId);
}
