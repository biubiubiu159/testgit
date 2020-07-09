package lesson.konwledge.text;

public class TestEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumSeason[] values =  EnumSeason.values();
		for(EnumSeason season : values) {
			System.out.println(season.name()+"是"+season.getName()+" : "+season.getDesc());
		}
	}
}
