package sozdatochered;
import java.util.ArrayDeque;
import java.util.Queue;

public class zad3 {
    private String zad3;
    private int weight;
	private String contents;


    public zad3(String contents, int weight) {
        this.contents = contents;
        this.weight = weight;
    }


    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public static void main(String[] args) {

        Queue<zad3> heavyBoxQueue = new ArrayDeque<>();

  
        heavyBoxQueue.offer(new zad3("Box 1", 10));
        heavyBoxQueue.offer(new zad3("Box 2", 15));
        heavyBoxQueue.offer(new zad3("Box 3", 12));

        System.out.println("Содержимое очереди: " + heavyBoxQueue);
    }
}
