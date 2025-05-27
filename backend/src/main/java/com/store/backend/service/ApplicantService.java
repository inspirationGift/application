package com.store.backend.service;

import com.store.backend.dao.Job;
import com.store.backend.dto.JobDto;
import com.store.backend.repo.QualificationRepo;
import com.store.backend.repo.JobRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicantService {

    private final QualificationRepo qualificationRepo;
    public final JobRepo jobRepo;

    public ApplicantService(QualificationRepo qualificationRepo, JobRepo jobRepo) {
        this.qualificationRepo = qualificationRepo;
        this.jobRepo = jobRepo;
    }

    public void saveJobs(List<Job> jobs) {
        jobRepo.saveAll(jobs);
    }

    public void saveJob(Job job) {
        jobRepo.save(job);
    }

    public List<JobDto> findAll() {
        return jobRepo.findAll().stream().map(it ->
                new JobDto(
                        it.getId(),
                        it.getTitle(),
                        it.getDescription(),
                        it.getCompany(),
                        it.getLocation(),
                        it.getSalaryFrom(),
                        it.getSalaryTo(),
                        it.getEmploymentType(),
                        it.getContact(),
                        it.getJobCategory(),
                        it.getIsRemote(),
                        it.getNumberOfOpenings(),
                        it.getQualifications(),
                        it.getApplicationDeadline(),
                        it.getCreatedAt(),
                        it.getUpdatedAt()
                )).toList();
    }
}
