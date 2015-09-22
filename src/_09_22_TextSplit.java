import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Foo {
  public static void main(String args[]) {

    if (args.length == 0) {                   // args.length �� �ɼ� ����
      System.err.println("Input Filename...");
      System.exit(1);                         // ���� ���ϸ��� ���� �ʾ��� ���� ����
    }

    try {
      ////////////////////////////////////////////////////////////////
      BufferedReader in = new BufferedReader(new FileReader(args[0]));
      String s;

      while ((s = in.readLine()) != null) {
        System.out.println(s);
      }
      in.close();
      ////////////////////////////////////////////////////////////////
    } catch (IOException e) {
        System.err.println(e); // ������ �ִٸ� �޽��� ���
        System.exit(1);
    }

  }
}