package com.example.demo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.example.demo.interfaceService.IpersonaService;
import com.example.demo.interfaceService.UserRepository;
import com.example.demo.modelo.Persona;
import com.example.demo.modelo.User;

@Controller
@RequestMapping("/users")
public class UsersController {
	@Autowired
	private UserRepository service;
	
	@GetMapping
	public String listar(Model model) {
		Iterable<User> usuarios = service.findAll();
		model.addAttribute("usuarios", usuarios);
		return "UserList";
	}
	
	@GetMapping("/edit")
	public String editForm(Model model) {
		Iterable<User> usuarios = service.findAll();
		model.addAttribute("usuarios", usuarios);
		return "Nuevo";
	}
	
	@PostMapping("/save")
	public ModelAndView save(@ModelAttribute User user,ModelMap model) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String password = user.getPassword();
        String encondeString = encoder.encode(password);
		
        user.setPassword(encondeString);
        
		service.save(user);
		Iterable<User> usuarios = service.findAll();
		model.addAttribute("usuarios", usuarios);
		return new ModelAndView("redirect:/users",model);
	}
	
	@GetMapping("/crear")
	public ModelAndView createForm(ModelMap model) {
		Iterable<User> usuarios = service.findAll();
		model.addAttribute("usuarios", usuarios);
		return new ModelAndView("redirect:/users",model);
	}
	
	@GetMapping("/eliminar/{id}")
	public ModelAndView delete(@PathVariable(value="id") Long id,ModelMap model) {
		service.deleteById(id);
		Iterable<User> usuarios = service.findAll();
		model.addAttribute("usuarios", usuarios);
		return new ModelAndView("redirect:/users",model);
	}
}
