package sm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shop")
public class ShopPagesController {
	public ShopPagesController() {}
	
	/**
	 * �̳���ҳ
	 * @ywh
	 */
	@RequestMapping("/index")
	public String adminMallIndexPage() {return  "index/index";}
}
