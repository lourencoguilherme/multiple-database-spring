package com.integration.common.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@XmlRootElement
@XmlAccessorType(XmlAccessType.PROPERTY)
@JsonIgnoreProperties(ignoreUnknown = true)
@MappedSuperclass
public abstract class CommonSimple implements Serializable {

  private static final long serialVersionUID = 1L;

  public CommonSimple() {

  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  protected Long id;

  @Column(name = "deleted", columnDefinition = "boolean DEFAULT false")
  protected Boolean deleted = false;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "created", updatable = false, insertable = false,
    columnDefinition = "TIMESTAMP WITHOUT TIME ZONE DEFAULT now()")
  protected Date created = new Date();

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "updated", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
  protected Date updated;



  @PrePersist
  public void prePersist() {
    created = new Date();
    updated = null;
  }

  @PreUpdate
  public void preUpdate() {
    updated = new Date();
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Boolean getDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  public Date getCreated() {
    return created;
  }

  public void setCreated(Date created) {
    this.created = created;
  }

  public Date getUpdated() {
    return updated;
  }

  public void setUpdated(Date updated) {
    this.updated = updated;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof CommonSimple)) return false;
    CommonSimple that = (CommonSimple) o;
    return Objects.equals(getId(), that.getId());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getId());
  }
}
