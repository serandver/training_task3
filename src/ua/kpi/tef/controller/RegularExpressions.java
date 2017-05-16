package ua.kpi.tef.controller;

public final class RegularExpressions {
    static String REG_NAME = "^[A-Z]{1}[a-z]{1,15}$";
    static String REG_NICKNAME = "^.{1,15}$";
    static String REG_HOME_NUMBER = "^[0-9]+$";
    static String REG_MOBILE_NUMBER1 = "^\\+38\\(0[\\d]{2}\\)[\\d]{7}$";
    static String REG_MOBILE_NUMBER2 = "^(\\+38\\(0[\\d]{2}\\)[\\d]{7})|next$";
    static String REG_EMAIL = "^[a-zA-Z\\d][\\w\\.-]{0,15}@[a-zA-Z]{1,10}\\.((com|net|org)(\\.ua)?|ua|ru)$";
    static String REG_SKYPE = "^[a-zA-Z\\d][\\w\\.]{0,20}$";
    static String REG_INDEX = "^[\\d]{5}$";
    static String REG_TOWN = "^[A-Z]{1}[a-zA-Z]{2,15}$";
    static String REG_STREET = "^[A-Z]{1}[a-z]{1,20}$";
    static String REG_HOUSE_NUMBER = "^[\\d]{1,3}(\\/[\\d]{1,2})?[a-z]?$";
    static String REG_APARTMENT_NUMBER = "^[\\d]{1,3}";
}
