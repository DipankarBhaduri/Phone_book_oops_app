public interface Phone {
    void powerOn() ;
    void callNumber( String phoneNO);
    void receiveCAll( String phoneNO);
    boolean answerCall();
    boolean isRinging();
}
