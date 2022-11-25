package de.oth.othappserver.model;

import java.lang.System;

/**
 * @param category 
 * @param message 
 * @param contactAddress 
 * @param images 
 * @param additionalInfo
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001!BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bH\u00c6\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\nH\u00c6\u0003JS\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\nH\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\t\u0010 \u001a\u00020\u0005H\u00d6\u0001R$\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bX\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011\u00a8\u0006\""}, d2 = {"Lde/oth/othappserver/model/FeedbackItem;", "", "category", "Lde/oth/othappserver/model/FeedbackItem$Category;", "message", "", "contactAddress", "images", "", "additionalInfo", "", "(Lde/oth/othappserver/model/FeedbackItem$Category;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V", "getAdditionalInfo", "()Ljava/util/Map;", "getCategory", "()Lde/oth/othappserver/model/FeedbackItem$Category;", "getContactAddress", "()Ljava/lang/String;", "getImages", "()Ljava/util/List;", "getMessage", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Category", "oth-app-server"})
public final class FeedbackItem {
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "category", required = true)
    private final de.oth.othappserver.model.FeedbackItem.Category category = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "message", required = true)
    private final java.lang.String message = null;
    @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "contactAddress")
    private final java.lang.String contactAddress = null;
    @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "images")
    private final java.util.List<java.lang.String> images = null;
    @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "additionalInfo")
    private final java.util.Map<java.lang.String, java.lang.String> additionalInfo = null;
    
    @org.jetbrains.annotations.NotNull()
    public final de.oth.othappserver.model.FeedbackItem.Category getCategory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getContactAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @javax.validation.constraints.Size(min = 0, max = 3)
    public final java.util.List<java.lang.String> getImages() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, java.lang.String> getAdditionalInfo() {
        return null;
    }
    
    public FeedbackItem(@org.jetbrains.annotations.NotNull()
    de.oth.othappserver.model.FeedbackItem.Category category, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.String contactAddress, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> images, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> additionalInfo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.oth.othappserver.model.FeedbackItem.Category component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, java.lang.String> component5() {
        return null;
    }
    
    /**
     * @param category 
     * @param message 
     * @param contactAddress 
     * @param images 
     * @param additionalInfo
     */
    @org.jetbrains.annotations.NotNull()
    public final de.oth.othappserver.model.FeedbackItem copy(@org.jetbrains.annotations.NotNull()
    de.oth.othappserver.model.FeedbackItem.Category category, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.String contactAddress, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> images, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> additionalInfo) {
        return null;
    }
    
    /**
     * @param category 
     * @param message 
     * @param contactAddress 
     * @param images 
     * @param additionalInfo
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * @param category 
     * @param message 
     * @param contactAddress 
     * @param images 
     * @param additionalInfo
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * @param category 
     * @param message 
     * @param contactAddress 
     * @param images 
     * @param additionalInfo
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    /**
     * Values: BUG,FEEDBACK,IDEE
     */
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lde/oth/othappserver/model/FeedbackItem$Category;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "BUG", "FEEDBACK", "IDEE", "oth-app-server"})
    public static enum Category {
        @com.fasterxml.jackson.annotation.JsonProperty(value = "Bug")
        /*public static final*/ BUG /* = new BUG(null) */,
        @com.fasterxml.jackson.annotation.JsonProperty(value = "Feedback")
        /*public static final*/ FEEDBACK /* = new FEEDBACK(null) */,
        @com.fasterxml.jackson.annotation.JsonProperty(value = "Idee")
        /*public static final*/ IDEE /* = new IDEE(null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String value = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getValue() {
            return null;
        }
        
        Category(java.lang.String value) {
        }
    }
}