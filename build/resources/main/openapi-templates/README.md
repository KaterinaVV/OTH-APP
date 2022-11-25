This directory contains mustache templates overriding default behaviour of the openapi kotlin-spring generator.
* `dataClass.mustache` needed because of a bug in the openapi generator for kotlin-spring that generates constructor braces for interface inheritance on a data class:

```kotlin
class DeleteEvent(

    @field:JsonProperty("eventId", required = true) override val eventId: kotlin.String,

    @field:Valid
    @field:JsonProperty("eventType", required = true) override val eventType: EventType
) : Event(){
}
```
But it should be without braces like this:
```kotlin
class DeleteEvent(

    @field:JsonProperty("eventId", required = true) override val eventId: kotlin.String,

    @field:Valid
    @field:JsonProperty("eventType", required = true) override val eventType: EventType
) : Event{
}
```