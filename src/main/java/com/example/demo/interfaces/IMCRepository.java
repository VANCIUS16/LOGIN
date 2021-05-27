package com.example.demo.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.modelo.IMC;

public interface IMCRepository extends CrudRepository<IMC, Long>{
	@Query("SELECT imc FROM IMC imc WHERE imc.idUser = :iduser")
	public List<IMC> findByIdUser(@Param("iduser") Long idUser); 
}
