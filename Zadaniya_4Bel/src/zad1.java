package sozdatochered;
import java.util.LinkedList;
import java.util.Queue;

public class zad1 {
    private String contents;
    private int weight;
   
    public zad1(String contents, int weight) {
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
    	
        Queue<zad1> heavyBoxQueue = new LinkedList<>();

   
        heavyBoxQueue.offer(new zad1("Box 1", 10));
        heavyBoxQueue.offer(new zad1("Box 2", 15));
        heavyBoxQueue.offer(new zad1("Box 3", 12));


        System.out.println("Содержимое очереди: " + heavyBoxQueue);

 
        zad1 removedBox = heavyBoxQueue.poll();
        System.out.println("Удаленный объект: " + removedBox);
        
        System.out.println("Содержимое очереди после удаления: " + heavyBoxQueue);


        zad1 peekedBox = heavyBoxQueue.peek();
        System.out.println("Объект в начале очереди: " + peekedBox);
    }
}
