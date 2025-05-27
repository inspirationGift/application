import {Job} from "../types/Job.tsx";

export class JobService {

    constructor() {
    }

    async getJobsProposals() {
        const response = await fetch("http://localhost:8080/all", {
            method: "GET",
        });

        const data = await response.json() as unknown;

        if (!Array.isArray(data)) {
            throw new Error("Invalid response format");
        }

        return data as Job[];
    }
}