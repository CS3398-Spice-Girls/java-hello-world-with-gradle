package hello;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestGreeter {

   private Greeter g;
	
   @Before
   public void setUp() throws Exception 
   {
      g = new Greeter();
   }

   @Test
   public void testGreeterEmpty() 
   {
      assertEquals(g.getName(),"");
      assertEquals(g.sayHello(),"Hello!");
   }
	
   @Test
   public void testGreeter() 
   {
      g.setName("World");
      assertEquals(g.getName(),"World");
      assertEquals(g.sayHello(),"Hello World!");
   }

   @Test
   public void newtestMAEGreeterPass()
   {
         g.setName("Michael's Pass");
         assertEquals(g.getName(), "Michael's Pass'");
   }
   
  // @Test
  // public void newtestMAEGreeterFail()
  // {
   //      g.setName("Oops");
    //     assertEquals(g.getName().toLowerCase(), "OOPS");
  // }
}
