package de.oth.othappserver.exceptions

class MissingConfigurationException(property: String) : RuntimeException("Missing required property '$property'.")
