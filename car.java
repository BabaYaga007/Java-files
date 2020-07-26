class Car {
  private String name;
  private String color;
  private int distance=0;
  private int fuel=100;
  
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
    System.out.println("Fuel: "+this.fuel+"L");
  }
  
  public void run(int distance) {
    System.out.println("Moving "+distance+"km...");
    if(distance>fuel)
    {
      System.out.println("Not enough fuel");
    }
    else {
      this.distance+=distance;
      
    }
      System.out.println("Distance: "+this.distance+"km");
      this.fuel-=this.distance;
      System.out.println("Fuel: "+this.fuel+"L");
    
  }
}