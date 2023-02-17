import java.util.function.DoubleToIntFunction;

public class Main {
    public static void main(String[] args) {


        SmartPhone smartPhone = new SmartPhone("123", "123456789", "nokiaXYZ", "nokia", "14mp");
        SmartWatch smartWatch = new SmartWatch();

        /* smartPhone.imei = "123";
        smartPhone.camara = "14mp";
        smartPhone.marca = "nokia";
        smartPhone.serial = "123456789";
        smartPhone.modelo = "nokiaXYZ"; */

        System.out.println(smartPhone);

        smartWatch.serial = "123ugjnkj";
        smartWatch.tipo = "sports";
        smartWatch.imei = "123jbbk89";
        smartWatch.marca = "garmin";
        smartWatch.modelo = "garminXYZ";

        System.out.println(smartWatch);
    }
}