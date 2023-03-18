package com.bt18022023;

import com.shared.SharedMethods;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class Bai4 {

  static int n;
  static String[] fullNames, abilities;
  static float[] scores;
  static SharedMethods sm = new SharedMethods();

  static void sortArraysByFloat(float[] floats, String[] fullNames, String[] abilities) {
    // Create an array of indices from 0 to floats.length-1
    Integer[] indices = IntStream.range(0, floats.length).boxed().toArray(Integer[]::new);
    Arrays.sort(indices, Comparator.comparing(i -> floats[i]));

    // Rearrange all arrays based on the sorted indices
    float[] sortedFloats = new float[floats.length];
    String[] sortedFullNames = new String[fullNames.length];
    String[] sortedAbilities = new String[abilities.length];

    for (int i = 0; i < indices.length; i++) {
      sortedFloats[i] = floats[indices[i]];
      sortedFullNames[i] = fullNames[indices[i]];
      sortedAbilities[i] = abilities[indices[i]];
    }

    System.arraycopy(sortedFloats, 0, floats, 0, floats.length);
    System.arraycopy(sortedFullNames, 0, fullNames, 0, fullNames.length);
    System.arraycopy(sortedAbilities, 0, abilities, 0, abilities.length);
  }

  static String[] getAbilities(float[] scores) {
    int n = scores.length;
    String[] abilities = new String[n];
    for (int i = 0; i < n; i++) {
      if (scores[i] < 5) {
        abilities[i] = "Yếu";
      } else if (scores[i] < 6.5) {
        abilities[i] = "Trung bình";
      } else if (scores[i] < 7.5) {
        abilities[i] = "Khá";
      } else if (scores[i] < 9) {
        abilities[i] = "Giỏi";
      } else {
        abilities[i] = "Xuất sắc";
      }
    }
    return abilities;
  }

  static void print(String[] fullNames, float[] scores, String[] abilities) {
    int n = fullNames.length;
    for (int i = 0; i < n; i++) {
      System.out.println("Sinh viên " + i + ":");
      System.out.println("Họ tên: " + fullNames[i]);
      System.out.println("Điểm: " + scores[i]);
      System.out.println("Học lực: " + abilities[i]);
      System.out.println();
    }
  }

  public static void main(String[] args) {
    n = sm.inputInt("số sinh viên", "positive");
    sm.sc.nextLine();
    fullNames = sm.inputStringArr(n, "Họ tên");
    scores = sm.inputFloatArray(n, "Điểm", "0..10");
    abilities = getAbilities(scores);
    System.out.println("Danh sách sinh viên:");
    print(fullNames, scores, abilities);
    sortArraysByFloat(scores, fullNames, abilities);
    System.out.println("Danh sách sinh viên sau khi sắp xếp theo điểm tăng dần:");
    print(fullNames, scores, abilities);
  }
}
