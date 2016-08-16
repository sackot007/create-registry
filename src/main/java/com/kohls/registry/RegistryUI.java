package com.kohls.registry;


public class RegistryUI {

	private String id;

	private String description;
	private String createdBy;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RegistryUI [id=").append(id).append(", description=")
				.append(description).append(", createdBy=").append(createdBy)
				.append("]");
		return builder.toString();
	}
}
