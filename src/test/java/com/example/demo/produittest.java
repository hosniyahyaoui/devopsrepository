package com.example.demo;


import static org.mockito.Mockito.when;

import org.apache.tomcat.util.http.parser.MediaType;
import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import com.example.demo.entities.Produit;

import com.example.demo.repositories.ProduitRepository;

import com.example.demo.services.IProduitService;

import com.example.demo.services.ProduitServiceImpl;




import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.Silent.class)
@ExtendWith(MockitoExtension.class)
@DataJpaTest 

@SpringBootTest(classes=DemoApplication.class)
public class produittest {
	@Mock
	ProduitRepository ProduitRepo;
	@InjectMocks
	ProduitServiceImpl rr;
    @Test
    @Order('1')
    public void Add() 
    {
    	ProduitRepository ProduitRepo;
    	
    	Produit pro=  new Produit();
    	pro.setPrix(120);
    	pro.setLibelleProduit("fdgdfgfd");
    	pro.setCodeProduit("code123");
    	pro.setIdProduit((long) 5);
    //	pro.setDateCreation(null);
    //	pro.setDateDerniereModification(null);

		when(rr.addProduit(pro)).thenReturn(pro);

    }
}

