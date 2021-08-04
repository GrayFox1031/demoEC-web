package grayfox1031.demoecspringbootapi.logic;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import grayfox1031.demoecspringbootapi.Dto.ItemsDto;

import java.io.IOException;

@Component
//@RequiredArgsConstructor
public class ItemsLogic {

//    private final RestTemplate restTemplate;
    @Autowired
    RestTemplate restTemplate = new RestTemplate();

    private static final String URL = "https://app.rakuten.co.jp/services/api/IchibaItem/Search/20170706?format=json&keyword=楽天&genreId=551167&applicationId=1011354982917407655";
    public ItemsDto getItemList() throws IOException {

        String response = restTemplate.getForObject(URL, String.class);

        System.out.println("Test2:" + response);

        ObjectMapper mapper = new ObjectMapper();
        ItemsDto items = mapper.readValue(response, ItemsDto.class);

        return items;
    }
}
