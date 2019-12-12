package CS5800temp;  
/**
 * abstract class Motorcycle containing template method modifyMotorcycle and implementation
 * of steps which is same for all types of motorCycles.
 */
//This is an abstract class.
public abstract class Motorcycle {
	/**
     * This is the template method we are discussing. This method should be
     * final so that other class can't re-implement and change the order of the
     * steps.
     */
	 public final void modifyMotorcycle(){
    	getOffer();
    	getExhaustSystem();
    	getTires();
        getWindshield();
        getLED();
        getEngineGuards();
        /* Note that any of this methods 
    	 * could provide a default implementation 
    	 * by being concretely defined
    	 */
    }
    public abstract void getOffer();
    public abstract void getExhaustSystem();
    public abstract void getTires();
    public abstract void getWindshield();
    public abstract void getLED();
    public abstract void getEngineGuards();
}
