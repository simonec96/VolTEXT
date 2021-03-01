package classes;

import java.awt.Color;

public class TXT_Item extends Item {
	/**
	 * 
	 */
	public TXT_Item() {
		super();
		setText("");
		setAngle_Rotation(0f);
		setID("");
		setFontFamily("");
		setFontFamilyTTF("");
		setFontSize(12);
		setrGBAcolor(new Color(0, 0, 0, 0));
		setBold(false);
		setItalics(false);
		setUnderline(false);
		setPosition("ul");
		setPosX(0f);
		setPosY(0f);
		setWidth(null);
		setHeight(null);
		setFitX(false);
		setFitY(false);
		setLayer(0);
		
	}
	private String Text;
	private String ID;
	private String FontFamily;
	private String FontFamilyTTF;
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
	private boolean FitX;
	private boolean FitY;
	private Integer Layer;
	/**
	 * @return the text
	 */
	public String getText() {
		return Text;
	}
	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		Text = text;
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
	 * @return the fontFamilyTTF
	 */
	public String getFontFamilyTTF() {
		return FontFamilyTTF;
	}
	/**
	 * @param fontFamilyTTF the fontFamilyTTF to set
	 */
	public void setFontFamilyTTF(String fontFamilyTTF) {
		FontFamilyTTF = fontFamilyTTF;
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
	 * @return the rGBAcolor
	 */
	public Color getrGBAcolor() {
		return rGBAcolor;
	}
	/**
	 * @param rGBAcolor the rGBAcolor to set
	 */
	public void setrGBAcolor(Color rGBAcolor) {
		this.rGBAcolor = rGBAcolor;
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


}
