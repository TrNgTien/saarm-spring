package com.trngtien.saarm_be.common;

public enum Statuses {
    ACTIVATED("100_ACTIVATED"),
    DEACTIVATED("101_DEACTIVATED"),
    BLOCKED("102_BLOCKED"),
    ARCHIVE("103_ARCHIVE"),
    SENT("104_SENT"),
    DRAFT("200_DRAFT"),
    PUBLISHED("201_PUBLISHED"),
    EXPIRED("202_EXPIRED"),
    SOLD_OUT("203_SOLD_OUT"),
    PENDING("300_PENDING"),
    SENDING("301_SENDING"),
    COMPLETED("302_COMPLETED"),
    CANCELLED("303_CANCELLED"),
    FAIL("304_FAIL"),
    TIMEOUT(" 305_TIMEOUT"),
    UNKNOWN("400_UNKNOWN"),
    SUCCESS("401_SUCCESS"),
    VISITED("700_VISITED"),
    ARCHIVED("800_ARCHIVED"),
    SAMPLES  ("500_SAMPLES"),
    ON_SALE  ("501_ON_SALE"),
    OUT_OF_STOCK ("502_OUT_OF_STOCK") ,
    DISCONTINUED ("503_DISCONTINUED");

    public final String statuses;

    private Statuses(String statuses) {
        this.statuses = statuses;
    }
}

//public class StatusesAvaible {
//    static readonly UNKNOWN = "000_UNKNOWN";
//    static readonly ACTIVATED = "100_ACTIVATED";
//    static readonly DEACTIVATED = "101_DEACTIVATED";
//    static readonly BLOCKED = "102_BLOCKED";
//    static readonly DRAFT = "103_DRAFT";
//    static readonly ARCHIVE = "104_ARCHIVE";
//    static readonly SUCCESS = "105_SUCCESS";
//    static readonly FAIL = "106_FAIL";
//    static readonly SENT = "107_SENT";
//}
//
//public class LimitRecords {
//    static readonly LIMIT_100 = 100;
//    static readonly LIMIT_500 = 500;
//    static readonly LIMIT_1000 = 1_000;
//    static readonly LIMIT_5000 = 5_000;
//}

