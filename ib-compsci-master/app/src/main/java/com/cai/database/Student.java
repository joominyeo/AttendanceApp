package com.cai.database;

/**
* Created by bchen on 9/27/14.
* Edited and maintained by Joomin "Cai" Yeo since 9/30/2014
*/
public class Student {

    public enum AttendanceStatus {
        PRESENT("Present"), TARDY("Tardy"), ABSENT("Absent");
        private static AttendanceStatus[] allValues = values();
        public static AttendanceStatus fromOrdinal(int n) {return allValues[n];}

        private String description;
        AttendanceStatus(String description) {
            this.description = description;
        }

        public String toString() {
            return description;
        }
    }
    private long id;
    private long periodId;
    private String fName;
    private String lName;
    private AttendanceStatus status;

    public Student() {
    }

    public Student(String f, String l) {
        fName = f;
        lName = l;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPeriodId() {
        return periodId;
    }

    public void setPeriodId(long periodId) {
        this.periodId = periodId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public AttendanceStatus getStatus() {
        return status;
    }

    public void setStatus(AttendanceStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return lName + ", " + fName;
    }

}
