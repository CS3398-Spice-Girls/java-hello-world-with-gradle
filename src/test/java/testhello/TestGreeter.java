package hello;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import java.lang.StringBuffer;


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
   public void newtestJMGreeterPass()
   {
      g.setName(new StringBuffer("Jean-Michel").reverse().toString());
      assertEquals(g.getName(), "lehciM-naeJ");
   }

   @Test
   public void newtestJMGreeterFail()
   {
      g.setName(new StringBuffer("Jean-Michel").reverse().toString());
      assertEquals(g.sayHello(), "lehciM-naeJ olleH");
   }
}