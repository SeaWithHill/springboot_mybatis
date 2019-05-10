package com.example.demo.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/status")
public class StatusController {

	private String username;
	private String password;

	@RequestMapping("")
    @ResponseBody
	public String getStatus() {
		return "status 200  !";
	}

}
