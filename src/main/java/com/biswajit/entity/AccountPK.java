package com.biswajit.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;

import lombok.Data;

@Data
@Embeddable
public class AccountPK implements Serializable {
	private Integer accNum;

	private String accType;
}
