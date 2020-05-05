package com.weh.common.utils;

import java.math.BigDecimal;

/**
 * 
    * @ClassName: RandNumUtil
    * @Description: TODO(获取随机工具类)
    * @author 武恩宏
    * @date 2020年4月27日
    *
 */
public class RandNumUtil {

	/**
	 * 
	    * @Title: getValue
	    * @Description: 获得指定范围的随机小数,精度scale表示小数点后位数，
	    * 				举例min为25400.56,max为67078.94,
	    * 				返回小数点后2位的min和max之间的数
	    * @param  min
	    * @param  max
	    * @param  scale
	    * @return    参数
	    * @return BigDecimal    返回类型
	    * @throws
	 */
	public static BigDecimal getValue(final double min, final double max,final int scale){
		BigDecimal value = new BigDecimal(Math.random()*(max-min)+min).setScale(scale,BigDecimal.ROUND_DOWN);
		
		return value;
		
		}
	
		//返回min-max之间的随机整数（包含min和不包含max值），例如返回1-3之间的随机数，则返回1或2，不能是其他数值
		public static int random(int min, int max){
			int num = (int)(Math.random()*max-1)+min;
			
			return num;
		} 
}
