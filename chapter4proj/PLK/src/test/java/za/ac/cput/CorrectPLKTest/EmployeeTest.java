package za.ac.cput.CorrectPLKTest;

import junit.framework.Assert;
import org.junit.Test;
import za.ac.cput.CorrectPLK.EmployeeName;
import za.ac.cput.CorrectPLK.EmployeeNumber;
import za.ac.cput.CorrectPLK.EmployeeSurname;

/**
 * Created by student on 2015/02/26.
 */
public class EmployeeTest {

    EmployeeName empNam = new EmployeeName();
    EmployeeNumber empNumber = new EmployeeNumber();
    EmployeeSurname empSur = new EmployeeSurname();

    @Test
    public void testEmployee() throws Exception
    {
        Assert.assertEquals("zimasa",empNam.empName());
        Assert.assertEquals("2314949302",empNumber.empNum());
        Assert.assertEquals("babalwe",empSur.empSurname());
    }
}
