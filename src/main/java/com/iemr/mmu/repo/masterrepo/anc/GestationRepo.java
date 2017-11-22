package com.iemr.mmu.repo.masterrepo.anc;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iemr.mmu.data.masterdata.anc.Gestation;

@Repository
public interface GestationRepo extends CrudRepository<Gestation, Short>{
	
	@Query("select gestationID, name, gestationDesc from Gestation where deleted = false order by name")
	public ArrayList<Object[]> getGestationTypes();
}