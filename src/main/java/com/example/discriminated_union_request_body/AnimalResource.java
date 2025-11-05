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
    return ResponseEntity.ok(
        switch (animal) {
          case Fish(Boolean salty) ->
              "%s fish created!".formatted(Boolean.TRUE.equals(salty) ? "Salty" : "Fresh water");
          case Cat(String name) -> "%s the cat was created!".formatted(name);
        });
  }
}
