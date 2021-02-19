package classes;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

public class Item_Container {
	private DIV_Item div;
	private IMG_Item img;
	private LIST_Item list;
	private PAGE_Item page;
	private PDF_Item doc;
	private TXT_Item txt;
	private PDDocument PDF_doc;
	private PDPage PDF_page;
	
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
	 * @return the pDF_doc
	 */
	public PDDocument getPDF_doc() {
		return PDF_doc;
	}
	/**
	 * @param pDF_doc the pDF_doc to set
	 */
	public void setPDF_doc(PDDocument pDF_doc) {
		PDF_doc = pDF_doc;
	}
	/**
	 * @return the pDF_page
	 */
	public PDPage getPDF_page() {
		return PDF_page;
	}
	/**
	 * @param pDF_page the pDF_page to set
	 */
	public void setPDF_page(PDPage pDF_page) {
		PDF_page = pDF_page;
	}
}
