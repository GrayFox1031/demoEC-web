package grayfox1031.demoecspringbootapi.Dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.HashMap;
import java.util.Map;

public class BrothersDto {

    //HOGE
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
