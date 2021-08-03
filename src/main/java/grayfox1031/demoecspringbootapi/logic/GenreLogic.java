package grayfox1031.demoecspringbootapi.logic;

import com.fasterxml.jackson.databind.ObjectMapper;
import grayfox1031.demoecspringbootapi.Dto.GenreDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Component
//@RequiredArgsConstructor
public class GenreLogic {

//    private final RestTemplate restTemplate;

    @Autowired
    RestTemplate restTemplate = new RestTemplate();

    private static final String URL = "https://app.rakuten.co.jp/services/api/IchibaGenre/Search/20140222?format=json&genreId=0&applicationId=1011354982917407655";
    public GenreDto getGenre() throws IOException {

//        String URL = "https://app.rakuten.co.jp/services/api/IchibaGenre/Search/20140222?format=json&genreId=0&applicationId=1011354982917407655";


        String response = restTemplate.getForObject(URL, String.class);
        ObjectMapper mapper = new ObjectMapper();
        GenreDto genre = mapper.readValue(response, GenreDto.class);

        return genre;
    }

}
