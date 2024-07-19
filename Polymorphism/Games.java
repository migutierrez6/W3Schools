package Polymorphism;

 class Games {
	public void game() {
		System.out.println("This is the console");
	}
}
 
 class Xbox extends Games {
		
		public void game() {
			System.out.println("Gears of Wars 2");
	}
}
 
 class playstation extends Games{
	 public void game() {
		 System.out.println("uncharged");
	 }
 }
 
 class Main2{
	public static void main(String[] args) {
		Games xbox = new Xbox();
		Games playstation = new playstation();
		playstation.game();
		xbox.game();
	}

}
