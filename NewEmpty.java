import java.util.Comparator;
//compare class
class CompareCircle implements Comparator<Circle> {
    @Override
    public int compare(Circle c1, Circle c2){
        return Integer.compare(c1.getRadius(), c2.getRadius());
    }
 }
