

export type Job = {
    id: number;
    title: string;
    description: string;
    company: string;
    location: string;
    salaryFrom: number;
    salaryTo: number;
    employmentType: string;
    contact: string;
    jobCategory: string;
    isRemote: boolean;
    numberOfOpenings: number;
    qualifications: Qualification[];
    applicationDeadline: number;
    createdAt: number;
    updatedAt: number;
};

export type Qualification = {
    id: number;
    name: string;
};
