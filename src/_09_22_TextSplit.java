import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Foo {
  public static void main(String args[]) {

    if (args.length == 0) {                   // args.length 는 옵션 개수
      System.err.println("Input Filename...");
      System.exit(1);                         // 읽을 파일명을 주지 않았을 때는 종료
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
        System.err.println(e); // 에러가 있다면 메시지 출력
        System.exit(1);
    }

  }
}