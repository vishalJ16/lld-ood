/**
 * 
 */
package com.navi.ledger.command;

/**
 * @author VJ
 * 7 May 2022
 */
public class CommandExecutor {

	private CommandExecutor() {
	}

	public static void executeInputCommand(String command) {
		execute(command);
	}

	private static void execute(String command) {
		CommandFactory factory = new CommandFactory();
		String[] inputs = command.split("\\s+");
		CommandProcessor processsor = factory.getCommandProcessor(inputs[0]);
		processsor.process(inputs);
	}
}
