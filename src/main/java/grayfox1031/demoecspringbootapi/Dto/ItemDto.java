package grayfox1031.demoecspringbootapi.Dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
//@JsonIgnoreProperties(ignoreUnknown=true)
public class ItemDto {

    private List<ImageUrlDto> mediumImageUrls;
    @JsonProperty("pointRate")
    private Integer pointRate;
    private Integer shopOfTheYearFlag;
    private Integer affiliateRate;
    private Integer shipOverseasFlag;
    private Integer asurakuFlag;
    private String endTime;
    private Integer taxFlag;
    private String startTime;
    private String itemCaption;
    private String catchcopy;
    private List<Integer> tagIds = null;
    private List<ImageUrlDto> smallImageUrls = null;
    private String asurakuClosingTime;
    private Integer imageFlag;
    private Integer availability;
    private String shopAffiliateUrl;
    private String itemCode;
    private Integer postageFlag;
    private String itemName;
    private Integer itemPrice;
    private String pointRateEndTime;
    private String shopCode;
    private String affiliateUrl;
    private Integer giftFlag;
    private String shopName;
    private Integer reviewCount;
    private String asurakuArea;
    private String shopUrl;
    private Integer creditCardFlag;
    private Integer reviewAverage;
    private String shipOverseasArea;
    private String genreId;
    private String pointRateStartTime;
    private String itemUrl;

//    @JsonIgnore
    @JsonIgnoreProperties(ignoreUnknown=true)
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
