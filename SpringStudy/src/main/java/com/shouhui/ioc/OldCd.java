package com.shouhui.ioc;

import org.springframework.stereotype.Component;

@Component
public class OldCd implements Cd {
	public void play() {
		System.out.println("OldCd.play()");
	}
}
