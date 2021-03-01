package classes;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

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
		setFitX(false);
		setFitY(false);
		setRGBAcolor(null);
		setList(new LinkedList<Item>());
	}
	private Float PosX;
	private Float PosY;
	private Float Angle_Rotation;
	private Float Width;
	private Float Height;
	private Integer Layer;
	private String ID;
	private boolean FitX;
	private boolean FitY;
	private Color RGBAcolor;
	private List<? extends Item> list;
	
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

	
}
