package org.kpccoh.prayer.command;


import javax.sql.DataSource;

import org.kpccoh.prayer.condition.MagicExistsCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

@Configuration
@ComponentScan
public class CommandConfig {
	
	@Bean(destroyMethod="shutdown")
	@Conditional(MagicExistsCondition.class)
	public DataSource dataSource() {
		return new EmbeddedDatabaseBuilder()
				.addScript("classpath:schema.sql")
				.addScript("classpath:test-data.sql")
				.build();
	}

}
