package com.epam.entity;

import lombok.Data;
import lombok.NonNull;

@Data // @ToString, @EqualsAndHashCode, @Getter / @Setter and @RequiredArgsConstructor
public class DataExample {

   @NonNull private String name;
   @NonNull private Integer age;

}
