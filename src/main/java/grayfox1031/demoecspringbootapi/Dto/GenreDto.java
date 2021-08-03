package grayfox1031.demoecspringbootapi.Dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class GenreDto {

    private List<ParentsDto> parents = null;
    private CurrentDto current;
    private List<ChildrenDto> children = null;
    private List<TagGroupsDto> tagGroups;
    private List<BrothersDto> brothers;


    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
