package org.kpccoh.prayer.command;

public interface Command {
	public String getName();
	public String getDescription();
	public void execute();
}
