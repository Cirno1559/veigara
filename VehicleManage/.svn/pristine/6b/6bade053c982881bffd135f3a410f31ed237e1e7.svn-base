package com.hxzy.controller.authority;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hxzy.util.ValidateImage;


@Controller
@RequestMapping(value="")
public class ValidateImageController {
	/**
	 * 生成验证码的方法
	 * url:code.do
	 */
	@RequestMapping(value="code")
	public void code(HttpServletRequest req,HttpServletResponse resp){
		
		try {
			//生成图片对象
			ValidateImage img = new ValidateImage(150, 40, 4, 30);
			
			//获取验证码
			String code = img.getRandomCode().toString();
			
			//把验证码保存到session
		    HttpSession session = req.getSession();
		    
		    session.setAttribute("codeValue", code);
		    
		    //响应内容
		    resp.setHeader("Pragme", "no-cache");
		    resp.setHeader("Cache-Control", "no-cache");
		    
		    resp.setDateHeader("Expires", 0);
		    resp.setContentType("image-jpeg");
		    
		    ServletOutputStream sos = resp.getOutputStream();
		    ImageIO.write(img.getImage(), "jpeg", sos);
		    
		    //关闭
		    sos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
