public class TheStack {
    private String[] stackArray;
    private int stackSize;
    private int topOfStack=-1;

    TheStack(int size){
        stackSize=size;
        stackArray= new String[size];
        
    }

    public void push(String input) {
         if (topOfStack +1 <stackSize){
             topOfStack++;
             stackArray[topOfStack]=input;
         }
         else
         System.out.println("Sorry but the Stack is full ");

    }

    public String pop() {
        if(topOfStack>0){
            System.out.println("POP "+stackArray[topOfStack] +"was removed from the Stack /n");
            
            return stackArray[topOfStack--];
        }
        else {
            System.out.println("sorry but the stack is Empty");

            return "-1";
        }
       
    }
    public String peek() {
        System.out.println("PEEK "+stackArray[topOfStack] +"Is at the Top of the Stack \n" );
        return stackArray[topOfStack];
    }

    public static void main(String[] args) {
       
    }
}