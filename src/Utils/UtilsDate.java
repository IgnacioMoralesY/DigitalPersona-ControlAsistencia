/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class UtilsDate {

	public static final String FORMAT_DATE_yyyyMMdd_Separator_Slash ="yyyy/MM/dd";
	public static final String FORMAT_DATE_yyyyMMMdd_Separator_Slash ="yyyy/MMM/dd";
	public static final String FORMAT_DATE_yyMMdd_Separator_Slash ="yy/MM/dd";
	public static final String FORMAT_DATE_yyMMMdd_Separator_Slash ="yy/MMM/dd";
	
	public static final String FORMAT_DATE_yyyyMMdd_Separator_Guion ="yyyy-MM-dd";
	public static final String FORMAT_DATE_yyyyMMMdd_Separator_Guion ="yyyy-MMM-dd";
	public static final String FORMAT_DATE_yyMMdd_Separator_Guion ="yy-MM-dd";
	public static final String FORMAT_DATE_yyMMMdd_Separator_Guion ="yy-MMM-dd";
	
	public static final String FORMAT_DATE_ddMMyyyy_Separator_Slash ="dd/MM/yyyy";
	public static final String FORMAT_DATE_ddMMMyyyy_Separator_Slash ="dd/MMM/yyyy";
	public static final String FORMAT_DATE_ddMMyy_Separator_Slash ="dd/MM/yy";
	public static final String FORMAT_DATE_ddMMMyy_Separator_Slash ="dd/MMM/yy";
	
	public static final String FORMAT_DATE_ddMMyyyy_Separator_Guion ="dd-MM-yyyy";
	public static final String FORMAT_DATE_ddMMMyyyy_Separator_Guion ="dd-MMM-yyyy";
	public static final String FORMAT_DATE_ddMMyy_Separator_Guion ="dd-MM-yy";
	public static final String FORMAT_DATE_ddMMMyy_Separator_Guion ="dd-MMM-yy";
	
	public static final String FORMAT_DATE_wyyyy_Separator_Guion ="w-yyyy";
		
	public static final String FORMAT_TIME_HHmmss ="HH:mm:ss";
	public static final String FORMAT_TIME_hhmmss ="hh:mm:ss";
	
	public static final String FORMAT_TIME_HHmm ="HH:mm";
	public static final String FORMAT_TIME_hhmm ="hh:mm";
	
	public static final String DEFAULT_DATE_FORMAT = "dd/MM/yyyy";
	public static final String DEFAULT_CALENDAR_DATE_FORMAT="dd-mm-yyyy";
	
	
	/**
	 * Descripcion: Retorna verdadero si la fecha se encuentra en el rango 
	 * @author Gino Salguero
	 * @param Date date
	 * @return Date 
     */
	public static boolean isFechaEntre(Date fecha, Date fechaIni, Date fechaFin) {
		
		int res1 = compareDates(fecha, fechaIni);
		int res2 = compareDates(fecha, fechaFin);
		
		boolean resultado = false;
		if( res1 == 0 || res1 == 1 ){
			if( res2 == 0 || res2 == -1 ){
				resultado = true;
			}
		}
		return resultado;
	}
	
	/**
	 * Descripcion: Retorna verdadero si la fecha se encuentra en el rango 
	 * @author Gino Salguero
	 * @param Date date
	 * @return Date 
     */
	public static boolean isFechaEntre_SinConsiderarIgual(Date fecha, Date fechaIni, Date fechaFin) {
		
		int res1 = compareDates(fecha, fechaIni);
		int res2 = compareDates(fecha, fechaFin);
		
		boolean resultado = false;
		if( res1 == 1 ){
			if( res2 == -1 ){
				resultado = true;
			}
		}
		return resultado;
	}
	
	/**
	 * Descripcion: Obtiene la fecha del primer dia del mes 
	 * @author Gino Salguero
	 * @param Date date
	 * @return Date 
     */
	public static Date getPrimerDiaDelMes(Date fecha) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(fecha);
		int date = cal.getActualMinimum(Calendar.DAY_OF_MONTH);
		
		int month = cal.get(Calendar.MONTH);
		int year =  cal.get(Calendar.YEAR);
		
		cal.set(year, month, date);
		
		return cal.getTime();
	}
	
	/**
	 * Descripcion: Obtiene la fecha del ultimo dia del mes 
	 * @author Gino Salguero
	 * @param Date date
	 * @return Date 
     */
	public static Date getUltimoDiaDelMes(Date fecha) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(fecha);
		int date = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

		int month = cal.get(Calendar.MONTH);
		int year =  cal.get(Calendar.YEAR);	
		
		cal.set(year, month, date);
		
		return cal.getTime();
	}
	
	
	public static int getDaysPerMonth(Date fecha) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(fecha); 
		int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH); // 28
		return days;
	}
	
	
	/**
	 * Descripcion: Obtiene la fecha del dia lunes de un periodo de tiempo 
	 * @author Gino Salguero
	 * @param Date date
	 * @return Date fecha del dia lunes correspondiente a ese periodo 
     */
	public static Date getMondayOfDate( Date date ){
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		return c.getTime();
	}
	
	/**
	 * Descripcion: Obtiene la fecha del dia martes de un periodo de tiempo 
	 * @author Gino Salguero
	 * @param Date date
	 * @return Date fecha del dia martes correspondiente a ese periodo 
     */
	public static Date getTuesdayOfDate( Date date ){
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
		return c.getTime();
		
	}
	
	/**
	 * Descripcion: Obtiene la fecha del dia miercoles de un periodo de tiempo 
	 * @author Gino Salguero
	 * @param Date date
	 * @return Date fecha del dia miercoles correspondiente a ese periodo 
     */
	public static Date getWednesdayOfDate( Date date ){
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
		return c.getTime();
	}
	
	/**
	 * Descripcion: Obtiene la fecha del dia jueves de un periodo de tiempo 
	 * @author Gino Salguero
	 * @param Date date
	 * @return Date fecha del dia jueves correspondiente a ese periodo 
     */
	public static Date getThursdayOfDate( Date date ){
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
		return c.getTime();
	}
	
	
	/**
	 * Descripcion: Obtiene la fecha del dia viernes de un periodo de tiempo 
	 * @author Gino Salguero
	 * @param Date date
	 * @return Date fecha del dia viernes correspondiente a ese periodo 
     */
	public static Date getFridayOfDate( Date date ){
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
		return c.getTime();
	}
	
	/**
	 * Descripcion: Obtiene la fecha del dia sabado de un periodo de tiempo 
	 * @author Gino Salguero
	 * @param Date date
	 * @return Date fecha del dia sabado correspondiente a ese periodo 
     */
	public static Date getSaturdayOfDate( Date date ){
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
		return c.getTime();
	}
	
	/**
	 * Descripcion: Obtiene la fecha del dia domingo de un periodo de tiempo 
	 * @author Gino Salguero
	 * @param Date date
	 * @return Date fecha del dia domingo correspondiente a ese periodo 
     */
	public static Date getSundayOfDate( Date date ){
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		return c.getTime();
	}
	
	/**
	 * Descripcion: Compara 2 fechas date1 y date 2. Devuelve un entero 0 si date1 = date2, 1 si date1 es mayor a date2, -1 si date1 es menor  a date2
	 * @author Gino Salguero
	 * @param Date date1
	 * @param Date date2
	 * @return int 0 si date1 = date2, 1 si date1 es mayor a date2, -1 si date1 es menor  a date2
     */
	public static int compareDates( Date date1 , Date date2 ){
		Calendar calendar1 = Calendar.getInstance();
		calendar1.setTime(date1);
		
		Calendar calendar2 = Calendar.getInstance();
		calendar2.setTime(date2);
		
		return calendar1.compareTo(calendar2);
	}
	
	/**
	 * Descripcion: Metodo que indica si una fecha entregada es valida o no. 
	 * @author Gino Salguero
	 * @param int year
	 * @param int month
	 * @param int day
	 * @return boolean true: Fecha Valida, false: Fecha No Valida
	 */
    public static boolean getFechaValida(int year, int month, int day) {
        try {
            boolean fechaValida = true;
            int diasValidos = 31;
            if (month == 4 || month == 6 || month == 9 || month == 11)
                diasValidos = 30;
            if (month == 2 && (year / 4) != Math.floor(year / 4))
                diasValidos = 28;
            if (month == 2 && (year / 4) == Math.floor(year / 4))
                diasValidos = 29;
            if (day <= diasValidos)
                return fechaValida;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
	 * Descripcion: Metodo que transforma una fecha Date a un String formateado.
	 * @author Gino Salguero
	 * @param Date date
	 * @param String format
	 * @return String Fecha con formato
	 */
    public static String getDate2String_formato_yyyyMMdd_HHmmss_sep_guion(Date date) {
    	return getDate2String(date, "yyyy-MM-dd HH:mm:ss");
    }
    
    /**
	 * Descripcion: Metodo que transforma una fecha Date a un String formateado.
	 * @author Gino Salguero
	 * @param Date date
	 * @param String format
	 * @return String Fecha con formato
	 */
    public static String getDate2String(Date date, String formatDate) {
        try{
        	SimpleDateFormat sim = new SimpleDateFormat(formatDate);
	        return sim.format(date);
        }catch (Exception e) {
        	//System.out.println("Error al tratar de formatear fecha: " + date + " - Format: " + formatDate); 
			return "";
		}
    }
    
    /**
	 * @param fecha
	 * @return
	 */
	public static String getDate2String_formato_dddeMMMMdeyyyy(Date fecha) {
		SimpleDateFormat formateador = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy", new Locale("ES"));
		return formateador.format(fecha);
	}
    
    /**
	 * Descripcion: Metodo que transforma una fecha Date a un String formateado de la forma dd/MM/yyyy.
	 * @author Gino Salguero
	 * @param Date date 
	 * @return String Fecha con formato 
	 */
    public static String getDateFormatDDMMYYYY(Date date) {
        return getDate2String(date,FORMAT_DATE_ddMMyyyy_Separator_Slash);
    }

    /**
	 * Descripcion: Metodo que recibe una Fecha String con el formato en que se encuentra y la transforma a Date
	 * @author Gino Salguero
	 * @param String date
	 * @param String format
	 * @return Date date
     * @throws ParseException 
	 */
    public static Date getString2Date(String stringDate, String formatDate) {
        try{
	    	SimpleDateFormat formatoDelTexto = new SimpleDateFormat(formatDate);
	        return formatoDelTexto.parse(stringDate);
        }catch(Throwable e){
        	return null;
        }
    }

    
    /**
	 * Descripcion: Metodo que recibe una Fecha String con el formato en que se encuentra y la transforma a Date
	 * @author Gino Salguero
	 * @param String date
	 * @param String format
	 * @return Date date
     * @throws ParseException 
	 */
    public static Date getString2Date_FormatsMasComunes(String stringDate) {
    	Date fecha = null;
    	try{
	    	if( stringDate!=null && stringDate.length() >0 ){
	    		if( stringDate.contains("/") ){
	    			String primeraPosicion = stringDate.split("\\/")[0];
	    			if( primeraPosicion.length() > 2 ){
	    				if( fecha == null )fecha = getString2Date(stringDate, "yyyy/MM/dd HH:mm:ss");
	    				if( fecha == null )fecha = getString2Date(stringDate, "yyyy/MM/dd HH:mm");
	        			if( fecha == null )fecha = getString2Date(stringDate, "yyyy/MM/dd");
	    			}else{
	    				String terceraPosicion = stringDate.split("\\/")[2];
	    				if( terceraPosicion.length() > 2 ){
	    					if( fecha == null )fecha = getString2Date(stringDate, "dd/MM/yyyy HH:mm:ss");
	    					if( fecha == null )fecha = getString2Date(stringDate, "dd/MM/yyyy HH:mm");
		        			if( fecha == null )fecha = getString2Date(stringDate, "dd/MM/yyyy");
	    				}else{
	    					if( fecha == null )fecha = getString2Date(stringDate, "dd/MM/yy HH:mm:ss");
	    					if( fecha == null )fecha = getString2Date(stringDate, "dd/MM/yy HH:mm");
		        			if( fecha == null )fecha = getString2Date(stringDate, "dd/MM/yy");
	    				}
	        		}
	    		}else if( stringDate.contains("-") ){
	    			String primeraPosicion = stringDate.split("\\-")[0];
	    			if( primeraPosicion.length() > 2 ){
	    				if( fecha == null )fecha = getString2Date(stringDate, "yyyy-MM-dd HH:mm:ss");
	    				if( fecha == null )fecha = getString2Date(stringDate, "yyyy-MM-dd HH:mm");
	        			if( fecha == null )fecha = getString2Date(stringDate, "yyyy-MM-dd");
	    			}else{
	    				String terceraPosicion = stringDate.split("\\-")[2];
	    				if( terceraPosicion.length() > 2 ){
	    					if( fecha == null )fecha = getString2Date(stringDate, "dd-MM-yyyy HH:mm:ss");
	    					if( fecha == null )fecha = getString2Date(stringDate, "dd-MM-yyyy HH:mm");
		        			if( fecha == null )fecha = getString2Date(stringDate, "dd-MM-yyyy");
	    				}else{
	    					if( fecha == null )fecha = getString2Date(stringDate, "dd-MM-yy HH:mm:ss");
	    					if( fecha == null )fecha = getString2Date(stringDate, "dd-MM-yy HH:mm");
		        			if( fecha == null )fecha = getString2Date(stringDate, "dd-MM-yy");
	    				}
	        		}
	    		}
	    	}
    	}catch(Throwable e){
    		System.out.println("No se puede parsear la Fecha en ningun formato ["+stringDate+"]");
    		return null;
    	}
		return fecha;
    }
    
    
    
    /**
	 * Descripcion: Metodo que resta 2 fechas. EL resultado de la resta va a ser igual a (dateFin - dateIni)
	 * @author Gino Salguero
	 * @param Date dateIni
	 * @param Date dateFin
	 * @return int diferencia de dias
     * @throws ParseException 
	 */
	public static int subtractDate2Date( Date dateIni, Date dateFin ) throws ParseException {
		DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
		String fechaInicioString = df.format(dateIni);
		dateIni = df.parse(fechaInicioString);
		String fechaFinalString = df.format(dateFin);
		dateFin = df.parse(fechaFinalString);
		long fechaInicialMs = dateIni.getTime();
		long fechaFinalMs = dateFin.getTime();
		long diferencia = fechaFinalMs - fechaInicialMs;
		double dias = Math.floor(diferencia / (1000 * 60 * 60 * 24));
		return ( (int) dias);
	}

	/**
	 * Descripcion: Metodo que resta 2 fechas. EL resultado de la resta va a ser igual a (dateFin - dateIni)
	 * @author Gino Salguero
	 * @param Date dateIni
	 * @param Date dateFin
	 * @return int diferencia de dias
     * @throws ParseException 
	 */
	public static int subtractDate2Today( Date dateIni ) {
		try{
			Date dateFin = new Date();
			DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
			String fechaInicioString = df.format(dateIni);
			dateIni = df.parse(fechaInicioString);
			String fechaFinalString = df.format(dateFin);
			dateFin = df.parse(fechaFinalString);
			long fechaInicialMs = dateIni.getTime();
			long fechaFinalMs = dateFin.getTime();
			long diferencia = fechaFinalMs - fechaInicialMs;
			double dias = Math.floor(diferencia / (1000 * 60 * 60 * 24));
			return ( (int) dias);
		}catch(Throwable e){
			e.printStackTrace();
			return 0;
		}
	}
	
	/**
	 * Descripcion: Metodo que resta 2 fechas. EL resultado de la resta va a ser igual a (dateFin - dateIni)
	 * @author Gino Salguero
	 * @param Date dateIni
	 * @param Date dateFin
	 * @return duelve un double que representa la hora y sus minutos Ejem: 2.25 = 2 horas 25 minutos
     * @throws ParseException 
	 */
	public static String subtractDate2DateEnHoras( Date dateIni, Date dateFin ){
		try{
			long fechaInicialMs = dateIni.getTime();
			long fechaFinalMs = dateFin.getTime();
			long diferencia = fechaFinalMs - fechaInicialMs;
			double horas = diferencia / (1000 * 60 * 60);
			double minutos = ( diferencia / (1000 * 60 ) )  - (horas * 60) ;
			return new String( (long)horas + "." +(long)minutos );
		}catch(Throwable e){
			e.printStackTrace();
			return "0";
		}
	}
	
	
	/**
	 * Descripcion: Metodo que resta 2 fechas. EL resultado de la resta va a ser igual a (dateFin - dateIni)
	 * @author Gino Salguero
	 * @param Date dateIni
	 * @param Date dateFin
	 * @return duelve un double que representa la hora y sus minutos Ejem: 2.25 = 2 horas 25 minutos
     * @throws ParseException 
	 */
	public static String subtractDate2DateEnHoras( String dateIniS, String dateFinS, String dateFormat ){
		try{
			Date dateIni = getString2Date(dateIniS, dateFormat);
			Date dateFin = getString2Date(dateFinS, dateFormat);
			
			long fechaInicialMs = dateIni.getTime();
			long fechaFinalMs = dateFin.getTime();
			long diferencia = fechaFinalMs - fechaInicialMs;
			double horas = diferencia / (1000 * 60 * 60);
			double minutos = ( diferencia / (1000 * 60 ) )  - (horas * 60) ;
			return new String( (long)horas + "." +(long)minutos );
		}catch(Throwable e){
			e.printStackTrace();
			return "0";
		}
	}
	
	public static String getTransformSecsIntoHourAndMin( int secs ){
		double horas = secs / (60 * 60);
		double minutos = ( secs / 60 )  - (horas * 60) ;
		String resultado = new String( (long)horas + "." +(long)minutos );
		System.out.println("Transformando Segundos ["+secs+"] en Horas. Resultado ["+resultado+"]");
		return resultado;
	}
	
	
	public static String getTransformMiliSecsIntoHourAndMin( int miliSecs ){
		double horas = miliSecs / (1000 * 60 * 60);
		double minutos = ( miliSecs / (1000 * 60 ) )  - (horas * 60) ;
		String resultado = new String( (long)horas + "." +(long)minutos );
		System.out.println("Transformando MiliSegundos ["+miliSecs+"] en Horas. Resultado ["+resultado+"]");
		return resultado;
	}
	
	
	/**
	 * Descripcion: Metodo que resta 2 fechas. EL resultado de la resta va a ser igual a (Today - dateIni) 
	 * @author Gino Salguero
	 * @param Date dateIni
	 * @return devuelve un long en segundos
     * @throws ParseException 
	 */
	public static int subtractDate2DateEnSegundos( Date dateIni ) {
		return subtractDate2DateEnSegundos(dateIni, new Date());
	}
	
	/**
	 * Descripcion: Metodo que resta 2 fechas. EL resultado de la resta va a ser igual a (dateFin - dateIni)
	 * @author Gino Salguero
	 * @param Date dateIni
	 * @param Date dateFin
	 * @return devuelve un long en segundos
     * @throws ParseException 
	 */
	public static int subtractDate2DateEnSegundos( Date dateIni, Date dateFin ) {
		try{
			long fechaInicialMs = dateIni.getTime();
			long fechaFinalMs = dateFin.getTime();
			long diferencia = fechaFinalMs - fechaInicialMs;
			Double segundos = new Double(diferencia / 1000);
			int x = segundos.intValue();
			System.out.println("subtractDate2DateEnSegundos: " + x );
			return x;
			
		}catch(Throwable e){
			e.printStackTrace();
			return 0;
		}
	}
	
	
	/**
	 * Descripcion: Metodo que resta 2 fechas. EL resultado de la resta va a ser igual a (dateFin - dateIni)
	 * @author Gino Salguero
	 * @param Date dateIni
	 * @param Date dateFin
	 * @return devuelve un long en segundos
     * @throws ParseException 
	 */
	public static int subtractDate2DateEnSegundos( String dateIniS, String dateFinS, String dateFormat ) {
		try{
			
			Date dateIni = getString2Date(dateIniS, dateFormat);
			Date dateFin = getString2Date(dateFinS, dateFormat);
			
			long fechaInicialMs = dateIni.getTime();
			long fechaFinalMs = dateFin.getTime();
			long diferencia = fechaFinalMs - fechaInicialMs;
			Double segundos = new Double(diferencia / 1000);
			int x = segundos.intValue();
			System.out.println("subtractDate2DateEnSegundos: " + x );
			return x;
			
		}catch(Throwable e){
			e.printStackTrace();
			return 0;
		}
	}
	
	
	/**
	 * Descripcion: Metodo suma una cantidad de minutos
	 * @author Gino Salguero
	 * @param Date date
	 * @param int dias a sumar
	 * @return Date fecha resultante
     */
	public static Date addMinutes2Date( Date date , int minutes ){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MINUTE, minutes);
		return calendar.getTime();
	}
	
	/**
	 * Descripcion: Metodo que devuelve la hora de una fecha
	 * @author Gino Salguero
	 * @param Date date
	 * @param int fecha a la que se le sacara la hora
	 * @return int con la hora
     */
	public static int getHourOfDay( Date date ){
		Calendar cal = new GregorianCalendar();
		cal.setTime(date);
		int hour24 = cal.get(Calendar.HOUR_OF_DAY);     // 0..23
		//int min = cal.get(Calendar.MINUTE);             // 0..59
		//int sec = cal.get(Calendar.SECOND);             // 0..59
		//int ms = cal.get(Calendar.MILLISECOND);         // 0..999
		//int ampm = cal.get(Calendar.AM_PM);             // 0=AM, 1=PM
		return hour24;
	}
	
	/**
	 * Descripcion: Metodo que devuelve el minuto de una fecha
	 * @author Gino Salguero
	 * @param Date date
	 * @param int fecha a la que se le sacara la hora
	 * @return int con el minuto
     */
	public static int getMinuteOfDay( Date date ){
		Calendar cal = new GregorianCalendar();
		cal.setTime(date);
		//int hour24 = cal.get(Calendar.HOUR_OF_DAY);     // 0..23
		int min = cal.get(Calendar.MINUTE);             // 0..59
		//int sec = cal.get(Calendar.SECOND);             // 0..59
		//int ms = cal.get(Calendar.MILLISECOND);         // 0..999
		//int ampm = cal.get(Calendar.AM_PM);             // 0=AM, 1=PM
		return min;
	}
	
	
	/**
	 * Descripcion: Metodo que devuelve el minuto de una fecha
	 * @author Gino Salguero
	 * @param Date date
	 * @param int fecha a la que se le sacara la hora
	 * @return int con el minuto
     */
	public static int getSecondOfDay( Date date ){
		Calendar cal = new GregorianCalendar();
		cal.setTime(date);
		//int hour24 = cal.get(Calendar.HOUR_OF_DAY);     // 0..23
		int second = cal.get(Calendar.SECOND);             // 0..59
		//int sec = cal.get(Calendar.SECOND);             // 0..59
		//int ms = cal.get(Calendar.MILLISECOND);         // 0..999
		//int ampm = cal.get(Calendar.AM_PM);             // 0=AM, 1=PM
		return second;
	}
	
	
	/**
	 * Descripcion: Metodo que setea una hora y un minuto especificos a una fecha
	 * @author Gino Salguero
	 * @param Date date
	 * @param int hora
	 * @return Date fecha resultante
     */
	public static Date setHourAndMinute2Date( Date date , int hora , int minute ){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.HOUR_OF_DAY, hora);
		calendar.set(Calendar.MINUTE, minute);
		return calendar.getTime();
	}
	
	/**
	 * Descripcion: Metodo que setea una hora especifica a una fecha
	 * @author Gino Salguero
	 * @param Date date
	 * @param int hora
	 * @return Date fecha resultante
     */
	public static Date setHour2Date( Date date , int hora ){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		
		calendar.set(Calendar.HOUR_OF_DAY, hora);
		return calendar.getTime();
	}
    
	/**
	 * Descripcion: Metodo que setea un minuto especifico a una fecha
	 * @author Gino Salguero
	 * @param Date date
	 * @param int minuto
	 * @return Date fecha resultante
     */
	public static Date setMinute2Date( Date date , int minute ){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.MINUTE, minute);
		return calendar.getTime();
	}

    

	
	/**
	 * Descripcion: Metodo suma una cantidad de horas a una fecha
	 * @author Gino Salguero
	 * @param Date date
	 * @param int dias a sumar
	 * @return Date fecha resultante
     */
	public static Date addHours2Date( Date date , int hours ){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.HOUR_OF_DAY, hours);
		return calendar.getTime();
	}
	
	/**
	 * Descripcion: Metodo suma una cantidad de dias a una fecha
	 * @author Gino Salguero
	 * @param Date date
	 * @param int dias a sumar
	 * @return Date fecha resultante
     */
	public static Date addDays2Date( Date date , int days ){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(GregorianCalendar.DAY_OF_YEAR, calendar.get(GregorianCalendar.DAY_OF_YEAR)+days);
		return calendar.getTime();
	}
	
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

  /**
	 * Descripcion: Metodo suma una cantidad de Semanas a una fecha
	 * @author Gino Salguero
	 * @param Date date
	 * @param int semanas a sumar
	 * @return Date fecha resultante
     */
	public static Date addWeeks2Date( Date date , int weeks ){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(GregorianCalendar.WEEK_OF_YEAR, calendar.get(GregorianCalendar.WEEK_OF_YEAR)+weeks);
		return calendar.getTime();
	}
	
	/**
	 * Descripcion: Metodo suma una cantidad de meses a una fecha
	 * @author Gino Salguero
	 * @param Date date
	 * @param int meses a sumar
	 * @return Date fecha resultante
     */
	public static Date addMonths2Date( Date date , int months ){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(GregorianCalendar.MONTH, calendar.get(GregorianCalendar.MONTH)+months);
		return calendar.getTime();
	}
	
	/**
	 * Descripcion: Metodo suma una cantidad de Agnos a una fecha
	 * @author Gino Salguero
	 * @param Date date
	 * @param int agnos a sumar
	 * @return Date fecha resultante
     */
	public static Date addYears2Date( Date date , int years ){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(GregorianCalendar.YEAR, calendar.get(GregorianCalendar.YEAR)+years);
		return calendar.getTime();
	}
	
	/**
	 * Descripcion: Retorna el mes de una fecha, el mes es un entero que va de 1 a 12 donde 1  es Enero y 12 es Diciembre
	 * @author Gino Salguero
	 * @param Date date
	 * @return int mes del 1 al 12
	 */
	public static int getMonth( Date date ){
		Calendar calendar = Calendar.getInstance();
	    calendar.setTime(date);
		return calendar.get( Calendar.MONTH )+1;
	}
	
	/**
	 * Descripcion: Retorna el agno de una fecha
	 * @author Gino Salguero
	 * @param Date date
	 * @return int agno
	 */
	public static int getYear( Date date ){
		Calendar calendar = Calendar.getInstance();
	    calendar.setTime(date);
		return calendar.get( Calendar.YEAR );
	}
	
	/**
	 * Descripcion: Retorna el agno de una fecha
	 * @author Gino Salguero
	 * @param Date date
	 * @return int agno
	 */
	public static int getWeekOfYear( Date date ){
		/*Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.setFirstDayOfWeek(Calendar.MONDAY);
		calendar.setMinimalDaysInFirstWeek(7);
	    calendar.setTime(date);
		return calendar.get( Calendar.WEEK_OF_YEAR );
		*/
		
		 Calendar cal = Calendar.getInstance();
         cal.setTime(date);
         return cal.get(Calendar.WEEK_OF_YEAR);
	}
	
	/**
	 * Descripcion: Retorna el dia de la semana de una fecha (domingo es 1 y sabado es 7)
	 * @author Gino Salguero
	 * @param Date date
	 * @return int dia
	 */
	public static int getDayOfWeek( Date date ){
		Calendar calendar = Calendar.getInstance();
	    calendar.setTime(date);
		return calendar.get( Calendar.DAY_OF_WEEK );
	}

	/**
	 * Descripcion: Retorna el dia del mes de una fecha
	 * @author Gino Salguero
	 * @param Date date
	 * @return int dia
	 */
	public static int getDayOfMonth( Date date ){
		Calendar calendar = Calendar.getInstance();
	    calendar.setTime(date);
		return calendar.get( Calendar.DAY_OF_MONTH );
	}
	
	/**
	 * Descripcion: Metodo que retorna el dia de hoy. 
	 * @author Gino Salguero
	 * @return Date
	 */
	public static Date getToDay(){
		return new Date();
	}
	
	/**
	 * Descripcion: Metodo que retorna la edad.
	 * @author Gino Salguero
	 * @param Date date
	 * @return int agnos que han transcurrido hasta el dia de hoy
	 */
	public static int subtractDate2ToDay_years( Date date ){
		try{
			return subtractDate2ToDay_years( getYear( date ) , getMonth( date ) , getDayOfMonth( date ) );
		}catch( Exception e ){
			return 0;
		}
	}
	
	/**
	 * Descripcion: Metodo que retorna la edad.
	 * @author Gino Salguero
	 * @param int year
	 * @param int month
	 * @param int day
	 * @return int agnos que han transcurrido hasta el dia de hoy
	 */
	public static int subtractDate2ToDay_years( int year , int month , int day ){
		int age=0;
		int gdate 	= getDayOfMonth	( getToDay() );
		int gmonth 	= getMonth		( getToDay() );
		int gyear 	= getYear		( getToDay() );
		age			= gyear-year;
		
		if(month<=gmonth){
			if(month<gmonth)
				age	=	gyear - year;
			if(month==gmonth){
				if(day<=gdate)
					age	=	gyear - year;
				if(day>gdate)
					age	=	gyear - year -1;
			}
		}
		else
			age = gyear-year-1;
		return age;
	}

	
	
	
	/**
	 * 
	 * @param date
	 * @return
	 */
	public static String getNameDayOfWeek( Date date ){
		int dayOfWeek = getDayOfWeek(date);
		if( dayOfWeek == Calendar.MONDAY )
			return "LUNES" ;
		if( dayOfWeek == Calendar.TUESDAY )
			return "MARTES";
		if( dayOfWeek == Calendar.WEDNESDAY )
			return "MIERCOLES";
		if( dayOfWeek == Calendar.THURSDAY )
			return "JUEVES";
		if( dayOfWeek == Calendar.FRIDAY )
			return "VIERNES";
		if( dayOfWeek == Calendar.SATURDAY )
			return "SABADO";
		if( dayOfWeek == Calendar.SUNDAY )
			return "DOMINGO";
		return "Dia no existente, el dia debe ser del 1 al 7";
	}
	
	/**
	 * 
	 * @param dayOfWeek
	 * @return
	 */
	public static String getNameDayOfWeek( int dayOfWeek ){
		if( dayOfWeek == Calendar.MONDAY )
			return "LUNES" ;
		if( dayOfWeek == Calendar.TUESDAY )
			return "MARTES";
		if( dayOfWeek == Calendar.WEDNESDAY )
			return "MIERCOLES";
		if( dayOfWeek == Calendar.THURSDAY )
			return "JUEVES";
		if( dayOfWeek == Calendar.FRIDAY )
			return "VIERNES";
		if( dayOfWeek == Calendar.SATURDAY )
			return "SABADO";
		if( dayOfWeek == Calendar.SUNDAY )
			return "DOMINGO";
		return "Dia no existente, el dia debe ser del 1 al 7";
	}
	
	public static Date getFechaValida(String fecha) {
	        DateFormat format = new SimpleDateFormat(FORMAT_DATE_ddMMyyyy_Separator_Slash);

	        //
	        // Input to be parsed should strictly follow the defined date format
	        // above.
	        //
	        format.setLenient(false);
	        Date ret;
	        try {
	             ret = format.parse(fecha);
	        } catch (ParseException e) {
	            //System.out.println("Date " + fecha + " is not valid according to " +
	            //        ((SimpleDateFormat) format).toPattern() + " pattern.");
	            return null;
	        }
			return ret;
	}
	
	/**
	 * 
	 * @param weeks
	 * @return
	 * @throws SistemaException 
	 */
	public static List<Date> getListDate( Date fechaLimite, int cantidadDeDiasAtras ){
		try{
			List<Date> listDate = new ArrayList<Date>();
			Date fechaDesde = addDays2Date(fechaLimite, -cantidadDeDiasAtras);
			for( int i=0;i <= cantidadDeDiasAtras;i++ ){
				//System.out.println(addDays2Date(fechaDesde, i));
				listDate.add(addDays2Date(fechaDesde, i));
			}
			return listDate;
		}catch (Throwable e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	/**
	 * 
	 * @param fechaDesde
	 * @param fechaHasta
	 * @return
	 * @throws SistemaException
	 */
	public static int getCountDiasHabiles( Date fechaDesde, Date fechaHasta ){
		try{
			int diferencia = subtractDate2Date(fechaDesde,fechaHasta);
			
			int cantidad = 0;
			for( int i=0; i <= diferencia;i++ ){
				Date fecha = addDays2Date(fechaDesde, i);
				int dayOfWeek = getDayOfWeek( fecha );
				if( dayOfWeek != Calendar.SATURDAY && dayOfWeek != Calendar.SUNDAY ){
					cantidad++;
				}
			}
			return cantidad;
		}catch (Throwable e) {
			e.printStackTrace();
			return -999;
		}
		
	}
	
	
	/**
	 * 
	 * @param fechaDesde
	 * @param fechaHasta
	 * @return
	 * @throws SistemaException
	 */
	public static int contarSabadosYDomingosEntreFechas( Date fechaDesde, Date fechaHasta ){
		try{
			int diferencia = subtractDate2Date(fechaDesde,fechaHasta);
			
			int cantidad = 0;
			for( int i=0; i <= diferencia;i++ ){
				Date fecha = addDays2Date(fechaDesde, i);
				int dayOfWeek = getDayOfWeek( fecha );
				if( dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY ){
					cantidad++;
				}
			}
			return cantidad;
		}catch (Throwable e) {
			e.printStackTrace();
			return -9999;
		}
		
	}
	
	
	/**
	 * Descripcion: Metodo que retorna en el nombre del mes en ingles corto a partir de una fecha
	 * @author Nelson Vidal
	 * @param Date date
     * @throws ParseException 
	 */
	public static String getMonthNameShort(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("MMM", Locale.ENGLISH);
		return sdf.format(date);
	}
	
	/**
	 * Descripcion: Metodo que retorna en el nombre dle mes en espaniol a partir de una fecha
	 * @author Gino Salguero
	 * @param Date dateIni
	 * @param Date dateFin
	 * @return int diferencia de dias
     * @throws ParseException 
	 */
	public static String getMonthNameShortESP(Date date) {
		int dayOfMonth = getMonth(date);
		return getMonthName_Short(dayOfMonth);
	}
	
	/**
	 * Descripcion: Metodo que retorna en el nombre dle mes en espaniol a partir de una fecha
	 * @author Gino Salguero
	 * @param Date dateIni
	 * @param Date dateFin
	 * @return int diferencia de dias
     * @throws ParseException 
	 */
	public static String getMonthName(Date date) {
		int dayOfMonth = getMonth(date);
		return getMonthName(dayOfMonth);
	}
	
	/**
	 * Descripcion: Metodo que retorna en el nombre dle mes en espaniol a partir de una fecha
	 * @author Gino Salguero
	 * @param Date dateIni
	 * @param Date dateFin
	 * @return int diferencia de dias
     * @throws ParseException 
	 */
	public static int getMonthNumber(String monthname) {
		System.out.println("Nombre Mes Enviado: " + monthname);
		if( monthname == null )
			monthname = "";
		
		String m = monthname.toUpperCase();
		
		if( m.contains("ENE") || m.contains("JAN") )
			return 1;
		if( m.contains("FEB") || m.contains("FEB") )
			return 2;
		if( m.contains("MAR") || m.contains("MAR") )
			return 3;
		if( m.contains("ABR") || m.contains("APR") )
			return 4;
		if( m.contains("MAY") )
			return 5;
		if( m.contains("JUN") )
			return 6;
		if( m.contains("JUL") )
			return 7;
		if( m.contains("AGO") || m.contains("AUG") )
			return 8;
		if( m.contains("SEP") )
			return 9;
		if( m.contains("OCT") )
			return 10;
		if( m.contains("NOV") )
			return 11;
		if( m.contains("DIC") || m.contains("DEC") )
			return 12;
		return -1;
	}
	
	
	/**
	 * Descripcion: Metodo que retorna en el nombre dle mes en espaniol a partir de una fecha
	 * @author Gino Salguero
	 * @param Date dateIni
	 * @param Date dateFin
	 * @return int diferencia de dias
     * @throws ParseException 
	 */
	public static String getMonthName(int month) {
		
		if( month == Calendar.JANUARY+1 )
			return "ENERO" ;
		if( month == Calendar.FEBRUARY+1 )
			return "FEBRERO";
		if( month == Calendar.MARCH+1 )
			return "MARZO";
		if( month == Calendar.APRIL+1 )
			return "ABRIL";
		if( month == Calendar.MAY+1 )
			return "MAYO";
		if( month == Calendar.JUNE+1 )
			return "JUNIO";
		if( month == Calendar.JULY+1 )
			return "JULIO";
		if( month == Calendar.AUGUST+1 )
			return "AGOSTO";
		if( month == Calendar.SEPTEMBER+1 )
			return "SEPTIEMBRE";
		if( month == Calendar.OCTOBER+1 )
			return "OCTUBRE";
		if( month == Calendar.NOVEMBER+1 )
			return "NOVIEMBRE";
		if( month == Calendar.DECEMBER+1 )
			return "DICIEMBRE";
		return "El mes no existe, el mes debe ser del 1 al 12";
	}
	
	/**
	 * Descripcion: Metodo que retorna en el nombre dle mes en espaniol a partir de una fecha
	 * @author Gino Salguero
	 * @param Date dateIni
	 * @param Date dateFin
	 * @return int diferencia de dias
     * @throws ParseException 
	 */
	public static String getMonthName_Short(int dayOfMonth) {
		
		if( dayOfMonth == Calendar.JANUARY+1 )
			return "ENE" ;
		if( dayOfMonth == Calendar.FEBRUARY+1 )
			return "FEB";
		if( dayOfMonth == Calendar.MARCH+1 )
			return "MAR";
		if( dayOfMonth == Calendar.APRIL+1 )
			return "ABR";
		if( dayOfMonth == Calendar.MAY+1 )
			return "MAY";
		if( dayOfMonth == Calendar.JUNE+1 )
			return "JUN";
		if( dayOfMonth == Calendar.JULY+1 )
			return "JUL";
		if( dayOfMonth == Calendar.AUGUST+1 )
			return "AGO";
		if( dayOfMonth == Calendar.SEPTEMBER+1 )
			return "SEP";
		if( dayOfMonth == Calendar.OCTOBER+1 )
			return "OCT";
		if( dayOfMonth == Calendar.NOVEMBER+1 )
			return "NOV";
		if( dayOfMonth == Calendar.DECEMBER+1 )
			return "DIC";
		return "El mes no existe, el mes debe ser del 1 al 12";
	}

	/**
	 * 
	 * @param anio
	 * @return
	 */
	public static Map<String,Map<String,Date>> getMapSemanasCerradasAnuales(int anio){
		Map<String,Map<String,Date>> mapFechasAnuales = new HashMap<String, Map<String,Date>>();
		for( int  i=1 ; i<13 ; i++ ){
			Date 	mesCalendario					= getString2Date("1/"+i+"/"+anio, "dd/MM/yyyy");
			int 	primerDiaDelMes_mesCalendario	= getDayOfWeek(mesCalendario);
			
			Date ini_1ra_semana_mesCalendario = null;
			int diferencia_mesCalendario = 1 - primerDiaDelMes_mesCalendario;
			ini_1ra_semana_mesCalendario = addDays2Date(mesCalendario, diferencia_mesCalendario);
			Date ini_2da_semana_mesCalendario = addDays2Date(ini_1ra_semana_mesCalendario, 7);
			Date ini_3ra_semana_mesCalendario = addDays2Date(ini_1ra_semana_mesCalendario, 14);
			Date ini_4ta_semana_mesCalendario = addDays2Date(ini_1ra_semana_mesCalendario, 21);
			Date ini_5ta_semana_mesCalendario = addDays2Date(ini_1ra_semana_mesCalendario, 28);
			Date ini_6ta_semana_mesCalendario = addDays2Date(ini_1ra_semana_mesCalendario, 35);
			
			Map<String,Date> mapFechas = new HashMap<String, Date>();
			mapFechas.put("1", ini_1ra_semana_mesCalendario);
			mapFechas.put("2", ini_2da_semana_mesCalendario);
			mapFechas.put("3", ini_3ra_semana_mesCalendario);
			mapFechas.put("4", ini_4ta_semana_mesCalendario);
			mapFechas.put("5", ini_5ta_semana_mesCalendario);
			mapFechas.put("6", ini_6ta_semana_mesCalendario);
			mapFechasAnuales.put(i+"", mapFechas);
		}
		return mapFechasAnuales;
	}

	

	/**
	 * Descripcion: Metodo que retorna la fecha sin minutos ni segundos.
	 * @param fecha
	 * @param format 
	 * @return
	 */
	public static Date getDateSinTiempo(Date fecha) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
		try {
			return formatter.parse(formatter.format(fecha));
		} catch (ParseException e) {
			System.out.println("Error al formatear fecha");
			return new Date();
		}
	}

	/**
	 * @param date
	 * @param days
	 * @return
	 */
	public static Date subtractDays2Date(Date date, int days) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DATE, -days);
		return calendar.getTime();
	}

	/**
	 * @return
	 */
	public static Date getUltimoDiaOfCurrentYear() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_YEAR, cal.getActualMaximum(Calendar.DAY_OF_YEAR));
		return cal.getTime();
	}
	
	/**
	 * @return
	 */
	public static Date getPrimerDiaOfCurrentYear() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_YEAR, cal.getActualMinimum(Calendar.DAY_OF_YEAR));
		return cal.getTime();
	}

	
	public static List<String> getListYears(int cantidad) {
		List<String> listYear = new ArrayList<String>();
		int year = getYear(new Date());
		for( int i=year-cantidad;i<year+cantidad;i++ ){
			listYear.add(year+"");
		}
		return listYear;
	}
	
	
	
}
