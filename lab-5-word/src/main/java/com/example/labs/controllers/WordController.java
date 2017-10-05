package com.example.labs.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Davidson
 *
 */

@RestController
public class WordController {

	@Value("${words}")
	private String words;

	// TESTE HARD CODED PARA 2 INSTANCIAS TESTE RIBBON
	// private String words = "icicle,refrigerator,blizzard,snowball";

	@GetMapping("/")
	public @ResponseBody String getWord() {

		String[] wordArray = words.split(",");
		int i = (int) Math.round(Math.random() * (wordArray.length - 1));
		return wordArray[i];

	}

}
