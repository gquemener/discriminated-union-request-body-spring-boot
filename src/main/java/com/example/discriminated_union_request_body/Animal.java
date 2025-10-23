package com.example.discriminated_union_request_body;

import com.example.discriminated_union_request_body.Animal.Cat;
import com.example.discriminated_union_request_body.Animal.Fish;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.v3.oas.annotations.media.DiscriminatorMapping;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = Fish.class, name = "Fish"),
  @JsonSubTypes.Type(value = Cat.class, name = "Cat")
})
@Schema(
    discriminatorProperty = "type",
    discriminatorMapping = {
      @DiscriminatorMapping(value = "Fish", schema = Fish.class),
      @DiscriminatorMapping(value = "Cat", schema = Cat.class)
    })
public interface Animal {
  @Data
  class Fish implements Animal {
    private Boolean salty;
  }

  @Data
  class Cat implements Animal {
    private String name;
  }
}
