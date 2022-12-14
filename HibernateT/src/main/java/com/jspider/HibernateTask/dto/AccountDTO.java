package com.jspider.HibernateTask.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class AccountDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String accountHolder;
	private long accountNo;
	private String ifsc;
	private String branch;
	private String bank;
	private String city;

}
