package app.adapters.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.adapters.order.entity.OrderEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository <OrderEntity, Long> {

}
