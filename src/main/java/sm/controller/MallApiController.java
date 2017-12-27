package sm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import sm.dao.PictureMapper;
import sm.entity.Picture;

@Controller
@RequestMapping("/api/mall")
public class MallApiController {
	@Autowired 
	private PictureMapper pictureMapper;
	
	@RequestMapping("/img")
	@ResponseBody
	public Picture picture(HttpServletRequest req, HttpServletResponse resp) {
		resp.setHeader("Access-Control-Allow-Origin", "*");
		return null;
	}
	
	
}
