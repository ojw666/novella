package sm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class EnterController {
	@RequestMapping("/")
	@ResponseBody
	public String adminMallLoginPage() {return  "login/user";}
}
