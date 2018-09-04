package com.artoo.rules.model;

public class Score {
	private float score = 0;

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	public void setScore(int score, float weight) {
		this.score += (score * (weight / 100));
	}
}
