package viacep.demo_cep_api.consulta_cep;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("consulta-cep")
public class ConsultaCepApi {

    @GetMapping("{cep}")
    public CepResultDTO consultaCep(@PathVariable("cep") String cep) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://viacep.com.br/ws/" + cep + "/json/";
        ResponseEntity<CepResultDTO> resp =
                restTemplate.getForEntity(url, CepResultDTO.class);
        return resp.getBody();
    }
}

