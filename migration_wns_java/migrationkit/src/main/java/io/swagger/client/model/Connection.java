/*
 * eGov Water and Sewerage(W&S)  System.
 * APIs for W&S module. This provide APIs for create new property, update existing property, search existing property. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: contact@egovernments.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
/**
 * This is lightweight property object that can be used as reference by
 * definitions needing property linking. Actual Property Object extends this to
 * include more elaborate attributes of the property.
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
@SuperBuilder
public class Connection {
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("tenantId")
	private String tenantId = null;

	@JsonProperty("propertyId")
	private String propertyId = null;

	@JsonProperty("applicationNo")
	private String applicationNo = null;

	@JsonProperty("applicationStatus")
	private String applicationStatus = null;

	/**
	 * Gets or Sets status
	 */

	public enum StatusEnum {
		Active("Active"), Inactive("Inactive");

		private String value;

		StatusEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

	}

	@JsonProperty("status")
	private StatusEnum status = null;

	@JsonProperty("connectionNo")
	private String connectionNo = null;

	@JsonProperty("mobilenumber")
	private String mobilenumber = null;

	
	@JsonProperty("oldConnectionNo")
	private String oldConnectionNo = null;

	@JsonProperty("documents")
	private List<Document> documents = null;

	@JsonProperty("plumberInfo")
	private List<PlumberInfo> plumberInfo = null;

	@JsonProperty("roadType")
	private String roadType = null;

	@JsonProperty("roadCuttingArea")
	private Double roadCuttingArea = null;

	@JsonProperty("connectionExecutionDate")
	private Long connectionExecutionDate = null;

	@JsonProperty("connectionCategory")
	private String connectionCategory = null;

	@JsonProperty("connectionType")
	private String connectionType = null;

	@JsonProperty("additionalDetails")
	private Object additionalDetails = null;

	@JsonProperty("auditDetails")
	private AuditDetails auditDetails = null;
	
	@JsonProperty("applicantname")
	private String applicantname = null;
	
	@JsonProperty("guardianname")
	private String guardianname = null;
	


	/**
	 * Unique Identifier of the connection for internal reference.
	 * 
	 * @return id
	 **/
	public String getId() {
		return id;
	}

	public Connection tenantId(String tenantId) {
		this.tenantId = tenantId;
		return this;
	}

	/**
	 * Unique ULB identifier.
	 * 
	 * @return tenantId
	 **/
	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public Connection propertyId(String propertyId) {
		this.propertyId = propertyId;
		return this;
	}

	/**
	 * UUID of the property.
	 * 
	 * @return propertyId
	 **/
	public String getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(String propertyId) {
		this.propertyId = propertyId;
	}

	/**
	 * Formatted application number, which will be generated using ID-Gen at the
	 * time .
	 * 
	 * @return applicationNo
	 **/
	public String getApplicationNo() {
		return applicationNo;
	}

	/**
	 * Get applicationStatus
	 * 
	 * @return applicationStatus
	 **/
	public String getApplicationStatus() {
		return applicationStatus;
	}

	/**
	 * Get status
	 * 
	 * @return status
	 **/
	public StatusEnum getStatus() {
		return status;
	}

	/**
	 * Formatted connection number, which will be generated using ID-Gen service
	 * after aproval of connection application in case of new application. If
	 * the source of data is \&quot;DATA_ENTRY\&quot; then application status
	 * will be considered as \&quot;APROVED\&quot; application.
	 * 
	 * @return connectionNo
	 **/
	public String getConnectionNo() {
		return connectionNo;
	}

	/**
	 * Mandatory if source is \&quot;DATA_ENTRY\&quot;.
	 * 
	 * @return oldConnectionNo
	 **/
	public String getOldConnectionNo() {
		return oldConnectionNo;
	}

	public Connection documents(List<Document> documents) {
		this.documents = documents;
		return this;
	}

	public Connection addDocumentsItem(Document documentsItem) {
		if (this.documents == null) {
			this.documents = new ArrayList<Document>();
		}
		this.documents.add(documentsItem);
		return this;
	}

	/**
	 * The documents attached by owner for exemption.
	 * 
	 * @return documents
	 **/
	public List<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}

	public Connection plumberInfo(List<PlumberInfo> plumberInfo) {
		this.plumberInfo = plumberInfo;
		return this;
	}

	public Connection addPlumberInfoItem(PlumberInfo plumberInfoItem) {
		if (this.plumberInfo == null) {
			this.plumberInfo = new ArrayList<PlumberInfo>();
		}
		this.plumberInfo.add(plumberInfoItem);
		return this;
	}

	/**
	 * The documents attached by owner for exemption.
	 * 
	 * @return plumberInfo
	 **/
	public List<PlumberInfo> getPlumberInfo() {
		return plumberInfo;
	}

	public void setPlumberInfo(List<PlumberInfo> plumberInfo) {
		this.plumberInfo = plumberInfo;
	}

	public Connection roadType(String roadType) {
		this.roadType = roadType;
		return this;
	}

	/**
	 * It is a master data, defined in MDMS. If road cutting is required to
	 * established the connection then we need to capture the details of road
	 * type.
	 * 
	 * @return roadType
	 **/
	public String getRoadType() {
		return roadType;
	}

	public void setRoadType(String roadType) {
		this.roadType = roadType;
	}

	public Connection roadCuttingArea(Double roadCuttingArea) {
		this.roadCuttingArea = roadCuttingArea;
		return this;
	}

	 
	/**
	 * Get connectionExecutionDate
	 * 
	 * @return connectionExecutionDate
	 **/
	public Long getConnectionExecutionDate() {
		return connectionExecutionDate;
	}

	public Connection connectionCategory(String connectionCategory) {
		this.connectionCategory = connectionCategory;
		return this;
	}

	/**
	 * It is a master data, defined in MDMS
	 * 
	 * @return connectionCategory
	 **/
	public String getConnectionCategory() {
		return connectionCategory;
	}

	public void setConnectionCategory(String connectionCategory) {
		this.connectionCategory = connectionCategory;
	}

	public Connection connectionType(String connectionType) {
		this.connectionType = connectionType;
		return this;
	}

	/**
	 * It is a master data, defined in MDMS.
	 * 
	 * @return connectionType
	 **/
	public String getConnectionType() {
		return connectionType;
	}

	public void setConnectionType(String connectionType) {
		this.connectionType = connectionType;
	}

	public Connection additionalDetails(Object additionalDetails) {
		this.additionalDetails = additionalDetails;
		return this;
	}

	/**
	 * Json object to capture any extra information which is not accommodated of
	 * model
	 * 
	 * @return additionalDetails
	 **/
	public Object getAdditionalDetails() {
		return additionalDetails;
	}

	public void setAdditionalDetails(Object additionalDetails) {
		this.additionalDetails = additionalDetails;
	}

	public Connection auditDetails(AuditDetails auditDetails) {
		this.auditDetails = auditDetails;
		return this;
	}

	/**
	 * Get auditDetails
	 * 
	 * @return auditDetails
	 **/
	public AuditDetails getAuditDetails() {
		return auditDetails;
	}

	public void setAuditDetails(AuditDetails auditDetails) {
		this.auditDetails = auditDetails;
	}
	
	public String getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Connection connection = (Connection) o;
		return Objects.equals(this.id, connection.id) && Objects.equals(this.tenantId, connection.tenantId)
				&& Objects.equals(this.propertyId, connection.propertyId)
				&& Objects.equals(this.applicationNo, connection.applicationNo)
				&& Objects.equals(this.applicationStatus, connection.applicationStatus)
				&& Objects.equals(this.status, connection.status)
				&& Objects.equals(this.connectionNo, connection.connectionNo)
				&& Objects.equals(this.oldConnectionNo, connection.oldConnectionNo)
				&& Objects.equals(this.documents, connection.documents)
				&& Objects.equals(this.plumberInfo, connection.plumberInfo)
				&& Objects.equals(this.roadType, connection.roadType)
				&& Objects.equals(this.roadCuttingArea, connection.roadCuttingArea)
				&& Objects.equals(this.connectionExecutionDate, connection.connectionExecutionDate)
				&& Objects.equals(this.connectionCategory, connection.connectionCategory)
				&& Objects.equals(this.connectionType, connection.connectionType)
				&& Objects.equals(this.additionalDetails, connection.additionalDetails)
				&& Objects.equals(this.auditDetails, connection.auditDetails);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, tenantId, propertyId, applicationNo, applicationStatus, status, connectionNo,
				oldConnectionNo, documents, plumberInfo, roadType, roadCuttingArea, connectionExecutionDate,
				connectionCategory, connectionType, additionalDetails, auditDetails);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Connection {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
		sb.append("    propertyId: ").append(toIndentedString(propertyId)).append("\n");
		sb.append("    applicationNo: ").append(toIndentedString(applicationNo)).append("\n");
		sb.append("    applicationStatus: ").append(toIndentedString(applicationStatus)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    connectionNo: ").append(toIndentedString(connectionNo)).append("\n");
		sb.append("    oldConnectionNo: ").append(toIndentedString(oldConnectionNo)).append("\n");
		sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
		sb.append("    plumberInfo: ").append(toIndentedString(plumberInfo)).append("\n");
		sb.append("    roadType: ").append(toIndentedString(roadType)).append("\n");
		sb.append("    roadCuttingArea: ").append(toIndentedString(roadCuttingArea)).append("\n");
		sb.append("    connectionExecutionDate: ").append(toIndentedString(connectionExecutionDate)).append("\n");
		sb.append("    connectionCategory: ").append(toIndentedString(connectionCategory)).append("\n");
		sb.append("    connectionType: ").append(toIndentedString(connectionType)).append("\n");
		sb.append("    additionalDetails: ").append(toIndentedString(additionalDetails)).append("\n");
		sb.append("    auditDetails: ").append(toIndentedString(auditDetails)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

	public String getApplicantname() {
		return applicantname;
	}

	public void setApplicantname(String applicantname) {
		this.applicantname = applicantname; 
	}

	public String getGuardianname() {
		return guardianname;
	} 

	public void setGuardianname(String guardianname) {
		this.guardianname = guardianname;
	}

}
