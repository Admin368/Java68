class Circle {
    int X;
    int Y;
    int radius;
    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        radius=radius;
    }
    public double getX() {
        return X;
    }
    public void setX(int x) {
        X=x;
    }
    public double getY() {
        return Y;
    }
    public void setY(int y) {
        Y=y;
    }
    Circle() {

        X = 1;
        Y = 1;
        radius = 1;
    }
    Circle(int x1, int y1, int r){
        X = x1;
        Y = y1;
        radius = r;

    }
    public double area(){
        return Math.PI*radius*radius;
    }
    public double circumference(){
        return  2*Math.PI*radius;
    }
    void display() {
        System.out.println(" " +"x= "+ X + ", y= " + Y);
        System.out.println("Radius = " + radius);
        System.out.println(" area= "+area());
        System.out.println(" circumference=:"+circumference());
    }
    public static void main(String args[]) {
        Circle c1 = new Circle(15,5,10);
        Circle c2 = new Circle(16,8,12);
        Circle c3 = new Circle();
        System.out.println(" circle c1:");
        c1.display();
        System.out.println(" circle c2:");
        c2.display();
        System.out.println("circle c3 with default constructor");
        c3.display();
        System.out.println("-------with getter and setter------");
        c1.setX(50);
        c1.setY(12);
        c2.setX(17);
        c2.setY(19);
        c1.setRadius(13);
        c2.setRadius(15);
        System.out.println("c1");}}