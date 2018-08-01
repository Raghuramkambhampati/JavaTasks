
public class DefaultMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleClass sc1=new SampleClass();
		System.out.println(sc1);
		System.out.println("To string method"+sc1.toString());
		System.out.println("Hash code method"+sc1.hashCode());
		System.gc();
        System.out.println("end");
		 Object obj = new String("Raghu");
	        Class c = obj.getClass();
	        System.out.println("Class of Object obj is : "+ c.getName());

	}

}


