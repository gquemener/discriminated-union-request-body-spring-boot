package com.example.discriminated_union_request_body;

import com.example.discriminated_union_request_body.Animal.Cat;
import com.example.discriminated_union_request_body.Animal.Fish;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class AnimalResource {
  @PostMapping("/animals")
  public ResponseEntity<String> create(@RequestBody Animal animal) {
    if (animal instanceof Fish) {
      return ResponseEntity.ok(
          "%s fish created!".formatted(((Fish) animal).getSalty() ? "Salty" : "Fresh water"));
    } else if (animal instanceof Cat) {
      return ResponseEntity.ok("%s the cat was created!".formatted(((Cat) animal).getName()));
    }

    return ResponseEntity.badRequest().body("unable to resolve the animal");
  }
}
