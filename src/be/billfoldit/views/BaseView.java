package be.billfoldit.views;

import be.billfoldit.Controller;

/**
 * @author Aymeric Ponjée
 */

public abstract class BaseView implements View {
	protected final Controller controller;

	public BaseView(Controller controller) {
		this.controller = controller;
	}

}
