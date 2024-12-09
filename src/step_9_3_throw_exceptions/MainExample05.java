package step_9_3_throw_exceptions;

public class MainExample05 {
    public static void main(String[] args) throws Exception {
        Job job = new Job();
        job.doJob();
    }
}

class Job {
    public void doJob() throws Exception {
        System.out.println("Start doJob");
        try {
            System.out.println("Start doJob2 in method doJob");
            doJob2();
            System.out.println("Finish doJob2 in method doJob");
        } catch (Exception e) {
            throw new Exception(e.getMessage() + "more info");
        } finally {
            System.out.println("Finish doJob");
        }
    }
    public void doJob2() throws Exception {
        System.out.println("Start doJob2 in method doJob2");
        throw new Exception();
    }
}
