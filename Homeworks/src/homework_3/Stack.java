package homework_3;
public class Stack {

    private Node top = null;

    // Добавить элемент в стек
    public void push(int value) {
        Node temp = new Node();
        temp.value = value;
        if (isEmpty()) {
            // Стек пустой поэтому дабавляемый элемент является вершиной
            top = temp;
            return;
        }
        // Здесь мы окажемся если стек не пустой
        temp.next = top;
        top = temp;
        return;
    }

    // Извлечь вершину стека
    public int pop() {
        int answer = top.value;
        top = top.next;
        return answer;
    }

    //Проверка пуст ли стек
    // Возвращается true если стек пустой
    public boolean isEmpty() {
        return top == null;
    }

    // Вернуть значение которое хранится в вершине текста без удаления
    public int peek() {
        return top.value;
    }

}


class Node {
    int value;
    Node next;
}
