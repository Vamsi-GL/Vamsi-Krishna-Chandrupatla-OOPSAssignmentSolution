package com.greatlearning.gradedAssessment1.OOPS.service.department.admin;

import com.greatlearning.gradedAssessment1.OOPS.service.department.superdepartment.SuperDepartment;

public class AdminDepartment extends SuperDepartment {

    public String departmentName()
    {
        return "Admin Department";
    }

    public String getTodaysWork()
    {
        return "Complete your documents submission";
    }

    public String getWorkDeadline()
    {
        return "Complete by EOD";
    }
}
