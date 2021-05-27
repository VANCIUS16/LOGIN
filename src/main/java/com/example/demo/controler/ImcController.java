package com.example.demo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.interfaces.IMCRepository;
import com.example.demo.modelo.IMC;

@RestController
@RequestMapping("/api/imc")
public class ImcController {
	@Autowired
	IMCRepository repository;
	
	@GetMapping("/{id}")
	private List<IMC> listar(@PathVariable(value="id") Long id){
		return repository.findByIdUser(id);
	}
}