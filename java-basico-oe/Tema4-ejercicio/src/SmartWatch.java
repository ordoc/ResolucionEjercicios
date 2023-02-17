

public class SmartWatch extends SmartDevice {

    String tipo;

    public SmartWatch(String imei, String serial, String modelo, String marca, String tipo) {
        super(imei, serial, modelo, marca);
        this.tipo = tipo;
    }

    public SmartWatch() {

    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "tipo='" + tipo + '\'' +
                ", imei='" + imei + '\'' +
                ", serial='" + serial + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
