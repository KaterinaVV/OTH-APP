package de.oth.othappserver.config

import de.oth.othappserver.config.ConditionalOnEnvironment.OnEnvironmentCondition
import org.springframework.context.annotation.Condition
import org.springframework.context.annotation.ConditionContext
import org.springframework.context.annotation.Conditional
import org.springframework.core.type.AnnotatedTypeMetadata
import org.springframework.util.StringUtils

@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@MustBeDocumented
@Conditional(OnEnvironmentCondition::class)
annotation class ConditionalOnEnvironment(val value: String = "") {
    class OnEnvironmentCondition : Condition {
        override fun matches(context: ConditionContext, metadata: AnnotatedTypeMetadata): Boolean {
            val allAnnotationAttributes = metadata.getAllAnnotationAttributes(ConditionalOnEnvironment::class.java.name)
            val valueList = allAnnotationAttributes?.get("value") ?: return false
            return StringUtils.hasText(System.getenv(valueList[0] as String))
        }
    }
}
