package org.knowm.xchange.coinsuper.dto.trade;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;


public class CoinsuperOrder {

@JsonProperty("orderNo")
private String orderNo;

/**
* No args constructor for use in serialization
* 
*/
public CoinsuperOrder() {
}

/**
* 
* @param orderNo
*/
public CoinsuperOrder(String orderNo) {
	super();
	this.orderNo = orderNo;
}

@JsonProperty("orderNo")
public String getOrderNo() {
	return orderNo;
}

@JsonProperty("orderNo")
public void setOrderNo(String orderNo) {
   this.orderNo = orderNo;
}


@Override
public String toString() {
  return new ToStringBuilder(this).append("orderNo", orderNo).toString();
}

}