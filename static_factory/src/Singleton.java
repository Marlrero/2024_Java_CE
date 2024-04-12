
public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    // 정적 팩토리 메서드
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    
	public static void main(String[] args) {
	    Singleton s1 = Singleton.getInstance();
	    Singleton s2 = Singleton.getInstance();
	    Singleton s3 = Singleton.getInstance();

	    System.out.println(s1);
	    System.out.println(s2);
	    System.out.println(s3);

	    System.out.println(s1 == s2);
	    System.out.println(s1 == s3);
	}
}
