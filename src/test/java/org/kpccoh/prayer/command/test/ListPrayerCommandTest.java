package org.kpccoh.prayer.command.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.kpccoh.prayer.command.Command;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = org.kpccoh.prayer.command.CommandConfig.class)
public class ListPrayerCommandTest {

	@Rule
	public final SystemOutRule log = new SystemOutRule().enableLog();

	@Autowired
	private Command command;

	@Test
	public void commandShouldNotBeNull() {
		assertNotNull(command);
		command.execute();
	}

	@Test
	public void commandExecuted() {
		command.execute();
		assertEquals("Command," + command.getName() + " executed.", log.getLog());
	}
}
