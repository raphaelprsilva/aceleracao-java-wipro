public class MobilePhone implements ITelephone {
  private int myNumber;
  private boolean isRinging;
  private boolean isOn = false;

  public MobilePhone(int myNumber) {
    this.myNumber = myNumber;
  }

  @Override
  public void powerOn() {
    isOn = true;
    System.out.println("Mobile phone powered up");
  }

  @Override
  public void dial(int phoneNumber) {
    if (this.isOn) {
      System.out.println("Now ringing " + phoneNumber + " on deskphone");
    } else {
      System.out.println("phone is switched off");
    }
  }

  @Override
  public void answer() {
    if (this.isRinging) {
      System.out.println("Answering the mobile phone");
      isRinging = false;
    }
  }

  @Override
  public boolean callPhone(int phoneNumber) {
    if (phoneNumber == myNumber && isOn) {
      isRinging = true;
      System.out.println("Melody ring");
    } else {
      isRinging = false;
      System.out.println("Mobile phone not on or different number");
    }
    return isRinging;
  }

  @Override
  public boolean isRinging() {
    return false;
  }
}
