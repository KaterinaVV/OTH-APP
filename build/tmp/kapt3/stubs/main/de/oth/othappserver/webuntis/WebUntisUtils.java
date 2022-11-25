package de.oth.othappserver.webuntis;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lde/oth/othappserver/webuntis/WebUntisUtils;", "", "()V", "Companion", "oth-app-server"})
public final class WebUntisUtils {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DateFormat = "yyyyMMdd";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DateTimeFormat = "yyyyMMdd\'T\'HHmm";
    private static final java.time.format.DateTimeFormatter WebUntisDateFormatter = null;
    private static final java.time.format.DateTimeFormatter WebUntisDateTimeFormatter = null;
    private static final java.time.format.DateTimeFormatter WebUntisTimeFormatter = null;
    @org.jetbrains.annotations.NotNull()
    public static final de.oth.othappserver.webuntis.WebUntisUtils.Companion Companion = null;
    
    public WebUntisUtils() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u000b\u001a\n \b*\u0004\u0018\u00010\u00070\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0019\u0010\r\u001a\n \b*\u0004\u0018\u00010\u00070\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lde/oth/othappserver/webuntis/WebUntisUtils$Companion;", "", "()V", "DateFormat", "", "DateTimeFormat", "WebUntisDateFormatter", "Ljava/time/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "getWebUntisDateFormatter", "()Ljava/time/format/DateTimeFormatter;", "WebUntisDateTimeFormatter", "getWebUntisDateTimeFormatter", "WebUntisTimeFormatter", "getWebUntisTimeFormatter", "convertTimeToString", "time", "Ljava/time/LocalTime;", "toBerlinOffset", "Ljava/time/OffsetDateTime;", "date", "oth-app-server"})
    public static final class Companion {
        
        public final java.time.format.DateTimeFormatter getWebUntisDateFormatter() {
            return null;
        }
        
        public final java.time.format.DateTimeFormatter getWebUntisDateTimeFormatter() {
            return null;
        }
        
        public final java.time.format.DateTimeFormatter getWebUntisTimeFormatter() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.time.OffsetDateTime toBerlinOffset(@org.jetbrains.annotations.NotNull()
        java.lang.String date, @org.jetbrains.annotations.NotNull()
        java.lang.String time) {
            return null;
        }
        
        /**
         * Convert LocalTime objects to strings in form of "12:30"
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String convertTimeToString(@org.jetbrains.annotations.NotNull()
        java.time.LocalTime time) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}