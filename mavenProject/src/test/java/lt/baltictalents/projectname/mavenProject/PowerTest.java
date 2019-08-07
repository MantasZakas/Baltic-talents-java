package lt.baltictalents.projectname.mavenProject;

import junit.framework.TestCase;

public class PowerTest extends TestCase {

	public void testPower() {
		Power p = new Power();
		assertEquals(8, p.power(2, 3));

	}

}
