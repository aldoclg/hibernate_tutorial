package br.unesp.rc.scrumboard.controller;


import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import br.unesp.rc.scrumboard.model.User;
import br.unesp.rc.scrumboard.repository.UserRepository;


@Controller
@RequestMapping("/scrumboard")
public class LoginController {
	
	@Autowired
	private UserRepository userRepo;
	
	@RequestMapping("/")
    public String login(Model model) {	 
		model.addAttribute("user", new User());
        return "login";
    }
	
	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public String enter(@Valid User user) {
		System.out.print("\n" + user);
		if (userRepo.findOne(user.getEmail()) != null) {
			return "/home";
		} else {
			throw new EntityNotFoundException(user.getEmail() + " not exits...");
		}	
	}
}
