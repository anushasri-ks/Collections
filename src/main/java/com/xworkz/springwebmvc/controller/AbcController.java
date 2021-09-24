package com.xworkz.springwebmvc.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class AbcController {

	public AbcController() {
		super();
		System.out.println(this.getClass().getSimpleName() + " bean created");
	}

	@RequestMapping(value = "/abc.xworkz")
	public void onClicked() {
		System.out.println("Invoked onClicked");
	}

	@RequestMapping(value = "/xyz.xworkz")
	public void onClicked1() {
		System.out.println("Invoked onClicked1");
	}

	@RequestMapping(value = "/pqr.xworkz")
	public void onClicked2() {
		System.out.println("Invoked onClicked2");
	}
}