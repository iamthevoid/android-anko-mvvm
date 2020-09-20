package iam.thevoid.noxml.generator.xml.model

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty

data class ClassDescription(
    @field:JacksonXmlProperty(localName = "name", isAttribute = true)
    var name: String = "",

    @field:JacksonXmlProperty(localName = "since", isAttribute = true)
    var since: Int? = null,

    @field:JacksonXmlProperty(localName = "deprecated", isAttribute = true)
    var deprecated: Int? = null,

    @field:JacksonXmlProperty(localName = "removed", isAttribute = true)
    var removed: Int? = null,

    @field:JacksonXmlProperty(localName = "extends")
    var extends: Extends? = null,

    @field:JacksonXmlCData
    @field:JacksonXmlElementWrapper(useWrapping = false)
    @field:JacksonXmlProperty(localName = "implements")
    var implements: List<Implements>? = emptyList(),

    @field:JacksonXmlProperty(localName = "method")
    @field:JacksonXmlCData
    @field:JacksonXmlElementWrapper(useWrapping = false)
    var methods: List<MethodDescription> = emptyList(),

    @field:JacksonXmlProperty(localName = "field")
    @field:JacksonXmlCData
    @field:JacksonXmlElementWrapper(useWrapping = false)
    var fields: List<FieldDescription> = emptyList()
) {
    val canonicalName
        get() = name.replace("/", ".")

    val simpleName
        get() = canonicalName.split(".").filter { it.isNotBlank() }.last()
}