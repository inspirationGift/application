import { JobService } from './job-service';


describe('JobService', () => {
    let jobService: JobService;

    beforeEach(() => {
        jobService = new JobService();
    });

    it('returns job proposals when the response is valid', async () => {
        global.fetch = jest.fn(() =>
            Promise.resolve({
                json: () => Promise.resolve([{ id: 1, title: 'Job 1' }]),
            } as Response)
        );

        const jobs = await jobService.getJobsProposals();
        expect(jobs).toEqual([{ id: 1, title: 'Job 1' }]);
    });

    it('throws an error when the response is not an array', async () => {
        global.fetch = jest.fn(() =>
            Promise.resolve({
                json: () => Promise.resolve({ id: 1, title: 'Job 1' }),
            } as Response)
        );

        await expect(jobService.getJobsProposals()).rejects.toThrow(
            'Invalid response format'
        );
    });

    it('throws an error when the fetch fails', async () => {
        global.fetch = jest.fn(() => Promise.reject(new Error('Network error')));

        await expect(jobService.getJobsProposals()).rejects.toThrow(
            'Network error'
        );
    });
});