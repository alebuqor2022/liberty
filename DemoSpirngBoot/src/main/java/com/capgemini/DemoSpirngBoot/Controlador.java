package com.capgemini.DemoSpirngBoot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping("/personas") // http://localhost:8080/personas
public class Controlador {
@Autowired
PersonaService servicio;
// @Autowired .... hace esto ...Dependency Injection
//public Controlador(PersonaService service) {
//	this.service=service;
//}
@GetMapping("/")
public String home() {
	return "index";
}

@GetMapping // tironeando info del backend
public List<Persona> listar(){
	return servicio.listar();
}

@GetMapping(path= {"/{id}"}) 
public Persona listarId(@PathVariable("id") int id) { //http://localhost:8080/personas/2
	return servicio.listarId(id);
}

@PostMapping
public Persona agregar(@RequestBody Persona p) {
	return servicio.add(p);
}

@PutMapping(path= {"/{id}"}) 
public Persona editar(@PathVariable("id") int id, @RequestBody Persona p) {
	p.setId(id);
	return servicio.edit(p);
}

@DeleteMapping(path= {"/{id}"}) 
public void delete(@PathVariable("id") int id) {
	servicio.delete(id);
}






}
