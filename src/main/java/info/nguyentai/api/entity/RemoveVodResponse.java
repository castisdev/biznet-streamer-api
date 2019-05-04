package info.nguyentai.api.entity;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Data;

@JacksonXmlRootElement(localName = "removeVodResponse")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class RemoveVodResponse implements Serializable  {

	private static final long serialVersionUID = 1100134884910382341L;

	@JsonProperty("result")
	private Stream result;
}
