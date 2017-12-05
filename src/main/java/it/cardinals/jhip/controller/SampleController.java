package it.cardinals.jhip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import it.cardinals.jhip.service.PrimaTabService;

@Controller
@EnableAutoConfiguration
public class SampleController {

	@Autowired
	private PrimaTabService serv; 
	
    @RequestMapping("/testMarco")
    @ResponseBody
    String home() {
    	
    	serv.getPrtimaTabella();
    	
        return "Hello Worlddddddddddddddddddddd!";
    }


}