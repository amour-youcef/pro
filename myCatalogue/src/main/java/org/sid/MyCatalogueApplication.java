package org.sid;

import java.util.List;

import org.sid.dao.ProduitRepository;
import org.sid.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

@SpringBootApplication
public class MyCatalogueApplication implements CommandLineRunner{
    
	@Autowired
	private ProduitRepository produitRepository;
	public static void main(String[] args) {
		SpringApplication.run(MyCatalogueApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	produitRepository.save(new Produit(1,"ordi portable ",6500,25));
    produitRepository.save(new Produit(2,"imprimante hp ",500,60));
    produitRepository.save(new Produit(3,"smartphon s9",600,70));
    
    Page<Produit> produits = produitRepository.findAll(PageRequest.of(0, 2));
    
    System.out.println(produits.getSize());
    System.out.println(produits.getTotalElements());
    System.out.println(produits.getTotalPages());
    
    produits.getContent().forEach(p->{
    	System.out.println(p.toString());
    });
}
}
