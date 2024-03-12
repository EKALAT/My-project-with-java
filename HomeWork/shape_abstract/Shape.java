package shape_abstract;
import java.util.Objects;

public abstract class Shape {
        protected String color;
        protected boolean filled;

        public Shape(){
            this.color = "black";
            this.filled = false;
        }
        public Shape(String color, boolean filled){
            this.color = color;
            this.filled = filled;
        }
        public String getColor(){
            return color;
        }
        public void setColor(String color){
            this.color = color;
        }
        public boolean isFilled(){
            return filled;
        }
        public void setFilled(boolean filled){
            this.filled = filled;
        }
        public abstract double getArea();
        public abstract double getPerimeter();

        public boolean equal(Object o){
            if (this == o ) return true;
            if (o == null || getClass() != o.getClass()) return false;
            shape_abstract.Shape shape = (shape_abstract.Shape) o;
            return Objects.equals(color, shape.color) &&
                    filled == shape.filled;
        }

        public String toString(){
            return "Shape{" +
                    "color ='" + color + '\''+
                    ", filled=" + filled +
                    '}';
        }
    }
