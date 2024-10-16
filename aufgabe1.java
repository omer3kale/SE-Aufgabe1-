package prazensaufgaben;

public class aufgabe1 {
	public static void main (String[] args) {
		int zahl = 6;
		System.out.println(aufgabe1(zahl));
	}
	
public static String aufgabe1 (int zahl) {
	if (zahl % 3 == 0 && zahl % 5 == 0) {
        return "Foobar";
      } else if (zahl % 3 == 0) {
          return "Foo";
      } else if (zahl % 5 == 0) {
          return "Bar";
      } else {
          return String.valueOf(zahl);
      }
  }
}

