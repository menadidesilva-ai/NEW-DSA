import java.util.*;

public class Main {

    Queue<Integer> q = new LinkedList<>();

    void push(int x) {
        q.add(x);

        int size = q.size();

        for (int i = 0; i < size - 1; i++) {
            int temp = q.remove();
            q.add(temp);
        }
    }

    void pop() {
        if (q.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println(q.remove());
        }
    }

    public static void main(String[] args) {

        Main s = new Main();

        s.push(10);
        s.push(20);
        s.push(30);

        s.pop();
        s.pop();
        s.pop();
    }
}
