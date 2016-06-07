package gov.ohio.jfs.cots.cpi;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class CPILogConfig {
	@Bean
	public CPILog cPILog() {
		return new CPILog("action", "application", new Date(), "personalId", "targetAccessed", "userAccessed");
	}
}
