package com.greatlearning.gradedAssessment1.OOPS.service.department.tech;

import com.greatlearning.gradedAssessment1.OOPS.service.department.superdepartment.SuperDepartment;

public class TechDepartment extends SuperDepartment {

    public String departmentName()
    {
        return "Technical";
    }

    public String getTodaysWork()
    {
        return "Complete coding of module 1";
    }

    public String getWorkDeadline()
    {
        return "Complete by EOD";
    }

    public String getTechStackInformation()
    {
        return "Core Java";
    }
}
