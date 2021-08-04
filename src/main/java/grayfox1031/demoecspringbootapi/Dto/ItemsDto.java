package grayfox1031.demoecspringbootapi.Dto;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
public class ItemsDto {

    private List<ItemDto> items = null;
    private Integer pageCount;
    private List<String> TagInformation = null;
    private Integer hits;
    private Integer last;
    private Integer count;
    private Integer page;
    private Integer carrier;
    private List<String> GenreInformation = null;
    private Integer first;

//    @JsonIgnore
    @JsonIgnoreProperties(ignoreUnknown=true)
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
