package com.segment.analytics.android.integrations;


public class JSONAsset {

    final static String IDENTITY_JSON_DATA = "{\n"
            + "\"type\":\"identify\",\n"
            + "\"traits\":{\n"
            + "\"name\":\"Yoda\",\n"
            + "\"email\":\"yoda@example.org\",\n"
            + "\"gender\":\"male\",\n"
            + "\"age\":180,\n"
            + "\"plan\":\"enterprise\"\n"
            + "},\n"
            + "\"userId\":\"test-user-ru3j5q\"\n"
            + "}";

    final static String GROUP_JSON_DATA = "{\n"
            + "\"type\":\"group\",\n"
            + "\"groupId\":\"0e8c78ea9d97a7b8185e8632\",\n"
            + "\"traits\":{\n"
            + "\"name\":\"Initech\",\n"
            + "\"industry\":\"Technology\",\n"
            + "\"employees\":329,\n"
            + "\"plan\":\"enterprise\"\n"
            + "},\n"
            + "\"userId\":\"test-user-ru3j5q\"\n"
            + "}";

    final static String ALIAS_JSON_DATA = "{\n"
            + "\"type\":\"alias\",\n"
            + "\"previousId\":\"jen@email.com\",\n"
            + "\"userId\":\"test-user-ru3j5q\"\n"
            + "}";

    final static String TRACK_JSON_DATA = "{\n"
            + "\"type\":\"track\",\n"
            + "\"event\":\"Registered\",\n"
            + "\"properties\":{\n"
            + "\"title\":\"Intro to Analytics\",\n"
            + "\"plan\":\"Pro Annual\",\n"
            + "\"accountType\":\"Facebook\"\n"
            + "},\n"
            + "\"userId\":\"test-user-ru3j5q\"\n"
            + "}";

    final static String SCREEN_JSON_DATA = "{\n"
            + "\"type\":\"screen\",\n"
            + "\"name\":\"Home\",\n"
            + "\"properties\":{\n"
            + "\"Feed Type\":\"private\"\n"
            + "},\n"
            + "\"userId\":\"test-user-ru3j5q\"\n"
            + "}";

    final static String PAGE_JSON_DATA = "{\n"
            + "\"type\":\"page\",\n"
            + "\"name\":\"Home\",\n"
            + "\"properties\":{\n"
            + "\"title\":\"Welcome | Initech\",\n"
            + "\"url\":\"http://www.initech.com\"\n"
            + "},\n"
            + "\"userId\":\"test-user-ru3j5q\"\n"
            + "}";

}

