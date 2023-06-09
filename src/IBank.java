public interface IBank {
    String hostIpAdress = "177.1.1.1";
     boolean connect(String ipAdress);

    boolean sendCardInfo(String cardNumber);

}
