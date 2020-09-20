package iam.thevoid.noxml.generator.xml.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class Api(
    @field:JacksonXmlProperty(localName = "class")
    @field:JacksonXmlCData
    @field:JacksonXmlElementWrapper(useWrapping = false)
    var classes: List<ClassDescription> = emptyList(),

    @field:JacksonXmlProperty(localName = "version", isAttribute = true)
    var version: Int = 0
)