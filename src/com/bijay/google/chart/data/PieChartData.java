package com.bijay.google.chart.data;

import java.util.ArrayList;
import java.util.List;

public class PieChartData {

	private static final List<KeyValue> pieDataList;

	static {
		pieDataList = new ArrayList<PieChartData.KeyValue>();
		pieDataList.add(new KeyValue("Dhading", "1926"));
		pieDataList.add(new KeyValue("Kathmandu", "395"));
		pieDataList.add(new KeyValue("Gorkha", "3610"));
		pieDataList.add(new KeyValue("Nuwakot", "1121"));
		pieDataList.add(new KeyValue("Rasuwa", "1544"));
		pieDataList.add(new KeyValue("Bhaktapur", "119"));
		pieDataList.add(new KeyValue("Lalitpur", "395"));
	}

	public static List<KeyValue> getPieDataList() {
		return pieDataList;
	}

	public static class KeyValue {
		String key;
		String value;

		public KeyValue(String key, String value) {
			super();
			this.key = key;
			this.value = value;
		}

		public String getKey() {
			return key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}
}
