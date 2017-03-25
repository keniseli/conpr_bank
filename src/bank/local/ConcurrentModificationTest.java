package bank.local;

public class ConcurrentModificationTest {
  public static void main(String[] args) {
    final ConprBank bank = new ConprBank();
    new Thread(() -> {
      while(true) {
        bank.createAccount("ME");
      }
    }).start();
    new Thread(() -> {
      while(true) {
        bank.getAccountNumbers();
      }
    }).start();
  }
}
