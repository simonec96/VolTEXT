package classes;

import java.util.List;

public class Item {
	private Item parentItem;
	private List<? extends Item> childrenItems;
	
	public Item() {
		super();
	}
	
	public Item(Item parentItem, List<Item> childrenItems) {
		super();
		this.parentItem = parentItem;
		this.setChildrenItems(childrenItems);
	}
	/**
	 * @return the parentItem
	 */
	public Item getParentItem() {
		return parentItem;
	}
	/**
	 * @param parentItem the parentItem to set
	 */
	public void setParentItem(Item parentItem) {
		this.parentItem = parentItem;
	}

	/**
	 * @return the childrenItems
	 */
	public List<? extends Item> getChildrenItems() {
		return childrenItems;
	}

	/**
	 * @param childrenItems the childrenItems to set
	 */
	public void setChildrenItems(List<? extends Item> childrenItems) {
		this.childrenItems = childrenItems;
	}

}
