package org.sid.web;

import java.util.List;

import org.sid.dao.ProduitRepository;
import org.sid.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProduitController {
	
	@Autowired
	private ProduitRepository produitRepository;
	
	@GetMapping(path="/index")
	public String index() {
		
		return "index";
	}
	
	@GetMapping(path="/products")
	public String products() {
		List<Produit> produits = produitRepository.findAll();
		return "products";
	}
}
