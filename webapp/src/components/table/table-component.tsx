import DynamicTable from '@atlaskit/dynamic-table';
import React from 'react';
import {Job} from "../../types/Job.tsx";


interface TableComponentProps {
    jobs: Job[];
    error: string;
}

export const TableComponent = ({jobs, error}: TableComponentProps) => {

    const jobMapper = (jobList: Job[]) => {
        return jobList.map((job: Job) => ({
            key: `row-${job.id}`,
            cells: [
                {
                    key: job.id,
                    content: (
                        <div>
                            <div>
                                <div>{job.company}</div>
                            </div>
                        </div>
                    ),
                },
                {
                    key: job.id,
                    content: job.description,
                },
                {
                    key: job.id,
                    content: job.jobCategory,
                },
            ],
        }));
    };
    const rows = jobMapper(jobs);

    const head = {
        cells: [
            {key: "company", content: "Company"},
            {key: "description", content: "Description"},
            {key: "jobCategory", content: "Job Category"},
        ],
    };

    return (
        <>
            {error.length === 0 && <DynamicTable
                caption="List of Job offers"
                head={head}
                rows={rows}
                rowsPerPage={10}
                defaultPage={1}
                isFixedSize
                loadingSpinnerSize={"small"}
            />}
            {error.length > 0 && <div>{error}</div>}
        </>

    );
};