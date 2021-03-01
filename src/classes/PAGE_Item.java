package classes;

public class PAGE_Item extends Item {
	/**
	 * 
	 */
	public PAGE_Item() {
		super();
		setID("");
		setAngleRotation(0f);
	}

	private String ID;
	private Float AngleRotation;
	private boolean oob;
	/**
	 * @return the iD
	 */
	public String getID() {
		return ID;
	}

	/**
	 * @param iD the iD to set
	 */
	public void setID(String iD) {
		ID = iD;
	}

	/**
	 * @return the angleRotation
	 */
	public Float getAngleRotation() {
		return AngleRotation;
	}

	/**
	 * @param angleRotation the angleRotation to set
	 */
	public void setAngleRotation(Float angleRotation) {
		AngleRotation = angleRotation;
	}

	/**
	 * @return the oob
	 */
	public boolean isOob() {
		return oob;
	}

	/**
	 * @param oob the oob to set
	 */
	public void setOob(boolean oob) {
		this.oob = oob;
	}
}
