package grayfox1031.demoecspringbootapi.logic;

import com.fasterxml.jackson.databind.ObjectMapper;
import grayfox1031.demoecspringbootapi.Dto.ParentItemDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import grayfox1031.demoecspringbootapi.Dto.ItemsDto;

import java.io.IOException;

@Component
//@RequiredArgsConstructor
public class ItemsLogic {

    @Autowired
    RestTemplate restTemplate = new RestTemplate();

    private static final String URL = "https://app.rakuten.co.jp/services/api/IchibaItem/Search/20170706?format=json&keyword=楽天&genreId=551167&applicationId=1011354982917407655";
    public ParentItemDto getItemList() throws IOException {

        String response = restTemplate.getForObject(URL, String.class);
        ObjectMapper mapper = new ObjectMapper();
        ParentItemDto items = mapper.readValue(response, ParentItemDto.class);

        return items;
    }
}
