/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cse.maven.sample;

import org.joda.time.*;
import cse.maven.sample.InvalidNicException;

/**
 *
 * @author Nishada
 */
public class NicInterpreter {

    private String nicNum;
    private int year;
    private int month;
    private int day;
    private int numberDays;
    private boolean male;
    private boolean voter;
    DateTime currentDate;

    public NicInterpreter(String nicNum) throws InvalidNicException {
        this.nicNum = nicNum;
        if (nicNum.length() == 10) {
            year = 1900 + Integer.parseInt(nicNum.substring(0, 2));
            numberDays = Integer.parseInt(nicNum.substring(2, 5));
            if (numberDays >= 500) {
                male = false;
                numberDays = numberDays - 500;
            } else {
                male = true;
            }

            currentDate = new DateTime();
            DateTime datNew = new DateTime(2012, 1, 1, 0, 0, 0);
            datNew = datNew.plusDays(numberDays - 1);

            month = datNew.getMonthOfYear();
            day = datNew.getDayOfMonth();
            DateTime dayP = new DateTime(year, month, day, 0, 0, 0);
            if (dayP.plusYears(18).compareTo(currentDate) < 0) {
                voter = true;
            } else {
                voter = false;
            }
        }

    }

    public String getGender() {
        if (male) {
            return "Male";
        } else {
            return "Female";
        }
    }

    public String isVoter() {
        if (voter) {
            return "True";
        } else {
            return "False";
        }
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDate() {
        return day;
    }
}
