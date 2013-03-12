package de.micromata.jira.rest.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * User: Christian
 * Date: 08.03.13
 * Time: 14:55
 */
public class DateParser {

    private static SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");

    private static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MMM/yy");

    public static Date parseDateFormat1(String dateString){
        try {
            return sdf1.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Date parseDateFormat2(String dateString){
        try {
            return sdf2.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

}