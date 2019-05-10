package ua.koslan.example_first.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ua.koslan.example_first.repositories.GenreRepository;

@Controller
public class GenreController {
	@Autowired
	private GenreRepository repo;
	
	@GetMapping("/genres")
	public String getGentres(Model model) {
		model.addAttribute("genres", repo.findAll());
		return "genres";
	}
}
