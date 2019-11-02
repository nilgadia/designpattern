package org.shahid.creational.builder.shahid;

import java.time.LocalDateTime;

public class ValueObject {

	private String createdBy;

	private LocalDateTime createdDt;

	private String modifiedBy;

	private LocalDateTime modifiedDt;

	private Integer version;

	public ValueObject() {
	}

	private ValueObject(String createdBy, LocalDateTime createdDt, String modifiedBy, LocalDateTime modifiedDt,
			Integer version) {
		this.createdBy = createdBy;
		this.createdDt = createdDt;
		this.modifiedBy = modifiedBy;
		this.modifiedDt = modifiedDt;
		this.version = version;
	}

	public static ValueObjectBuilder builder() {
		return new ValueObjectBuilder();
	}

	public static class ValueObjectBuilder {

		private String createdBy;
		private LocalDateTime createdDt;
		private String modifiedBy;
		private LocalDateTime modifiedDt;
		private Integer version;

		public ValueObject build() {
			return new ValueObject(this.createdBy, this.createdDt, this.modifiedBy, this.modifiedDt, this.version);
		}

		public ValueObjectBuilder createdBy(String createdBy) {
			this.createdBy = createdBy;
			return this;
		}

		public ValueObjectBuilder createdDt(LocalDateTime createdDt) {
			this.createdDt = createdDt;
			return this;
		}

		public ValueObjectBuilder modifiedBy(String modifiedBy) {
			this.modifiedBy = modifiedBy;
			return this;
		}

		public ValueObjectBuilder modifiedDt(LocalDateTime modifiedDt) {
			this.modifiedDt = modifiedDt;
			return this;
		}

		public ValueObjectBuilder version(Integer version) {
			this.version = version;
			return this;
		}

		@Override
		public String toString() {
			return "ValueObjectBuilder [createdBy=" + createdBy + ", createdDt=" + createdDt + ", modifiedBy="
					+ modifiedBy + ", modifiedDt=" + modifiedDt + ", version=" + version + "]";
		}
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public LocalDateTime getCreatedDt() {
		return createdDt;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public LocalDateTime getModifiedDt() {
		return modifiedDt;
	}

	public Integer getVersion() {
		return version;
	}

	@Override
	public String toString() {
		return "ValueObjectBuilder [createdBy=" + createdBy + ", createdDt=" + createdDt + ", modifiedBy="
				+ modifiedBy + ", modifiedDt=" + modifiedDt + ", version=" + version + "]";
	}
}