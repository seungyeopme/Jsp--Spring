package so.soft.com;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home(Model model) {
		return "home";
	}
	@RequestMapping("/du")
	public String du(Model model) {
		return "du";
	}
	@RequestMapping(value="/seung", method=RequestMethod.GET)
	public String seung(Model model) {
		return "seung";
	}
}