package iam.thevoid.noxml.generator.xml.model

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty
import sun.reflect.generics.parser.SignatureParser
import sun.reflect.generics.tree.MethodTypeSignature

data class MethodDescription(
    @field:JacksonXmlProperty(localName = "name", isAttribute = true)
    var template: String = "",
    @field:JacksonXmlProperty(localName = "since", isAttribute = true)
    var since: Int? = null,
    @field:JacksonXmlProperty(localName = "removed", isAttribute = true)
    var removed: Int? = null,
    @field:JacksonXmlProperty(localName = "deprecated", isAttribute = true)
    var deprecated: Int? = null
) {

    @get:JsonIgnore
    val name : String
        get() = "<?\\w+>?".toRegex().find(template)?.groups?.firstOrNull()?.value!!

    @get:JsonIgnore
    val signature : MethodTypeSignature
        get() = SignatureParser.make().parseMethodSig(template.replaceFirst(name, ""))
}