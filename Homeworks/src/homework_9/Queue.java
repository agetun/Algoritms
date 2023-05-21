package homework_9;

/*
1 уровень сложности: 1. Классическая Queue - реализовать используя массив (Array)
    pushToEnd(int data) - вставляет элемент в конец queue
    remove() - удаляет элемент из начала queue
    peek() - возвращает элемент из начала не удаляя его
    isEmpty()
    size()
начало:
public class Queue
    private int[] arr;      // массив для хранения элементов queue
    private int head;      // head указывает на первый элемент в queue
    private int tail;       // tail часть указывает на последний элемент в queue
    private int capacity;   // максимальная емкость queue
    private int count;      // текущий размер queue

// Конструктор для инициализации queue

public Queue(int size)
    {
        arr = new int[size];
        capacity = size;
        head = 0;
        tail = -1;
        count = 0;
    }
// ?? ….. дальше самостоятельно



Задача "Кузнечик и кувшинки"
Есть определённое количество кувшинок, расположенных в ряд, кузнечик стоит на первой из них.
Он может прыгнуть на следующую кувшинку, либо перепрыгнуть через одну. Сколько существует разных
способов (путей) добраться до последней кувшинки? Это задача на динамическое программирование.
*/

// TODO Можно доработать методы push и remove чтобы можно было
// добавлять любое количество элементов
public class Queue {

    private int[] arr;      // массив для хранения элементов queue
    private int head;       // head указывает на первый элемент в queue
    private int tail;       // tail часть указывает на последний элемент в queue
    private int capacity;   // максимальная емкость queue
    private int count;      // текущий размер queue

    // Конструктор для инициализации queue
    public Queue(int size) {
        arr = new int[size];
        capacity = size;
        head = -1;
        tail = -1;
        count = 0;
    }

    // Вставляет элемент в конец queue
    public void push(int data) {
        if (count == capacity) {
            System.out.println("Queue is full!");
            return;
        }
        if (tail == capacity - 1) {
            // После "хвоста" в очереди нет свободных ячеек
            System.out.println("Not enough space after tail!");
            return;
        }
        tail++;
        if (head == -1) {
            head++;
        }
        arr[tail] = data;
        count++;
    }

    // Удаляет элемент из начала queue
    public int remove() {
        if (head == -1) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int data = arr[head];
        head++;
        if (head > tail) {
            // Значит, что очередь стала пустой
            head = tail = -1;
        }
        count--;
        return data;
    }

    // Возвращает элемент из начала не удаляя его
    public int peek() {
        if (head == -1) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return arr[head];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }

}