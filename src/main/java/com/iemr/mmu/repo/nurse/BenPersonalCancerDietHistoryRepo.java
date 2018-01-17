package com.iemr.mmu.repo.nurse;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.iemr.mmu.data.nurse.BenPersonalCancerDietHistory;
import com.iemr.mmu.data.nurse.BenPersonalCancerHistory;

@Repository
public interface BenPersonalCancerDietHistoryRepo extends CrudRepository<BenPersonalCancerDietHistory, Long> {
	@Query("SELECT bpdh from BenPersonalCancerDietHistory bpdh  WHERE bpdh.beneficiaryRegID = :benRegID AND bpdh.benVisitID = :benVisitID")
	public BenPersonalCancerDietHistory getBenPersonaDietHistory(@Param("benRegID") Long benRegID,
			@Param("benVisitID") Long benVisitID);

	@Transactional
	@Modifying
	@Query("update BenPersonalCancerDietHistory set providerServiceMapID=:providerServiceMapID, dietType=:dietType, fruitConsumptionDays=:fruitConsumptionDays, "
			+ "fruitQuantityPerDay=:fruitQuantityPerDay, vegetableConsumptionDays=:vegetableConsumptionDays, vegetableQuantityPerDay=:vegetableQuantityPerDay, "
			+ " intakeOfOutsidePreparedMeal=:intakeOfOutsidePreparedMeal, typeOfOilConsumed=:typeOfOilConsumed, physicalActivityType=:physicalActivityType,"
			+ " ssRadiationExposure=:ssRadiationExposure, isThyroidDisorder=:isThyroidDisorder,"
			+ " modifiedBy=:modifiedBy, processed=:processed where "
			+ "  beneficiaryRegID=:benRegID AND benVisitID = :benVisitID")
	public int updateBenPersonalCancerDietHistory(@Param("providerServiceMapID") Integer providerServiceMapID,
			@Param("dietType") String dietType,
			@Param("fruitConsumptionDays") Integer fruitConsumptionDays,
			@Param("fruitQuantityPerDay") Integer fruitQuantityPerDay,
			@Param("vegetableConsumptionDays") Integer vegetableConsumptionDays,
			@Param("vegetableQuantityPerDay") Integer vegetableQuantityPerDay,
			@Param("intakeOfOutsidePreparedMeal") Integer intakeOfOutsidePreparedMeal,
			@Param("typeOfOilConsumed") String typeOfOilConsumed,
			@Param("physicalActivityType") String physicalActivityType,
			@Param("ssRadiationExposure") Boolean ssRadiationExposure,
			@Param("isThyroidDisorder") Boolean isThyroidDisorder, @Param("modifiedBy") String modifiedBy,
			@Param("benRegID") Long benRegID,
			@Param("benVisitID") Long benVisitID,
			@Param("processed") Character processed);

	@Query("SELECT bpdh from BenPersonalCancerDietHistory bpdh  WHERE bpdh.beneficiaryRegID = :benRegID AND bpdh.benVisitID = :benVisitID"
			+ " AND DATE(createdDate) = :createdDate")
	public BenPersonalCancerDietHistory getBenPersonaDietHistory(@Param("benRegID") Long benRegID,
			@Param("benVisitID") Long benVisitID, @Param("createdDate") Date createdDate);
	
	@Query(" SELECT dietType, fruitConsumptionDays, fruitQuantityPerDay, vegetableConsumptionDays, vegetableQuantityPerDay, "
			+ "intakeOfOutsidePreparedMeal, typeOfOilConsumed, physicalActivityType, ssRadiationExposure, isThyroidDisorder, Date(createdDate) "
			+ "from BenPersonalCancerDietHistory bph WHERE bph.beneficiaryRegID = :benRegID and (dietType is not null or fruitConsumptionDays is not null "
			+ "or fruitQuantityPerDay is not null or vegetableConsumptionDays is not null or vegetableQuantityPerDay is not null or intakeOfOutsidePreparedMeal is not null "
			+ "or typeOfOilConsumed <> '' or physicalActivityType is not null or ssRadiationExposure is not null or isThyroidDisorder is not null) order by createdDate desc")
	public ArrayList<Object[]> getBenPersonaDietHistory(@Param("benRegID") Long benRegID);
	
	
	@Query("SELECT processed from BenPersonalCancerDietHistory where beneficiaryRegID=:benRegID AND benVisitID = :benVisitID")
	public Character getPersonalCancerDietHistoryStatus(@Param("benRegID") Long benRegID,
			@Param("benVisitID") Long benVisitID);
	
}
