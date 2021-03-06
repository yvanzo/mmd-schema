//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.07 at 09:53:38 PM CST 
//


package org.musicbrainz.mmd2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}title" minOccurs="0"/&gt;
 *         &lt;element name="language" type="{http://musicbrainz.org/ns/mmd-2.0#}def_iso-639" minOccurs="0"/&gt;
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}language-list" minOccurs="0"/&gt;
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}artist-credit" minOccurs="0"/&gt;
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}iswc" minOccurs="0"/&gt;
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}iswc-list" minOccurs="0"/&gt;
 *         &lt;group ref="{http://musicbrainz.org/ns/mmd-2.0#}def_work-attribute-list" minOccurs="0"/&gt;
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}annotation" minOccurs="0"/&gt;
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}disambiguation" minOccurs="0"/&gt;
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}alias-list" minOccurs="0"/&gt;
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}relation-list" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}tag-list" minOccurs="0"/&gt;
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}user-tag-list" minOccurs="0"/&gt;
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}genre-list" minOccurs="0"/&gt;
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}user-genre-list" minOccurs="0"/&gt;
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}rating" minOccurs="0"/&gt;
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}user-rating" minOccurs="0"/&gt;
 *         &lt;group ref="{http://musicbrainz.org/ns/mmd-2.0#}def_work-element_extension"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://musicbrainz.org/ns/mmd-2.0#}def_work-attribute_extension"/&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="type-id" type="{http://musicbrainz.org/ns/mmd-2.0#}def_uuid" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "title",
    "language",
    "languageList",
    "artistCredit",
    "iswc",
    "iswcList",
    "attributeList",
    "annotation",
    "disambiguation",
    "aliasList",
    "relationList",
    "tagList",
    "userTagList",
    "genreList",
    "userGenreList",
    "rating",
    "userRating",
    "defExtensionElement"
})
@XmlRootElement(name = "work")
public class Work {

