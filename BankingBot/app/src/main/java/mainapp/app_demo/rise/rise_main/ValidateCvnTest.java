package mainapp.app_demo.rise.rise_main;

import android.app.Application;
import android.test.ApplicationTestCase;
import android.test.suitebuilder.annotation.SmallTest;

import com.realexpayments.remote.RealexRemote;

import com.realexpayments.remote.RealexRemote;
/*
 * Unit tests for validateCvn
 * CVN non-Amex validation (validateCvn)
 */

public class ValidateCvnTest extends ApplicationTestCase<Application> {

    public ValidateCvnTest() {
        super(Application.class);
    }

    @SmallTest
    public void testValidNonAmexCVN() {
        assertTrue(RealexRemote.validateCvn("123"));
    }

    @SmallTest
    public void testEmptyCVN() {
        assertFalse(RealexRemote.validateCvn(""));
    }

    @SmallTest
    public void testUndefinedCVN() {
        assertFalse(RealexRemote.validateCvn(null));
    }

    @SmallTest
    public void testWhiteSpaceOnly() {
        assertFalse(RealexRemote.validateCvn("   "));
    }

    @SmallTest
    public void testNonAmexCVNof4Numbers() {
        assertFalse(RealexRemote.validateCvn("1234"));
    }

    @SmallTest
    public void testNonAmexCVNof2Numbers() {
        assertFalse(RealexRemote.validateCvn("12"));
    }

    @SmallTest
    public void testNonNumericNonAmexCVNof3Characters() {
        assertFalse(RealexRemote.validateCvn("12a"));
    }

}