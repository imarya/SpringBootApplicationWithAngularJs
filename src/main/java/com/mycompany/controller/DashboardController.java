package com.mycompany.controller;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DashboardController {

	@RequestMapping("/getCurrentDate")
	public LocalDate getServerDate() {
		return LocalDate.now();
	}
}
