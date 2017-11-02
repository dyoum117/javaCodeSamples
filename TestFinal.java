import java.util.ArrayList;
import java.util.List;


// This class will compile and execute properly
// HOWEVER changing List foo to be private static final will cause compilation error
// snippet of code taken from https://stackoverflow.com/questions/15655012/how-final-keyword-works

class TestFinal {
  private final List foo;

  public TestFinal()
  {
      foo = new ArrayList();
      foo.add("foo"); // Modification-1
  }
  public static void main(String[] args) 
  {
    TestFinal t = new TestFinal();
  
    t.foo.add("bar"); // Modification-2
    System.out.println("print - " + t.foo);
  }
}

// Apparently, we can initialize a final variable and do so once!
// but I assumed we couldn't add bar to it... How is this possible?
// MISNOMER to assume that final means that variable can only be modified once
// final refers to only the reference and not the contents of referenced object
// t.foo = new ArrayList() after constructing t will result in compilation error


// to better understand,
// foo is an instance variable of the class TestFinal. When obj is created,
// instance variable foo will be copied inside object of TestFinal class.
// STATIC keyword is very different. If we have private final static List foo,
// then foo is not copied to the object.
// foo will instead be seen by MULTIPLE objects 


// final class cannot be subclassed
// final method cannot be overridden by subclasses
// final variable can only be initialized once