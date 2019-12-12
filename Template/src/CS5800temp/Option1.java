package CS5800temp;

	public class Option1 extends Motorcycle {
		//anything specific to this class
		@Override // overriding default superclass default implementation for offer
		public void getOffer() {
	        System.out.println(" ");
	        System.out.println("Offer1.");
	        /* specific implementation */
		}
		@Override // overriding default superclass default implementation for Exhaust system
	    public void getExhaustSystem() {
	        System.out.println(" ");
	        System.out.println("ExhaustSystem: Mufflers.");
	        /* specific implementation */
	    }
		@Override // overriding default superclass default implementation for Tires
	    public void getTires() {
	        System.out.println("Tire: Ceat.");
	        /* specific implementation */
	    }
		@Override // overriding default superclass default implementation for Windshield
	    public void getWindshield() {
	        System.out.println("Windshield: Memphis Shades Batwing.");
	        /* specific implementation */
	    }
		@Override // overriding default superclass default implementation for LED
	    public void  getLED() {
	        System.out.println("LED: Cygolite.");
	        /* specific implementation */
	    }
		@Override // overriding default superclass default implementation for EngineGuards
	    public void getEngineGuards() {
	        System.out.println("EngineGuard: Yoshimora.");
	        /* specific implementation */
	    }
	}


