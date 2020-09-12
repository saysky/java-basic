package Interface.ok;


public class DeskComputer implements Usb {

    @Override
    public void connect(Usb object) {
        System.out.println("连入设备的usb接口是：" + object.getUsbType());

    }

    @Override
    public String getUsbType() {
        return "usb3.0";

    }


}
