package classes;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Item_TOT {
	/**
	 * @param ordered
	 * @param items
	 * @param iD
	 * @param fontFamily
	 * @param fontSize
	 * @param rGBAcolor
	 * @param bold
	 * @param italics
	 * @param underline
	 * @param position
	 * @param posX
	 * @param posY
	 * @param angle_Rotation
	 * @param width
	 * @param height
	 * @param fitx
	 * @param fity
	 * @param alignment
	 * @param layer
	 * @param text
	 * @param fontFamilyTTF
	 * @param uRL
	 */
	public Item_TOT(String t, boolean ordered, String bullet, List<String> items, String iD, String fontFamily, Integer fontSize,
			Color rGBAcolor, Color RGBBulletColor, boolean bold, boolean italics, boolean underline, String position, Float posX, Float posY,
			Float angle_Rotation, Float width, Float height, boolean fitX, boolean fitY,String align, Integer layer, ArrayList<String> text,
			String fontFamilyTTF,String fontFamilyOTF, String uRL, String ux, String uy, String uw, String uh) {
		super();
		this.type = t;
		this.ordered = ordered;
		this.setBullet(bullet);
		this.items = items;
		ID = iD;
		FontFamily = fontFamily;
		FontSize = fontSize;
		this.rGBAcolor = rGBAcolor;
		this.RGBBulletColor = RGBBulletColor;
		Bold = bold;
		Italics = italics;
		Underline = underline;
		Position = position;
		PosX = posX;
		PosY = posY;
		Angle_Rotation = angle_Rotation;
		Width = width;
		Height = height;
		setFitX(fitX);
		setFitY(fitY);
		setAlignment(align);
		Layer = layer;
		Text = text;
		FontFamilyTTF = fontFamilyTTF;
		setFontFamilyOTF(fontFamilyOTF);
		URL = uRL;
		setUnitX(ux);
		setUnitY(uy);
		setUnitHeight(uh);
		setUnitWidth(uw);
	}
	private String type;
	private boolean ordered;
	private String bullet;
	private List<String> items;
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
	private Integer Layer;
	private ArrayList<String> Text;
	private String FontFamilyTTF;
	private String FontFamilyOTF;
	private String URL;
	private String UnitX;
	private String UnitY;
	private String UnitWidth;
	private String UnitHeight;
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
	public Color getRGBAcolor() {
		return rGBAcolor;
	}
	/**
	 * @param rGBAcolor the rGBAcolor to set
	 */
	public void setRGBAcolor(Color rGBAcolor) {
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
	 * @return the text
	 */
	public ArrayList<String> getText() {
		return Text;
	}
	/**
	 * @param text the text to set
	 */
	public void setText(ArrayList<String> text) {
		Text = text;
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
