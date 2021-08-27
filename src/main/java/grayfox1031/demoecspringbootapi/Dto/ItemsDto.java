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

//    @JsonIgnore
    @JsonIgnoreProperties(ignoreUnknown=true)
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
