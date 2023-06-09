public class BBank implements IBank {
    private String bankName;
    private String terminalId;
    private String passaword;

    public BBank(String bankName, String terminalId, String passaword) {
        this.bankName = bankName;
        this.terminalId = terminalId;
        this.passaword = passaword;
    }
    public void connect(){
        System.out.println(this.bankName+" CONNECTED SUCCESSFULLY");
    }
    public void sendCardInfo(){
        System.out.println("AWAITING A REPLY FROM THE BANK...");
        System.out.println("PROCESS IS SUCCESSFULY :) ");
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
