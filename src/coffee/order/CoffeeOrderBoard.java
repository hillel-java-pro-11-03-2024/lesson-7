package coffee.order;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class CoffeeOrderBoard {

  private int lastIndex = 0;
  private final Queue<Order> orders = new LinkedList<>();

  public void add(String customerName) {
    lastIndex++;
    orders.add(new Order(lastIndex, customerName));
  }

  public void deliver() {
    orders.poll();
  }

  public void deliver(int index) {
    Iterator<Order> iterator = orders.iterator();
    while (iterator.hasNext()) {
      Order order = iterator.next();
      if (order.getOrderId() == index) {
        iterator.remove();
        return;
      }
    }
  }

  public void draw() {
    System.out.println("Coffee Order Board");
    System.out.println("==================================");
    for (Order order : orders) {
      System.out.println(order.getOrderId() + ": " + order.getCustomerName());
    }
    System.out.println("==================================");
  }

}
