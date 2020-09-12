package Interface.ok;


public class MobileDisk implements Usb {

    @Override
    public void connect(Usb object) {
        System.out.println("连入设备的usb接口是：" + object.getUsbType());
    }

    @Override
    public String getUsbType() {
        return "usb2.0";
    }


}
