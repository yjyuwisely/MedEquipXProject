package pink.supply.service;

import pink.supply.model.ItemDetailsVO;

public interface ItemDetailsService {
	
	public ItemDetailsVO getItemDetailsByName(String name);
	public void toggleVisible(ItemDetailsVO vData);
	public void toggleVisibleYes(ItemDetailsVO vData);
	public ItemDetailsVO callImage(ItemDetailsVO imageCall);

}