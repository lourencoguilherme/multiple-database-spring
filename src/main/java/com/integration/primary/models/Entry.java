package com.integration.primary.models;

import com.integration.common.domain.Common;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Table
@Entity
public class Entry extends Common {

  private String type;
  private Double amount;
  private Date date;
  private Boolean paid;

  @ManyToOne @JoinColumn(name = "category_id")
  private Category category;

  public Entry() {
  }

  public Entry(String type, Double amount, Date date, Boolean paid, Category category) {
    this.type = type;
    this.amount = amount;
    this.date = date;
    this.paid = paid;
    this.category = category;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public Boolean getPaid() {
    return paid;
  }

  public void setPaid(Boolean paid) {
    this.paid = paid;
  }

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }
}
