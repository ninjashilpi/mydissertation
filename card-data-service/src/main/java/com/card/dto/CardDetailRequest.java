package com.card.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import javax.validation.constraints.Positive;

@Data
@ApiModel(value ="CardDetailRequest")
public class CardDetailRequest {

  @Positive(message = "Id Must be positive")
  @ApiModelProperty(value = "Id of card", required = true)
  private Long id;



}
