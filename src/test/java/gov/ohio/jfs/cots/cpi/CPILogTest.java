package gov.ohio.jfs.cots.cpi;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.kpccoh.prayer.Prayerer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = gov.ohio.jfs.cots.cpi.CPILogConfig.class)
public class CPILogTest {
	@Autowired
	private CPILog cpiLog;

	@Test
	public void logShouldNotBeNull() {
		assertNotNull(cpiLog);
	}
}
