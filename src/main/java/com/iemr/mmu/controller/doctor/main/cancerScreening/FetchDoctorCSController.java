package com.iemr.mmu.controller.doctor.main.cancerScreening;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.iemr.mmu.data.doctor.CancerAbdominalExamination;
import com.iemr.mmu.data.doctor.CancerBreastExamination;
import com.iemr.mmu.data.doctor.CancerDiagnosis;
import com.iemr.mmu.data.doctor.CancerGynecologicalExamination;
import com.iemr.mmu.data.doctor.CancerLymphNodeDetails;
import com.iemr.mmu.data.doctor.CancerOralExamination;
import com.iemr.mmu.data.doctor.WrapperCancerExamImgAnotasn;
import com.iemr.mmu.data.doctor.WrapperCancerSymptoms;
import com.iemr.mmu.data.nurse.BenCancerVitalDetail;
import com.iemr.mmu.data.nurse.BenFamilyCancerHistory;
import com.iemr.mmu.data.nurse.BenObstetricCancerHistory;
import com.iemr.mmu.data.nurse.BenPersonalCancerDietHistory;
import com.iemr.mmu.data.nurse.BenPersonalCancerHistory;
import com.iemr.mmu.data.nurse.BeneficiaryVisitDetail;
import com.iemr.mmu.service.common.master.DoctorMasterDataService;
import com.iemr.mmu.service.common.master.DoctorMasterDataServiceImpl;
import com.iemr.mmu.service.doctor.DoctorServiceImpl;
import com.iemr.mmu.service.nurse.NurseServiceImpl;
import com.iemr.utils.mapper.InputMapper;
import com.iemr.utils.response.OutputResponse;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@CrossOrigin
@RestController
@RequestMapping({ "/doctor" })
/** Objective: Performs Fetching Beneficiary Cancer Screening Details entered by doctor*/
public class FetchDoctorCSController {
	private InputMapper inputMapper = new InputMapper();
	private OutputResponse response;
	private Logger logger = LoggerFactory.getLogger(FetchDoctorCSController.class);
	private DoctorMasterDataService doctorMasterDataService;
	private DoctorMasterDataServiceImpl doctorMasterDataServiceImpl;

	@Autowired
	private DoctorServiceImpl doctorServiceImpl;

	@Autowired
	public void setDoctorMasterDataServiceImpl(DoctorMasterDataServiceImpl doctorMasterDataServiceImpl) {
		this.doctorMasterDataServiceImpl = doctorMasterDataServiceImpl;
	}

	
	@CrossOrigin()
	@ApiOperation(value = "provides doctor worklist", consumes = "application/json", produces = "application/json")
	@RequestMapping(value = { "/getDocWorklist" }, method = { RequestMethod.GET })
	public String getNurseWorkList() {
		OutputResponse response = new OutputResponse();
		try {
			String s = doctorServiceImpl.getDocWorkList();
			response.setResponse(s);
		} catch (Exception e) {
			logger.error("Error in getNurseWorkList:" + e);
			response.setError(e);
		}
		return response.toString();
	}

	
}