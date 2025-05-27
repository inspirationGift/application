package com.store.backend.rest;

import com.store.backend.dao.Job;
import com.store.backend.dto.JobDto;
import com.store.backend.service.ApplicantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController()
@RequestMapping("/")
public class ApplicantController {
    private final ApplicantService applicantService;

    public ApplicantController(ApplicantService applicantService) {
        this.applicantService = applicantService;
    }

    @PostMapping(value = "jobs")
    public void save(@RequestBody Job job) {
        applicantService.saveJob(job);
    }

    @GetMapping("all")
    public List<JobDto> getAll() {
        return applicantService.findAll();
    }
}
