import java.sql.SQLOutput;

public class Landline implements Phone {
    private String myPhoneNo ;
    private boolean isRinging;
    private boolean isPowerOn;

    public Landline ( String myPhoneNo ){
        this.isPowerOn = true ;
        this.isRinging = false ;
        this.myPhoneNo = myPhoneNo ;
    }

    public String getMyPhoneNo() {
        return myPhoneNo;
    }

    public void setMyPhoneNo(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    @Override
    public void powerOn() {
        this.isPowerOn = true ;
    }

    @Override
    public void callNumber( String phoneNo) {
        if ( isPowerOn == true ){
            System.out.println("You are dialing the to "+phoneNo);
        } else {
            System.out.println("Your landline is off");
        }
        return ;
    }

    @Override
    public void receiveCAll( String myPhoneNo) {
       if (isPowerOn && myPhoneNo.equals(myPhoneNo)){
           this.isRinging = true ;
           System.out.println("Hey "+myPhoneNo+ " You are receiving a call");
       } else {
           System.out.print("Call not Received");
       }
       return ;
    }

    @Override
    public boolean answerCall() {
        if ( isRinging == true ){
            System.out.println("Call answered");
            this.isRinging = false ;
            return true ;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        if ( isRinging == true){
            return true ;
        }
        return false ;
    }
}
