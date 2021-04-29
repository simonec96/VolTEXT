package classes;

import java.awt.Color;
import java.util.LinkedList;
import java.util.List;

import enums.Figure;

public class DIV_Item extends Item {
	
	/**
	 * 
	 */
	public DIV_Item() {
		super();
		setAngle_Rotation(0f);
		setPosX(0f);
		setPosY(0f);
		setWidth(0f);
		setHeight(0f);
		setLayer(0);
		setID("");
		setPosition("");
		setFitX(false);
		setFitY(false);
		setRGBAcolor(new Color(0,0,0,0));
		setList(new LinkedList<Item>());
		setUnitX("mm");
		setUnitY("mm");
		setUnitHeight("mm");
		setUnitWidth("mm");
		setFigura(Figure.RETTANGOLO);
		setCross_Percentage(0f);
	}
	private Float PosX;
	private Float PosY;
	private String Position;
	private Float Angle_Rotation;
	private Float Width;
	private Float Height;
	private Integer Layer;
	private String ID;
	private boolean FitX;
	private boolean FitY;
	private Color RGBAcolor;
	private String UnitX;
	private String UnitY;
	private String UnitWidth;
	private String UnitHeight;
	private List<? extends Item> list;
	private Figure Figura;
	private Float Cross_Percentage;
	
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
	/**
	 * @return the rGBAcolor
	 */
	public Color getRGBAcolor() {
		return RGBAcolor;
	}
	/**
	 * @param rGBAcolor the rGBAcolor to set
	 */
	public void setRGBAcolor(Color rGBAcolor) {
		RGBAcolor = rGBAcolor;
	}
	/**
	 * @return the fitX
	 */
	public boolean isFitX() {
		return FitX;
	}
	/**
	 * @param fitX the fitX to set
	 */
	public void setFitX(boolean fitX) {
		FitX = fitX;
	}
	/**
	 * @return the fitY
	 */
	public boolean isFitY() {
		return FitY;
	}
	/**
	 * @param fitY the fitY to set
	 */
	public void setFitY(boolean fitY) {
		FitY = fitY;
	}
	/**
	 * @return the list
	 */
	public List<? extends Item> getList() {
		return list;
	}
	/**
	 * @param list the list to set
	 */
	public void setList(List<? extends Item> list) {
		this.list = list;
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
	/**
	 * @return the figura
	 */
	public Figure getFigura() {
		return Figura;
	}
	/**
	 * @param figura the figura to set
	 */
	public void setFigura(Figure figura) {
		Figura = figura;
	}
	/**
	 * @return the cross_Percentage
	 */
	public Float getCross_Percentage() {
		return Cross_Percentage;
	}
	/**
	 * @param cross_Percentage the cross_Percentage to set
	 */
	public void setCross_Percentage(Float cross_Percentage) {
		if(cross_Percentage > 100)
			cross_Percentage = 100f;
		if(cross_Percentage < 0)
			cross_Percentage = 0f;
		Cross_Percentage = cross_Percentage;
	}

	
}
