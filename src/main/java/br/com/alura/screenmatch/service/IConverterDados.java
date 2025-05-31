package br.com.alura.screenmatch.service;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface IConverterDados {
    <T> T obterDados(String json, Class<T> DadosSerie) throws JsonProcessingException;
}
