package de.oth.othappserver.service.tags;

import java.lang.System;

/**
 * Parses the body of a EventData for hashtags and reads them.
 *
 * A tag is additional metadata attached to a event. It looks like this: #value;
 *
 * Example:
 * #some@email.de
 *
 * A tag is defined like this:
 * 1. Starts with a hashtag.
 * 2. Is the very first line in an events content.
 * 2.1 This is either the first element containing an '#' matching the Regex in a HTML body
 * 2.2 or the first line in plaintext data
 * 3. Always ends with the end of the first line.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000b\fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0002\u00a8\u0006\r"}, d2 = {"Lde/oth/othappserver/service/tags/EventTagsParser;", "", "()V", "extractTag", "Lde/oth/othappserver/service/tags/EventTagsParser$ExtractTagResult;", "data", "Lde/oth/othappserver/exchange/EventData;", "fromHTML", "content", "", "fromText", "Companion", "ExtractTagResult", "oth-app-server"})
@org.springframework.stereotype.Component()
public final class EventTagsParser {
    private static final kotlin.text.Regex regex = null;
    private static final org.slf4j.Logger logger = null;
    @org.jetbrains.annotations.NotNull()
    public static final de.oth.othappserver.service.tags.EventTagsParser.Companion Companion = null;
    
    /**
     * Search for tags in the body of a event.
     *
     * @return Optional containing the tag as String
     */
    @org.jetbrains.annotations.NotNull()
    public final de.oth.othappserver.service.tags.EventTagsParser.ExtractTagResult extractTag(@org.jetbrains.annotations.NotNull()
    de.oth.othappserver.exchange.EventData data) {
        return null;
    }
    
    private final de.oth.othappserver.service.tags.EventTagsParser.ExtractTagResult fromText(java.lang.String content) {
        return null;
    }
    
    private final de.oth.othappserver.service.tags.EventTagsParser.ExtractTagResult fromHTML(java.lang.String content) {
        return null;
    }
    
    public EventTagsParser() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0006J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J%\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0004H\u00d6\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lde/oth/othappserver/service/tags/EventTagsParser$ExtractTagResult;", "", "tag", "Ljava/util/Optional;", "", "data", "(Ljava/util/Optional;Ljava/lang/String;)V", "getData", "()Ljava/lang/String;", "getTag", "()Ljava/util/Optional;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "oth-app-server"})
    public static final class ExtractTagResult {
        @org.jetbrains.annotations.NotNull()
        private final java.util.Optional<java.lang.String> tag = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String data = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Optional<java.lang.String> getTag() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getData() {
            return null;
        }
        
        public ExtractTagResult(@org.jetbrains.annotations.NotNull()
        java.util.Optional<java.lang.String> tag, @org.jetbrains.annotations.Nullable()
        java.lang.String data) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Optional<java.lang.String> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final de.oth.othappserver.service.tags.EventTagsParser.ExtractTagResult copy(@org.jetbrains.annotations.NotNull()
        java.util.Optional<java.lang.String> tag, @org.jetbrains.annotations.Nullable()
        java.lang.String data) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lde/oth/othappserver/service/tags/EventTagsParser$Companion;", "", "()V", "logger", "Lorg/slf4j/Logger;", "regex", "Lkotlin/text/Regex;", "oth-app-server"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}