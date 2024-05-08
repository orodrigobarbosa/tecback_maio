package br.com.fujideia.iesp.tecback.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name="personagens", url = "http://localhost:9191")
public interface PersonagensClient {

    @GetMapping("/personagens")
    List<String> listarPersonagens(String personagens);
}
