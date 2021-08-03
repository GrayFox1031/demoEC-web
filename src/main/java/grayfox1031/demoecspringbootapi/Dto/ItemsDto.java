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

    private List<ItemDto> item;

//    @JsonIgnore
    @JsonIgnoreProperties(ignoreUnknown=true)
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
