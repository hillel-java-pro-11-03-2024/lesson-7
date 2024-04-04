import coffee.order.CoffeeOrderBoard;

public class Main {

  private static final CoffeeOrderBoard ordersManagement = new CoffeeOrderBoard();

  public static void main(String[] args) {
    ordersManagement.add("Vitaliy");
    ordersManagement.add("Ivan");
    ordersManagement.add("Petro");
    ordersManagement.add("Oleg");
    ordersManagement.draw();
    ordersManagement.deliver();
    ordersManagement.draw();
    ordersManagement.deliver(3);
    ordersManagement.draw();
  }

}
