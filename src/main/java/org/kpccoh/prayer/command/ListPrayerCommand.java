package org.kpccoh.prayer.command;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class ListPrayerCommand implements Command {

	private String name;
	private String description;

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getDescription() {
		return this.description;
	}

	@Override
	public void execute() {
		System.out.print("Command," + this.name + " executed.");
	}
}
