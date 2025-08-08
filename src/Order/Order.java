package Order;

import enums.OrderStatus;

public class Order {

    int orderId;
    OrderStatus status;

    public Order(int id , OrderStatus Order)
    {
        this.orderId = id;
        this.status = Order;
        System.out.println("ID: " +id+ " Status: " +Order);
    }
}
