package classes;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Item_Container {
	private DIV_Item div;
	private IMG_Item img;
	private LIST_Item list;
	private PAGE_Item page;
	private PDF_Item doc;
	private TXT_Item txt;
	private List<Item_TOT> list_tot;
	private Map<String, Item_Stylesheet> dictionary_style;
	
	
	
	/**
	 * 
	 */
	public Item_Container() {
		super();
		setList_tot(new LinkedList<Item_TOT>());
		setDictionary_style(new HashMap<String, Item_Stylesheet>());
	}
	/**
	 * @return the div
	 */
	public DIV_Item getDiv() {
		return div;
	}
	/**
	 * @param div the div to set
	 */
	public void setDiv(DIV_Item div) {
		this.div = div;
	}
	/**
	 * @return the img
	 */
	public IMG_Item getImg() {
		return img;
	}
	/**
	 * @param img the img to set
	 */
	public void setImg(IMG_Item img) {
		this.img = img;
	}
	/**
	 * @return the list
	 */
	public LIST_Item getList() {
		return list;
	}
	/**
	 * @param list the list to set
	 */
	public void setList(LIST_Item list) {
		this.list = list;
	}
	/**
	 * @return the page
	 */
	public PAGE_Item getPage() {
		return page;
	}
	/**
	 * @param page the page to set
	 */
	public void setPage(PAGE_Item page) {
		this.page = page;
	}
	/**
	 * @return the doc
	 */
	public PDF_Item getDoc() {
		return doc;
	}
	/**
	 * @param doc the doc to set
	 */
	public void setDoc(PDF_Item doc) {
		this.doc = doc;
	}
	/**
	 * @return the txt
	 */
	public TXT_Item getTxt() {
		return txt;
	}
	/**
	 * @param txt the txt to set
	 */
	public void setTxt(TXT_Item txt) {
		this.txt = txt;
	}
	/**
	 * @return the list_tot
	 */
	public List<Item_TOT> getList_tot() {
		return list_tot;
	}
	/**
	 * @param list_tot the list_tot to set
	 */
	public void setList_tot(List<Item_TOT> list_tot) {
		this.list_tot = list_tot;
	}
	/**
	 * @return the dictionary_style
	 */
	public Map<String, Item_Stylesheet> getDictionary_style() {
		return dictionary_style;
	}
	/**
	 * @param dictionary_style the dictionary_style to set
	 */
	public void setDictionary_style(Map<String, Item_Stylesheet> dictionary_style) {
		this.dictionary_style = dictionary_style;
	}

}
