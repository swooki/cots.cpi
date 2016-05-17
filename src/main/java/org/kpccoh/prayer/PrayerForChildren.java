package org.kpccoh.prayer;

import org.springframework.stereotype.Component;

@Component("prayerForChildren")
public class PrayerForChildren implements Prayer {
	private String childName = "Haerim";

	public void pray() {
		System.out.print("Praying for " + childName);
	}
}
