package Tests;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertFalse;



public class JobTest {
    Job job1;
    Job job2;
    Job job3;
    Job job4;


    @Before
    public void createJobObjects(){
//        test_job1 = new Job();
//        test_job2 = new Job();
//        job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        job3 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
    }

    @Test
    public void testSettingJobId(){
        Job test_job1 = new Job();
        assertEquals(1, test_job1.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", job1.getName());
        assertEquals("ACME",job1.getEmployer().getValue());
        assertEquals("Desert", job1.getLocation().getValue());
        assertEquals("Quality control", job1.getPositionType().getValue());
        assertEquals("Persistence", job1.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality(){
        job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(job1.equals(job2));
    }

    @Test
    public void testBlankLines(){
        job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String[] strArr = job1.toString().split("");
        assertEquals("\n", strArr[0]);
        assertEquals("\n", strArr[strArr.length-1]);
    }

    @Test
    public void testFieldLabels(){
        job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String[] strArr = job1.toString().split("\n");
        assertEquals("Name: Product tester", strArr[2]);
        assertEquals("Employer: ACME", strArr[3]);
        assertEquals("Location: Desert", strArr[4]);
        assertEquals("Position type: Quality control", strArr[5]);
        assertEquals("Core Competency: Persistence", strArr[6]);
    }

    @Test
    public void testEmptyField(){
        job3 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        String[] strArr = job3.toString().split("\n");
        assertEquals("Name: Data not available", strArr[2]);
        assertEquals("Employer: Data not available", strArr[3]);
        assertEquals("Location: Data not available", strArr[4]);
        assertEquals("Position type: Data not available", strArr[5]);
        assertEquals("Core Competency: Data not available", strArr[6]);
    }

    @Test
    public void testNoJob(){
        job4 = new Job();
        assertEquals("OOPS! This job does not seem to exist.", job4.toString());
    }
}
