import java.io.Serializable;
import java.util.Comparator;

public class Circle implements Serializable {

private int rad = 1;
//circle constructors
public Circle() {
}
public Circle(int radius) {
    this.rad = rad;
}
//getter and setter methods
public void setRadius(int v) {
    if (v > 0) {
        this.rad = v;
    }
}
public int getRadius() {
    return this.rad;
}
//override toString method
@Override
public String toString() {
    return "A Circle with the radius of: [" + rad + "]";
}
}