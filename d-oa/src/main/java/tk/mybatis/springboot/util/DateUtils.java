package tk.mybatis.springboot.util;

import tk.mybatis.springboot.model.utils.DateStyle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 日期处理相关工具类
 * @author Alan
 * DateUtils 
 * 
 * 2017-6-6  下午10:01:31
 */
public class DateUtils {
	/**
	 * 格式 yyyyMM
	 */
	public static final String	DATE_JFP_STR	= "yyyyMM";
	/**
	 * 格式 yyyy-MM-dd HH:mm:ss
	 */
	public static final String	DATE_FULL_STR	= "yyyy-MM-dd HH:mm:ss";
	/**
	 * 格式 yyyy-MM-dd HH:mm:ss|SSS
	 */
	public static final String	DATE_FULLAll_STR	= "yyyy-MM-dd HH:mm:ss|SSS";
	/**
	 * 格式 yyyy-MM-dd HH:mm:ss
	 */
	public static final String	TIME_FULL_STR	= "HH:mm:ss";
	/**
	 * 格式 yyyy-MM-dd
	 */
	public static final String	DATE_SMALL_STR	= "yyyy-MM-dd";
	/**
	 * 格式 yyMMddHHmmss
	 */
	public static final String	DATE_KEY_STR	= "yyMMddHHmmss";
	/**
	 * 格式  yyyy年MM月dd日
	 */
	public static final String	DATE_Char_STR	= "yyyy年MM月dd日";
	
	public static final String	DATE_Char_Long	= "yyyy年MM月dd日 HH时mm分ss秒";

	/**
	 * 使用预设格式提取字符串日期 yyyy-MM-dd
	 * 
	 * @param strDate
	 *            日期字符串
	 * @return
	 */
	public static Date parse(String strDate) {
		return parse(strDate, DATE_SMALL_STR);
	}
	/**
	 * 使用预设格式提取字符串日期 yyyy-MM-dd HH:mm:ss
	 * 
	 * @param strDate
	 *            日期字符串
	 * @return
	 */
	public static Date parselong(String strDate) {
		return parse(strDate, DATE_FULL_STR);
	}
	/**
	 * 使用预设格式提取字符串日期 yyyy年MM月dd日
	 * @param strDate
	 * @return
	 */
	public static Date parseChar(String strDate) {
		return parse(strDate, DATE_Char_STR);
	}
	
	public static Date parseCharLong(String strDate) {
		return parse(strDate, DATE_Char_Long);
	}
	public static Date[] parsewithDoa(String strDate) {
//		2018年01月20日 - 2018年01月20日
		strDate=strDate.replace(" ","");
		String[] mydate=strDate.split("-");
		 Date parse = parse(mydate[0]+" 00时00分00秒", DATE_Char_Long);
		 Date parse1 = parse(mydate[1]+" 23时59分59秒", DATE_Char_Long);
		 Date[] getdate={parse,parse1};
		 return getdate;
	}
	public static Date[] parsewithDoaToday() {
		Date[] parsewithDoa = parsewithDoa(getNowTimeCharLong()+"-"+getNowTimeCharLong());
//		 
		return parsewithDoa;
	}

	/**
	 * 獲取系統當前的年份
	 */
	public static Integer getYear() {
		Calendar calendar = Calendar.getInstance();
		return calendar.get(Calendar.YEAR);
	}

	/**
	 * 獲取系統當前的月份
	 * 
	 */
	public static Integer getMoth() {
		Calendar calendar = Calendar.getInstance();

		return calendar.get(Calendar.MONTH) + 1;
	}

	/**
	 * 獲取系統當前的天數
	 */
	public static Integer getDay() {
		Calendar calendar = Calendar.getInstance();
		return calendar.get(Calendar.DAY_OF_MONTH);
	}

