package com.maurice.va.util;

import java.time.Instant;
import java.util.Date;

public final class DateTimeUtils {
  private DateTimeUtils() {
  }

  public static Date epochToDateConverter(Long epoch) {
    return new Date(epoch * 1000);
  }

  public static Long getNowTimeEpoch(){
    return Instant.now().toEpochMilli();
  }
}
