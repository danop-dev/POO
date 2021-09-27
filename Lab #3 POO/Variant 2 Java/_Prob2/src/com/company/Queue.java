package com.company;

class QNode {
    int key;
    QNode next;

    public QNode(int key)
    {
        this.key = key;
        this.next = null;
    }
}

class Queue {
    QNode front, rear;
    public int count = 1;
    public int max_qu = 2;

    public Queue()
    {
        this.front = this.rear = null;
    }

    boolean isEmpty(){
        return (count == 0);
    }

    boolean isFull()
    {
        return (count == max_qu);
    }

    void push(int key)
    {

        QNode temp = new QNode(key);

        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }

        this.rear.next = temp;
        this.rear = temp;
        count++;
    }

    void push_to_max(int key)
    {
        if(isFull()){
            System.out.println("Elementul " + key + " nu a fost introdus fiindca queue este plina");
            return;
        } else {
            QNode temp = new QNode(key);

            if (this.rear == null) {
                this.front = this.rear = temp;
                return;
            }

            this.rear.next = temp;
            this.rear = temp;
            count++;
        }
    }

    int pop(){
        if (this.front == null){
            System.out.println("Queue este goala");
            return 0;
        }

        int data = front.key;
        count--;

        QNode temp = this.front;
        this.front = this.front.next;

        if (this.front == null)
            this.rear = null;

        System.out.println(data + " a fost sters");
        return data;
    }

    void display(){
        QNode current = this.front;
        while (current != null){
            System.out.println(current.key);
            current = current.next;
        }
    }

}

class Main {
    public static void main(String[] args)
    {
        Queue qu1 = new Queue();
        System.out.println("Queue 1 : ");
        qu1.push(10);
        qu1.push(20);
        qu1.push(30);
        qu1.push(40);
        qu1.display();

        System.out.println("Dupa stergere 1 : ");
        qu1.pop();
        qu1.pop();

        System.out.println("\n");
        qu1.display();


        Queue qu2 = new Queue();
        System.out.println("\nQueue 2 : ");
        qu2.push_to_max(60);
        qu2.push_to_max(70);
        qu2.push_to_max(80);
        qu2.push_to_max(90);
        qu2.display();

        System.out.println("Dupa stergere 2 : ");
        qu2.pop();
        System.out.println("\n");
        qu2.display();

        System.out.println("\n");
        System.out.println("Queue este plina : " + qu2.isFull());
        System.out.println("Queue este goala : " + qu2.isEmpty());




//        System.out.println("Queue Front : " + qu1.front.key);
//        System.out.println("Queue Rear : " + qu1.rear.key);
    }
}