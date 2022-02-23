package com.codingdojo.peru.full_time_2022.date_time_visualizer.controllers;

import java.util.Date;
import java.util.Locale;
import java.text.SimpleDateFormat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	private Date date = new Date();
	private Locale locale = new Locale("es","PE");
	
	@RequestMapping("/")
	public String index() {
	    return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		SimpleDateFormat formatter = new SimpleDateFormat("EEEE, d 'de' MMMM, 'de' YYYY", locale);
		model.addAttribute("date", formatter.format(date));
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		SimpleDateFormat formatter = new SimpleDateFormat("h:mm a", locale);
		model.addAttribute("time", formatter.format(date));
		return "time.jsp";
	}
}
