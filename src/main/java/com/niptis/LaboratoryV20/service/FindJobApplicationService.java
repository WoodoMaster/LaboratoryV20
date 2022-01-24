package com.niptis.LaboratoryV20.service;

import com.niptis.LaboratoryV20.entity.JobApplication;

import java.util.List;

public interface FindJobApplicationService {
    List <JobApplication> find(JobApplication jobApplication);
}
