package com.example.demo.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/status")
public class StatusController {

	private String username;
	private String password;
//	    public  getStatus(){
//	        return new JsonResult("200","成功",new Date());
//	    }

}
