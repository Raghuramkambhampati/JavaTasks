
public class SampleClass {
  public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

int a=10;
  int b=20;
  int c=30;
	
  @Override
  protected void finalize()
  {
      System.out.println("finalize method called");
  }
}
