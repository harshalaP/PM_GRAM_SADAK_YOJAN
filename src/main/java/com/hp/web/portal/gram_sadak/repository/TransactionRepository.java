package com.hp.web.portal.gram_sadak.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hp.web.portal.gram_sadak.entity.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

	/**
	 * Method to get max value from column
	 * @return
	 */
	@Query(value="SELECT COALESCE(MAX(txn.TransactionId), 0)+1 FROM Transaction txn",nativeQuery = true)
	Integer getNewTransactionId();
	
	@Modifying(clearAutomatically = true)
	@Transactional
	@Query(value="UPDATE Transaction set  TransactionId=:transactionId ",nativeQuery = true)
	Integer incrementTransactionId(@Param("transactionId") Integer transactionId);
}
