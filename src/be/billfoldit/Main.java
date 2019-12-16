package be.billfoldit;

import be.billfoldit.views.ConsoleView;
import be.billfoldit.views.GuiView;
import be.billfoldit.views.View;

public class Main {
	public static void main(String[] args) {
		boolean isGui = args.length > 1 && args[0].equalsIgnoreCase("--gui");

		Controller controller = new Controller();

		View view = isGui ? new GuiView(controller) : new ConsoleView(controller);
		view.start();
	}
}
