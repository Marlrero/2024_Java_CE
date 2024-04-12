interface SmartPhone {
    public static SmartPhone getSamsungPhone() {
        return new GalaxyP();
    }

    public static SmartPhone getApplePhone() {
        return new IPhoneP();
    }

    public static SmartPhone getChinesePhone() {
        return new HuaweiP();
    }
    
    public static SmartPhone getPhone(int price) {
        if(price > 100000) {
            return new IPhoneP();
        }

        if(price > 50000) {
            return new GalaxyP();
        }

        return new HuaweiP();
    }
}

class GalaxyP implements SmartPhone {}
class IPhoneP implements SmartPhone {}
class HuaweiP implements SmartPhone {}