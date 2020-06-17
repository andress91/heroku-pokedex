package com.humberto.springboot.pokedex.app.models.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


import com.humberto.springboot.pokedex.app.models.Quote;

@Component
public class Lectura {

	@Autowired
	private RestTemplate restTemplate;

	public Quote leer() {
		String url =  "https://pokeapi.co/api/v2/pokemon/";
		System.out.println("entre");
		Quote quote = restTemplate.getForObject(url, Quote.class);
		System.out.println(quote.getNext());
		return quote;
	}


}
