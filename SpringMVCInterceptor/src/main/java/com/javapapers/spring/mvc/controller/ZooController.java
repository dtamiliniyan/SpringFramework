package com.javapapers.spring.mvc.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javapapers.spring.mvc.Animal;
import com.javapapers.spring.mvc.AnimalService;

@Controller
public class ZooController {

	protected AnimalService animalService = new AnimalService();

	@RequestMapping(value = "/AnimalList", method = RequestMethod.GET)
	public String getAnimals(Model model) {
		List<Animal> animalList = animalService.getAnimalList();
		model.addAttribute("animalList", animalList);
		return "AnimalList";
	}

}
