package InnerClass;

public class Maiin {
	public static void main(String[] args) {
	Xbox myOuter = new Xbox();
	
	Xbox.Ram myInner = myOuter.new Ram();
	
	System.out.println("how much ram does the Xbox has: "+ myInner.HowMuchRam() +" GB");
	
	}
}

class Xbox {
	  int x = 16;

	  class Ram {
	    public int HowMuchRam() {
	      return x;
	    }
	  }
	}

