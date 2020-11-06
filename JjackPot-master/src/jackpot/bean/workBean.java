package jackpot.bean;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;



import jackpot.DTO.workDTO;
import oracle.sql.DATE;


@Controller
public class workBean {
	
	@Autowired
	private SqlMapClientTemplate sqlMap;

	@RequestMapping("/work.jp") //�Ϻ��� ���ºҷ����� 
	public String work(HttpServletRequest request,workDTO wdto,Model model,HttpSession session,String dateFormatStr ){
		
		String emp_num =(String)session.getAttribute("memId");
		wdto.setEmp_num(emp_num);
		SimpleDateFormat sys = new SimpleDateFormat("HH:mm");
		HttpServletRequest req = ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes()).getRequest();
		String ip = req.getHeader("X-FORWARDED-FOR");//ip�ҷ�����

		Date date = new Date();
		
		if(dateFormatStr == null) dateFormatStr = "yyyy-MM-dd"; // string�� date�� �ϱ����� ��
		Calendar cal = Calendar.getInstance();   //Ķ������ date�� ��ȯ
		DateFormat stringForma = new SimpleDateFormat(dateFormatStr); 
		cal.setTime(date);     //date�� Ķ�����ð��� �־��ش�.

		if (ip == null) {
			ip = req.getRemoteAddr();
		}

		wdto = (workDTO)sqlMap.queryForObject("work.getDay", null);   //�ش糯¥�� �ҷ�����
		model.addAttribute("sys",sys);//�ð� �ҷ�����
		model.addAttribute("wdto",wdto);
		model.addAttribute("date", date);
		model.addAttribute("ip",ip);

