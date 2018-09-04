package com.artoo.rules.util;

import com.artoo.rules.model.Score;

public class Out {
	public void p(String text) {
		System.out.println(System.currentTimeMillis() + "-> " + text);
	}
	
	public void score(Score s) {
		System.out.println(System.currentTimeMillis() + "-> Score is " + s.getScore());
	}
}
