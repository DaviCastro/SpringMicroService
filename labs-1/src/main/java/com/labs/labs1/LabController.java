package com.labs.labs1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author LopesCaD
 *
 */
@Controller
public class LabController {

	@RequestMapping("/")
	public String hi() {
		return "Oi";

	}

}
