class Main {
  public static void main(String[] args) {
    Bicycle bi = new Bicycle();
    bi.setName("Bianchi");
    bi.setColor("Green");
    System.out.println("【Bicycle Info】");
    bi.printData();
    System.out.println("-----------------");
    bi.run(10);
  }
}