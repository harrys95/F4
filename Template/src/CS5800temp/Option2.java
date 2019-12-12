package CS5800temp;

public class Option2 extends Motorcycle {
	//anything specific to this class
	
	@Override // overriding default superclass default implementation for offer
	public void getOffer() {
        System.out.println(" ");
        System.out.println("Offer2.");
        /* specific implementation */
	    }
	@Override // overriding default superclass default implementation for Exhaust System
	    public void getExhaustSystem() {
	        System.out.println(" ");
	        System.out.println("ExhaustSystem: Tailpipes");
	        /* specific implementation */
	    }
	@Override // overriding default superclass default implementation for Tires
	    public void getTires() {
	        System.out.println("Tire: Pirelli.");
	        /* specific implementation */
	    }
	@Override // overriding default superclass default implementation for Windshield
	    public void getWindshield() {
	        System.out.println("Windshield: National Cycle Vstream.");
	        /* specific implementation */
	    }
	@Override // overriding default superclass default implementation for LED
	    public void  getLED() {
	        System.out.println("LED: TeamObsidian.");
	        /* specific implementation */
	    }
	@Override // overriding default superclass default implementation for EngineGaurds
	    public void getEngineGuards() {
	        System.out.println("EngineGuard: MachineArt.");
	        /* specific implementation */
	    }
	}


