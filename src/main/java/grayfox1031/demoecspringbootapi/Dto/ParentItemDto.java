package grayfox1031.demoecspringbootapi.Dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ParentItemDto {

    @JsonProperty("Items")
    private List<ItemsDto> items;
    private Integer pageCount;
    @JsonProperty("TagInformation")
    private List<String> tagInformation;
    private Integer hits;
    private Integer last;
    private Integer count;
    private Integer page;
    private Integer carrier;
    @JsonProperty("GenreInformation")
    private List<String> genreInformation;
    private Integer first;
}
