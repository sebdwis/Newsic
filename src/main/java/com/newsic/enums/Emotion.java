package com.newsic.enums;

/**
 * Created by Sebastian on 2/10/2018.
 */
public enum Emotion {
  HAPPY(0.5, 1.0),
  KINDAHAPPY(0.45, 0.65),
  NEUTRAL(0.4, 0.6),
  KINDASAD(0.2, 0.5),
  SAD(0.0, 0.4);

  private final double lower;
  private final double upper;

  Emotion(double lower, double upper) {
    this.lower = lower;
    this.upper = upper;
  }

  public double getLower() {
    return this.lower;
  }

  public double getUpper() {
    return this.upper;
  }
}
