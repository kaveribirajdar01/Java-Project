package com.nursery.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nursery.Service.NurseryService;
import com.nursery.entity.Nursery;

@RestController
public class NurseryController {

	@Autowired
	NurseryService nurseryService;
	
	@PostMapping(value="/nursery")
	public Nursery addNursery(@RequestBody Nursery nursery)
	{
		return nurseryService.addNursery(nursery);
		
	}
	

	@GetMapping(value="/nursery")
	public List<Nursery> getAllNursery()
	{
		return nurseryService.findAllNursery();
		
	}	
	
	@GetMapping(value="/nursery/{id}")
	public List<Nursery> findNurseryById(@PathVariable int id)
	{
		return nurseryService.findNurseryById(id);	
	}
	
	@DeleteMapping(value="/nursery/{id}")
	public String deleteNursery(@PathVariable int id)
	{
		 nurseryService.deleteNursery(id);
		return "Plant Deleted";	
	}	
	
	@PutMapping(value="/nursery/{id}")
	public Nursery updateNursery(@RequestBody Nursery nursery)
	{
		return nurseryService.updateNursery(nursery);	
	}
}
