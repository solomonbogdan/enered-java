package ro.enered.exemple;

public class Main {
	
	public static void main (String[] args){
		int a=4;
		int b=3;
		int c;
		c = scadere(a,b);
		
		System.out.println(c);
		
	    initializareStudent();
	    initializareNota();
	    initializareStoc();
	    
	}
		private static int scadere (int a1,int b1){
			
			return a1-b1;
			
		}
		private static void initializareStudent(){
			
			Student s = new Student();
			
			s.nume = "Vlad";
			s.grup = 4;
		
			System.out.println(s.invata("Java",5));
		
		}
	public static void initializareNota(){
		
		Student s = new Student();
		s.nume = "Ion";
		s.grup = 2;
		Nota n = new Nota();
		//n.atribuie(s,8);
		System.out.println(n.atribuie(s, 8));
	}
	public static void initializareStoc(){
		Stoc s = new Stoc();
		System.out.println(s.calcNr());
		
	}

}
