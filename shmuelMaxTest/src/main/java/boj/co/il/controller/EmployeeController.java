package boj.co.il.controller;

import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

// yosilev 21-Jan-2018

@Controller
@RequestMapping(value="/shnuel")
public class EmployeeController {
	
	static Logger logger= Logger.getLogger(EmployeeController.class);

	//-----------------------------------------------------------------------------------------------------------------
	/**
	 *   URL: http://localhost:8080/shnuel/test
	 */
	@RequestMapping(value="/test", method=RequestMethod.GET, produces = "application/json; charset=utf-8")
	public @ResponseBody String test(){
		return "EmployeeController OK " + new Date();
	}
}