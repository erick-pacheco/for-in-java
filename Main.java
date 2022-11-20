class Main {

  public static void main(String[] args) {
    int[] array1 = { 4, 20, 15, 2, 19 };
    String[] stringArr1 = { "Hello", "there", "how", "are", "you?" };

    /* Section 3 */
    log(array1[2]);

    /* Section 4 */
    log(stringArr1[1]);

    /* Section 5 */
    log(array1.length);

    /* Section 6 */
    log(stringArr1.length);

    /* Section 7: reformatted */
    for (int val : array1) {
      log(val);
    }

    /* Section 8: reformatted */
    for (String word : stringArr1) {
      log(word);
    }
  }

  public static void log(Object message) {
    System.out.println(message);
  }
}