package com.iemr.mmu.service.nurse;

import java.util.List;

import com.iemr.mmu.data.nurse.BenCancerVitalDetail;
import com.iemr.mmu.data.nurse.BenFamilyCancerHistory;
import com.iemr.mmu.data.nurse.BenObstetricCancerHistory;
import com.iemr.mmu.data.nurse.BenPersonalCancerDietHistory;
import com.iemr.mmu.data.nurse.BenPersonalCancerHistory;
import com.iemr.mmu.data.nurse.BeneficiaryVisitDetail;

public interface NurseService {

	public Long saveBeneficiaryVisitDetails(BeneficiaryVisitDetail beneficiaryVisitDetail);

	public int saveBenFamilyCancerHistory(List<BenFamilyCancerHistory> benFamilyCancerHistory);

	public Long saveBenObstetricCancerHistory(BenObstetricCancerHistory benObstetricCancerHistory);

	public Long saveBenPersonalCancerDietHistory(BenPersonalCancerDietHistory benPersonalCancerDietHistory);

	public Long saveBenPersonalCancerHistory(BenPersonalCancerHistory benPersonalCancerHistory);

	public BenCancerVitalDetail saveBenVitalDetail(BenCancerVitalDetail benCancerVitalDetail);

	public String savePatientVisitDetails();

}