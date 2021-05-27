package com.example.demo.interfaceService;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaces.IMCRepository;
import com.example.demo.modelo.IMC;

@Service
public class IMCService{
	@Autowired
    private IMCRepository repository;
	
	public void save(IMC imcData) {
		Float imc = 0.0f;
		imc =  imcData.getPeso() / (imcData.getEstatura()*imcData.getEstatura());
		imcData.setImc(imc);
		
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formater = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		imcData.setFecha(formater.format(now));
		
		repository.save(imcData);
    }

}
