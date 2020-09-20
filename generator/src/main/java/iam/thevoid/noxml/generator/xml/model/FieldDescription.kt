package iam.thevoid.noxml.generator.xml.model

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty

data class FieldDescription(
    @field:JacksonXmlProperty(localName = "name", isAttribute = true)
    var name: String = "",
    @field:JacksonXmlProperty(localName = "since", isAttribute = true)
    var since: Int? = null,
    @field:JacksonXmlProperty(localName = "removed", isAttribute = true)
    var removed: Int? = null,
    @field:JacksonXmlProperty(localName = "deprecated", isAttribute = true)
    var deprecated: Int? = null
)