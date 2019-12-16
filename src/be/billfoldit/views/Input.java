package be.billfoldit.views;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import be.billfoldit.TypeMember;

/**
 * Class that ask for a choice in the main menu (CLI view) and checks if a
 * String, Double or int has been entered.
 * 
 * @author Melvin Campos Casares
 */
public class Input {
	private static final Scanner scanner = new Scanner(System.in);

	/**
	 * Method that checks if a String has been entered or not
	 * 
	 * @param name the entered String
	 * @return
	 */
	public static Optional<String> askforString(String name) {
		prompt(name);
		if (scanner.hasNext()) {
			String next = scanner.next();
			return Optional.of(next);
		}

		return Optional.empty();
	}

	/**
	 * Method that checks if a Double has been entered or not
	 * 
	 * @param name the entered String
	 * @return
	 */
	public static Optional<Double> askForDouble(String name) {
		double value;
		while (true) {
			prompt(name);
			if (scanner.hasNext()) {
				String next = scanner.next();
				try {
					value = Double.parseDouble(next);
				} catch (NumberFormatException e) {
					continue;
				}
				return Optional.of(value);
			}
		}
	}

	/**
	 * Method that checks if a int value has been entered or not
	 * 
	 * @param name the entered String
	 * @return
	 */
	public static Optional<Integer> askForInt(String name) {
		int value;
		while (true) {
			prompt(name);

			if (scanner.hasNext()) {
				String next = scanner.next();
				try {
					value = Integer.parseInt(next);
				} catch (NumberFormatException e) {
					continue;
				}
				return Optional.of(value);
			}
		}
	}

	/**
	 * Method that ask for a choice in the main menu of the CLI view
	 * 
	 * @param commands a number entered between those presented in the main menu
	 * @return the entered choice
	 */
	public static String askChoice(List<String> commands) {
		if (commands == null || commands.isEmpty()) {
			throw new IllegalArgumentException();
		}

		while (true) {
			int i = 0;
			for (String choice : commands) {
				System.out.println(i + " " + choice);
				i++;
			}
			System.out.println();

			Optional<Integer> index = askForInt("Enter a number");

			if (index.isEmpty()) {
				throw new IllegalArgumentException();
			}

			var indexValue = index.get();

			if (indexValue < 0 || indexValue >= commands.size()) {
				continue;
			}

			return commands.get(index.get());
		}

	}

	private static void prompt(String name) {
		String prompt = name + " > ";
		System.out.print(prompt);
	}

}
