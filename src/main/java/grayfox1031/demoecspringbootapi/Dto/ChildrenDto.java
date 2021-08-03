package grayfox1031.demoecspringbootapi.Dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class ChildrenDto {

    private ChildDto child;

 @JsonIgnore
 private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
