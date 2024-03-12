package Point_00;

public class Triangle {
    Point vertice1;
    Point vertice2;
    Point vertice3;
    public Triangle (Point vertice1, Point vertice2, Point vertice3){
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.vertice3 = vertice3;
    }
    public Triangle ( int x1,int y1, int x2 , int y2, int x3 , int y3){
        this.vertice1 = new Point(x1,y1);
        this.vertice2 = new Point(x2,y2);
        this.vertice3 = new Point(x3,y3);
    }
    public double getPerimeter(){
        double side1 = calculateDistance(vertice1, vertice2);
        double side2 = calculateDistance(vertice2, vertice3);
        double side3 = calculateDistance(vertice3, vertice1);

        return side1 + side2 + side3;
    }
    double calculateDistance(Point p1, Point p2){
        return Math.sqrt(Math.pow(p2.getX()- p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }
}


