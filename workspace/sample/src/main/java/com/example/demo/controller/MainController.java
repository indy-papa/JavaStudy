package com.example.demo.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	@RequestMapping(path = "/", method = {RequestMethod.GET})
	public String input(Model model) {
		Random rand = new Random();
		int num = rand.nextInt(100000000);
		model.addAttribute("power", num);
		return "scouter";
	}
	
}
