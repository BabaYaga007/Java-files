class Bicycle {
  private String name;
  private String color;
  private int distance=0;
  
  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    this.name = name;
  }
  
  public String getColor() {
    return this.color;
  }
  public void setColor(String color) {
    this.color= color;
  }
  
  public int getDistance() {
    return this.distance;
  }
  public void setDistance(int distance) {
    this.distance= distance;
  }
  
  public void printData() {
    System.out.println("Name: "+this.name);
    System.out.println("Color: "+this.color);
    System.out.println("Distance: "+this.distance+"km");
  }
  
  public void run(int distance) {
    System.out.println("Moving "+distance+"km...");
    this.distance+=distance;
    System.out.println("Distance: "+this.distance+"km");
  }
}