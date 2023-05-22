package inheritance;

public class R extends H {

	public static void main(String[] args) {
		
		R1();
		H1();
		K1();
		
		R.R1();
		R.H1();
		R.K1();
		 System.out.println(w);
		 
		 R r = new R();
		 r.H2();
		 r.K2();
		 
		 
		
	}
        public static void R1() {
        	System.out.println("static R1 method");
        }
	  public void R2(){
		  H1();
		  super.H1();
		  System.out.println("non-static R2 method");
	  }
	  
	
	
	
	
	
	
	
	
	
	
	
}
