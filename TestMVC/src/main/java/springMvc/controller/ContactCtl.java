package springMvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springMvc.Model.User;
import springMvc.Service.*;

@Controller
public class ContactCtl {

	@Autowired
	private UserService userService;

	@ModelAttribute
	public void commomadata(Model m) {

		m.addAttribute("header", "learn coding with fun ");

	}

	@RequestMapping("/contact")
	public String showform() {

		return "contact";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {
		
		this.userService.createUser(user);

		return "success";
	}

	/*
	 * @RequestParam("email") String email,
	 * 
	 * @RequestParam("Username") String name,
	 * 
	 * @RequestParam("pwd")String pwd,Model model)
	 * 
	 * { System.out.println(email+" "+name+""+pwd);
	 * 
	 * User user=new User(); user.setEmail(email); user.setUsername(name);
	 * user.setPassword(pwd);
	 */
	// model.addAttribute("user", user);

	/*
	 * String email = req.getParameter("email"); String name =
	 * req.getParameter("Username"); String pwd = req.getParameter("password");
	 * 
	 * System.out.println(email+" "+name+" "+pwd);
	 */

}
