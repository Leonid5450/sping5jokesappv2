package guru.springframework.sping5jokesappv2.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.sping5jokesappv2.services.JokeService;

@Controller
public class JokeController {

	private JokeService jokeServce;

	
	public JokeController(JokeService jokeServce) {
		super();
		this.jokeServce = jokeServce;
	}
	
	@RequestMapping({"/", ""})
    public String showJokes(Model model) {
    	
    	model.addAttribute("joke",jokeServce.getJoke());
    	
    	return "index";
    }
	
}
