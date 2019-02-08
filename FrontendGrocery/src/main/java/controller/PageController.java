package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greetings", "Intro to spring MVC");
		return mv;
	}

	/*
	 * static
	 * 
	 * @RequestMapping(value="/test") public ModelAndView
	 * test(@RequestParam(value="greetings", required = false) String greetings) {
	 * if(greetings == null) {
	 * 
	 * greetings = "hello"; } ModelAndView mv = new ModelAndView("page");
	 * mv.addObject("greetings",greetings); return mv; }
	 */

	/* dynamic */

	@RequestMapping(value = "/test/{greetings}")
	public ModelAndView test(@PathVariable("greetings") String greetings) {
		if (greetings == null) {

			greetings = "hello";
		}
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greetings", greetings);
		return mv;
	}

}
