public class TheQueue {
    private String[] queueArray;
    private int queueSize;
    private int front,rear, numberOfItems=0;

    TheQueue(int size){
        queueSize =size;
        queueArray =new String[size];

    }

    public void insert(String input){
        if ( (numberOfItems+1) <= queueSize) {
            queueArray[rear]=input;
            rear++;
            numberOfItems++;
            System.out.println("INSERT "+ input + " was added to the Queue \n");
        }
        else
        {
            System.out.println("Sorry but the queue is full");
        }
    }

    public void remove() {
        if (numberOfItems >0){
            System.out.println("Remove " +queueArray[front]+"was removed ");
            queueArray[front]="-1";
            front++;
            numberOfItems--;
            
            System.out.println("Present queue is");
            for(String item:queueArray)
            {
                System.out.print(item+"\t");
            }
            System.out.print("\n");
          }
        else
          System.out.println("Sorry The queue is Empty");
    }

    public void peek() {
        System.out.println("The first element is " +queueArray[front]);
    }

    public static void main(String[] args) {
        TheQueue theQueue=new TheQueue(10);

        theQueue.insert("10");
        theQueue.insert("15");
        theQueue.insert("11");
        theQueue.remove();

        theQueue.peek();
        
    }
    
}