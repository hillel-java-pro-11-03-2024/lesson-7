package coffee.order;

public class Order {

  private final int orderId;
  private final String customerName;

  public Order(int orderId, String customerName) {
    this.orderId = orderId;
    this.customerName = customerName;
  }

  public int getOrderId() {
    return orderId;
  }

  public String getCustomerName() {
    return customerName;
  }
}
