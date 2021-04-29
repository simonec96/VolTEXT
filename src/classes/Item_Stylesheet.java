package classes;

import java.awt.Color;

import enums.Figure;

public class Item_Stylesheet {

	private String type;
	private boolean ordered;
	private String bullet;
	private String ID;
	private String FontFamily;
	private Integer FontSize;
	private Color rGBAcolor;
	private Color RGBBulletColor;
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
	private String Alignment;
	private String FontFamilyTTF;
	private String FontFamilyOTF;
	private String URL;
	private String UnitX;
	private String UnitY;
	private String UnitWidth;
	private String UnitHeight;
	private boolean oob;
	private String format;
	private Figure Figura;
	private Float Cross_Percentage;
	
	public Item_Stylesheet(String id)
	{
		type = "";
		ordered = false;
		bullet = "odd";
		ID = id;
		FontFamily = "";
		FontSize = 12;
		rGBAcolor = new Color(0, 0, 0, 0);
		RGBBulletColor = null;
		Bold = false;
		Italics = false;
		Underline = false;
		Position = "";
		PosX = 0f;
		PosY = 0f;
		Angle_Rotation = 0f;
		Width = 0f;
		Height = 0f;
		FitX = false;
		FitY = false;
		Alignment = null;
		FontFamilyTTF = null;
		FontFamilyOTF = null;
		UnitX = "mm";
		UnitY = "mm";
		UnitHeight = "mm";
		UnitWidth = "mm";
		oob = false;
		format = "";
		Figura = Figure.RETTANGOLO;
		Cross_Percentage = 0f;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
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
	 * @return the bullet
	 */
	public String getBullet() {
		return bullet;
	}
	/**
	 * @param bullet the bullet to set
	 */
	public void setBullet(String bullet) {
		this.bullet = bullet;
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
	 * @return the rGBBulletColor
	 */
	public Color getRGBBulletColor() {
		return RGBBulletColor;
	}
	/**
	 * @param rGBBulletColor the rGBBulletColor to set
	 */
	public void setRGBBulletColor(Color rGBBulletColor) {
		RGBBulletColor = rGBBulletColor;
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
	 * @return the alignment
	 */
	public String getAlignment() {
		return Alignment;
	}
	/**
	 * @param alignment the alignment to set
	 */
	public void setAlignment(String alignment) {
		Alignment = alignment;
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
	 * @return the fontFamilyOTF
	 */
	public String getFontFamilyOTF() {
		return FontFamilyOTF;
	}
	/**
	 * @param fontFamilyOTF the fontFamilyOTF to set
	 */
	public void setFontFamilyOTF(String fontFamilyOTF) {
		FontFamilyOTF = fontFamilyOTF;
	}
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
		Cross_Percentage = cross_Percentage;
	}
}
