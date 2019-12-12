package CS5800temp;

public class Option3 extends Motorcycle {
	//anything specific to this class
	
	@Override // overriding default superclass default implementation for Offer
	public void getOffer() {
        System.out.println(" ");
        System.out.println("Offer3.");
        /* specific implementation */
	}
	@Override// overriding default superclass default implementation for ExhaustSystem
    public void getExhaustSystem() {
        System.out.println(" ");
        System.out.println("ExhaustSystem: Heartthrob.");
        /* specific implementation */
    }
	@Override // overriding default superclass default implementation for Tires
    public void getTires() {
        System.out.println("Tire: MRF.");
        /* specific implementation */
    }
	@Override // overriding default superclass default implementation for WindShield
    public void getWindshield() {
        System.out.println("Windshield: National Cycle Plexifairing.");
        /* specific implementation */
    }
	@Override // overriding default superclass default implementation for LED
    public void  getLED() {
        System.out.println("LED: Nitro.");
        /* specific implementation */
    }
	@Override // overriding default superclass default implementation for EngineGaurds
    public void getEngineGuards() {
        System.out.println("EngineGuard: Roland sand.");
        /* specific implementation */
    }
}