	/**
	 * 使用用户格式提取字符串日期
	 * 
	 * @param strDate
	 *            日期字符串
	 * @param pattern
	 *            日期格式
	 * @return
	 */
	public static Date parse(String strDate, String pattern) {
		SimpleDateFormat df = new SimpleDateFormat(pattern);
		try {
			return df.parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 两个时间比较
	 * 
	 * @param date
	 * @return
	 */
	public static int compareDateWithNow(Date date1) {
		Date date2 = new Date();
		int rnum = date1.compareTo(date2);
		return rnum;
	}
	
	/**
	 * 两个时间比较
	 * 
	 * @param date
	 * @return
	 */
	public static int compareDateWithDate(Date date1,Date date2) {
		int rnum = date1.compareTo(date2);
		return rnum;
	}

	/**
	 * 两个时间比较(时间戳比较)
	 * 
	 * @param date
	 * @return
	 */
	public static int compareDateWithNow(long date1) {
		long date2 = dateToUnixTimestamp();
		if (date1 > date2) {
			return 1;
		} else if (date1 < date2) {
			return -1;
		} else {
			return 0;
		}
	}

	/**
	 * 获取系统当前时间  yyyy-MM-dd HH:mm:ss
	 * 
	 * @return
	 */
	public static String getNowTime() {
		return getNowTime(DATE_FULL_STR);
	}
	/**
	 * yyyy年MM月dd日	
	 * @return
	 */
	public static String getNowTimeCharLong() {
		return getNowTime(DATE_Char_STR);
	}
	/**
	 * 获取系统当前时间  yyyy-MM-dd 
	 * 
	 * @return
	 */
	public static String getNowTime2() {
		return getNowTime(DATE_SMALL_STR);
	}
	/**
	 * 获取系统当前时间  yyyy-MM-dd HH:mm:ss|SSS
	 *@return
	 *
	 *
	 */
	public static String getNowTime3() {
		return getNowTime(DATE_FULLAll_STR);
	}
	 
	
	/**
	 * 获取系统当前时间  yyyyMMdd
	 * 
	 * @return
	 */
	public static String getNowSimpleTime() {
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
		return df.format(new Date());
	}
	
	/**
	 * 获取系统当前时间    Date
	 *@return Date
	 *
	 *@author Alan 创建于:2017 2017-6-16 上午9:57:47
	 *
	 */
	public static Date getNowDate() {
		Date date=new Date();
		SimpleDateFormat df = new SimpleDateFormat(DATE_FULL_STR);
		try {
			date=df.parse(df.format(new Date()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	/**
	 * 获取系统当前时间
	 * 
	 * @return type 格式
	 */
	public static String getNowTime(String type) {
		SimpleDateFormat df = new SimpleDateFormat(type);
		return df.format(new Date());
	}

	/**
	 * 获取系统当前计费期
	 * 
	 * @return
	 */
	public static String getJFPTime() {
		SimpleDateFormat df = new SimpleDateFormat(DATE_JFP_STR);
		return df.format(new Date());
	}

	/**
	 * 将当前日期转换成毫秒
	 * 
	 * @return long 时间戳
	 */
	public static long dateToUnixTimestamp() {
		long timestamp = new Date().getTime();
		return timestamp;
	}

	/**
	 * 獲取某年月份的天數
	 */
	public static Integer getMonthDay(Integer year, Integer month) {
		Calendar a = Calendar.getInstance();
		a.set(Calendar.YEAR, year);
		a.set(Calendar.MONTH, month - 1);
		a.set(Calendar.DATE, 1);
		a.roll(Calendar.DATE, -1);
		int maxDate = a.get(Calendar.DATE);
		return maxDate;
	}
	
	/**
	 * 获取当前月份第一天时间戳
	 */
	public static Date getMonthfirstDay(){
		Calendar calendar = Calendar.getInstance();    
		calendar.add(Calendar.MONTH, 0);
		calendar.set(Calendar.DAY_OF_MONTH,1);
		return calendar.getTime();
	}

	/**
	 * 日期转换为字符串
	 */
	public static String DataToString(Date date, String type) {
		SimpleDateFormat formatter = new SimpleDateFormat(type);
		return formatter.format(date);
	}
	/**
	 * 日期转换为字符串  yyyy-MM-dd HH:mm:ss
	 */
	public static String DataToString(Date date) {
		SimpleDateFormat formatter = new SimpleDateFormat(DATE_FULL_STR);
		return formatter.format(date);
	}	
	
	/**
	 * 日期转换为字符串  yyyy-MM-dd
	 */
	public static String DataToStringSmall(Date date) {
		SimpleDateFormat formatter = new SimpleDateFormat(DATE_SMALL_STR);
		return formatter.format(date);
	}
	/**
	 * 日期转换为字符串  yyyy年MM月dd日
	 */
	public static String DataToStringChar(Date date) {
		SimpleDateFormat formatter = new SimpleDateFormat(DATE_Char_STR);
		return formatter.format(date);
	}
	/**
	 * 日期转换为字符串  yyyy年MM月dd日 HH时mm分ss秒
	 * @param date
	 * @return
	 */
	public static String DataToStringCharLong(Date date) {
		SimpleDateFormat formatter = new SimpleDateFormat(DATE_Char_Long);
		return formatter.format(date);
	}	
	
	/**
	 * 日期转换为字符串  HH:mm:ss
	 */
	public static String DataToTime(Date date) {
		SimpleDateFormat formatter = new SimpleDateFormat(TIME_FULL_STR);
		return formatter.format(date);
	}

	/**
	 * 后多少天 的時間
	 */
	public static Date getNextDay(Date date, int day) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, +day);// +1今天的时间加一天
		date = calendar.getTime();
		return date;
	}

	/**
	 * 前多少天 的時間
	 */
	public static Date getToptDay(Date date, int day) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, -day);// -1今天的时间减一天
		date = calendar.getTime();
		return date;
	}
	/**
	 * 前多少年  
	 *@param date
	 *@param year
	 *@return Date
	 *
	 *@author Alan 创建于:2017 2017-10-26 上午11:16:00
	 *
	 */
	public static Date getYearAfter(Date date, int year) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.YEAR, -year);// -1前一年
		date = calendar.getTime();
		return date;
	}
	/**
	 *后多少年
	 *@param date
	 *@param year
	 *@return Date
	 *
	 *@author Alan 创建于:2017 2017-10-26 上午11:15:53
	 *
	 */
	public static Date getYearBefore(Date date, int year) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.YEAR, +year);// +1 后一年
		date = calendar.getTime();
		return date;
	}

	/**
	 * 前多少小時 的時間
	 */
	public static Date getToptHH(Date date, int HH) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.HOUR_OF_DAY, -HH);// -1今天的时间减一小时
		date = calendar.getTime();
		return date;
	}

	/**
	 * 后多少小時 的時間
	 */
	public static Date getNestHH(Date date, int HH) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.HOUR_OF_DAY, +HH);// +1今天的时间加一小时
		date = calendar.getTime();
		return date;
	}
	/**
	 * 获取当前时间的整点
	 *@return
	 *
	 *@author Alan 创建于:2017 2017-10-20 下午5:10:06
	 *
	 */
	public static Integer getPointTime() {
		Date date =new Date(); 
		SimpleDateFormat formatter = new SimpleDateFormat("HH"); 
		Integer time = Integer.parseInt(formatter.format(date));
		return time;
	}
	/**
	 * 取得当前时间的后多少分钟的时间  格式yyyy-MM-dd HH:mm:ss
	 *@param minute
	 *@return
	 *
	 *@author Alan 创建于:2017 2017-10-21 上午9:09:39
	 *
	 */
	public static String getNextTime(Integer minute) {
		Date now = new Date();
		return getNextTime(now,minute);
	}
	/**
	 * 
	 * 取得指定时间的后多少分钟的时间  格式yyyy-MM-dd HH:mm:ss
	 *@param now
	 *@param minute
	 *@return
	 *
	 *@author Alan 创建于:2017 2017-10-21 上午9:20:11
	 *
	 */
	public static String getNextTime(Date now,Integer minute) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date afterDate = new Date(now .getTime() + (minute*60000));
		return sdf.format(afterDate);
	}
	/**
	 * 取得当前时间的后多少分钟的时间  Date类型
	 *@param minute
	 *@return
	 *
	 *@author Alan 创建于:2017 2017-10-21 上午9:12:16
	 *
	 */
	  
	public static Date getNextDTime(Integer minute) {
		Date now = new Date();
		return getNextDTime(now,minute);
	}
	/**
	 * 取得指定时间的后多少分钟的时间  Date类型
	 *@param minute
	 *@return
	 *
	 *@author Alan 创建于:2017 2017-10-21 上午9:12:16
	 *
	 */
	
	public static Date getNextDTime(Date data,Integer minute) {
		Date afterDate = new Date(data.getTime() + (minute*60000));
		return afterDate;
	}
	
	/**
	   * 时间前推或后推分钟,其中JJ表示分钟.
	   */
	  public static Date getPreTime(String sj1, String jj) {
		  Calendar calendar = Calendar.getInstance();
		
		  Date date=new Date();
	    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    try {
	      Date date1 = format.parse(sj1);
	      long Time = (date1.getTime() / 1000) + Integer.parseInt(jj) * 60;
	      date1.setTime(Time * 1000);
	    } catch (Exception e) {
	    }
	    return date;
	  }
	
	
	
	 /** 
     * 获取SimpleDateFormat 
     * @param parttern 日期格式 
     * @return SimpleDateFormat对象 
     * @throws RuntimeException 异常：非法日期格式 
     */  
    private static SimpleDateFormat getDateFormat(String parttern) throws RuntimeException {  
        return new SimpleDateFormat(parttern);  
    }  
    
	 /** 
     * 获取日期字符串的日期风格。失敗返回null。 
     * @param date 日期字符串 
     * @return 日期风格 
     */  
    public static DateStyle getDateStyle(String date) {
        DateStyle dateStyle = null;  
        Map<Long, DateStyle> map = new HashMap<Long, DateStyle>();  
        List<Long> timestamps = new ArrayList<Long>();  
        for (DateStyle style : DateStyle.values()) {  
            Date dateTmp = StringToDate(date, style.getValue());  
            if (dateTmp != null) {  
                timestamps.add(dateTmp.getTime());  
                map.put(dateTmp.getTime(), style);  
            }  
        }  
        dateStyle = map.get(getAccurateDate(timestamps).getTime());  
        return dateStyle;  
    }  
    
    /** 
     * 将日期字符串转化为日期。失败返回null。 
     * @param date 日期字符串 
     * @return 日期 
     */  
    public static Date StringToDate(String date) {  
        DateStyle dateStyle = null;  
        return StringToDate(date, dateStyle);  
    }  
    
    /** 
     * 将日期字符串转化为日期。失败返回null。 
     * @param date 日期字符串 
     * @param parttern 日期格式 
     * @return 日期 
     */  
    public static Date StringToDate(String date, String parttern) {  
        Date myDate = null;  
        if (date != null) {  
            try {  
                myDate = getDateFormat(parttern).parse(date);  
            } catch (Exception e) {  
            }  
        }  
        return myDate;  
    }  
    
    /** 
     * 将日期字符串转化为日期。失败返回null。 
     * @param date 日期字符串 
     * @param dateStyle 日期风格 
     * @return 日期 
     */  
    public static Date StringToDate(String date, DateStyle dateStyle) {  
        Date myDate = null;  
        if (dateStyle == null) {  
            List<Long> timestamps = new ArrayList<Long>();  
            for (DateStyle style : DateStyle.values()) {  
                Date dateTmp = StringToDate(date, style.getValue());  
                if (dateTmp != null) {  
                    timestamps.add(dateTmp.getTime());  
                }  
            }  
            myDate = getAccurateDate(timestamps);  
        } else {  
            myDate = StringToDate(date, dateStyle.getValue());  
        }  
        return myDate;  
    }  
    
    /** 
     * 获取精确的日期 
     * @param timestamps 时间long集合 
     * @return 日期 
     */  
    private static Date getAccurateDate(List<Long> timestamps) {  
        Date date = null;  
        long timestamp = 0;  
        Map<Long, long[]> map = new HashMap<Long, long[]>();  
        List<Long> absoluteValues = new ArrayList<Long>();  
  
        if (timestamps != null && timestamps.size() > 0) {  
            if (timestamps.size() > 1) {  
                for (int i = 0; i < timestamps.size(); i++) {  
                    for (int j = i + 1; j < timestamps.size(); j++) {  
                        long absoluteValue = Math.abs(timestamps.get(i) - timestamps.get(j));  
                        absoluteValues.add(absoluteValue);  
                        long[] timestampTmp = { timestamps.get(i), timestamps.get(j) };  
                        map.put(absoluteValue, timestampTmp);  
                    }  
                }  
  
                // 有可能有相等的情况。如2012-11和2012-11-01。时间戳是相等的  
                long minAbsoluteValue = -1;  
                if (!absoluteValues.isEmpty()) {  
                    // 如果timestamps的size为2，这是差值只有一个，因此要给默认值  
                    minAbsoluteValue = absoluteValues.get(0);  
                }  
                for (int i = 0; i < absoluteValues.size(); i++) {  
                    for (int j = i + 1; j < absoluteValues.size(); j++) {  
                        if (absoluteValues.get(i) > absoluteValues.get(j)) {  
                            minAbsoluteValue = absoluteValues.get(j);  
                        } else {  
                            minAbsoluteValue = absoluteValues.get(i);  
                        }  
                    }  
                }  
  
                if (minAbsoluteValue != -1) {  
                    long[] timestampsLastTmp = map.get(minAbsoluteValue);  
                    if (absoluteValues.size() > 1) {  
                        timestamp = Math.max(timestampsLastTmp[0], timestampsLastTmp[1]);  
                    } else if (absoluteValues.size() == 1) {  
                        // 当timestamps的size为2，需要与当前时间作为参照  
                        long dateOne = timestampsLastTmp[0];  
                        long dateTwo = timestampsLastTmp[1];  
                        if ((Math.abs(dateOne - dateTwo)) < 100000000000L) {  
                            timestamp = Math.max(timestampsLastTmp[0], timestampsLastTmp[1]);  
                        } else {  
                            long now = new Date().getTime();  
                            if (Math.abs(dateOne - now) <= Math.abs(dateTwo - now)) {  
                                timestamp = dateOne;  
                            } else {  
                                timestamp = dateTwo;  
                            }  
                        }  
                    }  
                }  
            } else {  
                timestamp = timestamps.get(0);  
            }  
        }  
  
        if (timestamp != 0) {  
            date = new Date(timestamp);  
        }  
        return date;  
    }  
    
    /**
     * 获取当前年份第一天
     * 鲁超    2017 2017年11月25日 下午2:35:14
     * @return
     */
    public static Date getYearfirstday(){
    	Calendar calendar = Calendar.getInstance();
		int currentYear = calendar.get(Calendar.YEAR);  
        calendar.clear();  
        calendar.set(Calendar.YEAR, currentYear); 
		return calendar.getTime();
    }
    
    /** 
     * 将日期转化为日期字符串。失败返回null。 
     * @param date 日期 
     * @param parttern 日期格式 
     * @return 日期字符串 
     */  
    public static String DateToString(Date date, String parttern) {  
        String dateString = null;  
        if (date != null) {  
            try {  
                dateString = getDateFormat(parttern).format(date);  
            } catch (Exception e) {  
            }  
        }  
        return dateString;  
    }
    
    public static Date StringTodate(String datetime){
        SimpleDateFormat format = new SimpleDateFormat(TIME_FULL_STR);
        Date date=null;
		try {
			date = format.parse(datetime);
		} catch (ParseException e) {
		}
        return date;  
    }
}