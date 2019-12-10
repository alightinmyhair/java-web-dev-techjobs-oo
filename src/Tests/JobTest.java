package Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;


public class JobTest {
    Job test_job1;
    Job test_job2;
    Job job1;
    Job job2;


    @Before
    public void createJobObjects(){
        test_job1 = new Job();
        test_job2 = new Job();
        job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testSettingJobId(){
        assertEquals(1, test_job1.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        assertEquals("Product tester", job1.getName());
        assertEquals("ACME",job1.getEmployer().getValue());
        assertEquals("Desert", job1.getLocation().getValue());
        assertEquals("Quality control", job1.getPositionType().getValue());
        assertEquals("Persistence", job1.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality(){
        assertFalse(job1.equals(job2));
    }

}
