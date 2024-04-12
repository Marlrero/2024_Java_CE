import java.util.HashMap;
import java.util.Map;

class Day {
    private String day;
    public Day(String day) { this.day = day; }
    public String getDay() { return day; }
}

public class DayFactory {
	// Day 객체를 저장하는 캐싱 저장소 역할
    private static final Map<String, Day> cache = new HashMap<>();
	
    // 자주 사용될것 같은 Day 객체 몇가지를 미리 등록한다
    static { 
    	cache.put("Monday", new Day("Monday")); 
        cache.put("Tuesday", new Day("Tuesday")); 
        cache.put("Wednesday", new Day("Wednesday")); 
    }
	
    // 정적 팩토리 메서드 (인스턴스에 대해 철저한 관리)
    public static Day from(String day) {
        if(cache.containsKey(day)) {
            // 캐시 되어있으면 그대로 가져와 반환
            System.out.println("해당 요일은 캐싱되어 있습니다.");
            return cache.get(day);
        } else {
            // 캐시 되어 있지 않으면 새로 생성하고 캐싱하고 반환
            System.out.println("해당 요일은 캐싱되어 있지 않아 새로 생성하였습니다.");
            Day d = new Day(day);
            cache.put(day, d);
            return d;
        }
    }
    
	public static void main(String[] args) {
	    // 이미 등록된 요일 가져오기
	    Day day = DayFactory.from("Monday");
	    System.out.println(day.getDay());

	    // 등록되지 않은 요일 가져오기
	    day = DayFactory.from("Friday");
	    System.out.println(day.getDay());	
	}
}
