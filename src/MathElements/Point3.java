package MathElements;

public class Point3 {
    public double x;
    public double y;
    public double z;

    public Point3(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String toString(){
        return this.x + ", " + this.y + ", " + this.z + "\n";
    }

}
