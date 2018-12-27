package com.binance.api.client.domain.market;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * A trade event for a symbol.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Trade {

  @JsonProperty("t")
  private long tradeId;

  @JsonProperty("p")
  private String price;

  @JsonProperty("q")
  private String quantity;

  @JsonProperty("T")
  private long tradeTime;

  @JsonProperty("m")
  private boolean isBuyerMaker;

  @JsonProperty("b")
  private String buyerOrderId;

  @JsonProperty("a")
  private String sellerOrderId;

  public long getTradeId() {
    return tradeId;
  }

  public void setTradeId(long tradeId) {
    this.tradeId = tradeId;
  }

  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public String getQuantity() {
    return quantity;
  }

  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }

  public long getTradeTime() {
    return tradeTime;
  }

  public void setTradeTime(long tradeTime) {
    this.tradeTime = tradeTime;
  }

  public boolean isBuyerMaker() {
    return isBuyerMaker;
  }

  public void setBuyerMaker(boolean buyerMaker) {
    isBuyerMaker = buyerMaker;
  }

    public String getBuyerOrderId() {
        return buyerOrderId;
    }

    public void setBuyerOrderId(String buyerOrderId) {
        this.buyerOrderId = buyerOrderId;
    }

    public String getSellerOrderId() {
        return sellerOrderId;
    }

    public void setSellerOrderId(String sellerOrderId) {
        this.sellerOrderId = sellerOrderId;
    }

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
        .append("tradeId", tradeId)
        .append("price", price)
        .append("quantity", quantity)
        .append("tradeTime", tradeTime)
        .append("isBuyerMaker", isBuyerMaker)
        .append("sellerOrderId", sellerOrderId)
        .append("buyerOrderId", buyerOrderId)
        .toString();
  }
}
