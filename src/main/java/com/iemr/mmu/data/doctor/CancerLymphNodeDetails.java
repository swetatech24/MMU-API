package com.iemr.mmu.data.doctor;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.google.gson.annotations.Expose;
import com.iemr.mmu.data.nurse.BeneficiaryVisitDetail;
import com.iemr.mmu.data.registrar.BeneficiaryData;

@Entity
@Table(name = "t_cancerlymphnode")
public class CancerLymphNodeDetails {
	@Id
	@GeneratedValue
	@Expose
	@Column(name = "ID")
	private Long ID;
	
	@Expose
	@Column(name = "BeneficiaryRegID")
	private Long beneficiaryRegID;
	@Expose
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(updatable = false, insertable = false, name = "BeneficiaryRegID")
	private BeneficiaryData beneficiaryData;
	
	@Expose
	@Column(name = "BenVisitID")
	private Long benVisitID;
	@Expose
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(updatable = false, insertable = false, name = "BenVisitID")
	private BeneficiaryVisitDetail beneficiaryVisitDetail;
	
	@Expose
	@Column(name = "ProviderServiceMapID")
	private Integer providerServiceMapID;
	
	@Expose
	@Column(name = "LymphNodeName")
	private String lymphNodeName;
	
	@Expose
	@Column(name = "Mobility_Left")
	private Boolean mobility_Left;
	
	@Expose
	@Column(name = "Size_Left")
	private String size_Left;
	
	@Expose
	@Column(name = "Mobility_Right")
	private Boolean mobility_Right;
	
	@Expose
	@Column(name = "Size_Right")
	private String size_Right;
	
	@Expose
	@Column(name = "Deleted",insertable = false, updatable = true)
	private Boolean deleted; 
	
	@Expose
	@Column(name = "Processed",insertable = false, updatable = true)
	private String processed;
	
	@Expose
	@Column(name = "CreatedBy")
	private String createdBy;
	
	@Expose
	@Column(name = "CreatedDate", insertable = false, updatable = false)
	private Timestamp createdDate;
	
	@Expose
	@Column(name = "ModifiedBy")
	private String modifiedBy;
	
	@Expose
	@Column(name = "LastModDate", insertable = false, updatable = false)
	private Timestamp lastModDate;

	public CancerLymphNodeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CancerLymphNodeDetails(Long ID, Long beneficiaryRegID, BeneficiaryData beneficiaryData, Long benVisitID,
			BeneficiaryVisitDetail beneficiaryVisitDetail, Integer providerServiceMapID, String lymphNodeName,
			Boolean mobility_Left, String size_Left, Boolean mobility_Right, String size_Right, Boolean deleted) {
		super();
		this.ID = ID;
		this.beneficiaryRegID = beneficiaryRegID;
		this.beneficiaryData = beneficiaryData;
		this.benVisitID = benVisitID;
		this.beneficiaryVisitDetail = beneficiaryVisitDetail;
		this.providerServiceMapID = providerServiceMapID;
		this.lymphNodeName = lymphNodeName;
		this.mobility_Left = mobility_Left;
		this.size_Left = size_Left;
		this.mobility_Right = mobility_Right;
		this.size_Right = size_Right;
		this.deleted = deleted;
	}

	public Long getBeneficiaryRegID() {
		return beneficiaryRegID;
	}

	public void setBeneficiaryRegID(Long beneficiaryRegID) {
		this.beneficiaryRegID = beneficiaryRegID;
	}

	public BeneficiaryData getBeneficiaryData() {
		return beneficiaryData;
	}

	public void setBeneficiaryData(BeneficiaryData beneficiaryData) {
		this.beneficiaryData = beneficiaryData;
	}

	public Long getBenVisitID() {
		return benVisitID;
	}

	public void setBenVisitID(Long benVisitID) {
		this.benVisitID = benVisitID;
	}

	public BeneficiaryVisitDetail getBeneficiaryVisitDetail() {
		return beneficiaryVisitDetail;
	}

	public void setBeneficiaryVisitDetail(BeneficiaryVisitDetail beneficiaryVisitDetail) {
		this.beneficiaryVisitDetail = beneficiaryVisitDetail;
	}

	public Integer getProviderServiceMapID() {
		return providerServiceMapID;
	}

	public void setProviderServiceMapID(Integer providerServiceMapID) {
		this.providerServiceMapID = providerServiceMapID;
	}

	public String getLymphNodeName() {
		return lymphNodeName;
	}

	public void setLymphNodeName(String lymphNodeName) {
		this.lymphNodeName = lymphNodeName;
	}

	public Boolean getMobility_Left() {
		return mobility_Left;
	}

	public void setMobility_Left(Boolean mobility_Left) {
		this.mobility_Left = mobility_Left;
	}

	public String getSize_Left() {
		return size_Left;
	}

	public void setSize_Left(String size_Left) {
		this.size_Left = size_Left;
	}

	public Boolean getMobility_Right() {
		return mobility_Right;
	}

	public void setMobility_Right(Boolean mobility_Right) {
		this.mobility_Right = mobility_Right;
	}

	public String getSize_Right() {
		return size_Right;
	}

	public void setSize_Right(String size_Right) {
		this.size_Right = size_Right;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public String getProcessed() {
		return processed;
	}

	public void setProcessed(String processed) {
		this.processed = processed;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Timestamp getLastModDate() {
		return lastModDate;
	}

	public void setLastModDate(Timestamp lastModDate) {
		this.lastModDate = lastModDate;
	}

	public Long getID() {
		return ID;
	}
	
	
	
}