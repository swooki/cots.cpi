package org.kpccoh.prayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Prayerer {
	private Prayer prayer;
	
	@Autowired
	public Prayerer(Prayer prayer) {
		this.prayer = prayer;
	}
	
	public void pray() {
		prayer.pray();
	}
}
