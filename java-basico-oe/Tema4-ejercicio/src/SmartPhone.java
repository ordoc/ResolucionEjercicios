

public class SmartPhone extends SmartDevice{

    String camara;

    public SmartPhone(String imei, String serial, String modelo, String marca, String camara) {

        super(imei, serial, modelo, marca);
        this.camara = camara;
    }

    public SmartPhone() {

    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "camara='" + camara + '\'' +
                ", imei='" + imei + '\'' +
                ", serial='" + serial + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
