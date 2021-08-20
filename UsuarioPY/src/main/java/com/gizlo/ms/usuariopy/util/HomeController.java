package com.gizlo.ms.usuariopy.util;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 
 * @author fherrera
 *
 */
@Controller
public class HomeController {
	
	@GetMapping(value = "/")
	public String index() {
		return "redirect:swagger-ui.html";
	}

}
