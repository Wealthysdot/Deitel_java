//package extraExercise;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.* ;
//
//class MyNewStackTest {
// MyNewStack myNewStack;
//    @BeforeEach
//    void setUp() {
//      myNewStack = new MyNewStack(5);
//    }
//
//
//    @AfterEach
//    void tearDown() {
//    }
//
//    @Test
//    void pushOneElementTest(){
//       MyNewStack myNewStack = new MyNewStack(5);
//       myNewStack.push(5);
//       assertEquals(5, myNewStack.peek());
//    }
//
//    @Test
//   void pushTwoElementsTest(){
//      myNewStack.push(8);
//       myNewStack.push(6);
//       assertEquals(6, myNewStack.peek());
//
//    }
//
//
//    @Test
//   void pushTwoElements_popOneTest(){
//       myNewStack.push(4);
//       myNewStack.push(11);
//
//       assertEquals(11,myNewStack.removeLastElement());
//       assertEquals(4, myNewStack.peek());
//    }
//
//    @Test
//   void pushTwo_popTwo_shouldBeEmptyTest(){
//       myNewStack.push(4);
//       myNewStack.push(11);
//       myNewStack.removeLastElement();
//       myNewStack.removeLastElement();
//       assertTrue(myNewStack.isEmpty());
//    }
//
//   @Test
//   void pushThree_shouldBeEmptyTest(){
//       myNewStack = new MyNewStack(3);
//      myNewStack.push(4);
//      myNewStack.push(11);
//      myNewStack.push(3);
//      assertTrue(myNewStack.isFull());
//   }
//
//   @Test
//   void pushOneElement_afterStackIsFull_ThrowStackOverFlowException(){
//      myNewStack = new MyNewStack(3);
//      myNewStack.push(4);
//      myNewStack.push(11);
//      myNewStack.push(3);
//      assertTrue(myNewStack.isFull());
//      assertThrows(MyNewStack.StackOverflowException.class, ()-> myNewStack.push(5));
//    }
//
//
//
//}