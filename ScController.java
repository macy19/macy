package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.po.Greens;
import com.service.ScService;

@Controller
public class ScController {

	@Autowired
	ScService service;
	@RequestMapping("/getgreensbydate")
	@ResponseBody
	public List<Greens> getGreensByDate(@RequestParam("begindate")String begindate,@RequestParam("enddate")String enddate){
		
		
		return service.getGreensByDate(begindate, enddate);
		
	}
}