		return"/work/work";
		
	 }
	
	@RequestMapping("/workday.jp")
	public String workday(String day, HttpSession session, Model model,String dateFormatStr){
		workDTO wdto = new workDTO();
		String emp_num =(String)session.getAttribute("memId");
		wdto.setEmp_num(emp_num);
		day = day.replace("-", "/");
		wdto.setDay(day);

		SimpleDateFormat sys = new SimpleDateFormat("HH:mm");
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
		if(dateFormatStr == null) dateFormatStr = "yyyy-MM-dd"; // string�� date�� �ϱ����� ��
		int count = (int) sqlMap.queryForObject("work.monthCount",wdto );
		wdto = (workDTO)sqlMap.queryForObject("work.getDayChagne", wdto);  //�ش糯¥�� �ҷ�����
	
		model.addAttribute("count", count);
		model.addAttribute("date",date);
		model.addAttribute("wdto",wdto);
		model.addAttribute("sys",sys);//�ð� �ҷ�����
		return "/work/workday";
		
	}
	
	/*���� ��ü������Ȳ����(����)*/
	@RequestMapping("/work_all.jp")
	public String work(HttpSession session,HttpServletRequest request,Model model,workDTO wdto,String dateFormatStr){
		
		String emp_num =(String)session.getAttribute("memId");
		wdto.setEmp_num(emp_num);
		
		SimpleDateFormat sys = new SimpleDateFormat("HH:mm");
		SimpleDateFormat month = new SimpleDateFormat("yyyy-MM-dd");
		HttpServletRequest req = ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes()).getRequest();
		String ip = req.getHeader("X-FORWARDED-FOR");//ip�ҷ�����
		List monthsh = null;
		Date date = new Date();
		
		if(dateFormatStr == null) dateFormatStr = "yyyy-MM-dd"; // string�� date�� �ϱ����� ��
		Calendar cal = Calendar.getInstance();   //Ķ������ date�� ��ȯ
		DateFormat stringForma = new SimpleDateFormat(dateFormatStr); 
		cal.setTime(date);     //date�� Ķ�����ð��� �־��ش�.

		if (ip == null) {
			ip = req.getRemoteAddr();
		}
		
		monthsh = sqlMap.queryForList("work.getMonth", wdto);   //�ش���� �ҷ�����
		model.addAttribute("sys",sys);//�ð� �ҷ�����
		model.addAttribute("month",month);
		model.addAttribute("monthsh",monthsh);
		model.addAttribute("wdto",wdto);
		model.addAttribute("date", date);
		model.addAttribute("ip",ip);

		
		return"/work/work_all";
	 }
	
	
	@RequestMapping("/workMonth.jp")//�ش���� ���°����ҷ����� 
	public String workMonth(HttpSession session, String day, Model model,String dateFormatStr){
		
		workDTO wdto = new workDTO();
		String emp_num =(String)session.getAttribute("memId");
		wdto.setEmp_num(emp_num);
		day = day.replace("-", "/");
		wdto.setDay(day);
		
		SimpleDateFormat sys = new SimpleDateFormat("HH:mm");
		SimpleDateFormat month = new SimpleDateFormat("yyyy-MM-dd");
		if(dateFormatStr == null) dateFormatStr = "yyyy-MM-dd"; // string�� date�� �ϱ����� ��
		
		
		List monthsh = sqlMap.queryForList("work.getMonthChagne",wdto);  //�ش���� �ҷ�����
		model.addAttribute("monthsh",monthsh);
		model.addAttribute("month",month);
		model.addAttribute("wdto",wdto);
		model.addAttribute("sys",sys);//�ð� �ҷ�����
		
		return "/work/workMonth";
	}
	
	
	
	@RequestMapping("/work_on.jp")
	public String work_on(HttpSession session,HttpServletRequest request,String dateFormatStr) {
		workDTO wdto = new workDTO();
		String emp_num =(String)session.getAttribute("memId");
		String ip = request.getRemoteAddr();// ip�ּ� ��������
		wdto.setEmp_num(emp_num);
		wdto.setIp(ip);
		sqlMap.insert("work.insertWork", wdto); //��ٽð� ���ϱ�
		
	/*========================================================================================================================*/

		//�����ð����ϱ� 
		workDTO ladto = (workDTO)sqlMap.queryForObject("work.getWork", wdto);
		Timestamp wo = ladto.getWork_on();
		System.out.println(ladto.getWork_on());
		Date d = new Date();    //�ð���¥�ҷ�����
		d.setHours(9);			//���� �ð� ����
		d.setMinutes(30);		//���� ������
		d.setSeconds(0);		//�ð� ������
		
		
		if(dateFormatStr == null) dateFormatStr = "yyyy-MM-dd HH:mm:ss"; // string�� date�� �ϱ����� ��
		Calendar cal = Calendar.getInstance();   //Ķ������ date�� ��ȯ
		DateFormat stringForma = new SimpleDateFormat(dateFormatStr); 
		cal.setTime(wo);     //work_on�� Ķ�����ð��� �־��ش�.
		long won = cal.getTimeInMillis();  //work_on �ð��� �ʴ����� �ٲ��ش�.
		cal.setTime(d);
		long dd = cal.getTimeInMillis(); 
		
		
		if( won > dd ){
		long late =(wo.getTime() - d.getTime());    //��ٽð� - ���������ð�
		long hourlatework_time = late;  // ���� �ð����� ����
		long minutelatework_time = late;		//���� ������ ����
		hourlatework_time  = (late/1000)/60/60;    // ������ �ð��� �����ش�
		minutelatework_time = (late/ 1000)/60;   //������ ���� �����ش�.
		System.out.println((int)minutelatework_time);
		
		while((int)minutelatework_time > 59)
		{
			System.out.println(minutelatework_time);
			minutelatework_time = minutelatework_time - 60 ;
			
		}  //���� 59���� ũ�� �ڵ����� 60�� �����ش�.
		
		String lateNess = hourlatework_time+":"+minutelatework_time;  //lateNess���� Ÿ���� �°� ����Ǿ� ���Ѱ��� �־��ش�.
		ladto.setLateNess(lateNess);  //���Ѱ��� �־��ش�.
		sqlMap.update("work.updateLateNess", ladto);  //lateNess SQL�� �־��ش�.
		}
		return "/work/work_on";
	}
	
	

	@RequestMapping("/work_off.jp")
	public String work_off(String dateFormatStr, HttpSession session,HttpServletRequest request,workDTO wdto){
		String emp_num=(String)session.getAttribute("memId");
		wdto.setEmp_num(emp_num);
		workDTO rdto = (workDTO)sqlMap.queryForObject("work.getWork", wdto);
		sqlMap.update("work.updateWork", rdto);    //��ٽð� update
	
	/*========================================================================================================================*/	
	
		//�ٹ��ð� ���ϱ�
		rdto = (workDTO)sqlMap.queryForObject("work.getWork", wdto);   //�ٹ��ð������ ���� �ٽ� ����Ʈ�� �ҷ��´�.
		if(dateFormatStr == null) dateFormatStr = "yyyy-MM-dd HH:mm:ss"; // string�� date�� �ϱ����� ��
		Calendar calendar = Calendar.getInstance();   //Ķ������ date�� ��ȯ
		DateFormat stringFormat = new SimpleDateFormat(dateFormatStr); 

		Date work_on = rdto.getWork_on();  //work_on�� �ҷ��´�.
		Date work_off = rdto.getWork_off();   //work_off�� �ҷ��´�.
		calendar.setTime(work_off);     //work_off�� Ķ�����ð��� �־��ش�.
		long woff = calendar.getTimeInMillis();  //work_off �ð��� �ʴ����� �ٲ��ش�.
		calendar.setTime(work_on);			//work_on�� Ķ�����ð��� �־��ش�.
		long won = calendar.getTimeInMillis();     //work_on �ð��� �ʴ����� �ٲ��ش�.
		long work_time1 = woff - won;    //work_off-work_on�� �Ͽ� 1000�ʸ� �������� �ʸ� �����ش�.
		long hourwork_time = work_time1;  // �ð����� ����
		long minutework_time = work_time1;		//������ ����
		hourwork_time = (work_time1/1000)/60/60;    // ������ �ð��� �����ش�
		minutework_time = (work_time1 / 1000)/60;   //������ ���� �����ش�.
				
		while((int)minutework_time > 59)
		{
			System.out.println(minutework_time);
			minutework_time = minutework_time - 60 ;
		} //���� 59���� ũ�� �ڵ����� 60�� �����ش�.
			
		String work_time = hourwork_time+":"+minutework_time;  //work_time���� Ÿ���� �°� ����Ǿ� ���Ѱ��� �־��ش�.
		rdto.setWork_time(work_time);  //���Ѱ��� �־��ش�.
		sqlMap.update("work.updateWorkTime", rdto);  
		
    /*========================================================================================================================*/
		
		//����ð����ϱ� 
		workDTO eadto = (workDTO)sqlMap.queryForObject("work.getWork", wdto);
		Date wof = eadto.getWork_off();
		Date d = new Date();    //�ð���¥�ҷ�����
		d.setHours(17);			//���� �ð� ����
		d.setMinutes(30);		//���� ������
		d.setSeconds(0);		//�ð� ������
		
		if(dateFormatStr == null) dateFormatStr = "yyyy-MM-dd HH:mm:ss"; // string�� date�� �ϱ����� ��
		Calendar cal = Calendar.getInstance();   //Ķ������ date�� ��ȯ
		DateFormat stringForma = new SimpleDateFormat(dateFormatStr); 
		calendar.setTime(wof);     //work_off�� Ķ�����ð��� �־��ش�.
		long wofff = calendar.getTimeInMillis();  //work_off �ð��� �ʴ����� �ٲ��ش�.
		calendar.setTime(d);
		long dd = calendar.getTimeInMillis(); 
		
		
		if(wofff < dd ){
		long EarlyTime =(d.getTime() - wof.getTime());    //��ٽð� - ���������ð�
		long hourEarlywork_time = EarlyTime;  // ���� �ð����� ����
		long minuteEarlywork_time = EarlyTime;		//���� ������ ����
		hourEarlywork_time  = (EarlyTime/1000)/60/60;    // ������ �ð��� �����ش�
		minuteEarlywork_time = (EarlyTime/ 1000)/60;   //������ ���� �����ش�.
		System.out.println((int)minuteEarlywork_time);
		
		while((int)minuteEarlywork_time > 59)
		{
			System.out.println(minuteEarlywork_time);
			minuteEarlywork_time = minuteEarlywork_time - 60 ;
			
		}  //���� 59���� ũ�� �ڵ����� 60�� �����ش�.
		
		String early = hourEarlywork_time+":"+minuteEarlywork_time;  //early���� Ÿ���� �°� ����Ǿ� ���Ѱ��� �־��ش�.
		eadto.setEarly(early);  //���Ѱ��� �־��ش�.
		sqlMap.update("work.updateEarly", eadto);  //early SQL�� �־��ش�.
		}
	
	/*========================================================================================================================*/
		
		//����ٹ��ð����ϱ�
		else if(wofff > dd){
		long outTime =(work_off.getTime() - d.getTime());    //��ٽð� - ��������ð�
		long houroutTime = outTime;  // ��� �ð����� ����
		long minuteoutTime = outTime;		//��� ������ ����
		houroutTime  = (outTime/1000)/60/60;    // ������ �ð��� �����ش�
		minuteoutTime = (outTime/ 1000)/60;   //������ ���� �����ش�.
		System.out.println((int)minuteoutTime);
		
		while((int)minuteoutTime > 59)
		{
			System.out.println(minuteoutTime);
			minuteoutTime = minuteoutTime - 60 ;
			
		}  //���� 59���� ũ�� �ڵ����� 60�� �����ش�.
		
		String workOut = houroutTime+":"+minuteoutTime;  //workOut���� Ÿ���� �°� ����Ǿ� ���Ѱ��� �־��ش�.
		eadto.setWorkOut(workOut);  //���Ѱ��� �־��ش�.
		sqlMap.update("work.updateWorkOut", eadto);  //workOut SQL�� �־��ش�.
		}
			

		
	
	/*	//���ϱٹ� 
		rdto = (workDTO)sqlMap.queryForObject("work.getWork", wdto);
		private static String[] solarArr = new String[]{"0101", "0301", "0505", "0606", "0815", "1225"};
	    private static String[] lunarArr = new String[]{"0101", "0102", "0408", "0814", "0815", "0816"};
	    
	    *//**
	     * �ش����ڰ� ����������, ��ü������, �����, �Ͽ������� Ȯ��
	     * @param date ��³�¥ (yyyyMMdd)
	     * @return ����������, ��ü������, �Ͽ����̸� true, ������ false
	     *//*
	    public static boolean isHoliday(String date) {
	        try {
	            return isHolidaySolar(date) || isHolidayLunar(date) || isHolidayAlternate(date) || isWeekend(date);
	        } catch (ParseException e) {
	            e.printStackTrace();
	            return false;
	        }
	    }
	 
	    *//**
	     * ����� �Ǵ� �Ͽ����̸� true�� �����Ѵ�.
	     * @param date ��³�¥ (yyyyMMdd)
	     * @return �Ͽ������� ����
	     * @throws ParseException
	     *//*
	    private static boolean isWeekend(String date) throws ParseException {
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	        Calendar cal = Calendar.getInstance();
	        cal.setTime(sdf.parse(date));
	        return cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY || cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY;
	    }
	    
	    *//**
	     * �ش����ڰ� ��ü�����Ͽ� �ش��ϴ� �� Ȯ��
	     * @param ��³�¥ (yyyyMMdd)
	     * @return ��ü �������̸� true
	     *//*
	    private static boolean isHolidayAlternate(String date) {
	        
	        String[] altHoliday = new String[] {
	                "20150929", "20160210", "20170130", "20180926", 
	                "20180507", "20190506", "20200127", "20220912", 
	                "20230124", "20240212", "20240506", "20251008", 
	                "20270209", "20290924", "20290507"}; 
	        
	        return Arrays.asList(altHoliday).contains(date); 
	        */
	        /*
	        int year = Integer.parseInt(date.substring(0, 4));
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	        
	        // ����
	        String dayFirst2 = convertLunarToSolar(year + "0101");
	        String dayFirst3 = convertLunarToSolar(year + "0102");
	        String dayFirst1 = String.valueOf(Integer.parseInt(dayFirst2) - 1);     
	        
	        // �߼�
	        String dayThanks1 = convertLunarToSolar(year + "0814");
	        String dayThanks2 = convertLunarToSolar(year + "0815");
	        String dayThanks3 = convertLunarToSolar(year + "0816");
	        
	        // ��̳�
	        String dayChild = year + "0505";
	        
	        // �ش� �⵵�� ��ü���� ���
	        List<String> altHolyday = new ArrayList<String>();
	        
	        if(getDayOfWeek(dayFirst1) == Calendar.SUNDAY || getDayOfWeek(dayFirst2) == Calendar.SUNDAY || getDayOfWeek(dayFirst3) == Calendar.SUNDAY || isHolidaySolar(dayFirst1) || isHolidaySolar(dayFirst2) || isHolidaySolar(dayFirst3)) {
	            int y = Integer.parseInt(dayFirst3.substring(0, 4));
	            int m = Integer.parseInt(dayFirst3.substring(4, 6)) - 1;
	            int d = Integer.parseInt(dayFirst3.substring(6)) + 1;
	            Calendar c = Calendar.getInstance();
	            c.set(y, m, d);
	            altHolyday.add(sdf.format(c.getTime()));
	        }
	            
	        if(getDayOfWeek(dayThanks1) == Calendar.SUNDAY || getDayOfWeek(dayThanks2) == Calendar.SUNDAY || getDayOfWeek(dayThanks3) == Calendar.SUNDAY || isHolidaySolar(dayThanks1) || isHolidaySolar(dayThanks2) || isHolidaySolar(dayThanks3)) {
	            int y = Integer.parseInt(dayThanks3.substring(0, 4));
	            int m = Integer.parseInt(dayThanks3.substring(4, 6)) - 1;
	            int d = Integer.parseInt(dayThanks3.substring(6)) + 1;
	            Calendar c = Calendar.getInstance();
	            c.set(y, m, d);
	            altHolyday.add(sdf.format(c.getTime()));
	        }
	        
	        int childWeek = getDayOfWeek(dayChild); 
	        
	        if(childWeek == Calendar.SATURDAY) {
	            int y = Integer.parseInt(dayChild.substring(0, 4));
	            int m = Integer.parseInt(dayChild.substring(4, 6)) - 1;
	            int d = Integer.parseInt(dayChild.substring(6)) + 2;
	            Calendar c = Calendar.getInstance();
	            c.set(y, m, d);
	            altHolyday.add(sdf.format(c.getTime()));
	        }
	            
	        if(childWeek == Calendar.SUNDAY) {
	            int y = Integer.parseInt(dayChild.substring(0, 4));
	            int m = Integer.parseInt(dayChild.substring(4, 6)) - 1;
	            int d = Integer.parseInt(dayChild.substring(6)) + 1;
	            Calendar c = Calendar.getInstance();
	            c.set(y, m, d);
	            altHolyday.add(sdf.format(c.getTime()));
	        }
	        
	        return altHolyday.contains(date); 
	        
	    }
	 */
	 
	    /**
	     * �ش����ڰ� ���� ���������Ͽ� �ش��ϴ� �� Ȯ��
	     * @param ��³�¥ (yyyyMMdd)
	     * @return ���� �������̸� true
	     *//*
	    private static boolean isHolidayLunar(String date) {
	        try {
	            Calendar cal = Calendar.getInstance();
	            ChineseCalendar chinaCal = new ChineseCalendar();
	            
	            cal.set(Calendar.YEAR, Integer.parseInt(date.substring(0, 4)));
	            cal.set(Calendar.MONTH, Integer.parseInt(date.substring(4, 6)) - 1);
	            cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(date.substring(6)));
	            
	            chinaCal.setTimeInMillis(cal.getTimeInMillis());
	            
	            // �������� ��ȯ�� ���� ����
	            int mm = chinaCal.get(ChineseCalendar.MONTH) + 1;
	            int dd = chinaCal.get(ChineseCalendar.DAY_OF_MONTH);
	            
	            StringBuilder sb = new StringBuilder();
	            sb.append(String.format("%02d", mm));
	            sb.append(String.format("%02d", dd));
	                        
	            // ���� 12���� �������� (���� ù��° ����)���� Ȯ��
	            if (mm == 12) {
	                int lastDate = chinaCal.getActualMaximum(ChineseCalendar.DAY_OF_MONTH);
	                if (dd == lastDate) {
	                    return true;
	                }
	            }
	 
	            // ���� ���Ͽ� ���ԵǴ��� ���� ����
	            return Arrays.asList(lunarArr).contains(sb.toString()); 
	        } catch(Exception ex) {
	            System.out.println(ex.getStackTrace());
	            return false;
	        }
	    }
	 
	 
	    *//**
	     * �ش����ڰ� ��� ���������Ͽ� �ش��ϴ� �� Ȯ��
	     * @param date ��³�¥ (yyyyMMdd)
	     * @return ��� �������̸� true
	     *//*
	    private static boolean isHolidaySolar(String date) {
	        try {
	            // �����Ͽ� ���� ���� ���� 
	            return Arrays.asList(solarArr).contains(date.substring(4));
	        } catch(Exception ex) {
	            System.out.println(ex.getStackTrace());
	            return false;
	        }
	    }
	    
	    
	    *//**
	     * ���³�¥�� ��³�¥�� ��ȯ
	     * @param ���³�¥ (yyyyMMdd)
	     * @return ��³�¥ (yyyyMMdd)
	     *//*
	    private static String convertLunarToSolar(String yyyymmdd) {
	        ChineseCalendar cc = new ChineseCalendar();
	        Calendar cal = Calendar.getInstance();
	 
	        if (yyyymmdd == null)
	            return "";
	 
	        String date = yyyymmdd.trim();
	        if (date.length() != 8) {
	            if (date.length() == 4)
	                date = date + "0101";
	            else if (date.length() == 6)
	                date = date + "01";
	            else if (date.length() > 8)
	                date = date.substring(0, 8);
	            else
	                return "";
	        }
	 
	        cc.set(ChineseCalendar.EXTENDED_YEAR, Integer.parseInt(date.substring(0, 4)) + 2637);
	        cc.set(ChineseCalendar.MONTH, Integer.parseInt(date.substring(4, 6)) - 1);
	        cc.set(ChineseCalendar.DAY_OF_MONTH, Integer.parseInt(date.substring(6)));
	        
	        cal.setTimeInMillis(cc.getTimeInMillis());
	 
	        int y = cal.get(Calendar.YEAR);
	        int m = cal.get(Calendar.MONTH) + 1;
	        int d = cal.get(Calendar.DAY_OF_MONTH);
	 
	        StringBuffer ret = new StringBuffer();
	        ret.append(String.format("%04d", y));
	        ret.append(String.format("%02d", m));
	        ret.append(String.format("%02d", d));
	 
	        return ret.toString();
	    }
	    
	    *//**
	     * ��³�¥�� ������ ����
	     * @param ��³�¥ (yyyyMMdd)
	     * @return ����(int)
	     *//*
	    private static int getDayOfWeek(String day) {
	        int y = Integer.parseInt(day.substring(0, 4));
	        int m = Integer.parseInt(day.substring(4, 6)) - 1;
	        int d = Integer.parseInt(day.substring(6));
	        Calendar c = Calendar.getInstance();
	        c.set(y, m, d);
	        return c.get(Calendar.DAY_OF_WEEK);
	    }
	 
	 
	    public static void main(String[] args) {
	        System.out.println("20150217        : " + HolidayUtil.isHoliday("20150217"));       
	        System.out.println("20150218 (����) : " + HolidayUtil.isHoliday("20150218")); // ���� - ����
	        System.out.println("20150219 (����) : " + HolidayUtil.isHoliday("20150219")); // ����       
	        System.out.println("20150220 (����) : " + HolidayUtil.isHoliday("20150220")); // ���� - ������
	        System.out.println("20150221        : " + HolidayUtil.isHoliday("20150221"));       
	        System.out.println("20151225 (���) : " + HolidayUtil.isHoliday("20151225")); // ũ��������
	        System.out.println("20151226        : " + HolidayUtil.isHoliday("20151226"));
	        System.out.println("20150929 (��ü) : " + HolidayUtil.isHoliday("20150929")); // ��ü ����
	    }   */
		return "/work/work_off";
	}
}


	
	
	
