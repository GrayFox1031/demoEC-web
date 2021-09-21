package grayfox1031.demoecspringbootapi.Dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;


@Data
public class ParentDto {

    @JsonProperty("genreLevel")
    private Integer genreLevel;
    private String genreName;
    private Integer genreId;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
