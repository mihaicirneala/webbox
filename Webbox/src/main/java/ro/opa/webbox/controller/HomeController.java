package ro.opa.webbox.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ro.opa.webbox.service.BoxService;

@Controller
public class HomeController {
	
	private static final Logger log = Logger.getLogger(HomeController.class);
	
	@Autowired
	private BoxService boxService;

	@RequestMapping(value="/", method = RequestMethod.GET)
    public ModelAndView home(HttpServletRequest request, Model model)
    {
    	ModelAndView modelAndView = new ModelAndView("index");
    	log.debug("test");
    	return modelAndView;
    }
	
	@RequestMapping(value="/query", method = RequestMethod.GET)
	public ModelAndView query(HttpServletRequest request)
	{
		ModelAndView modelAndView = new ModelAndView("json");
		modelAndView.addObject("msg", boxService.test());
		return modelAndView;
	}

}