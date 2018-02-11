package com.newsic.enums;

import sun.nio.cs.IBM737;

/**
 * Created by Sebastian on 2/10/2018.
 */
public enum Chord {
  MAJOR(Emotion.HAPPY),
  MINOR(Emotion.SAD),
  MAJOR7(Emotion.KINDAHAPPY),
  MINOR7(Emotion.KINDASAD),
  MAJOR6(Emotion.KINDAHAPPY),
  MINOR6(Emotion.KINDAHAPPY),
  MAJOR9(Emotion.KINDASAD),
  MINOR9(Emotion.KINDASAD),
  SUS4(Emotion.NEUTRAL),
  SUS2(Emotion.NEUTRAL),
  DIM(Emotion.SAD),
  AUG(Emotion.KINDASAD);

  private final Emotion emotion;

  Chord(Emotion emotion) {
    this.emotion = emotion;
  }

  public Emotion getEmotion() {
    return this.emotion;
  }



}
