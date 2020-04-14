package com.tanovait.spring.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisInfoContributor;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

   ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();

    @Override
    public String sayAJoke() {
        return quotes.getRandomQuote();
    }
}
