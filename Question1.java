//question 2 for programming assignment 6
import java.util.Comparator;
//main public class
public class Question1{
    //main method
    public static void main(String[] args) {
    //creating required circles
    Circle[] a = {new Circle(5), new Circle(1), new Circle(3), new Circle(4), new Circle(2)};
    //displaying unsorted circles
    System.out.println("The Circles before a Selection Sort: ");
    for (Circle y : a) {
        System.out.println(y.toString());
    }
    //displaying sorted circles
    selectionSort(a, new CompareCircle());
    System.out.println("");
    System.out.println("The Circles after sorting with a Selection Sort: ");
    for (int i = 0; i < a.length; i++) {
        System.out.println(a[i].toString());
        }
    }
    //selection sort method
    public static <E> void selectionSort(E[] list, Comparator<? super E> comparator) {
		for (int i = 0; i < list.length - 1; i++) {
			//find smallest element
			E currentMin = list[i];
			int currentMinIndex = i;
			for (int j = i + 1; j < list.length; j++) {
				if (comparator.compare(currentMin, list[j]) > 0) {
				currentMin = list[j];
				currentMinIndex = j;
			}
		}
		//swap list if needed
		if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}
}