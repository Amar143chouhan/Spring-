package springMVC.Controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	
	/*
	 * @RequestMapping("/") 
	 * 
	 * public String home() {
	 * 
	 * System.out.println("this is about home");
	 * 
	 * return "index";
	 * 
	 * }
	 * 
	 *//*
	 * @RequestMapping("/about") 
	 * 
	 * public String about(Model model) {
	 * 
	 * System.out.println("this is about.....");
	 * 
	 * model.addAttribute("name","ankit sharma");
	 * 
	 * return "final";
	 * 
	 * }
	 */
	
	@RequestMapping("/clickHere")
	public String redirect() {

		return "viewpage";
	}

	@RequestMapping("/helloagain")
	public String display(Model model) {

		model.addAttribute("name", "ankit sharma");
		
		model.addAttribute("id",1254);
        
		List<String> l = new ArrayList();
		
		l.add("vivek");
		l.add("ankit");
		l.add("rohan");
		l.add("vikas");
		l.add("babu");
		
		model.addAttribute("f",l);
		
		return "help";
	}
    */
	@RequestMapping(path= "/help",method=RequestMethod.GET)
	public ModelAndView help() {
		
		ModelAndView mv =new ModelAndView();
		
		
		mv.addObject("name","my name is john cena");
		
		mv.addObject("rollno",12345);
		
		LocalDateTime ldt = LocalDateTime.now();
		
		List<Integer> list =new ArrayList<Integer>();
		
		list.add(123);
		list.add(254);
		list.add(546);
		list.add(859);
		list.add(985);
		
	    
		
		mv.addObject("list",list);
		mv.addObject("time", ldt);
		
		mv.setViewName("help");
		
		
		
		return mv;
		
		
		
	}
}
