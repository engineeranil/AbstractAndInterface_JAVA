public class ABank {
    private String bankName;
    private String terminalId;
    private String passaword;

    public ABank(String bankName, String terminalId, String passaword) {
        this.bankName = bankName;
        this.terminalId = terminalId;
        this.passaword = passaword;
    }
    public boolean connect(){
        System.out.println(this.bankName+" CONNECTED SUCCESSFULLY");
        return true;
    }
    boolean sendCardInfo(){
       System.out.println("AWAITING A REPLY FROM THE BANK...");
       System.out.println("PROCESS IS SUCCESSFULY :) ");
       return true;
    }


    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getPassaword() {
        return passaword;
    }

    public void setPassaword(String passaword) {
        this.passaword = passaword;
    }



}
