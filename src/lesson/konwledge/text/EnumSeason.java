package lesson.konwledge.text;

public enum EnumSeason {

	//实例化
	SPRING("春天","一江春水向东流"),//注意逗号
	SUMMER("夏天","映日荷花别样红"),
	FALL("秋天","秋水共长天一色"),
	WINTER("冬天","忽如一夜春风来");
	
	//属性为私有常量
	private final String name;
	
	private final String desc;
	
	//私有构造方法
	private EnumSeason(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDesc() {
		return desc;
	}
}
