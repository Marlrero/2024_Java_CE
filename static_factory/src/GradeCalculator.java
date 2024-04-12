interface Grade { String toText(); }

class A implements Grade {
    @Override
    public String toText() {return "A";}
}

class B implements Grade {
    @Override
    public String toText() {return "B";}
}

class C implements Grade {
    @Override
    public String toText() {return "C";}
}

class D implements Grade {
    @Override
    public String toText() {return "D";}
}

class F implements Grade {
    @Override
    public String toText() {return "F";}
}

public class GradeCalculator {
	// 정적 팩토리 메서드
    public static Grade of(int score) {
        if (score >= 90) {
            return new A();
        } else if (score >= 80) {
            return new B();
        } else if (score >= 70) {
            return new C();
        } else if (score >= 60) {
            return new D();
        } else {
            return new F();
        }
    }
    
    public static void main(String[] args) {
        String jeff_score = GradeCalculator.of(36).toText();
        String herryPorter_score = GradeCalculator.of(99).toText();

        System.out.println(jeff_score); // F
        System.out.println(herryPorter_score); // A
	}
}
