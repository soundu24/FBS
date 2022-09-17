package payment.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import payment.model.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order, String> {

	Order findByRazorpayOrderId(String razorpayOrderId);
}
