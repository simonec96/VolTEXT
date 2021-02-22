package classes;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class LIST_Item extends Item {
	private boolean ordered;
	private List<String> items;
	private String ID;
	private String FontFamily;
	private Integer FontSize;
	private Color rGBAcolor;
	private boolean Bold;
	private boolean Italics;
	private boolean Underline;
	private String Position;
	private Float PosX;
	private Float PosY;
	private Float Angle_Rotation;
	private Float Width;
	private Float Height;
	private Integer Layer;

	public LIST_Item() {
		super();
		setItems(new ArrayList<String>());
		setAngle_Rotation(0f);
		setID("");
		setFontFamily("");
		setFontSize(12);
		setRGBAcolor(new Color(0, 0, 0, 0));
		setBold(false);
		setItalics(false);
		setUnderline(false);
		setPosition("ul");
		setPosX(0f);
		setPosY(0f);
		setWidth(0f);
		setHeight(0f);
		setLayer(0);
	}
	
	/**
	 * @return the ordered
	 */
	public boolean isOrdered() {
		return ordered;
	}

	/**
	 * @param ordered the ordered to set
	 */
	public void setOrdered(boolean ordered) {
		this.ordered = ordered;
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
	 * @return the fontFamily
	 */
	public String getFontFamily() {
		return FontFamily;
	}

	/**
	 * @param fontFamily the fontFamily to set
	 */
	public void setFontFamily(String fontFamily) {
		FontFamily = fontFamily;
	}

	/**
	 * @return the fontSize
	 */
	public Integer getFontSize() {
		return FontSize;
	}

	/**
	 * @param fontSize the fontSize to set
	 */
	public void setFontSize(Integer fontSize) {
		FontSize = fontSize;
	}

	/**
	 * @return the bold
	 */
	public boolean isBold() {
		return Bold;
	}

	/**
	 * @param bold the bold to set
	 */
	public void setBold(boolean bold) {
		Bold = bold;
	}

	/**
	 * @return the italics
	 */
	public boolean isItalics() {
		return Italics;
	}

	/**
	 * @param italics the italics to set
	 */
	public void setItalics(boolean italics) {
		Italics = italics;
	}

	/**
	 * @return the underline
	 */
	public boolean isUnderline() {
		return Underline;
	}

	/**
	 * @param underline the underline to set
	 */
	public void setUnderline(boolean underline) {
		Underline = underline;
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

	/**
	 * @return the items
	 */
	public List<String> getItems() {
		return items;
	}

	/**
	 * @param items the items to set
	 */
	public void setItems(List<String> items) {
		this.items = items;
	}

	/**
	 * @return the rGBAcolor
	 */
	public Color getRGBAcolor() {
		return rGBAcolor;
	}

	/**
	 * @param rGBAcolor the rGBAcolor to set
	 */
	public void setRGBAcolor(Color rGBAcolor) {
		this.rGBAcolor = rGBAcolor;
	}
}
