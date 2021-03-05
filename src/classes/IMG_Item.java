package classes;

public class IMG_Item extends Item {
	public IMG_Item(String url) {
		super();
		setURL(url);
		setAngle_Rotation(0f);
		setID("");
		setPosition("");
		setPosX(0f);
		setPosY(0f);
		setWidth(null);
		setHeight(null);
		setLayer(0);
		setFitX(false);
		setFitY(false);
		setUnitX("mm");
		setUnitY("mm");
		setUnitWidth("mm");
		setUnitHeight("mm");
	}
	private String URL;
	private String ID;
	private String Position;
	private Float PosX;
	private Float PosY;
	private Float Angle_Rotation;
	private Float Width;
	private Float Height;
	private boolean FitX;
	private boolean FitY;
	private Integer Layer;
	private String UnitX;
	private String UnitY;
	private String UnitWidth;
	private String UnitHeight;
	/**
	 * @return the uRL
	 */
	public String getURL() {
		return URL;
	}
	/**
	 * @param uRL the uRL to set
	 */
	public void setURL(String uRL) {
		URL = uRL;
	}
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
	 * @return the position
	 */
	public String getPosition() {
		return Position;
	}
	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		Position = position;
	}
	/**
	 * @return the posX
	 */
	public Float getPosX() {
		return PosX;
	}
	/**
	 * @param posX the posX to set
	 */
	public void setPosX(Float posX) {
		PosX = posX;
	}
	/**
	 * @return the posY
	 */
	public Float getPosY() {
		return PosY;
	}
	/**
	 * @param posY the posY to set
	 */
	public void setPosY(Float posY) {
		PosY = posY;
	}
	/**
	 * @return the angle_Rotation
	 */
	public Float getAngle_Rotation() {
		return Angle_Rotation;
	}
	/**
	 * @param angle_Rotation the angle_Rotation to set
	 */
	public void setAngle_Rotation(Float angle_Rotation) {
		Angle_Rotation = angle_Rotation;
	}
	/**
	 * @return the width
	 */
	public Float getWidth() {
		return Width;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(Float width) {
		Width = width;
	}
	/**
	 * @return the height
	 */
	public Float getHeight() {
		return Height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(Float height) {
		Height = height;
	}
	/**
	 * @return the layer
	 */
	public Integer getLayer() {
		return Layer;
	}
	/**
	 * @param layer the layer to set
	 */
	public void setLayer(Integer layer) {
		Layer = layer;
	}
	public boolean isFitX() {
		return FitX;
	}
	public void setFitX(boolean fitX) {
		FitX = fitX;
	}
	public boolean isFitY() {
		return FitY;
	}
	public void setFitY(boolean fitY) {
		FitY = fitY;
	}
	/**
	 * @return the unitX
	 */
	public String getUnitX() {
		return UnitX;
	}
	/**
	 * @param unitX the unitX to set
	 */
	public void setUnitX(String unitX) {
		UnitX = unitX;
	}
	/**
	 * @return the unitY
	 */
	public String getUnitY() {
		return UnitY;
	}
	/**
	 * @param unitY the unitY to set
	 */
	public void setUnitY(String unitY) {
		UnitY = unitY;
	}
	/**
	 * @return the unitWidth
	 */
	public String getUnitWidth() {
		return UnitWidth;
	}
	/**
	 * @param unitWidth the unitWidth to set
	 */
	public void setUnitWidth(String unitWidth) {
		UnitWidth = unitWidth;
	}
	/**
	 * @return the unitHeight
	 */
	public String getUnitHeight() {
		return UnitHeight;
	}
	/**
	 * @param unitHeight the unitHeight to set
	 */
	public void setUnitHeight(String unitHeight) {
		UnitHeight = unitHeight;
	}
}
