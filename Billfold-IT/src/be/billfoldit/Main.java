package be.billfoldit;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// add, graph
		String bonjourValues = Arrays.toString(Bonjour.values());
		System.out.println("Values of bonjour: " + bonjourValues);

		if (args.length == 0) {
			System.out.println("Please give an argument...");
		} else if (args[0].equals("add")) {
			double value = 0;
			Bonjour bonjour = null;
			System.out.println("add");

			if (args.length < 3) {
				System.out.println("Not enough arguments...");
				System.exit(1);
			}

			try {
				value = Double.parseDouble(args[1]);
			} catch (NumberFormatException e) {
				System.out.println("Not a number, please give one...");
				System.exit(1);
			}

			try {
				bonjour = Bonjour.valueOf(args[2].toUpperCase());
			} catch (IllegalArgumentException e) {
				System.out.println("Incorrect value...");
				System.exit(1);
			}

			Data data = new Data(bonjour, value);
			Controller.add(data);

		} else if (args[0].equals("graph")) {
			System.out.println("graph");
		} else {
			System.out.println("Arguments are: add, graph");
		}

	}
}
