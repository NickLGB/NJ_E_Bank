package util;

//数据库timestamp类型和java的Date类型间的转换
public class Date{

	public static java.sql.Timestamp d2t(java.util.Date d) {
		if (null == d)
			return null;
		return new java.sql.Timestamp(d.getTime());
	}

	public static java.util.Date t2d(java.sql.Timestamp t) {
		if (null == t)
			return null;
		return new java.util.Date(t.getTime());
	}
}
