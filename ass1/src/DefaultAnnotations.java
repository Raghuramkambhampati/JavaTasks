
public class DefaultAnnotations extends SampleClass
{

	
	@Deprecated
    public void Display()
    {
        System.out.println("Deprecatedtest display()");
    }
	
	@SuppressWarnings({"checked", "deprecation"})
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DefaultAnnotations da=new DefaultAnnotations();
		da.Display();
		da.supermethod();
		
	}
	
	@Override
	public void supermethod()
	  {
		  System.out.println("This is sub class");
	  }

}
