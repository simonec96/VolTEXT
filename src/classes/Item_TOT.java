package classes;

import java.awt.Color;
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
	 * @param fit
	 * @param layer
	 * @param text
	 * @param fontFamilyTTF
	 * @param uRL
	 */
	public Item_TOT(String t, boolean ordered, List<String> items, String iD, String fontFamily, Integer fontSize,
			Color rGBAcolor, boolean bold, boolean italics, boolean underline, String position, Float posX, Float posY,
			Float angle_Rotation, Float width, Float height, boolean fit, Integer layer, String text,
			String fontFamilyTTF, String uRL) {
		super();
		this.type = t;
		this.ordered = ordered;
		this.items = items;
		ID = iD;
		FontFamily = fontFamily;
		FontSize = fontSize;
		this.rGBAcolor = rGBAcolor;
		Bold = bold;
		Italics = italics;
		Underline = underline;
		Position = position;
		PosX = posX;
		PosY = posY;
		Angle_Rotation = angle_Rotation;
		Width = width;
		Height = height;
		Fit = fit;
		Layer = layer;
		Text = text;
		FontFamilyTTF = fontFamilyTTF;
		URL = uRL;
	}
	private String type;
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
	private boolean Fit;
	private Integer Layer;
	private String Text;
	private String FontFamilyTTF;
	private String URL;
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
	 * @return the fit
	 */
	public boolean isFit() {
		return Fit;
	}
	/**
	 * @param fit the fit to set
	 */
	public void setFit(boolean fit) {
		Fit = fit;
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

}