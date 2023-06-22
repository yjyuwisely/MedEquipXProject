package pink.supply.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import pink.supply.model.SuppliesListVO;
import pink.supply.service.SuppliesListService;
import pink.supply.service.itemReceivedService;

@Controller
public class itemReceiveController {
	
	private static final Logger logger = LoggerFactory.getLogger(itemReceiveController.class);

	
	@Autowired
	itemReceivedService itemReceivedSer;
	
	@PostMapping("itemReceived")
	public String itemReceivedpage(SuppliesListVO itemReceived) {
		itemReceivedSer.callitemReceivedList(itemReceived);
		return "redirect:/dashboard";
	}

}
