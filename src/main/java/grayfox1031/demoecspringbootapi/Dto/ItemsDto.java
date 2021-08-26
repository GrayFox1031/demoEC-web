package grayfox1031.demoecspringbootapi.Dto;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnore;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ItemsDto {

    @JsonProperty("Item")
    private ItemDto item;
//    private Integer pageCount;
//    private List<String> TagInformation;
//    private Integer hits;
//    private Integer last;
//    private Integer count;
//    private Integer page;
//    private Integer carrier;
//    private List<String> GenreInformation;
//    private Integer first;

//    @JsonIgnore
    @JsonIgnoreProperties(ignoreUnknown=true)
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
