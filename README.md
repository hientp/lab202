# Enterprise-Java-Development-2.02

### Review of Lab 2.02 (Tim Acosta):

Hinweis: Nie ungenutzten Code pushen. Das hat hier keine Relevanz,
aber in echten Projekten sollte ein push auf Github wirklich nur die Dinge beinhalten die funktioniere und benötigt sind.

 * MathTesting - Simple Mathematische Logik angewendet, da Ungerade Zahlen ja immer mit 1,3,5,7 oder 9 enden. Eine andere Form ist den Modulus Operator (Restwert-Operator) anzuwenden: http://www.tutego.de/blog/javainsel/2019/04/der-restwert-operator/
Damit können wir prüfen ob der Restwert 0 ist (Gerade Zahl) oder ungleich 0 (Ungerade Zahl).

 ```java

  public static int[] oddsToArray(int num) {
  		if (num <= 0) {
  			throw new IllegalArgumentException();
  		}
  		ArrayList<Integer> result = new ArrayList<Integer>();
  		for (int i = 1; i <= num; i++) {
  			if (i % 2 != 0) {
  				result.add(i);
  			}
  		}
  		return result.stream().mapToInt(i->i).toArray();
  	}

   ```

   * Breakword - Funktioniert :)! Hier noch eine andere Möglichkeit

    ```java

    public static boolean containsReservedKeyword(String string) {
           if (string == null) {
               return false;
           }
           for (String keyword : keywords) {
               if (string.toLowerCase().contains(keyword)) {
                   return true;
               }
           }
           return false;
       }
  

      ```



