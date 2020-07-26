import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Bicycle bi = new Bicycle();
    bi.setName("Bianchi");
    bi.setColor("Green");
    System.out.println("【Bicycle Info】");
    bi.printData();
    System.out.println("-----------------");
    System.out.print("Enter distance to move: ");
    int dist1= scanner.nextInt();
    bi.run(dist1);
    
    System.out.println("=================");
    Car car = new Car();
    car.setName("Ferrari");
    car.setColor("Red");
    System.out.println("【Car Info】");
    car.printData();
    System.out.println("-----------------");
    System.out.print("Enter distance to move: ");
    int dist2= scanner.nextInt();
    car.run(dist2);
    System.out.println("-----------------");
    System.out.print("Enter amount to refuel: ");
    int refuel= scanner.nextInt();
    car.charge(refuel);
    
  }
}