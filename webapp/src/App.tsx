import './App.css';
import {JobService} from './service/job-service.tsx';
import {useEffect, useState} from "react";
import {Job} from "./types/Job.tsx";
import {TableComponent} from "./components/table/table-component.tsx";
import styled from "styled-components";

const Layout = styled.div`
    margin-left: 200px;
    margin-right: 200px;
    justify-content: center;
    align-items: center;
`;

export function App() {

    const [values, setValues] = useState<Job[]>([]);
    const [error, setError] = useState<string>("");


    useEffect(() => {
        const jobService = new JobService();
        jobService.getJobsProposals().then(v => setValues(v))
            .catch(e => setError(e.message))
    }, []);


    return (
        <Layout>
            <TableComponent jobs={values} error={error}/>
        </Layout>
    );
}
