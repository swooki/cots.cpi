package org.kpccoh.prayer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = org.kpccoh.prayer.PrayerConfig.class)
@ActiveProfiles("dev")
public class PrayerTest {

	@Rule
	public final SystemOutRule log = new SystemOutRule().enableLog();

	@Autowired
	private Prayerer prayerer;
	
	@Autowired
	private Prayer prayer;

	@Test
	public void prayerShouldNotBeNull() {
		assertNotNull(prayer);
		prayer.pray();
	}

	@Test
	public void prayererPrays() {
		prayerer.pray();
		assertEquals("Praying for Haerim", log.getLog());
	}
}
