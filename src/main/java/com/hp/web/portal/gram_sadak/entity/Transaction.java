package com.hp.web.portal.gram_sadak.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Transaction")
public class Transaction implements Serializable{
	
	 private static final long serialVersionUID = 1L;

	    @Id
	    @Column(name="TransactionId")
	    private Integer transactionId;

	    public Integer getTransactionId() {
	        return transactionId;
	    }

	    public void setId(Integer transactionId) {
	        this.transactionId = transactionId;
	    }

}
