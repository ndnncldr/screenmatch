package br.com.alura.screenmatch;

import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.service.ConsumirApi;
import br.com.alura.screenmatch.service.ConverterDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumirApi = new ConsumirApi();
		var json =consumirApi.obterDados("https://www.omdbapi.com/?t=doctor%20who&apikey=484552e4");
		System.out.println(json);
		ConverterDados converterDados = new ConverterDados();
		DadosSerie serie = converterDados.obterDados(json, DadosSerie.class);
		System.out.println(serie);
	}

}