    protected String title;
    protected String language;
    @XmlElement(name = "language-list")
    protected LanguageList languageList;
    @XmlElement(name = "artist-credit")
    protected ArtistCredit artistCredit;
    protected String iswc;
    @XmlElement(name = "iswc-list")
    protected IswcList iswcList;
    @XmlElement(name = "attribute-list")
    protected Work.AttributeList attributeList;
    protected Annotation annotation;
    protected String disambiguation;
    @XmlElement(name = "alias-list")
    protected AliasList aliasList;
    @XmlElement(name = "relation-list")
    protected List<RelationList> relationList;
    @XmlElement(name = "tag-list")
    protected TagList tagList;
    @XmlElement(name = "user-tag-list")
    protected UserTagList userTagList;
    @XmlElement(name = "genre-list")
    protected GenreList genreList;
    @XmlElement(name = "user-genre-list")
    protected UserGenreList userGenreList;
    protected Rating rating;
    @XmlElement(name = "user-rating")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger userRating;
    @XmlAnyElement
    protected List<Element> defExtensionElement;
    @XmlAttribute(name = "id")
    @XmlSchemaType(name = "anyURI")
    protected String id;
    @XmlAttribute(name = "type")
    @XmlSchemaType(name = "anyURI")
    protected String type;
    @XmlAttribute(name = "type-id")
    protected String typeId;
    @XmlAttribute(name = "score", namespace = "http://musicbrainz.org/ns/ext#-2.0")
    protected Integer score;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the languageList property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageList }
     *     
     */
    public LanguageList getLanguageList() {
        return languageList;
    }

    /**
     * Sets the value of the languageList property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageList }
     *     
     */
    public void setLanguageList(LanguageList value) {
        this.languageList = value;
    }

    /**
     * Gets the value of the artistCredit property.
     * 
     * @return
     *     possible object is
     *     {@link ArtistCredit }
     *     
     */
    public ArtistCredit getArtistCredit() {
        return artistCredit;
    }

    /**
     * Sets the value of the artistCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArtistCredit }
     *     
     */
    public void setArtistCredit(ArtistCredit value) {
        this.artistCredit = value;
    }

    /**
     * Gets the value of the iswc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIswc() {
        return iswc;
    }

    /**
     * Sets the value of the iswc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIswc(String value) {
        this.iswc = value;
    }

    /**
     * Gets the value of the iswcList property.
     * 
     * @return
     *     possible object is
     *     {@link IswcList }
     *     
     */
    public IswcList getIswcList() {
        return iswcList;
    }

    /**
     * Sets the value of the iswcList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IswcList }
     *     
     */
    public void setIswcList(IswcList value) {
        this.iswcList = value;
    }

    /**
     * Gets the value of the attributeList property.
     * 
     * @return
     *     possible object is
     *     {@link Work.AttributeList }
     *     
     */
    public Work.AttributeList getAttributeList() {
        return attributeList;
    }

    /**
     * Sets the value of the attributeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Work.AttributeList }
     *     
     */
    public void setAttributeList(Work.AttributeList value) {
        this.attributeList = value;
    }

    /**
     * Gets the value of the annotation property.
     * 
     * @return
     *     possible object is
     *     {@link Annotation }
     *     
     */
    public Annotation getAnnotation() {
        return annotation;
    }

    /**
     * Sets the value of the annotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Annotation }
     *     
     */
    public void setAnnotation(Annotation value) {
        this.annotation = value;
    }

    /**
     * Gets the value of the disambiguation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisambiguation() {
        return disambiguation;
    }

    /**
     * Sets the value of the disambiguation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisambiguation(String value) {
        this.disambiguation = value;
    }

    /**
     * Gets the value of the aliasList property.
     * 
     * @return
     *     possible object is
     *     {@link AliasList }
     *     
     */
    public AliasList getAliasList() {
        return aliasList;
    }

    /**
     * Sets the value of the aliasList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AliasList }
     *     
     */
    public void setAliasList(AliasList value) {
        this.aliasList = value;
    }

    /**
     * Gets the value of the relationList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relationList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelationList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationList }
     * 
     * 
     */
    public List<RelationList> getRelationList() {
        if (relationList == null) {
            relationList = new ArrayList<RelationList>();
        }
        return this.relationList;
    }

    /**
     * Gets the value of the tagList property.
     * 
     * @return
     *     possible object is
     *     {@link TagList }
     *     
     */
    public TagList getTagList() {
        return tagList;
    }

    /**
     * Sets the value of the tagList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TagList }
     *     
     */
    public void setTagList(TagList value) {
        this.tagList = value;
    }

    /**
     * Gets the value of the userTagList property.
     * 
     * @return
     *     possible object is
     *     {@link UserTagList }
     *     
     */
    public UserTagList getUserTagList() {
        return userTagList;
    }

    /**
     * Sets the value of the userTagList property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserTagList }
     *     
     */
    public void setUserTagList(UserTagList value) {
        this.userTagList = value;
    }

    /**
     * Gets the value of the genreList property.
     * 
     * @return
     *     possible object is
     *     {@link GenreList }
     *     
     */
    public GenreList getGenreList() {
        return genreList;
    }

    /**
     * Sets the value of the genreList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenreList }
     *     
     */
    public void setGenreList(GenreList value) {
        this.genreList = value;
    }

    /**
     * Gets the value of the userGenreList property.
     * 
     * @return
     *     possible object is
     *     {@link UserGenreList }
     *     
     */
    public UserGenreList getUserGenreList() {
        return userGenreList;
    }

    /**
     * Sets the value of the userGenreList property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserGenreList }
     *     
     */
    public void setUserGenreList(UserGenreList value) {
        this.userGenreList = value;
    }

    /**
     * Gets the value of the rating property.
     * 
     * @return
     *     possible object is
     *     {@link Rating }
     *     
     */
    public Rating getRating() {
        return rating;
    }

    /**
     * Sets the value of the rating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rating }
     *     
     */
    public void setRating(Rating value) {
        this.rating = value;
    }

    /**
     * Gets the value of the userRating property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUserRating() {
        return userRating;
    }

    /**
     * Sets the value of the userRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUserRating(BigInteger value) {
        this.userRating = value;
    }

    /**
     * Gets the value of the defExtensionElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defExtensionElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefExtensionElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * 
     * 
     */
    public List<Element> getDefExtensionElement() {
        if (defExtensionElement == null) {
            defExtensionElement = new ArrayList<Element>();
        }
        return this.defExtensionElement;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the typeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeId(String value) {
        this.typeId = value;
    }

    /**
     * Gets the value of the score property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScore(Integer value) {
        this.score = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="attribute" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="type-id" use="required" type="{http://musicbrainz.org/ns/mmd-2.0#}def_uuid" /&gt;
     *                 &lt;attribute name="value-id" type="{http://musicbrainz.org/ns/mmd-2.0#}def_uuid" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "attribute"
    })
    public static class AttributeList {

        @XmlElement(required = true)
        protected List<Work.AttributeList.Attribute> attribute;

        /**
         * Gets the value of the attribute property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the attribute property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAttribute().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Work.AttributeList.Attribute }
         * 
         * 
         */
        public List<Work.AttributeList.Attribute> getAttribute() {
            if (attribute == null) {
                attribute = new ArrayList<Work.AttributeList.Attribute>();
            }
            return this.attribute;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="type-id" use="required" type="{http://musicbrainz.org/ns/mmd-2.0#}def_uuid" /&gt;
         *       &lt;attribute name="value-id" type="{http://musicbrainz.org/ns/mmd-2.0#}def_uuid" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "content"
        })
        public static class Attribute {

            @XmlValue
            protected String content;
            @XmlAttribute(name = "type", required = true)
            protected String type;
            @XmlAttribute(name = "type-id", required = true)
            protected String typeId;
            @XmlAttribute(name = "value-id")
            protected String valueId;

            /**
             * Gets the value of the content property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContent() {
                return content;
            }

            /**
             * Sets the value of the content property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContent(String value) {
                this.content = value;
            }

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * Gets the value of the typeId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTypeId() {
                return typeId;
            }

            /**
             * Sets the value of the typeId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTypeId(String value) {
                this.typeId = value;
            }

            /**
             * Gets the value of the valueId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValueId() {
                return valueId;
            }

            /**
             * Sets the value of the valueId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValueId(String value) {
                this.valueId = value;
            }

        }

    }

}
