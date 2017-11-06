package com.obsidiandynamics.log4jextras.splunk;

import org.apache.log4j.*;

public final class SplunkTester {
  private static final Logger LOG = Logger.getLogger(SplunkTester.class);
  
  public static void main(String[] args) {
    System.setProperty("log4jextras.splunk.token", "set me");
    System.setProperty("log4jextras.splunk.url", "set me");
    System.setProperty("log4jextras.splunk.index", "set me");
    System.setProperty("log4jextras.splunk.source", "set me");
    
    LOG.debug("Test log");
  }
}
