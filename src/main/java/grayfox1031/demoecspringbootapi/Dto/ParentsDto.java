package grayfox1031.demoecspringbootapi.Dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class ParentsDto {

    private ParentDto parent;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
