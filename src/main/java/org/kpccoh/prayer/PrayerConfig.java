package org.kpccoh.prayer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrayerConfig {
	@Bean
	public Prayer prayerForChildren() {
		return new PrayerForChildren();
	}

	@Bean
	public Prayerer prayerer(Prayer prayer) {
		return new Prayerer(prayer);
	}
}
