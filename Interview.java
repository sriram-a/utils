/* To be run in https://ideone.com/. Therefore the only public class is called as Main.
*/
interface OS {
	public void w(String s);
	public void wb(byte b);
}

class POS implements OS {
	public void w(String s) {
		for (byte b : s.getBytes()) {
			wb(b);
		}
	}
	
	public void wb(byte b) {
	}
}

class MyPOS extends POS {
	int size = 0;
	public void w(String s) {
		super.w(s);
		size += s.getBytes().length;
	}
	
	public void wb(byte b) {
		super.wb(b);
		size++;
	}
	public int getSize() {
		return size;
	}
}

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		OS p = new MyPOS();
		p.w("Java");
		System.out.println(((MyPOS) p).getSize());
	}
}
