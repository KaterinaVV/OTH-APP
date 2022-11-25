package de.oth.othappserver.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\n\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003R\u000f\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004\u00a8\u0006\u0006"}, d2 = {"Lde/oth/othappserver/config/ConditionalOnEnvironment;", "", "value", "", "()Ljava/lang/String;", "OnEnvironmentCondition", "oth-app-server"})
@java.lang.annotation.Target(value = {java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.ANNOTATION_TYPE})
@java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
@java.lang.annotation.Documented()
@org.springframework.context.annotation.Conditional(value = {de.oth.othappserver.config.ConditionalOnEnvironment.OnEnvironmentCondition.class})
@kotlin.annotation.MustBeDocumented()
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.ANNOTATION_CLASS, kotlin.annotation.AnnotationTarget.CLASS, kotlin.annotation.AnnotationTarget.FUNCTION, kotlin.annotation.AnnotationTarget.PROPERTY_GETTER, kotlin.annotation.AnnotationTarget.PROPERTY_SETTER})
@kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.RUNTIME)
public abstract @interface ConditionalOnEnvironment {
    
    public abstract java.lang.String value() default "";
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lde/oth/othappserver/config/ConditionalOnEnvironment$OnEnvironmentCondition;", "Lorg/springframework/context/annotation/Condition;", "()V", "matches", "", "context", "Lorg/springframework/context/annotation/ConditionContext;", "metadata", "Lorg/springframework/core/type/AnnotatedTypeMetadata;", "oth-app-server"})
    public static final class OnEnvironmentCondition implements org.springframework.context.annotation.Condition {
        
        @java.lang.Override()
        public boolean matches(@org.jetbrains.annotations.NotNull()
        org.springframework.context.annotation.ConditionContext context, @org.jetbrains.annotations.NotNull()
        org.springframework.core.type.AnnotatedTypeMetadata metadata) {
            return false;
        }
        
        public OnEnvironmentCondition() {
            super();
        }
    }
}