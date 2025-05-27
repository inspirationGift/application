package com.store.backend.dto;


import com.store.backend.dao.Qualification;


import java.util.List;

public record JobDto(
        Long id,
        String title,
        String description,
        String company,
        String location,
        Double salaryFrom,
        Double salaryTo,
        String employmentType,
        String contact,
        String jobCategory,
        Boolean isRemote,
        Integer numberOfOpenings,
        List<Qualification> qualifications,
        Long applicationDeadline,
        Long createdAt,
        Long updatedAt
) {
}
