package com.example.ExposeAPI.controller;

import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.ExposeAPI.model.ValuationData;


@RestController
@CrossOrigin
public class TestController {
	
	@Autowired
	ValuationData vd;
	
	@RequestMapping(value = "/data", method = RequestMethod.GET)
	public ValuationData firstService() {
		return vd;
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/newData", consumes = { MediaType.APPLICATION_JSON_VALUE })
	public void getMessagesFromClient(@RequestBody ValuationData valuationData) {
		System.out.println("Check this received :-> " + valuationData.toString());
		vd = valuationData;
		//return valuationData;
	}
	
}
