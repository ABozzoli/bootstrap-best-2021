package org.generation.italy.controller;

import java.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController { // il controller è una normale classe java, che può avere attributi e costruttori

	@GetMapping
	public String index(Model model) { // Model è un'interfaccia di spring web (che non gli viene passata da noi ma in automatico)
		model.addAttribute("name", "Alessandro");
		return "index"; // l'"indirizzo" del file html che il programma sa di trovare nella cartella "templates"
	}
		
	@GetMapping("/movies")
	public String movies(Model model) {
		model.addAttribute("category", "Movies");
		model.addAttribute("list", Arrays.asList("The Power of the Dog", "Drive My Car", "Licorice Pizza", "The Worst Person in the World", "Memoria", "The French Dispatch", "Flee", "Petite Maman", "Passing", "C’mon C’mon"));
		return "list";
	}
	
	@GetMapping("/songs")
	public String songs(Model model) {
		model.addAttribute("category", "Songs");
		model.addAttribute("list", Arrays.asList("To Be Loved", "Darkest Hour", "Waiting on a war", "The Darkness", "Coloratura", "Campione dei Novanta", "Figlia", "Cosplayer", "T'Amo", "Coraline"));
		return "list";
	}
	
}
