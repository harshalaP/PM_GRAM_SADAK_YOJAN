package com.hp.web.portal.gram_sadak.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hp.web.portal.gram_sadak.entity.Job;

@Repository
public interface JobRepository extends JpaRepository<Job, Long>{

	/**
	 * Method to get max value from column
	 * @return
	 */
	@Query(value="SELECT COALESCE(MAX(jb.JobId), 0)+1 FROM Job jb",nativeQuery = true)
	Integer getNewJobId();
	
	@Modifying(clearAutomatically = true)
	@Transactional
	@Query(value=" UPDATE Job set JobId=:jobId ",nativeQuery = true)
	Integer incrementJobId(@Param("jobId") Integer jobId);





	
}
