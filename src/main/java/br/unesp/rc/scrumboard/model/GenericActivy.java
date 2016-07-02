package br.unesp.rc.scrumboard.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@MappedSuperclass
public abstract class GenericActivy implements Serializable {

	private static final long serialVersionUID = 2307354905893950758L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(length = 100, nullable = false)
	@NotNull
	@Size(min = 4, max = 100)
    private String name;
	
	@Column(length = 1024)	
	@Size(max = 1024)
    private String description;
	
	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	@NotNull
	private Date beginDate;
	
	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	@NotNull
    private Date endDate;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	@Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(GenericActivy.class, name);
    }

    @Override
    public boolean equals(Object that) {        
        return EqualsBuilder.reflectionEquals(this, that, "id", "name");
    }
}
