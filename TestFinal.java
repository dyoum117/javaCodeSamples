import java.util.ArrayList;
import java.util.List;


// This class will compile and execute properly
// HOWEVER< changing List foo to be private static final will cause compilation error
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

