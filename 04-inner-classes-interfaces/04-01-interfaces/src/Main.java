public class Main {
  public static void main(String[] args) {
    ITelephone raphaPhone;
    raphaPhone = new DeskPhone(123456);
    raphaPhone.powerOn();
    raphaPhone.callPhone(123456);

    raphaPhone = new MobilePhone(456);
    raphaPhone.powerOn();
    raphaPhone.callPhone(456);
    raphaPhone.answer();
  }
}
