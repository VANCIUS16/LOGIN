package com.example.demo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.interfaceService.IMCService;
import com.example.demo.interfaceService.UserRepository;
import com.example.demo.interfaces.IMCRepository;
import com.example.demo.modelo.IMC;

import com.example.demo.modelo.User;

@Controller
public class BodyController {
	@Autowired
    private UserRepository userRepository;
	
	@Autowired
    private IMCService imcService;
	
	@GetMapping("/")
	public String principal(Model model,Authentication authentication) {
		User user = userRepository.getUserByUserName(authentication.getName());
		System.out.println(user.getId());
		model.addAttribute("user",user);
		return "Principal";
	}
	
	@PostMapping("/imc/save")
	public String save(@ModelAttribute IMC datauser) {
		imcService.save(datauser);
		return "redirect:/";
	}
}
