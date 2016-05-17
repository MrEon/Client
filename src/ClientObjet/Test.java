package ClientObjet;

import communication.requests.Request;

import java.io.Serializable;

/**
 * @author Zineb El HAOUARI
 */
public class Test extends Request {
  String message;
  static String himessg = "Hi ! ";
  static String byemessg = "Bye !";

  public Test() {
    this.message = "Hello World !";
  }
}
