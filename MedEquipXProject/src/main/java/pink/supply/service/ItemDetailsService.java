package pink.supply.service;

import java.util.ArrayList;

import pink.supply.model.ItemDetailsVO;

public interface ItemDetailsService {
	
	public ArrayList<ItemDetailsVO> callItemDetails(ItemDetailsVO itDetails);
	
}