import java.util.ArrayList;
import java.util.Arrays;

public class Queue {

    String[] values = new String[]{"", "", "", "", ""};
    int size = 5;
    int rear = -1;
    int front = -1;

    public void enQueue(String value) {
        if (rear == size - 1) {
            System.out.println("La cola esta llena");
            return;
        }
        if (front == -1) front = 0;

        rear++;
        values[rear] = value;
        System.out.println("Se inserto el valor: " + value);
    }

    public void deQueue() {
        if (front == -1) {
            System.out.println("No hay nada en la cola");
            return;
        }
        System.out.println("se elimino el valor: " + values[front]);
        values[front] = "";
        for (int i = 0; i < size - 1; i++) {
            values[i] = values[i + 1];
        }
        values[size-1] = "";
        rear--;
        if (rear == 0) {
            front = rear = -1;
        }
    }

    public void showQueue() {
        for (String v : values) {
            System.out.print(v + " ");
        }
        System.out.println();
    }

}
