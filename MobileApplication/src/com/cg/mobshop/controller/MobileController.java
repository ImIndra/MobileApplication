package com.cg.mobshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.mobshop.dto.Mobiles;
import com.cg.mobshop.service.MobileService;

@Controller
public class MobileController 
{
	@Autowired
	MobileService service;
	
	@RequestMapping("getmoblist")
	public String showMobileList(Model model)
	{
		List<Mobiles> list= service.getAllMobiles();
		model.addAttribute("list",list);
		return "home";
	}
}
