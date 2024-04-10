package Lesson;

public class Box {
    private int w,h,d;

    public Box() {
        this.w = w;
        this.h = h;
        this.d = d;
    }
    public void setW(int w) {
        this.w = w;
    }
    public void setH(int h) {
        this.h = h;
    }
    public void setD(int d) {
        this.d = d;
    }

    public int getW() {
        return w;
    }

    public int getH() {
        return h;
    }

    public int getD() {
        return d;
    }

    public int Volume(){
        return w*h*d;
    }
    public int Surface(){
        return 2 * (h * w + w * h + d * h);
    }
}
