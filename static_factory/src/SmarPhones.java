interface SmarPhone {}

class Galaxy implements SmarPhone {}
class IPhone implements SmarPhone {}
class Huawei implements SmarPhone {}

public class SmarPhones {
    public static SmarPhone getSamsungPhone() {
        return new Galaxy();
    }

    public static SmarPhone getApplePhone() {
        return new IPhone();
    }

    public static SmarPhone getChinesePhone() {
        return new Huawei();
    }
}
