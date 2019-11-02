package org.shahid.creational.builder.shahid;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@SuppressWarnings("unused")
public class IBSNormalInterestRate {

	private String        createdBy;

    private LocalDateTime createdDt;

    private String        countryCode;

    private LocalDateTime effectiveDate;

    private BigDecimal    normalInterestRate;

    private String        modifiedBy;

    private LocalDateTime modifiedDt;

    private Integer       version;

    private IBSNormalInterestRate(String createdBy, LocalDateTime createdDt, String countryCode,
            LocalDateTime effectiveDate, BigDecimal normalInterestRate, String modifiedBy, LocalDateTime modifiedDt,
            Integer version) {
        this.createdBy = createdBy;
        this.createdDt = createdDt;
        this.countryCode = countryCode;
        this.effectiveDate = effectiveDate;
        this.normalInterestRate = normalInterestRate;
        this.modifiedBy = modifiedBy;
        this.modifiedDt = modifiedDt;
        this.version = version;
    }

    public static IBSNormalInterestRateBuilder builder() {
        return new IBSNormalInterestRateBuilder();
    }

    public static class IBSNormalInterestRateBuilder {

        private String        createdBy;
        private LocalDateTime createdDt;
        private String        countryCode;
        private LocalDateTime effectiveDate;
        private BigDecimal    normalInterestRate;
        private String        modifiedBy;
        private LocalDateTime modifiedDt;
        private Integer       version;

        public String toString() {
            return "IBSNormalInterestRate.IBSNormalInterestRateBuilder(createdBy=" + this.createdBy + ", createdDt="
                    + this.createdDt + ", countryCode=" + this.countryCode + ", effectiveDate=" + this.effectiveDate
                    + ", normalInterestRate=" + this.normalInterestRate + ", modifiedBy=" + this.modifiedBy
                    + ", modifiedDt=" + this.modifiedDt + ", version=" + this.version + ")";
        }

        public IBSNormalInterestRate build() {
            return new IBSNormalInterestRate(this.createdBy, this.createdDt, this.countryCode, this.effectiveDate,
                    this.normalInterestRate, this.modifiedBy, this.modifiedDt, this.version);
        }

        public IBSNormalInterestRateBuilder version(Integer version) {
            this.version = version;
            return this;
        }

        public IBSNormalInterestRateBuilder modifiedDt(LocalDateTime modifiedDt) {
            this.modifiedDt = modifiedDt;
            return this;
        }

        public IBSNormalInterestRateBuilder modifiedBy(String modifiedBy) {
            this.modifiedBy = modifiedBy;
            return this;
        }

        public IBSNormalInterestRateBuilder normalInterestRate(BigDecimal normalInterestRate) {
            this.normalInterestRate = normalInterestRate;
            return this;
        }

        public IBSNormalInterestRateBuilder effectiveDate(LocalDateTime effectiveDate) {
            this.effectiveDate = effectiveDate;
            return this;
        }

        public IBSNormalInterestRateBuilder countryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        public IBSNormalInterestRateBuilder createdDt(LocalDateTime createdDt) {
            this.createdDt = createdDt;
            return this;
        }

        public IBSNormalInterestRateBuilder createdBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
    }
 }
