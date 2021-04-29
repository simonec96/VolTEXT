package classes;

public class PAGE_Item extends Item {
	/**
	 * 
	 */
	public PAGE_Item() {
		super();
		setID("");
		setAngleRotation(0f);
		setOob(false);
		setFormat("");
		setWidth(0f);
		setHeight(0f);
	}

	private String ID;
	private Float AngleRotation;
	private boolean oob;
	private String format;
	private Float width;
	private Float height;
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

	/**
	 * @return the format
	 */
	public String getFormat() {
		return format;
	}

	/**
	 * @param format the format to set
	 */
	public void setFormat(String format) {
		this.format = format;
	}

	/**
	 * @return the width
	 */
	public Float getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(float width) {
		this.width = width;
	}

	/**
	 * @return the height
	 */
	public Float getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(float height) {
		this.height = height;
	}
}
