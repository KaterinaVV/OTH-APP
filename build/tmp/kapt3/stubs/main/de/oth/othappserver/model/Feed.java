package de.oth.othappserver.model;

import java.lang.System;

/**
 * A faculty's RSS Feed.
 * @param rss RSS feed URI
 * @param type Type of the RSS feed.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lde/oth/othappserver/model/Feed;", "", "rss", "", "type", "Lde/oth/othappserver/model/Feed$Type;", "(Ljava/lang/String;Lde/oth/othappserver/model/Feed$Type;)V", "getRss", "()Ljava/lang/String;", "getType", "()Lde/oth/othappserver/model/Feed$Type;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Type", "oth-app-server"})
public final class Feed {
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "rss", required = true)
    private final java.lang.String rss = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "type", required = true)
    private final de.oth.othappserver.model.Feed.Type type = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRss() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.oth.othappserver.model.Feed.Type getType() {
        return null;
    }
    
    public Feed(@org.jetbrains.annotations.NotNull()
    java.lang.String rss, @org.jetbrains.annotations.NotNull()
    de.oth.othappserver.model.Feed.Type type) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.oth.othappserver.model.Feed.Type component2() {
        return null;
    }
    
    /**
     * A faculty's RSS Feed.
     * @param rss RSS feed URI
     * @param type Type of the RSS feed.
     */
    @org.jetbrains.annotations.NotNull()
    public final de.oth.othappserver.model.Feed copy(@org.jetbrains.annotations.NotNull()
    java.lang.String rss, @org.jetbrains.annotations.NotNull()
    de.oth.othappserver.model.Feed.Type type) {
        return null;
    }
    
    /**
     * A faculty's RSS Feed.
     * @param rss RSS feed URI
     * @param type Type of the RSS feed.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * A faculty's RSS Feed.
     * @param rss RSS feed URI
     * @param type Type of the RSS feed.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * A faculty's RSS Feed.
     * @param rss RSS feed URI
     * @param type Type of the RSS feed.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    /**
     * Type of the RSS feed.
     * Values: BULLETIN_BOARD
     */
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lde/oth/othappserver/model/Feed$Type;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "BULLETIN_BOARD", "oth-app-server"})
    public static enum Type {
        @com.fasterxml.jackson.annotation.JsonProperty(value = "BULLETIN_BOARD")
        /*public static final*/ BULLETIN_BOARD /* = new BULLETIN_BOARD(null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String value = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getValue() {
            return null;
        }
        
        Type(java.lang.String value) {
        }
    }
}