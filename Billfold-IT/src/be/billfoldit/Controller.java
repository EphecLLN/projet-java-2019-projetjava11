package be.billfoldit;

import java.util.ArrayList;
import java.util.List;

public class Controller {
	private static List<Data> dataList = new ArrayList<Data>();

	public static void add(Data data) {
		dataList.add(data);
		System.out.println(dataList);
	}
}
