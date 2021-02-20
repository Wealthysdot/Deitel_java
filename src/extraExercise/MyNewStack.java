//package extraExercise;
//
//public class MyNewStack {
//    private int[] elements;
//    private int lastLocationWritten = -1;
//
//
//    public MyNewStack(int numberOfElements){
//        elements = new int[numberOfElements];
//    }
//
//    public void push(int elementToPush) {
//        if(isFull()){
//            throw new StackOverflowException("Stack is Full");
//        }
//        elements[++lastLocationWritten] = elementToPush;
//
//    }
//
//
//
//    public int peek() {
//        return elements[lastLocationWritten];
//    }
//
//    public int removeLastElement() {
//        int lastElement = elements[lastLocationWritten];
//        elements[lastLocationWritten--] = 0;
//
//        return lastElement;
//    }
//
//    public boolean isEmpty() {
//        return (lastLocationWritten == -1);
//    }
//
//    public boolean isFull() {
//        return(lastLocationWritten == (elements.length -1));
//    }
//
//    public class StackOverflowException extends RuntimeException{
//        public Sta
//    }
//}
