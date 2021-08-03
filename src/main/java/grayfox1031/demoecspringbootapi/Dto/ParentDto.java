package grayfox1031.demoecspringbootapi.Dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;


@Data
public class ParentDto {

    private Integer genreLevel;
    private String genreName;
    private Integer genreId;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
