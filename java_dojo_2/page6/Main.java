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
    int dist= scanner.nextInt();
    bi.run(dist);
  }
}