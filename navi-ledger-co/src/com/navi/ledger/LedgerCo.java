/**
 * 
 */
package com.navi.ledger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.navi.ledger.command.CommandExecutor;

/**
 * @author VJ
 * 7 May 2022
 */
public class LedgerCo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LedgerCo.start(args);
	}

	public static void start(String[] args) {
		String filePath = "resources/inputs1.txt"; // default file
		if (args != null && args.length > 0) {
			filePath = args[0];
		}

		Path path = Paths.get(filePath);
//		System.out.println(path.toAbsolutePath());
		try {
			Files.lines(path).forEach(line -> {
				CommandExecutor.executeInputCommand(line);
			});
		} catch (IOException e) {
			System.out.println("Ex during reading file");
		}
	}
}
